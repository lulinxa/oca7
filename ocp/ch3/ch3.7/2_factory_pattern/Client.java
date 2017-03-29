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

class Client {
	public static void main(String args[]){
		App app = AppFactory.getAppInstance(".docx");
		app.open("Hello.doc");
		App app2 = AppFactory.getAppInstance(".xml");
		app2.open("Hello.xml");
	}
}

/*
 * Simple example of Simple Factory (Static Factory) pattern
 */
