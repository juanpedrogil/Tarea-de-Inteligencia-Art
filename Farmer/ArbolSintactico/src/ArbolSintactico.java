
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
    private void mostrarArbol(){
        //System.out.print(root.mostrarArbol());
        System.out.print(dibujarArbolIzq(root.mostrarArbol()));
        
    }
    public static void main(String[] args){
        new ArbolSintactico("1+4=2+3");
    }
    public String dibujarArbolIzq(String cad){
        if(cad.charAt(0)=='1'||cad.charAt(0)=='2'
                || cad.charAt(0)=='3' || cad.charAt(0)=='4'
                || cad.charAt(0)=='5' ||cad.charAt(0)=='6'
                || cad.charAt(0)=='7' || cad.charAt(0)=='8'
                || cad.charAt(0)=='9' || cad.charAt(0)=='0'){
            return "/\n"+cad.charAt(0);
        }else{
            if(cad.charAt(1)=='+' || cad.charAt(1)=='-' || cad.charAt(1)=='*' || cad.charAt(1)=='/'){
                return "/\n"+cad.charAt(0)+"  "+dibujarArbolIzq(cad.substring(1,cad.length()));
            }else{
                return "/\n"+cad.charAt(0)+"  "+dibujarArbolIzq(cad.substring(1,cad.length()))+"       "+dibujarArbolDer(cad.substring(1,cad.length()));
            }
        }
    }
    public String dibujarArbolDer(String cad){
        if(cad.charAt(0)=='1'||cad.charAt(0)=='2'
                || cad.charAt(0)=='3' || cad.charAt(0)=='4'
                || cad.charAt(0)=='5' ||cad.charAt(0)=='6'
                || cad.charAt(0)=='7' || cad.charAt(0)=='8'
                || cad.charAt(0)=='9' || cad.charAt(0)=='0'){
            return "\\"+"\n"+cad.charAt(0);
        }else{
            if(cad.charAt(1)=='+' || cad.charAt(1)=='-' || cad.charAt(1)=='*' || cad.charAt(1)=='/'){
                return "/\n"+cad.charAt(0)+"  "+dibujarArbolIzq(cad.substring(1,cad.length()));
            }else{
                return "/\n"+cad.charAt(0)+"  "+dibujarArbolIzq(cad.substring(1,cad.length()))+"       "+dibujarArbolDer(cad.substring(1,cad.length()));
            }
        }
    }
}
