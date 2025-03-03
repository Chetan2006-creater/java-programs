public class book{
String Title;
String Author;
int Year_of_publication;
public book(String Title, String Author, int Year_of_publication){
this.Title = Title;
this.Author = Author;
this.Year_of_publication = Year_of_publication;
}
public void display(){
System.out.println("Title of the book is "+ Title +'\n'+"Its Author is "+ Author +'\n'+"Its year of Publication is "+ Year_of_publication);
}
public static void main(String[] args){
book book1 = new book("Thomus calculus" , "Thomas" , 1999);
book book2 = new book("Anandmath" , "Bankim Chandra Chatterjee" , 2006);
book book3 = new book("Chandalika" , "Rabindra Nath Tagore" , 1937);
book1.display();
book2.display();
book3.display();
}
}
