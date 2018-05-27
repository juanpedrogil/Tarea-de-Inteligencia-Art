/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemajarras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanpedrog
 */
public class Nodo {
    private List<Nodo> nodos=new ArrayList();
    private Jarra jarra4l_1,jarra4l_2,jarr3l;

    public Jarra getJarra4l_1() {
        return jarra4l_1;
    }

    public void setJarra4l_1(Jarra jarra4l_1) {
        this.jarra4l_1 = jarra4l_1;
    }

    public Jarra getJarra4l_2() {
        return jarra4l_2;
    }

    public void setJarra4l_2(Jarra jarra4l_2) {
        this.jarra4l_2 = jarra4l_2;
    }

    public Jarra getJarr3l() {
        return jarr3l;
    }

    public void setJarr3l(Jarra jarr3l) {
        this.jarr3l = jarr3l;
    }

    public Nodo(Jarra jarra4l_1, Jarra jarra4l_2, Jarra jarr3l) {
        this.jarra4l_1 = jarra4l_1;
        this.jarra4l_2 = jarra4l_2;
        this.jarr3l = jarr3l;
    }
    public void addNodo(Nodo nodo){
        nodos.add(nodo);
    }
    public Nodo getNodo(int index){
        return nodos.get(index);
    }
    public int tamNodos(){
        return nodos.size();
    }
}
