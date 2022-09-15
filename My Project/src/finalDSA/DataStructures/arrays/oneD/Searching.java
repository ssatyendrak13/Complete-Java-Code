package finalDSA.DataStructures.arrays.oneD;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] =  { 18, 30, 15, 70, 12 };
		
		int elem = 70;
		for(int i=0; i<input.length; i++) {
			if(input[i]==elem) {
				System.out.println("elem is found at pos "+(i+1));
				break;
			}
		}
	}

}
