class Author {
	String name;
	String skypeName;
	public String getSkypeID() {
		return skypeName;
	}
}
class Editor {
	public void clearEditingDoubts(Author author) {
		/* 
		 * if skypeName changed than we have to change
		 * setUpCall method /argument name/
		 * but if we call method which returns skypeName/ID/whatever
		 * then Editor becomes idepemndent on change of skypeName/ID name
		 * in Author class
		 */
		//		  author.getSkypeID() -> loosely(low) coupling
		setUpCall(author.skypeName); // tightly coupled Editor with Author
		converse(author);
	}
	void setUpCall(String skypeID) {}
	void converse(Author author) {}
}
