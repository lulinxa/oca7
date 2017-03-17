class Course {
	String title;
	Course(String title){
		this.title = title;
	}
	public boolean equals(Object o) {
		if (o instanceof Course) {
			Course c = (Course) o;
			return (title.equals(c.title));
		}
		else 
			return false;
	}
}
class JavaCourse extends Course {
	int duration = 0;
	JavaCourse(String title, int duration){
		super(title);
		this.duration = duration;
	}
	public boolean equals(Object o) {
		if(o instanceof JavaCourse){
			return (super.equals(o) && 
					((JavaCourse)o).duration == duration);
		}
		else if(o instanceof Course){
			return super.equals(o);
		}
		else
			return false;
	}
}
public class Equals{
	public static void main(String... args){
		Course c1 = new JavaCourse("level1", 2);
		Course c2 = new Course("level1");
		Course c3 = new JavaCourse("level1", 12);

		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c1.equals(c3));
		/* prints 
		 *
		 * true 
		 * true
		 * false
		 *
		 * not transitive equals NOT overrriden appropriate
		 */

		/*
		 * reflexive 	-> x.equlas(x) = true
		 * symetric		-> x.equlas(y) = y.equals(x)
		 * transitive	-> x.equals(y) && y.equals(z) <==> x.equlas(z)
		 * consistent	-> multiple calls to equlas always returns same result
		 * x = non-null	-> x.equlas(null) = false
		 */
		 
	}
}
