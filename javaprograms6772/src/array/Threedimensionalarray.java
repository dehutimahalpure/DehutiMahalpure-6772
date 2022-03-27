package array;

public class Threedimensionalarray {

	public static void main(String[] args)
	{
		int [][] myarray=new int [3][3];
		myarray[0][0]=0;
		myarray[0][1]=1;
		myarray[0][2]=1;
		
		myarray[1][0]=1;
		myarray[1][1]=0;
		myarray[1][2]=1;
		
		myarray[2][0]=1;
		myarray[2][1]=1;
		myarray[2][2]=0;
		
		System.out.println("Array elements are");
		System.out.println(myarray[0][0]+ " " +myarray[0][1]+ " " +myarray[0][2]);
		System.out.println(myarray[1][0]+ " " +myarray[1][1]+ " " +myarray[1][2]);
		System.out.println(myarray[2][0]+ " " +myarray[2][1]+ " " +myarray[2][2]);
		
		
	}

}
