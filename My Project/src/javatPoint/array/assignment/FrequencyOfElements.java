package javatPoint.array.assignment;

public class FrequencyOfElements {
	
	public static void main(String args[]) {
		frequency(new int [] {2,4,2,3,4});
	}
	
	public static void frequency(int input[]) {
		
		int fr[]= new int[input.length];
		int visited =-1;
		for(int i=0; i<input.length;i++) {
			int count =1;
			for(int j=i+1; j<input.length;j++) {
				if(input[i] == input[j]) {
					count++;
					fr[j]=-1;
				}
			}
			if(fr[i] != visited) {
				fr[i]=count;
			}
			
		}
		for(int i=0; i<fr.length;i++) {
			if(fr[i] != visited) {
				System.out.println(input[i]+"     "+fr[i]);
			}
		}
	}

}
