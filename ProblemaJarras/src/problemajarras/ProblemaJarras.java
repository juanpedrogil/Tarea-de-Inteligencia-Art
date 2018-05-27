/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemajarras;

/**
 *
 * @author juanpedrog
 */
public class ProblemaJarras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo g=new Grafo();
        if(g.search(new Nodo(new Jarra(4,4),new Jarra(4,2),new Jarra(3,0)))){
            System.out.print(g.recorrido);
        }
    }
    
}
