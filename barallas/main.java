package barallas;

public class main {
    public static void main(String[] args) {
        BarallaFRA bf = new BarallaFRA();
        bf.crearBaralla();
        bf.barallar(bf.barallaFra);
        System.out.println("Cartas Dispoñibes: " + bf.cartasDisponibles());
        bf.mostrarBaralla();
        bf.darCarta(5);
        System.out.println("Cartas Dispoñibes: " + bf.cartasDisponibles());
    }
}
