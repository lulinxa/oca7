class Emp {
	int id;
	String name;
	int age;
	String address;

	public String toString() {
		return "" + id + ":" + name;
	}
}
interface EmpDAO {
	public int create(Emp e);
}
class EmpDAOOracleImpl implements EmpDAO {
	public int create(Emp e) {
		// connect to datastore and create empleyee e
		System.out.println("Created employee: " + e + " in ORACLE");
		return 0;
	}
}
class EmpDAOMysqlImpl implements EmpDAO {
	public int create(Emp e) {
		// connect to datastore and create empleyee e
		System.out.println("Create employee: " + e + " in MySQL");
		return 0;
	}
}

abstract class DAOFactory {
	public static int ORACLE = 1;
	public static int MYSQL = 2;
	public static EmpDAO getEmpDAOInstance(int DBtype) {
		if(DBtype == ORACLE)
			return new EmpDAOOracleImpl();
		else if(DBtype == MYSQL)
			return new EmpDAOMysqlImpl();
		else
			return null;
	}
}

class SimpleFactoryAndDAO {
	public static void main(String args[]){
		EmpDAO empDAO = DAOFactory.getEmpDAOInstance(DAOFactory.ORACLE);
		Emp emp = new Emp();
		emp.id = 10;
		emp.name = "Harry";
		emp.age = 39;
		emp.address = "UK";
		empDAO.create(emp);
	}
}
