
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanpedrog
 */
public class ArbolSintactico {
    private String cadena;
    private List<String> caracteres=new ArrayList<String>();
    private Nodo root=new Nodo(null,null,null,"=","");

    public ArbolSintactico(String cadena) {
        this.cadena=cadena;
        if(sacarRoot()){
            formarSubArbol();
            mostrarArbol();
        }
    }
    private boolean sacarRoot(){
        //aux va a guardar cada caracter de la cadena
        int contadorIgual=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='='){
                contadorIgual++;
                
            }
        }
        if(contadorIgual!=1){
            return false;
        }
        
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='='){
                root.setHijoIzq(new Nodo(root,null,null,"",cadena.substring(0,i)));
                root.setHijoDer(new Nodo(root,null,null,"",cadena.substring(i+1, cadena.length())));
            }
        }
        return true;
    }
    private void formarSubArbol(){
        //Recorrer la lista en busca de paréntesis
        root.generarValor();
    }
    public String espacios="                                ";
    String cad="";
    private void mostrarArbol(){
        //System.out.print(root.mostrarArbol());
        //System.out.print(root.mostrarArbol());
        cad=espacios+"=";
        dibujarArbol(root,espacios);
        System.out.print(cad);
    }
    public void dibujarArbol(Nodo nodo,String esp){
        if(nodo.getHijoIzq()!=null){
            esp=esp.substring(0,esp.length()-1);
            cad+="\n"+esp+"/";
        }
        if(nodo.getHijoDer()!=null){
            cad+=" \\";
        }
        if(nodo.getHijoIzq()!=null){
            esp=esp.substring(0,esp.length()-1);
            cad+="\n"+esp+nodo.getHijoIzq().getValor();
        }
        if(nodo.getHijoDer()!=null){
            cad+="   "+nodo.getHijoDer().getValor();
        }
        if(nodo.getHijoIzq()!=null){
            dibujarArbol(nodo.getHijoIzq(),esp.substring(0,esp.length()));
        }
        if(nodo.getHijoIzq()!=null){
            dibujarArbol(nodo.getHijoDer(),esp+"   ");
        }
    }
    public static void main(String[] args){
        new ArbolSintactico("1+4+5=2+3");
    }
    
//                       =
//                      / \
//                     +   *
//                    / \ / \
//                   1   47   6
}
