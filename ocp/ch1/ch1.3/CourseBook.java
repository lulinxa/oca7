public class CourseBook extends Book {
	boolean onlyForReference;
	CourseBook(boolean onlyForReference){
		this.onlyForReference = onlyForReference;
	}
	@Override
	void issueBook(int days){
		if(onlyForReference)
			System.out.println("Reference Book");
		else
			if(days < 14)
				super.issueBook(days);
			else
				System.out.println("days >= 14");
	}
}
