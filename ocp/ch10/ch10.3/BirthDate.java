import java.util.Date;

final class BirthDate {
	private final Date birth;
	public BirthDate(Date dob) {
		this.birth = dob;
	}
	public Date getBirthDate() {
		return (Date)birth.clone();
	}
	public boolean isOlder(Date other) {
		// calculate other with birth
		// return true is birth < other
		return false;
	}
}
