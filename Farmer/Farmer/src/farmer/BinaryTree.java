package farmer;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree{
    private Node root;
    List<String> start;
    List<String> end;
    public BinaryTree() {
        start=new ArrayList<String>();
        end=new ArrayList<String>();
        start.add("Col");
        start.add("Granjero");
        start.add("Lobo");
        start.add("Oveja");
        end.add(null);
        end.add(null);
        end.add(null);
        end.add(null);
        root=new Node(null,null,null,"Col,Granjero,Lobo,Oveja,|,,,, ");
        generate();
    }
    public void generate(){
        root.setChildLeft(new Node(root,null,null,"Col,,Lobo,,|,,Granjero,,Oveja"));
        root.getChildLeft().setChildLeft(new Node(root.getChildLeft(),null,null,"Col,Granjero,Lobo,,|,,,,Oveja"));
        root.getChildLeft().getChildLeft().setChildLeft(new Node(root.getChildLeft().getChildLeft(),null,null,"Col,,,,|,,Granjero,Lobo,Oveja"));
        root.getChildLeft().getChildLeft().setChildRight(new Node(root.getChildLeft().getChildLeft(),null,null,",,Lobo,,|,Col,Granjero,,Oveja"));
        root.getChildLeft().getChildLeft().getChildLeft().setChildLeft(new Node(root.getChildLeft().getChildLeft().getChildLeft(),null,null,"Col,Granjero,,Oveja,|,,,Lobo, "));
        root.getChildLeft().getChildLeft().getChildLeft().getChildLeft().setChildLeft(new Node(root.getChildLeft().getChildLeft().getChildLeft().getChildLeft(),null,null,",,,Oveja,|,Col,Granjero,Lobo, "));
        root.getChildLeft().getChildLeft().getChildLeft().getChildLeft().getChildLeft().setChildLeft(new Node(root.getChildLeft().getChildLeft().getChildLeft().getChildLeft().getChildLeft(),null,null,",Granjero,,Oveja,|,Col,,Lobo, "));
        root.getChildLeft().getChildLeft().getChildLeft().getChildLeft().getChildLeft().getChildLeft().setChildLeft(new Node(root.getChildLeft().getChildLeft().getChildLeft().getChildLeft().getChildLeft().getChildLeft(),null,null,",,,,|,Col,Granjero,Lobo,Oveja"));
        
        
    }
    public String search(String res){
        String[] resArray=res.split(",");
        String[] rootArray=root.getValue().split(",");
        if(resArray[5].equals(rootArray[5]) 
                && resArray[6].equals(rootArray[6])
                && resArray[7].equals(rootArray[7])
                && resArray[8].equals(rootArray[8])){
            return "(|"+resArray[5]+","+resArray[6]+","+resArray[7]+","+resArray[8]+")";
        }
        String aux="("+root.getValue()+")";
        return aux+search(res,root.getChildLeft());
    }
    public String search(String res,Node node){
        String[] resArray=res.split(",");
        String[] nodeArray=node.getValue().split(",");
        if(resArray[5].equals(nodeArray[5]) 
                && resArray[6].equals(nodeArray[6])
                && resArray[7].equals(nodeArray[7])
                && resArray[8].equals(nodeArray[8])){
            return "(|"+resArray[5]+","+resArray[6]+","+resArray[7]+","+resArray[8]+")";
        }
        String aux="("+node.getValue()+")";
        return aux+search(res,node.getChildLeft());
    }
}