interface Author {
	String getSkypeID();
}
class TechnicalAuthor implements Author {
	String name;
	String skypeName;
	public String getSkypeID() {
		return skypeName;
	}
}
class Editor {
	public void clearEditingDoubts(Author author) {
		setUpCall(author.getSkypeID());
		converse(author);
	}
	void setUpCall(String skypeID) {}
	void converse(Author author) {}
}
