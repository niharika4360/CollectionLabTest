/*   (BookList.java)
1.WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
 and print elements of both ArrayLists one on one line.*/
package CollectionPack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BookList {
	public static void main (String args[]) {

		//Creating ArrayList and Adding element
		ArrayList<String> a1=new ArrayList<String>();
		Book b1=new Book("100","java","ABC");
		Book b2=new Book("110","phython","XYZ");
		Book b3=new Book("120","c++","MNO");
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);

	
		ArrayList<String> a2=new ArrayList<String>();
        Book b4=new Book("102","logical","neha");
		Book b5=new Book("103","maths","meenu");
		Book b6=new Book("104","skill","madhu");
		a2.add(b4);
		a2.add(b5);
		a2.add(b6);
		//Traversing element and Print
	    ListIterator<Integer> it=a1.listIterator();
	    while(it.hasNext())
	    {
		   System.out.println(it.next());
	    }
	    ListIterator<Integer> it1=a2.listIterator();
	    while(it.hasNext())
	    {
		   System.out.println(it1.next());
	    }

			
	}
}