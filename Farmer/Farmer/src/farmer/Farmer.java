/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanpedrog
 */
public class Farmer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree arbol=new BinaryTree();
        String cadena=arbol.search(",,,,|,Col,Granjero,Lobo,Oveja");
        System.out.print(cadena);
    }
    
}
