package barallas;

public class BarallaESP extends Baralla implements Utilities {
    private static final int BAR_LONGA = 48;
    private static final int BAR_NORMAL = 40;
    private static final String PalosESP[] = { "OUROS", "BASTOS", "COPAS", "ESPADAS" };

    // Constructor

    public BarallaESP(boolean b) {
        if (b) {
            super.BarallaCartas = new Carta[BAR_NORMAL];
        } else {
            super.BarallaCartas = new Carta[BAR_LONGA];
        }
    }

    /* METODOS */

    /**
     * Método que crea a baralla ordenada. Por cada pau, xera 10 cartas, do 1 ao 10.
     * Ten un condicional dentro que evalúa a entrada para os número maiores ca 7.
     * Procede a sumar +3 ao número seguinte, dandolle os valores reais que teñen as
     * cartas. O 10,11 e 12 son a Sota, Cabalo e Rei.
     */
    @Override
    public void crearBaralla() {
        for (int a = 0; a < PalosESP.length; a++) {
            if (BarallaCartas.length == 40) {
                for (int b = 0; b < BarallaCartas.length / 4; b++) {
                    if (b >= 7) {
                        BarallaCartas[((BarallaCartas.length / 4) * a) + b] = new Carta(b + 3, PalosESP[a]);
                    } else {
                        BarallaCartas[((BarallaCartas.length / 4) * a) + b] = new Carta(b + 1, PalosESP[a]);
                    }
                }
            } else {
                for (int c = 0; c < BarallaCartas.length / 4; c++) {
                    BarallaCartas[((BarallaCartas.length / 4) * a) + c] = new Carta(c + 1, PalosESP[a]);
                }
            }
        }
    }

    @Override
    public void mostrarBaralla() {
        for (int i = 0; i < BarallaCartas.length; i++) {
            if (BarallaCartas[i].getNum() == 1) {
                System.out.print("As");
            } else if (BarallaCartas[i].getNum() == 10) {
                System.out.print("Sota");
            } else if (BarallaCartas[i].getNum() == 11) {
                System.out.print("Cabalo");
            } else if (BarallaCartas[i].getNum() == 12) {
                System.out.print("Rei");
            } else {
                System.out.print(BarallaCartas[i].getNum());
            }

            System.out.print(" de " + BarallaCartas[i].getPalo() + "\n");
        }
    }

}
