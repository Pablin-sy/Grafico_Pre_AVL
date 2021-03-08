package Arbol_PREW;

import javax.swing.JFrame;
import logica.Arbol;

public class LienzoArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arbol objArbol = new Arbol(); 
        Lienzo objLienzo = new Lienzo(); 
        Controlador objControlador = new Controlador(objLienzo, objArbol);
        objArbol.insertar(60);
        objArbol.insertar(20);
        objArbol.insertar(80);
        objArbol.insertar(70);
        objArbol.insertar(90);
        objControlador.iniciar();
        JFrame ventana = new JFrame();
        ventana.getContentPane().add(objLienzo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(600, 600);
        ventana.setVisible(true);
    }
}
