public class FixedWidthStackOfStrings {
    private  String[] stack;
    private int N=0; //pointer for head/top of stack

    public FixedWidthStackOfStrings(int capacity) {
        stack=new String[capacity];
    }


    public void push(String s) {
        stack[N]=s;
        N++;
    }

    public String pop() {
        N--;
        String item=stack[--N];
        stack[--N]=null;
        return item;
    }
}
