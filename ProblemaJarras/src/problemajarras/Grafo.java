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
public class Grafo {
    private Nodo root;
    public String recorrido="";

    public Grafo() {
        root=new Nodo(new Jarra(4,0),new Jarra(4,0),new Jarra(3,0));
        root.addNodo(new Nodo(new Jarra(4,4),new Jarra(4,0),new Jarra(3,0)));
        root.addNodo(new Nodo(new Jarra(4,0),new Jarra(4,0),new Jarra(3,3)));
        root.getNodo(1).addNodo(new Nodo(new Jarra(4,4),new Jarra(4,0),new Jarra(3,3)));
        root.getNodo(1).addNodo(new Nodo(new Jarra(4,3),new Jarra(4,0),new Jarra(3,0)));
        root.getNodo(1).getNodo(1).addNodo(new Nodo(new Jarra(4,4),new Jarra(4,0),new Jarra(3,0)));
        root.getNodo(1).getNodo(1).addNodo(new Nodo(new Jarra(4,3),new Jarra(4,4),new Jarra(3,0)));
        root.getNodo(1).getNodo(1).addNodo(new Nodo(new Jarra(4,3),new Jarra(4,0),new Jarra(3,3)));
        root.getNodo(1).getNodo(1).getNodo(0).addNodo(new Nodo(new Jarra(4,4),new Jarra(4,4),new Jarra(3,0)));
        root.getNodo(1).getNodo(1).getNodo(0).addNodo(new Nodo(new Jarra(4,1),new Jarra(4,0),new Jarra(3,3)));
        root.getNodo(1).getNodo(1).getNodo(1).addNodo(new Nodo(new Jarra(4,3),new Jarra(4,4),new Jarra(3,3)));
        root.getNodo(1).getNodo(1).getNodo(2).addNodo(new Nodo(new Jarra(4,4),new Jarra(4,0),new Jarra(3,2)));
        root.getNodo(1).getNodo(1).getNodo(2).getNodo(0).addNodo(new Nodo(new Jarra(4,4),new Jarra(4,2),new Jarra(3,0)));
    }
    public boolean search(Nodo nodo){
        if(nodo.getJarra4l_1().getCantidad()==root.getJarra4l_1().getCantidad()
                && nodo.getJarra4l_2().getCantidad()==root.getJarra4l_2().getCantidad()
                && nodo.getJarr3l().getCantidad()==root.getJarr3l().getCantidad()){
            recorrido+="("+"("+root.getJarra4l_1().getCapacidad()+","+
                    root.getJarra4l_1().getCantidad()+")("+root.getJarra4l_2().getCapacidad()
                    +","+root.getJarra4l_2().getCantidad()+")("+root.getJarr3l().getCapacidad()+
                    ","+root.getJarr3l().getCantidad()+")"+")";
            return true;
        }
        return search(nodo,root);
    }
    private boolean search(Nodo nodo,Nodo padre){
        recorrido+="("+"("+padre.getJarra4l_1().getCapacidad()+","+
                    padre.getJarra4l_1().getCantidad()+")("+padre.getJarra4l_2().getCapacidad()
                    +","+padre.getJarra4l_2().getCantidad()+")("+padre.getJarr3l().getCapacidad()+
                    ","+padre.getJarr3l().getCantidad()+")"+")";
        if((nodo.getJarra4l_1().getCantidad()==padre.getJarra4l_1().getCantidad()
                && nodo.getJarra4l_2().getCantidad()==padre.getJarra4l_2().getCantidad()
                && nodo.getJarr3l().getCantidad()==padre.getJarr3l().getCantidad())){
            return true;
        }else{
            for(int i=0;i<padre.tamNodos();i++){
                if(search(nodo,padre.getNodo(i))){
                    return true;
                }
            }
        }
        return false;
    }
}
