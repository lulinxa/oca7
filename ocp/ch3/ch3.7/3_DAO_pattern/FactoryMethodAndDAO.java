class Emp {
	int id;
	String name;
	int age;
	String address;

	public String toString() {
		return "" + id + ":" + name;
	}
}
class Dept {
	int id;
	String name;

	public String toString() {
		return "" + id + ":" + name;
	}
}

interface EmpDAO {
	public int create(Emp e);
}
interface DeptDAO {
	public boolean update(Dept d); 
}

class EmpDAOOracleImpl implements EmpDAO {
	public int create(Emp e) {
		// connect to datastore and create empleyee e
		System.out.println("Created employee: " + e + " in ORACLE");
		return 0;
	}
}
class DeptDAOOracleImpl implements DeptDAO {
	public boolean update(Dept d) {
		// connect to datastore and create department d
		System.out.println("Updated department: " + d + " in ORACLE");
		return false;
	}
}

class EmpDAOMysqlImpl implements EmpDAO {
	public int create(Emp e) {
		// connect to datastore and create empleyee e
		System.out.println("Create employee: " + e + " in MySQL");
		return 0;
	}
}
class DeptDAOMysqlImpl implements DeptDAO {
	public boolean update(Dept d) {
		// connect to datastore and create department d
		System.out.println("Updated department: " + d + " in MySQL");
		return false;
	}
}

abstract class DAOFactory {
	protected abstract EmpDAO getEmpDAO();
	protected abstract DeptDAO getDeptDAO();
	public EmpDAO getEmpDAOInstance() {
		return getEmpDAO();
	}
	public DeptDAO getDeptDAOInstance() {
		return getDeptDAO();
	}
}

class OracleDAOFactory extends DAOFactory {
	protected EmpDAO getEmpDAO() {
		return new EmpDAOOracleImpl();
	}
	protected DeptDAO getDeptDAO() {
		return new DeptDAOOracleImpl();
	}
}
class MySQLDAOFactory extends DAOFactory {
	protected EmpDAO getEmpDAO() {
		return new EmpDAOMysqlImpl();
	}
	protected DeptDAO getDeptDAO() {
		return new DeptDAOMysqlImpl();
	}
}

/*
 * this is client and it should work on any implementation of factory
 */
class FactoryMethodAndDAO {
	public static void main(String args[]){
		/*
		 * switching between to factory implementation
		 * we only change "datastore" everything else
		 * stays the same
		 */
		
		//DAOFactory factory = new OracleDAOFactory();
		DAOFactory factory = new MySQLDAOFactory();

		EmpDAO empDAO = factory.getEmpDAOInstance();
		DeptDAO deptDAO = factory.getDeptDAOInstance();

		Emp emp = new Emp();
		emp.id = 22;
		emp.name = "MyName";
		empDAO.create(emp);

		Dept dept = new Dept();
		dept.id = 234;
		dept.name = "R&D";
		deptDAO.update(dept);
	}
}
