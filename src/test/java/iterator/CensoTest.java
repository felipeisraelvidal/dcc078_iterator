package iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CensoTest {

    @Test
    void deveContarLivrosDisponiveisColecao() {
        Collection colecao = new Collection(
                new Book("Harry Potter e a Pedra Filosofal", true),
                new Book("Como eu era antes de você", true),
                new Book("Morte no Nilo", false),
                new Book("Simplismente acontece", true)
        );
        assertEquals(3, Censo.contarLivrosDisponiveisColecao(colecao));
    }

    @Test
    void deveContarTotalLivrosColecao() {
        Collection colecao = new Collection(
                new Book("Harry Potter e a Pedra Filosofal", true),
                new Book("Como eu era antes de você", true),
                new Book("Morte no Nilo", false),
                new Book("Simplismente acontece", true)
        );
        assertEquals(4, Censo.contarTotalLivrosColecao(colecao));
    }

}
