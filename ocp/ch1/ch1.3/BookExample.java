class BookExample {
	public static void main(String... args) {
		Book b = new CourseBook(true);
		b.issueBook(100);
		b = new CourseBook(false);
		b.issueBook(100);
		b = new Book();
		b.issueBook(0);
		b.issueBook(100);
	}
}
