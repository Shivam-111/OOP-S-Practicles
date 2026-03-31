// 19.	A library wants to store details of multiple books. 
// Question: 
// Create a class Book with attributes: 
//  title 
// 	author 
//	price 
// Create an array of Book objects and display the details of all books. 
class Books{
    String title;
    String author;
    double price;

    //Constructor
    Books(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Book Author: "+author);
        System.out.println("Book price: "+price);
    }
}
class Library{
    public static void main(String args[]){
        Books[] book = new Books[3];
        book[0] = new Books("Bulid Dont talk","RajShamani",250);
        book[1] = new Books("Unbreakable","Shivam Dipte",100);
        book[1] = new Books("Unbreakable","Shivam Dipte",100);

        book[0].display();
        book[1].display();
        book[2].display();
    }
}