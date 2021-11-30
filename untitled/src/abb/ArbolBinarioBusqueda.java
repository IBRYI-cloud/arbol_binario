package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;
    public ArbolBinarioBusqueda(){
            raiz=null;
    }

    /*
    -Arbol esta vacio o no
     */
    public boolean estaVacio(){
        return raiz == null;
    }

    /*
    Metodo recursivo para Insertar un nodo a nuestro abb
     */
    public void insertar(Nodo padre, Nodo hijo, int dato){
        if (hijo == null){//casobase
            Nodo nuevo = new Nodo(null, dato, null);
            if (dato >= padre.getData()){
                padre.setDerecho(nuevo);
            } else {
                padre.setIzquierdo(nuevo);
            }
        } else {//llama recursivo
            if (dato >= padre.getData()){
                insertar(hijo, hijo.getDerecho(), dato);
            }else {
                insertar(hijo, hijo.getIzquierdo(), dato);
            }

        }
    }
    public void insertar(int dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo(null, dato, null);
            raiz = nuevo;
        }else {
                if (dato >= raiz.getData()){
                    insertar(raiz, raiz.getDerecho(), dato);
                }else {
                    insertar(raiz, raiz.getIzquierdo(), dato);
                }
        }

    }
    private void mostrarInOrden(Nodo nodo){
        if (nodo == null){
        }else {
            mostrarInOrden(nodo.getIzquierdo());
            System.out.println(nodo.getData() + " ");
            mostrarInOrden(nodo.getDerecho());
        }
    }
    public void mostrarInOrden(){
            Nodo temp  = raiz;
            mostrarInOrden(raiz);
        System.out.println();
    }
}
