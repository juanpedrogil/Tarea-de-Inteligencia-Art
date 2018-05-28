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
public class Grafo {
    public Nodo root;
    public String recorrido;

    public Grafo() {
        
        root=new Nodo(new char[]{'a','b','c'},new char[]{' ',' ',' '});
        root.setNodo(new Nodo(new char[]{' ',' ','c'},new char[]{' ','a','b'}));
        root.setNodo(new Nodo(new char[]{' ','b',' '},new char[]{' ','a','c'}));
        root.setNodo(new Nodo(new char[]{' ',' ','c'},new char[]{' ','b','a'}));
        root.setNodo(new Nodo(new char[]{'a',' ',' '},new char[]{' ','b','c'}));
        root.setNodo(new Nodo(new char[]{'a',' ',' '},new char[]{' ','c','b'}));
        root.setNodo(new Nodo(new char[]{' ','b',' '},new char[]{' ','c','a'}));
        root.getNodo(0).setNodo(new Nodo(new char[]{' ',' ',' '},new char[]{'c','a','b'}));
        root.getNodo(1).setNodo(new Nodo(new char[]{' ',' ',' '},new char[]{'b','a','c'}));
        root.getNodo(2).setNodo(new Nodo(new char[]{' ',' ',' '},new char[]{'c','b','a'}));
        root.getNodo(3).setNodo(new Nodo(new char[]{' ',' ',' '},new char[]{'a','b','c'}));
        root.getNodo(4).setNodo(new Nodo(new char[]{' ',' ',' '},new char[]{'a','c','b'}));
        root.getNodo(5).setNodo(new Nodo(new char[]{' ',' ',' '},new char[]{'b','c','a'}));
        //root.getNodo(0).setNodo(root.getNodo(1));
        //root.getNodo(1).setNodo(root.getNodo(0));
        
    }
    public boolean search(Nodo fin){
        if(fin.getAbcOrdenado(0)==root.getAbcOrdenado(0)
                && fin.getAbcOrdenado(1)==root.getAbcOrdenado(1)
                && fin.getAbcOrdenado(2)==root.getAbcOrdenado(2)){
            recorrido+="(("+root.getAbcDesordenado(0)+","+root.getAbcDesordenado(1)+
                    ","+root.getAbcDesordenado(2)+")("+root.getAbcOrdenado(0)+
                    ","+root.getAbcOrdenado(1)+","+root.getAbcOrdenado(2)+"));";
            return true;
        }
        return search(fin,root);
    }
    public boolean search(Nodo fin,Nodo padre){
        recorrido+="(("+padre.getAbcDesordenado(0)+","+padre.getAbcDesordenado(1)+
                    ","+padre.getAbcDesordenado(2)+")("+padre.getAbcOrdenado(0)+
                    ","+padre.getAbcOrdenado(1)+","+padre.getAbcOrdenado(2)+"));";
        if(fin.getAbcOrdenado(0)==padre.getAbcOrdenado(0)
                && fin.getAbcOrdenado(1)==padre.getAbcOrdenado(1)
                && fin.getAbcOrdenado(2)==padre.getAbcOrdenado(2)){
            return true;
        }
        for(int i=0;i<padre.tamNodos();i++){
            if(search(fin,padre.getNodo(i))){
                return true;
            }
        }
        return false;
    }
    
}
