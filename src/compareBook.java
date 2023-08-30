import java.util.Comparator;

public interface compareBook extends Comparator<Book> {
    @Override
    int compare(Book o1, Book o2);
}
