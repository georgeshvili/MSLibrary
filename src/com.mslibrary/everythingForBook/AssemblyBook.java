import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class AssemblyBook extends Book {

    HashMap<Integer, String> mapOfWorkNamesWithPages;

    public AssemblyBook(String booksName, String authorsLastName){
        super(booksName, authorsLastName);
        this.mapOfWorkNamesWithPages = setWorksNamesAndBeginPages();
    }

    public AssemblyBook(String booksName, String authorsFirstName,
                    String authorsLastName,String genre, int pages){
        super(booksName, authorsFirstName, authorsLastName, genre, pages);
    }

    public HashMap<Integer, String> setWorksNamesAndBeginPages(){
        mapOfWorkNamesWithPages = new HashMap<Integer, String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество работ: ");
        int numberOfWorks = scanner.nextInt();
        System.out.println("Введите номер страницы и название работы:");
        for(int i = 0; i < numberOfWorks; i++)
            mapOfWorkNamesWithPages.put(scanner.nextInt(), scanner.nextLine());
        return mapOfWorkNamesWithPages;
    }

    public HashMap<Integer, String> getMapOfWorkNamesWithPages() {
        return mapOfWorkNamesWithPages;
    }

    public String read(String bookName){

        return null;

    }

}
