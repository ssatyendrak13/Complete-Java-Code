package apniKaksha.string.functionOfString;

public class Split {

	public static void main(String[] args) {
		String name = "satyendra , nirala , amar , sachin , krishnakant";
		String allname[] = name.split(" , ");
		for(String sattu : allname) {
			System.out.println(sattu);
		}

	}

}
