package LSE;

public class Lista<T> {

    protected Nodo list;

//	************************************* CONSTRUCTOR ******************************************************
    public Lista() {
        list = null;
    }

//	***************************************** INICIO *******************************************************
    public Nodo inicio() {
        return list;
    }

//	***************************************** INICIO *******************************************************
    public boolean listaVacia() {
        return (list == null);
    }

//	********************************** INSERTAR AL PRINCIPIO ***********************************************
    public void insertarPri(T elem) {
        Nodo x = new Nodo(elem);
        if (list == null) {
            list = x;
        } else {
            x.setPs(list);
            list = x;
        }
    }

    public void prt(String s) {
        System.out.println(s);
    }

//	******************************************** QUITAR ****************************************************
    public Nodo quitar(Nodo p, Nodo ant) {
        Nodo x = p;

        if (p == list) {
            list = p.getPs();
        } else {
            ant.setPs(p.getPs());

        }
        return x;
    }

    public Nodo<T> eliminar(Nodo elem) {
        Nodo<T> x = null;
        Nodo<T> p = list;
        Nodo<T> ant = null;
        if(list == null)
            return x;
        boolean band = false;
        while (p != null && !band) {
            if (p.getDato().hashCode()==elem.hashCode()) {
                band = true;
            } else {
                ant = p;
                p = p.getPs();

            }
        }
        if (band == true) {
            quitar(p, ant);
            x = p;
        }
        return x;
    }

    public <T> void visualizar() {
        Nodo p = inicio();
        while (p != null) {
            prt(p.getDato() + "");
            p = p.getPs();
        }
    }
    
    public <T> void mostrarLista(){
        Nodo<T> p=inicio();
        while(p!=null){
            p.toString();
            System.out.println(p.getDato().toString());
            p=p.getPs();
        }
    }
    
    
    

}
