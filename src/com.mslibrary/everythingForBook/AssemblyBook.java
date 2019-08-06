import java.util.HashMap;
import java.util.LinkedList;

public class AssemblyBook extends Book {

    private LinkedList<String> worksNames;
    private LinkedList<Integer> beginPages;
    HashMap<Integer, String> mapOfWorkNamesWithPages;

    public AssemblyBook(String booksName, String authorsLastName){
        super(booksName, authorsLastName);
        this.mapOfWorkNamesWithPages = collectAssemblyBook();
    }

    public AssemblyBook(String booksName, String authorsFirstName,
                    String authorsLastName,String genre, int pages){
        super(booksName, authorsFirstName, authorsLastName, genre, pages);
    }

    public HashMap<Integer, String> getMapOfWorkNamesWithPages() {
        return mapOfWorkNamesWithPages;
    }

    private LinkedList<Integer> collectBeginPages(){

        beginPages = new LinkedList<Integer>();

        for(int i = 0; i <= 100; i+= 10){
            beginPages.add(i);
        }

        return beginPages;

    }
    private LinkedList<String> collectWorksNames(){

        worksNames = new LinkedList<String>();

        for(int i = 0; i <= 100; i+=10){
            worksNames.add("Произведение на странице номер -" + i);
        }

        return worksNames;

    }

    private HashMap<Integer, String> collectAssemblyBook(){

        mapOfWorkNamesWithPages = new HashMap<Integer, String>();

        this.beginPages = collectBeginPages();
        this.worksNames = collectWorksNames();

        for(int i = 0; beginPages.isEmpty() == false && worksNames.isEmpty() == false;)
            mapOfWorkNamesWithPages.put(beginPages.remove(i), worksNames.remove(i));

        return mapOfWorkNamesWithPages;
    }

    public String read(String bookName){

        return null;

    }

}
