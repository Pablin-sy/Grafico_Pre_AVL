package Arbol_PREW;

import logica.Arbol;

public class Controlador {
    private final Lienzo objLienzo;
    private final Arbol objArbol; 

    public Controlador(Lienzo objLienzo, Arbol objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objLienzo.setObjArbol(objArbol);
    }
}
