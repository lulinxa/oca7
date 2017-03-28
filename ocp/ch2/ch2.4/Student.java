class Student {
	void attendLecture() {
		Lecture3 l = new Lecture3();
		l.notes(new Pen2() {
			public void write() {
				System.out.println("Okay! I am writin");
			}
		});
	}
}
