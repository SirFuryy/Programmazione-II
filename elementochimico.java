import java.util.Objects;

/**
 * classe concreta immutabile che rappresenta un elemento chimico
 */
public class elementochimico {
    
    //numero dei protoni dell'elemento
    private final int numeroAtomico; 

    //nome dell'elemento
    private final String nome;

    //simbolo chimico dell'elemento
    private final String simbolo;

    //massa atomica unificata dell'elemento
    private final float peso;

    //AF: il numero atomico corrisponde al numero di protoni dell'elemento, il nome
    //corrisponde al nome dato all'elemento, il simbolo corrisponde al simbolo
    //chimico dell'elemento, il peso corrisponde alla massa atomica unificata dell'
    //elemento
    //IR: numero atomico non null e positivo, nome non null e non vuoto, simbolo
    //non null, non vuoto e con la prima lettera Maiuscola, peso non null e 
    //positivo

    /**
     * costruisce un elemento a partire dal numero atomico, dal nome, dal simbolo atomico e dal 
     * peso dell'elemento se il numero atomico non è null ed è positivo, il nome non è null e 
     * non è vuoto, il simbolo non è null, non è vuoto e ha la prima lettera Maiuscola, il 
     * peso non è null ed è positivo.
     * 
     * @param numAt il numero atomico nell'elemento
     * @param nome il nome dell'elemento
     * @param simboloAt il smbolo atomico dell'elemento
     * @param pesoAt il peso atomico dell'elemento
     * @throws IllegalArgumentException se il numero atomico non è positivo, il nome dell'
     * elemento è vuoto, se Il simbolo chimico non può essere null, vuoto o con la prima lettera minuscola
     * se il peso atomico non è positivo
     * @throws NullPointerException se il numero atomico o il nome o il simbolo atomico o il peso
     * Atomico sono null
     */
    public elementochimico(final int numAt, final String nome, final String simboloAt, final float pesoAt) {
        if (Objects.requireNonNull(numAt, "il numero atomico non può essere vuoto") <= 0) {
            throw new IllegalArgumentException("Il numero atomico deve essere positivo");
        }
        
        if (Objects.requireNonNull(nome, "il nome dell'elemento non può essere vuoto") == " " ) {
            throw new IllegalArgumentException("Il nome dell'elemento non può essere vuoto");
        }

        //da guardare se cathcare
        if (Helpers.elementoValido(simboloAt)) {
            throw new IllegalArgumentException("Il simbolo chimico non può essere null, vuoto o con la prima lettera minuscola");
        }

        if (pesoAt <= 0) {
            throw new IllegalArgumentException("Il peso atomico deve essere positivo");
        }

        this.numeroAtomico = numAt;
        this.nome = nome;
        this.simbolo = simboloAt;
        this.peso = pesoAt;
    }

    /**
     * ritorna il numero atomico di questo
     * 
     * @return il numero atomico dell'elemento
     */
    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    /**
     * ritorna il nome di questo
     * 
     * @return il nome dell'elemenot
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * ritorna il simbolo atomico di questo
     * 
     * @return il simbolo atomico edll'elemento
     */
    public String getSimbolo() {
        return simbolo;
    }

    /**
     * ritorna il peso atomico di questo
     * 
     * @return il peso atomico dell'elemento
     */
    public float getPeso() {
        return peso;
    }
}
