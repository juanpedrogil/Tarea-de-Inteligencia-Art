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
        root=new Node(null,null,null,new Value(start,end));
        System.out.print(end.size());
    }
    public void generate(){
        pickGO();
        root.setChildLeft(new Node(root,null,null,new Value(start,end)));
        getG();
        
    }
    private void pickGO(){
        pickG();
        end.set(3, "Oveja");
        start.set(3, null);
    }
    private void pickGC(){
        pickG();
        end.set(0, "Col");
        start.set(0, null);
    }
    private void pickGL(){
        pickG();
        end.set(2, "Lobo");
        start.set(2, null);
    }
    private void pickG(){
        end.set(1, "Granjero");
        start.set(1, null);
    }
    private void getGO(){
        getG();
        end.set(3, null);
    }
    private void getGC(){
        getG();
        end.set(0, null);
        start.set(0, "Col");
    }
    private void getGL(){
        getG();
        end.set(2,null);
        start.set(2, "Lobo");
    }
    private void getG(){
        end.set(1,null);
        start.set(1,"Granjero");
    }
}