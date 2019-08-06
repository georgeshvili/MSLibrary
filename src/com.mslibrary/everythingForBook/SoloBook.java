public class SoloBook extends Book {

    public SoloBook(String booksName, String authorsLastName){
        super(booksName,authorsLastName);
    }

    public SoloBook(String booksName, String authorsFirstName,
                    String authorsLastName,String genre, int pages){
        super(booksName, authorsFirstName, authorsLastName, genre, pages);
    }

    public String read(String bookName){

        return null;

    }

}
