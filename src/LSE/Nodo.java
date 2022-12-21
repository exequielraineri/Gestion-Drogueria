package LSE;


public class Nodo<G> {

    private G dato;
    private Nodo ps;

    public Nodo(G elem) {
        dato = elem;
        ps = null;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

    /**
     * @return el dato
     */
    public G getDato() {
        return dato;
    }

    /**
     * @param dato el dato a establecer
     */
    public void setDato(G dato) {
        this.dato = dato;
    }

    /**
     * @return el ps
     */
    public Nodo getPs() {
        return ps;
    }

    /**
     * @param ps el ps a establecer
     */
    public void setPs(Nodo ps) {
        this.ps = ps;
    }

    void visualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
