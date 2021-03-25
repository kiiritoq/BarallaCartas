package barallas;

public class main {
    public static void main(String[] args) {
        BarallaFRA bf = new BarallaFRA();
        BarallaESP be = new BarallaESP(true);
        System.out.println("BARALLA ESPAÑOLA");
        be.crearBaralla();
        be.mostrarBaralla();
        be.darCarta(12);
        System.out.println("BARALLA FRANCESA");
        bf.crearBaralla();
        bf.barallar(bf.barallaFra);
        System.out.println("Cartas Dispoñibes: " + bf.cartasDisponibles());
        bf.mostrarBaralla();
        bf.darCarta(5);
        System.out.println("Cartas Dispoñibes: " + bf.cartasDisponibles());
    }
}
