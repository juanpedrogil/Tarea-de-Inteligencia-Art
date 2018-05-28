/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarabc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanpedrog
 */
public class Nodo {
    private char[] abcDesordenado;
    private char[] abcOrdenado;
    private List<Nodo> nodos=new ArrayList<Nodo>();
    public int tamNodos(){
        return nodos.size();
    }
    public Nodo(char[] abcDesordenado,char[] abcOrdenado){
        this.abcDesordenado=abcDesordenado;
        this.abcOrdenado=abcOrdenado;
    }
    public Nodo getNodo(int index){
        return nodos.get(index);
    } 
    public void setNodo(Nodo nodo){
        nodos.add(nodo);
    }
    public char getAbcDesordenado(int index){
        return abcDesordenado[index];
    }
    public char getAbcOrdenado(int index){
        return abcOrdenado[index];
    }
}
