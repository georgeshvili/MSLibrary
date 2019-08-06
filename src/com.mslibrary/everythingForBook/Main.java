public class Main {

    public static void main(String[] args) {
        System.out.println("That's my library");
        AssemblyBook firstBook = new AssemblyBook("Lalala","Trololo");
        System.out.println(firstBook.getBooksName() + firstBook.getAuthorsLastName());
        System.out.println(firstBook.getMapOfWorkNamesWithPages());
    }

}
