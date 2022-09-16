/*   (BookTree.java)
2. Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
    Get the number of elements in  tree set and print first and last element of treeset.
    */
package CollectionPack;

import java.util.ArrayList;

import java.util.TreeSet;

public class BookTree  {
	public static void main(String args[])
	{
		ArrayList<Book> a1=new ArrayList<Book>();
		Book b1=new Book("100","java","ABC");
		Book b2=new Book("110","phython","XYZ");
		Book b3=new Book("120","c++","MNO");
		//Element are added using add method
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		ArrayList<Book> a2=new ArrayList<Book>();
		Book b4=new Book("102","logical","neha");
		Book b5=new Book("103","maths","meenu");
		Book b6=new Book("104","skill","madhu");
		a2.add(b4);
		a2.add(b5);
		a2.add(b6);
		TreeSet<Book> ts=new TreeSet<Book>();

		ts.addAll(a1);
		ts.addAll(a2);
		//we will use for each loop in order to iterate through treeset
		for(Book b:ts)
		{
			//print the value
			System.out.println(b);
        }
		//print first element
		System.out.println("first element of tree set"+ts.first());
		//print last element
		System.out.println("last element of tree set"+ts.last());

     }
}
