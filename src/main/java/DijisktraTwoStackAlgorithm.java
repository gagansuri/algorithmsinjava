import java.util.Stack;

public class DijisktraTwoStackAlgorithm {

//

    /**
     *
     * @param args
     *
     *
     * (2+3)*(7+8)
     * when left bracket do nothing
     * when + or * --> push on operatorstck
     * when number --> push on operandStack
     * when ) --> pop 2 operands and pop 1 operator and push the result on operand
     */
    public static void main(String[] args) {
        Stack<String>  operatorStack=new Stack<>();
        Stack<Integer> operandStack=new Stack<>();

        char[] chars="(1+((2+3)*(4*5)))".toCharArray();

        for(char c : chars) {
            System.out.println(c);
            switch (c) {

                case '(':
                    //operatorStack.push(c+"");
                    break;
                case ')':
                    int val1=operandStack.pop();
                    int val2 = operandStack.pop();
                    String operation=operatorStack.pop();
                    if(operation=="+") {
                        operandStack.push(val1+val2);
                    } else if(operation=="*") {
                        operandStack.push(val1*val2);
                    }
                    break;
                case '+':
                    operatorStack.push("+");
                    break;

                case '*':
                    operatorStack.push("*");
                    break;

                default:
                    operandStack.push(Integer.parseInt(c+""));

            }
        }
        System.out.println("result : "+operandStack.pop());
    }
}
