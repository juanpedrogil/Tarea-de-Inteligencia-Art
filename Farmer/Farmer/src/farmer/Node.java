package farmer;
public class Node{
    //Feature declarations
    private Node childLeft,childRight,parent;
    private Value value;

    public Node(Node childLeft, Node childRight, Node parent, Value value) {
        this.childLeft = childLeft;
        this.childRight = childRight;
        this.parent = parent;
        this.value = value;
    }

    public Node getChildLeft() {
        return childLeft;
    }

    public void setChildLeft(Node childLeft) {
        this.childLeft = childLeft;
    }

    public Node getChildRight() {
        return childRight;
    }

    public void setChildRight(Node childRight) {
        this.childRight = childRight;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    
}