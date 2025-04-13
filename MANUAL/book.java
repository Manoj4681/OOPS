// questiion 1 
class book {

   
    private String title;
    private String author;
    private int yearOfPublication;


    public book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
 System.out.println("did by: M.N.H.O.K.MANOJ  from cse-c roll no : cse24214")
       
        book book1 = new book("Malgudi Days", "R.K. Narayan", 1953);
        book book2 = new book("Voice of India - Asha Bhosle", "Mohammad Rafi", 1972);


        book1.displayDetails();
        book2.displayDetails();
    }
}
