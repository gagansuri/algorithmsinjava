import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class StackClient {

    public static void main1(String[] args) throws Exception {
        File file = new File(
                StackClient.class.getClassLoader().getResource("Stackinput.txt").getFile()
        );
        BufferedReader br=new BufferedReader(new FileReader(file));
        String operations = br.readLine().trim();
        br.close();

        String oper[]=operations.split(" ");
        StackOfStrings  stackOfStrings=new StackOfStrings();

        for(String op:oper) {
        if(!op.equals("-")) {
            stackOfStrings.push(op);
        }    else {
            System.out.println(stackOfStrings.pop());
        }

        }
    }


    public static void main2(String[] args) throws Exception {
        File file = new File(
                StackClient.class.getClassLoader().getResource("Stackinput.txt").getFile()
        );
        BufferedReader br=new BufferedReader(new FileReader(file));
        String operations = br.readLine().trim();
        br.close();

        String oper[]=operations.split(" ");
        StackOfStringsModified  stackOfStrings=new StackOfStringsModified();

        for(String op:oper) {
            if(!op.equals("-")) {
                stackOfStrings.push(op);
            }    else {
                System.out.println(stackOfStrings.pop());
            }

        }
    }


    public static void main3(String[] args) throws Exception {
        File file = new File(
                StackClient.class.getClassLoader().getResource("Stackinput.txt").getFile()
        );
        BufferedReader br=new BufferedReader(new FileReader(file));
        String operations = br.readLine().trim();
        br.close();

        String oper[]=operations.split(" ");
        FixedWidthStackOfStrings stackOfStrings=new FixedWidthStackOfStrings(10);

        for(String op:oper) {
            if(!op.equals("-")) {
                stackOfStrings.push(op);
            }    else {
                System.out.println(stackOfStrings.pop());
            }

        }
    }


    public static void main4(String[] args) throws Exception {
        File file = new File(
                StackClient.class.getClassLoader().getResource("Stackinput.txt").getFile()
        );
        BufferedReader br=new BufferedReader(new FileReader(file));
        String operations = br.readLine().trim();
        br.close();

        String oper[]=operations.split(" ");
        StackOfStringAgain  stackOfStrings=new StackOfStringAgain();

        for(String op:oper) {
            if(!op.equals("-")) {
                stackOfStrings.push(op);
            }    else {
                System.out.println(stackOfStrings.pop());
            }

        }
    }


    public static void main(String[] args) throws Exception {
        File file = new File(
                StackClient.class.getClassLoader().getResource("StackResizeArrayinput.txt").getFile()
        );
        BufferedReader br=new BufferedReader(new FileReader(file));
        String operations = br.readLine().trim();
        br.close();

        String oper[]=operations.split(" ");
        StackOfStringResizeArray  stackOfStringResizeArray=new StackOfStringResizeArray();

        for(String op:oper) {
            if(!op.equals("-")) {
                stackOfStringResizeArray.push(op);
            }    else {
                System.out.println(stackOfStringResizeArray.pop());
            }

        }
    }


}
