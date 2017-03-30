import java.util.Collection;
import java.util.ArrayList;
class Emp {
	int id;
	String name;
	int age;
	String address;
}
interface EmpDAO {
	public int create(Emp e);
	public Emp get(int id);
	public boolean delete(Emp e);
	public boolean update(Emp e);
	public Collection<Emp> getAll();
}
class EmpDAOImpl implements EmpDAO {
	public int create(Emp e) {
		// connect to datastore, insert data for empleyee e
		return 0;
	}
	public Emp get(int id) {
		// connnect to datastore, retrieve and return data for employee id
		return new Emp();
	}
	public boolean delete(Emp e) {
		// connect to datastore, delete employee  e
		return false;
	}
	public boolean update(Emp e) {
		// connect do datastore, update employee e
		return false;
	}
	public Collection<Emp> getAll() {
		// connect to datastore, retrieve emp data, return as Collection
		return new ArrayList<Emp>();
	}
}
class Client {
	public static void main(String args[]){
		Emp emp = new Emp();
		emp.id = 10;
		emp.name = "Harry";
		emp.age = 39;
		emp.address = "HR";

		EmpDAO dao = new EmpDAOImpl();
		dao.create(emp);
		emp.name = "Hrvoje";
		emp.age = 40;
		dao.update(emp);

		Emp emp2 = dao.get(11);
		if(emp2 != null)
			dao.delete(emp2);
	}
}
