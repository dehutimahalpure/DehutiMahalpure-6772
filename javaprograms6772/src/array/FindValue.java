package array;

public class FindValue {

	public static void main(String[] args) 
	{
		int[] num ={10,20,30,40,50,60,70,80,90};
		int value =30;
		boolean found=false;
		for(int i : num)
		{
			if(i==value)
			{
				found=true;
				break;
			}
		}
		if(found)
			System.out.println(value +"  is found ");
		else
			System.out.println(value +"  is not found ");
	}
	}


