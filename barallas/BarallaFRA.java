package barallas;

public class BarallaFRA extends Baralla implements Utilities {

    private static final int BARALLA = 53;
    private int contador = 0;
    public Carta[] barallaFra;
    private static final String palosFRA[] = { "DIAMANTES", "PICAS", "CORAZONES", "TREBOLES" };

    // Constructor
    public BarallaFRA() {
        barallaFra = new Carta[BARALLA];
    }

    // Metodos
    @Override
    public void crearBaralla() {
        for (int i = 0; i < palosFRA.length; i++) {
            for (int b = 0; b < barallaFra.length / 4; b++) {
                barallaFra[((barallaFra.length / 4) * i) + b] = new Carta(b + 1, palosFRA[i]);

            }
        }
        barallaFra[barallaFra.length - 1] = new Carta(0, "JOKER");
    }

    @Override
    public void mostrarBaralla() {
        for (int i = 0; i < barallaFra.length; i++) {
            System.out.println(barallaFra[i].toString());
        }

    }

    @Override
    public int cartasDisponibles() {
        return BARALLA - contador;
    }

    @Override
    public int darCarta(int n) {
        contador += n;
        return cartasDisponibles() - n;
    }
}
