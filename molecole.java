/**
 * classe concreta immutabile che crea e rappresenta delle molecole
 */
public class molecole{

    //formula bruta di una molecola
    private final String formula;

    //peso atomico della molecola
    private final float peso;

    //la complessità della molecola (semplice o complessa)
    private final String complessita;


    //AF: la formula rappresenta gli elementi che compongono la molecola, il peso rappresenta 
    //la somma dei pesi atomici degli elementi che compongono la molecola, la complessità
    //rappresenta se la molecola è composta solo da atomi dello stesso elemento o se è 
    //composta da atomi di più elementi
    //IR: formula non null e composta dai simboli atomici degli atomi degli elementi che la 
    //compongono, peso non null, positivo e somma dei pesi atomici degli atomi degli elementi
    // che la compongono, complessità non null e o "semplice" o "complessa"

    /**
     * crea le molecole a partire dalla formula passata in input se la formula non è null ed
     * è nel formato corretto
     * @param formula la formula della molecola
     * @throws IllegalArgumentException se la formula è null o non è nel formato corretto
     */
    public molecole(final String formula) {
        String[] elementi;
        try {
            elementi = Helpers.parseFormula(formula);
        } catch (Exception e) {
            throw new IllegalArgumentException("La formula non deve essere null o di formulazione errata", e);
        }
        //this.formula = formulaHill(elementi);
        this.formula=formula; //non è quella corretta, non sono riuscito a crearlo
        this.peso = pesoMolecola(elementi);

        if (elementi.length==2) {
            this.complessita="semplice";
        } else {
            this.complessita = "complessa";
        }
    } 


    /**
     * ritorna il peso della molecola se la formula passata in input è corretta
     * @param formula di cui vogliamo calcolare il peso
     * @return il peso della molecola
     * @throws IllegalArgumentException se la formula è null o non è nel formato corretto //non implementato
     */
    public float pesoMolecola(final String[] formula) {
        float pesocompl= 0.0f;
        for (int i = 0; i<formula.length; i=i+2) {
            pesocompl=tavolaPeriodica.trova(formula[i]).getPeso() * Integer.parseInt(formula[i+1]) ;
        }

        return pesocompl;
    }

    /**
     * Restituisce la formula in formato formula di hill
     * @param formulagrezza la formula da sistemare
     * @return la formula correttamente identata
     
    public String formulaHill(final String[] formulagrezza) {
        String formHill;
        String[] arraysupport;
        for (int i = 0; i<formulagrezza.length; i=i+2) {
            if (formulagrezza[i]=="C") {
                
                if (formulagrezza[i+1]!="1") {

                }
            }
        }
    }
    */
}
