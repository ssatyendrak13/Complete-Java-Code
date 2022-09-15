package ramaSoft.oops;

public class GarvageCollector {
	
		public static void main(String []args){

			Sample objr1=new Sample();
			Sample objr2=objr1;
			objr2=null;
			objr1=null;
			System.gc(); //way1
//			Runtime.getRuntime().gc(); //way2

		}

}
class Sample{
	int num;
	  void setNum(int num)
	  {
		  this.num=num;
	  }
	  int getNum()
	  {
		  return num;
	  }
	  protected void finalize(){
	      System.out.println("Finalize method ");
	  }
}
