package array;

public class AverageArray {

	public static void main(String[] args) 
	{
		
	   int[] Arr={1,2,3,4,5};
	   int length=Arr.length;
	   int sum=0;
    	for(int i=0; i < Arr.length; i++)
    	{
    		sum +=Arr[i];
    	}
    		double average = sum / length;
    		System.out.println("Average of Array :"+average);
    	
    		
    }
	
	
	
	}


