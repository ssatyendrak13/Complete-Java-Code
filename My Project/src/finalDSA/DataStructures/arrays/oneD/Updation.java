package finalDSA.DataStructures.arrays.oneD;

public class Updation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] =  { 18, 30, 15, 70, 12,15 };
		
		for(int i=0; i<input.length; i++) {
			if(input[i]==15) {
				input[i]=50;
//				break;
			}
		}
		for(int item : input) {
			System.out.print(item+" ");
		}
	}

}
