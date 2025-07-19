public class BookInfo 
{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	BookInfo()
	{
		System.out.println("Empty Constructor");
	}
	public BookInfo(String bookName,String bookAuthor,String bookId,String bookType, int bookCopy){
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
	}
	public void setbookName(String bookName)
	{
		this.bookName=bookName;
	}
	public void setbookAuthor(String bookAuthor)
	{
		this.bookAuthor=bookAuthor;
	}
	public void setbookId(String bookId)
	{
		this.bookId=bookId;
	}
	public void setbookType(String bookType)
	{
		this.bookType=bookType;
	}
	public void setbookCopy(int bookCopy)
	{
		this.bookCopy=bookCopy;
	}
	public String getbookName()
	{
		return bookName;
	}
	public String getbookAuthor()
	{
		return bookAuthor;
	}
	public String getbookId()
	{
		return bookId;
	}
	public String getbookType()
	{
		return bookType;
	}
	public int getbookCopy()
	{
		return bookCopy;
	}
	
	public void showBookInfo()
	{
		System.out.println("BookName= " +bookName);
		System.out.println("BookAuthor= " +bookAuthor);
		System.out.println("BookKid= "+bookId);
		System.out.println("BookType= "+bookType);
		System.out.println("BookCopy= "+bookCopy);
	}
	static int bookCounter=0;
	
	public void addBookCopy(int bookCopy){
		this.bookCopy += bookCopy;
		bookCounter += bookCopy;
	}
	public void showTotalBookInfo()
	{
		System.out.println("Total number of books: " +bookCounter);
}
}