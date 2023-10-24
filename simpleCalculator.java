import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        //getting inputs
        double result=0;
        Scanner input= new Scanner(System.in);
        System.out.println("The first number: ");
        double firstNumber=input.nextDouble();
        input.nextLine();
        System.out.println("Enter any operator(+,-,*,%,/) : ");
        char operator=input.next().charAt(0);
        System.out.println("The second number: ");
        double secondNumber=input.nextDouble();
        


        //calculations using switch statements
        switch (operator) {
            case '+':
                result=firstNumber+secondNumber;
                
                break;
            case '-':
                result=firstNumber-secondNumber;
                
                break;
            case '*':
                result=firstNumber*secondNumber;
                
                break;
            case '/':
                result=firstNumber/secondNumber;
                
                break;
            case '%':
                result=firstNumber%secondNumber;
                
                break;
            default:
            System.out.println("Error: Invalid operator.");
                break;
        }
        System.out.println(firstNumber+" "+operator+" "+secondNumber+"="+result); 
    }
}
