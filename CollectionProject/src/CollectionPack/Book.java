/*Create a class Book with 3 private data members:
-bid
-subject
-author*/
package CollectionPack;


public class Book implements  Comparable <Book>

{
   
	private String Bid;
    private String Subject;
    private String Author;
    //Create constructor 
    public Book(String bid, String subject, String author) {
		super();
		Bid = bid;
		Subject = subject;
		Author = author;
	}
	




	public void Book1(String bid2, String subject2, String author2) {
		// TODO Auto-generated constructor stub
	}





	public String getBid() {
		return Bid;
	}
	public void setBid(String bid) {
		Bid = bid;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	@Override
	public String toString() {
		return "Book [Bid=" + Bid + ", Subject=" + Subject + ", Author=" + Author + "]";
	}
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		return this.Bid.compareTo(b.getBid());
	}
    
}


