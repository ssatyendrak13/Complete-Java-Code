package apniKaksha.oops.abstractions.Interface;

public class Person implements Student , YouTuber {
	
	public static void main(String args []) {
		
		Person p = new Person();
		p.study();
		p.MakeVideo();
		
	}

	@Override
	public void study() {
		System.out.println("person is studying ");
		
	}

	@Override
	public void MakeVideo() {
		System.out.println("person is making a good videos ");
		
	}

}
