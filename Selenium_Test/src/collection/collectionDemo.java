package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionDemo {

	public static void main(String[] args)
	{
		List  list=new ArrayList();
		list.add(1);
		list.add("Dehuti");
		list.add(9.9);
		list.add(true);
		
		
		
		System.out.println(list.get(0));
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//			
//		}

		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
			
	}

}
