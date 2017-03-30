/* Abstract Factory Client */
interface App {}
class WordProcessor implements App {}
class TextEditor implements App {}

interface Font {}
class RichFont implements Font {}
class RegularFont implements Font {}

/* 
 * abstract Factory class
 */
abstract class AppFactory {
	protected abstract App getApp();
	protected abstract Font getFont();

	public App getAppInstance() {
		App appln = getApp();
		return appln;
	}
	public Font getFontInstance() {
		Font font = getFont();
		return font;
	}
}

/* concrete factory classes */
class WordAppFactory extends AppFactory {
	protected App getApp() {
		return new WordProcessor();
	}
	protected Font getFont() {
		return new RichFont();
	}
}
class TextEditAppFactory extends AppFactory {
	protected App getApp() {
		return new TextEditor();
	}
	protected Font getFont() {
		return new RegularFont();
	}
}

public class AbstractFactoryClient {
	public static void main(String args[]){
		AppFactory factory1 = new WordAppFactory();
		App app1 = factory1.getAppInstance();
		Font font1 = factory1.getFontInstance();
		System.out.println(app1 + ":" + font1);

		AppFactory factory2 = new TextEditAppFactory();
		App app2 = factory2.getAppInstance();
		Font font2 = factory2.getFontInstance();
		System.out.println(app2 + ":" + font2);
	}
}
