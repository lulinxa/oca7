interface App {
	void open(String filename);
}

class WordProcessor implements App {
	public void open(String filename) {
		System.out.println("Launch WordProcessor using: " + filename);
	}
}
class TextEditor implements App {
	public void open(String filename) {
		System.out.println("Launch TextEditor using: " + filename);
	}
}

/* 
 * abstract Factory class
 */
abstract class AppFactory {
	public App getAppInstance() {
		App appln = getApp();
		return appln;
	}
	public abstract App getApp(); // factory method
}

/*
class AppFactory {
	public static App getAppInstance(String fileExtension) {
		App appln = null;
		if(fileExtension.equals(".docx")) {
			appln = new WordProcessor();
		} else if(fileExtension.equals(".xml")) {
			appln = new TextEditor();
		}
		return appln;
	}
}
*/

/* concrete factory classes */
class WordAppFactory extends AppFactory {
	public App getApp() {
		return new WordProcessor();
	}
}
class TextEditFactory extends AppFactory {
	public App getApp() {
		return new TextEditor();
	}
}

public class FactoryMethodClient {
	public static void main(String args[]){
		AppFactory factory = new WordAppFactory();
		App app = factory.getAppInstance();
		app.open("Hello.doc");
		
		app = new TextEditFactory().getAppInstance();
		app.open("Hello.xml");
	}
}

/*
 * Factory Method Pattern
 */
