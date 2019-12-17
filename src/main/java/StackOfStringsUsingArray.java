public class StackOfStringsUsingArray {

    private String [] stringArray;
    private int N=0;

    public StackOfStringsUsingArray(int size) {
            stringArray=new String[size];

    }


    public void push(String text) {
        this.stringArray[N++]=text;
    }

    public String pop(){
        return this.stringArray[--N];
    }

    public boolean isEmpty(){
        return this.N==0;
    }

    public boolean isFull(){
        return (this.N==stringArray.length+1);
    }



}
