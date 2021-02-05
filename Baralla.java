import java.util.Random;

public class Baralla {
    public Carta BarallaCartas[];
    private static final int MAX_BARALLA = 40;
    private static final String Palos[] = { "OUROS", "BASTOS", "COPAS", "ESPADAS" };
    private int contador = 0;
    private final int MAX_CARTAS = 40;

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
     * Método que lista todas as cartas. Recorre toda a baralla e imprimindo por
     * pantalla o número da carta e o pau.
     * 
     * !Este método é so para ver se sae correcta a información. ======= Método que
     * lista todas as cartas. Recorre toda a baralla de cartas. Este método é so
     * para ver a saída da baralla por pantalla.
     */
    public void mostrarBaralla() {
        for (int i = 0; i < BarallaCartas.length; i++) {
            System.out.println(BarallaCartas[i].toString());
        }
    }

    /**
     * Método que devolve a seguite carta. Inicializamos o contador a 0, e cada vez
     * que chamamos a este método, actaulízase o contador en +1 e devolve o valor da
     * carta.
     * 
     * @return c - Devolve a Carta, se é a última devólvea como null xa que
     *         significa que non quedan cartas. Sairá un aviso indicando que non hai
     *         máis cartas.
     */
    public String siguienteCarta() {
        String c = null;
        if (this.contador == MAX_CARTAS) {
            c = "Non quedan cartas";
        } else {
            c = BarallaCartas[contador++].toString();
        }
        return c;

    }

    /**
     * Método que devolve cantas cartas quedan por repartir. Para iso, o que facemos
     * é: coller as cartas totáis que hai (40) menos as que xa saíron. O contador
     * actualízase cada vez que chamamos ao método "siguienteCarta", polo tanto así
     * teremos o número de cartas restantes.
     * 
     * @return Devolve un número enteiro.
     */
    public int cartasDisponibles() {
        return MAX_CARTAS - contador;
    }

    /**
     * Método que retira n cartas da baralla.
     * 
     * @param n É o número de cartas que imos a retirar. Tamén será o número que
     *          teremos que actualizar no contador para que non nos conte esas
     *          cartas.
     * @return Devolve o número de cartas que quedan na baralla.
     */
    public int darCarta(int n) {
        contador += n;
        return cartasDisponibles() - n;
    }

    /**
     * Método que baralla as cartas. A este método temos que pasarlle un array de
     * Cartas (BarallaCartas). Xeramos un Obxeto rdm para xerar un número random
     * dende 0 (incluido) ata o array.length (excluído).
     */
    public void barallar(Carta[] array) {
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            int nummRad = rd.nextInt(array.length - i);
            Carta cTemp = array[nummRad];
            array[nummRad] = array[array.length - i - 1];
            array[array.length - i - 1] = cTemp;
        }

    }
}
