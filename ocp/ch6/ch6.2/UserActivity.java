class UserActivity {
	public void login(String user, String pwd) throws LoginException {
		if(!findInDatabase(user, pwd))
			throw new LoginException("Invalid username or password");
	}
	public boolean findInDatabase(String user, String pwd) {
		//
		return false;
	}
}
