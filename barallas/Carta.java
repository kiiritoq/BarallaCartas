package barallas;

public class Carta {
    private int iNum;
    private String sPalo;

    /* Constructores */

    public Carta(int n, String p) {
        this.iNum = n;
        this.sPalo = p;
    }

    /* Metodos */

    public int getNum() {
        return iNum;
    }

    public void setNum(int n) {
        this.iNum = n;
    }

    public String getPalo() {
        return sPalo;
    }

    public void setPalo(String p) {
        this.sPalo = p;
    }

    @Override
    public String toString() {
        return iNum + " de " + sPalo;
    }

}
