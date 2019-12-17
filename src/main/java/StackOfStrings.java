import java.util.*;

public class StackOfStrings {

    List<Node> stack=new ArrayList<>();
    int pointer=-1;
    Node n=null;
    public String pop(){
        if(!isEmpty()) {
            n=stack.remove(pointer--);
        }

        return n!=null?n.content:null;
    }

    void push (String content) {
        Node node=new Node();
        node.content=content;
        stack.add(node);
        pointer++;

    }


    private boolean isEmpty(){
        return pointer==-1;
    }

    private class Node{

        String content;
        Node next;
    }
}
