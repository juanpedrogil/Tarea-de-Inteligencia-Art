package farmer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanpedrog
 */
public class Nodo {
    private Nodo parent;
    private Nodo hijoIzq;
    private Nodo hijoDer;
    private String valor;
    private String cadena;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Nodo(Nodo parent, Nodo hijoIzq, Nodo hijoDer, String valor, String cadena) {
        this.parent = parent;
        this.hijoIzq = hijoIzq;
        this.hijoDer = hijoDer;
        this.valor = valor;
        this.cadena = cadena;
    }

    public Nodo getParent() {
        return parent;
    }

    public void setParent(Nodo parent) {
        this.parent = parent;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public void generarValor(){
        if(cadena.length()==1){
            this.setValor(cadena);
            return;
        }
        int indicePartir=-1;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='+'||cadena.charAt(i)=='-'){
                this.setValor(cadena.charAt(i)+"");
                indicePartir=i;
            }else{
                if(cadena.charAt(i)=='*'||cadena.charAt(i)=='/'){
                    this.setValor(cadena.charAt(i)+"");
                    i=cadena.length();
                    indicePartir=i;
                }
            }
        }
        if(indicePartir>=0){
            String auxIzq=cadena.substring(0,indicePartir);
            String auxDer=cadena.substring(indicePartir+1,cadena.length());
            if(!auxIzq.equals("")){
                this.setHijoIzq(new Nodo(this,null,null,cadena.charAt(indicePartir)+"",auxIzq));
            }
            if(!auxDer.equals("")){
                this.setHijoDer(new Nodo(this,null,null,cadena.charAt(indicePartir)+"",auxDer));
            }
        }
        if(this.getHijoIzq()!=null){
            this.getHijoIzq().generarValor();
        }
        if(this.getHijoDer()!=null){
            this.getHijoDer().generarValor();
        }
    }
    public String mostrarArbol(){
        if(hijoIzq!=null && hijoDer!=null){
            //return "Valor: "+valor+" HijoIzq: "+hijoIzq.getValor()+" HijoDer: "+hijoDer.getValor()+"| "+hijoIzq.mostrarArbol()+"| "+hijoDer.mostrarArbol();
            return valor+hijoIzq.mostrarArbol()+hijoDer.mostrarArbol();
        }else{
            if(hijoIzq!=null){
                //return "Valor: "+valor+" HijoIzq: "+hijoIzq.getValor()+" HijoDer: "+hijoDer.getValor()+"| "+hijoIzq.mostrarArbol();
                return valor+hijoIzq.mostrarArbol();
            }
            if(hijoDer!=null){
                //return "Valor: "+valor+" HijoIzq: "+hijoIzq.getValor()+" HijoDer: "+hijoDer.getValor()+"| "+hijoDer.mostrarArbol();
                return valor+hijoDer.mostrarArbol();
            }
        }
        //return "Valor: "+valor;
        return valor;
        
    }

    
}

