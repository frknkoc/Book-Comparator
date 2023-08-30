import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        list.add(new Book("The Outsiders (Dışarıdakiler)", 540, "S.E. Hinton"));
        list.add(new Book("Mieko and the Fifth Treasure (Mieko ve Beşinci Hazine)", 730, "Eleanor Coerr"));
        list.add(new Book("Charlotte’s Web (Charlotte’nin Sevgi Ağı)", 610, "E.B. White"));

        list.sort(new compareBook() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("-- İsme Göre Sıralama --\n");
        for (Book s: list
        ) {
            System.out.println(s.getName() + " " + s.getNumberOfPages() + " " + s.getAuthor());
        }

        list.sort(new compareBook() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPages() - o2.getNumberOfPages();
            }
        });

        System.out.println("\n---- Sayfa Sayısına Göre Sıralama --\n");
        for (Book s: list
        ) {
            System.out.println(s.getName() + " " + s.getNumberOfPages() + " " + s.getAuthor());
        }

        TreeSet<Book> myBookList = new TreeSet<>(new CompareToName());
        myBookList.add(new Book("Peter Pan", 200, "J.M. Barrie"));
        myBookList.add(new Book("The Giver (Seçilmiş Kişi)", 180, "Lois Lowry"));
        myBookList.add(new Book("Number the Stars (Yıldızları Saymak))", 310, "Lois Lowry"));


        System.out.println("-- Liste --\n");
        for (Book s: myBookList
        ) {
            System.out.println(s.getName() + " " + s.getNumberOfPages() + " " + s.getAuthor());
        }

    }
}