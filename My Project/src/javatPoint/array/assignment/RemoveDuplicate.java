package javatPoint.array.assignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove(new int[]{10,20,20,30,30,40,50,50});

	}
	public static void remove(int input[]) {
		int visited =-1;
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i] == input[j] && input[i] != visited)
					input[j]=visited;
			}
		}
		for(int i=0;i<input.length;i++) {
			if(input[i] != visited) {
				System.out.print(input[i]+" ");
			}
		}
	}

}
