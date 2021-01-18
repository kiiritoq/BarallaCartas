import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class main {
    public static void main(String[] args) {
        Baralla b = new Baralla();
        b.crearBaralla();
        b.mostrarBaralla();
        System.out.println(b.cartasDisponibles());
        b.darCarta(5);
        System.out.println(b.cartasDisponibles());

    }
}
