package LSE;

public class ListaOrdenada<T> extends Lista {

    public ListaOrdenada() {
        super();
    }

    public void insertarMedio(Nodo p, Nodo ant, Nodo x) {
        x.setPs(p);
        ant.setPs(x);
    }

    public void insertarFin(Nodo ant, Nodo p, Nodo x) {
        if (p == null) {
            x.setPs(null);
            ant.setPs(x);
        }
    }

    public void insertar(T entrada) {
        Nodo p = inicio();
        Nodo ant = null;
        boolean b = false;
        boolean e = false;
        while (p != null && b == false) {
            if (p.getDato().hashCode() >= entrada.hashCode()) {
                if (p.getDato().hashCode() == entrada.hashCode()) {
                    e = true;
                    p = null;
                } else {
                    b = true;
                }

            } else {
                ant = p;
                p = p.getPs();
            }
        }
        Nodo x = new Nodo(entrada);
        if (!e) {
            if (b == true) {
                if (p == list) {
                    insertarPri(entrada);
                } else {
                    insertarMedio(p, ant, x);
                }
            } else if (ant == null) {
                list = x;
            } else {
                insertarFin(ant, p, x);
            }
        }else{
            System.out.println("Ya existe");
        }

    }

    
    @Override
    public Nodo<T> eliminar(Nodo elem) {
        Nodo x = null;
        Nodo p = inicio();
        Nodo ant = null;
        if (listaVacia()) {
            prt("Lista Vacía!!!");
            return x;
        }
        boolean band = false;
        while (p != null && !band) {
            if (p.getDato().hashCode()>= elem.getDato().hashCode()) {
                //System.out.println("Entro al hash");
                if (p.equals(elem)) {
                    //System.out.println("Entro al equals");
                    x = quitar(p, ant);
                    band = true;
                } else {
                    p = null;
                }
            } else {
                ant = p;
                p = p.getPs();
            }
        }
        if (band == true) {

            //prt("Elemento eliminado!");
        } else {
            //prt("Elemento inexistente!!!");
        }
        return x;
    }
    

}
