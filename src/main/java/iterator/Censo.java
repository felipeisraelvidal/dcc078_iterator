package iterator;

import java.util.Iterator;

public class Censo {
    public static Integer contarLivrosDisponiveisColecao(Collection colecao) {
        int quantidade = 0;
        for (Book book : colecao) {
            if (book.isAvailable()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosColecao(Collection collection) {
        int quantidade = 0;
        for (Iterator a = collection.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
