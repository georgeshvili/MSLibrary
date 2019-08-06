public abstract class Book implements ReadableBook {

    /**
     * @author George Djaniashvili
     */

    private String booksName;
    private String authorsFirstName;
    private String authorsLastName;
    private String genre;
    private int pages;

    protected Book(String booksName, String authorsLastName){
        this.booksName = booksName;
        this.authorsLastName = authorsLastName;
    }

    protected Book(String booksName, String authorsFirstName,
                   String authorsLastName,String genre, int pages){
        this.booksName = booksName;
        this.authorsFirstName = authorsFirstName;
        this.authorsLastName = authorsLastName;
        this.genre = genre;
        this.pages = pages;
    }

    public void setName(String name){ this.booksName = name; }

    public String getBooksName(){ return booksName; }

    public void setAuthorsFirstName(String authorsFirstName){ this.authorsFirstName = authorsFirstName; }

    public String getAuthorsFirstName(){ return authorsFirstName; }

    public void setAuthorsLastName(String authorsLastName){ this.authorsLastName = authorsLastName; }

    public String getAuthorsLastName(){ return authorsLastName; }

    public void setGenre(String genre){ this.genre = genre; }

    public String getGenre(){ return genre; }

    public void setPages(int pages){ this.pages = pages; }

    public int getPages(){ return pages; }

}
