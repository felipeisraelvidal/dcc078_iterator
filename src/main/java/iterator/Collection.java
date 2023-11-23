package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection implements Iterable<Book>{

    private List<Book> livros = new ArrayList<Book>();

    public Collection(Book... books) {
        this.livros = Arrays.asList(books);
    }

    @Override
    public Iterator<Book> iterator() {
        return livros.iterator();
    }

}
