/*(StudentMap.java)
3. WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
   Print the name of students whose id is greater than 103.*/
package CollectionPack;

import java.util.HashMap;
import java.util.Set;

public class StudentMap {
	public static void main(String args[])
	{
		HashMap<Integer,String> h1=new HashMap<>();
		h1.put(101,"Anny");
		h1.put(102, "Funny");
		h1.put(103, "Monika");
		h1.put(104, "Oly");
		h1.put(105, "Pinki");
		Set<Integer>keys=h1.keySet();
		for(Integer i:keys)
		{
			if(i.intValue()>103)
			{
				System.out.println(h1.get(i));
			}
		}
	}
}
