/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarabc;

/**
 *
 * @author juanpedrog
 */
public class OrdenarABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo g=new Grafo();
        g.search(new Nodo(new char[]{' ',' ',' '},new char[]{'a','b','c'}));
        String cad=g.recorrido;
        System.out.print(cad);
    }
    
}
