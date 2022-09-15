package apniKaksha.oops.inheritance.singletonPattern;

public class AppConfig {
	
	private AppConfig() {
		
		
	}
	private static AppConfig obj = null;
	
	public static AppConfig getInstance() {
		if(obj==null) {
			obj= new AppConfig();
		}
		return obj;
	}

}
