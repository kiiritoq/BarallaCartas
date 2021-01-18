public class Baralla {
    public Carta BarallaCartas[];
    private static final int MAX_BARALLA = 40;
    private static final String Palos[] = { "OUROS", "BASTOS", "COPAS", "ESPADAS" };

    /* Constructor */
    /**
     * Constructor da clase Baralla. Crea unha baralla poñendo un máximo de 40
     * cartas que é unha constante que xa está gardada como MAX_BARALLA. Cando
     * utilizamos o método constructor, o que fai é xerar un listado de Cartas con
     * un máximo que nos lle pasemos.
     */
    public Baralla() {
        this.BarallaCartas = new Carta[MAX_BARALLA];
    }

    /* Metodos */
    /**
     * Método que crea a baralla ordenada. Por cada pau, xera 10 cartas, do 1 ao 10.
     * Ten un condicional dentro que evalúa a entrada para os número maiores ca 7.
     * Procede a sumar +3 ao número seguinte, dandolle os valores reais que teñen as
     * cartas. O 10,11 e 12 son a Sota, Cabalo e Rei.
     */

    public void crearBaralla() {
        for (int a = 0; a < Palos.length; a++) {
            for (int b = 0; b < 10; b++) {
                if (b >= 7) {
                    BarallaCartas[(10 * a) + b] = new Carta(b + 3, Palos[a]);
                } else {
                    BarallaCartas[(10 * a) + b] = new Carta(b + 1, Palos[a]);
                }
            }
        }
    }

    /**
     * Método que lista todas as cartas. Recorre toda a  baralla e imprimindo
     * por pantalla o número da carta e o pau. 
     * 
     * !Este método é so para ver se sae correcta a información.
     */
    public void mostrarBaralla() {
        for (int i = 0; i < BarallaCartas.length; i++) {
            System.out.println(BarallaCartas[i].toString());
        }
    }
    

}
