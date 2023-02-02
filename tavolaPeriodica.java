import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * classe concreta immutabile che conserva e permette la ricerca degli elementi chimici
 */

public class tavolaPeriodica {

    //lista degli elementi chimici
    private final static List<elementochimico> tavPeriodica = new ArrayList<>();

    //AF: ogni posizione della lista rappresenta un elemento della tavola periodica 
    //in ordine di numero atomico.
    //IR: la lista deve essere ordinata per numero atomico

    /**
     * aggiunge tutti gli elementi passati in input
     * @param elementi l'array contenente tutti gli elementi da inserire
     * @throws NullPointerException se una posizione dell'array è null
     */
    public void inserisci(final elementochimico[] elementi) {
        for (elementochimico elem : elementi) {
            tavPeriodica.add(Objects.requireNonNull(elem, "L'elemento non può essere null"));
        }
    }

    public static elementochimico trova(String formula) {
        for (int i = 0; i<tavPeriodica.size(); i++) {
            if (tavPeriodica.get(i).getSimbolo()==formula) {
                return tavPeriodica.get(i);
            }
        }

        return null;
    }
}
