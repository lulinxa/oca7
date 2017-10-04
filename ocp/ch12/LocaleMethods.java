import java.util.*;
public class LocaleMethods {
	public static void main(String... args) {
		msg("Default locale: " + Locale.getDefault());
		Locale.setDefault(Locale.ITALY);

		Locale[] all = Locale.getAvailableLocales();

		for(Locale l : all) {
			msg("LOC: " + l);
		}

		Locale loc = new Locale("fr", "FR");

		msg("Code Country:"+loc.getCountry());
		msg("Code Language:"+loc.getLanguage());
		msg("Display Country:"+loc.getDisplayCountry());
		msg("Display Language:"+loc.getDisplayLanguage());
		msg("Display Name:"+loc.getDisplayName());

		msg("TEST: " + loc.getDisplayName(new Locale("jp", "JP")));
		msg("TEST: " + loc.getDisplayName(new Locale("en", "US")));

	}

	static void msg(String str) { System.out.println(str); }
}
