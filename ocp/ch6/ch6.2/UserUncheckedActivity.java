class UserUncheckedActivity {
	public void login(String user, String pwd) {
		if(!findInDatabase(user, pwd))
			throw new LoginUncheckedException("Invalid username or password");
	}
	public boolean findInDatabase(String user, String pwd) {
		//
		return false;
	}
}
