import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorApp {

    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new DataInputStream(System.in)));
    int calculator;
    int number_x_a;
    int number_x_b;
    int number_y_a;
    int number_y_b;
    int operation;
    Number solutionNumber;
    AbstractCalculator abstractCalculator;
    public void starten() {
        while (true){
            AusgabeChooseCalculator();
            if(calculator==4)System.exit(0);
            AusgabeEnterNumbers();
            AusgabeCooseOperation();
            while (operation==5){
                AusgabeEnterNumbers();
                AusgabeCooseOperation();
            }
            System.out.println("----------------------");

            switch (calculator){
                case 1: abstractCalculator=new RationalCalculator();break;
                case 2: abstractCalculator=new VectorCalculator();break;
                case 3:abstractCalculator=new ComplexCalculator();break;
                default:System.out.println("Sie haben eine Falsch Zahl eingegeben");
                //case 1:calculateOperation=new RationalCalculator()
            }
            switch (operation){
                case 1:solutionNumber=abstractCalculator.add(new Number(number_x_a,number_x_b),new Number(number_y_a,number_y_b));break;
                case 2:solutionNumber=abstractCalculator.subtract(new Number(number_x_a,number_x_b),new Number(number_y_a,number_y_b));break;
                case 3:solutionNumber=abstractCalculator.multiply(new Number(number_x_a,number_x_b),new Number(number_y_a,number_y_b));break;
                case 4:solutionNumber=abstractCalculator.divide(new Number(number_x_a,number_x_b),new Number(number_y_a,number_y_b));break;
                default:
                    System.out.println("Sie haben eine unglültige Zahl eingegeben");
            }

            //case 1:RationalCalculator rationalCalculator=new RationalCalculator(number_x_a,number_x_b,number_y_a,number_y_b);
            AusgabeSolution();
        }
    }



    private void AusgabeChooseCalculator(){
        System.out.println("Choose calculator :");
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit program");
        System.out.print("> ");
        try {
            calculator=Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("BufferdreaderFehler");        }

    }
    private void AusgabeEnterNumbers(){

        try {
            System.out.print("Enter number x a > ");
            number_x_a= Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter number x b > ");
            number_x_b= Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter number y a > ");
            number_y_a= Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter number y b > ");
            number_y_b= Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("BufferdReader Fehler");
        }

    }

    private void AusgabeCooseOperation(){
        System.out.println("Choose operation :");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");
        System.out.print("> ");
        try {
            operation=Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("BufferdreaderFehler");
        }

    }
    private void AusgabeSolution(){
        System.out.println("Solution :");
        switch (calculator){
            case 1:System.out.println("a = "+solutionNumber.getA());
                   System.out.println("b = "+ solutionNumber.getB());break;
            case 2:System.out.println("("+ solutionNumber.getA()+")");
                   System.out.println("("+solutionNumber.getB()+")");break;
            case 3:if(solutionNumber.getB()>=0) System.out.println(""+ solutionNumber.getA()+"+"+ solutionNumber.getB()+"i");
                    else System.out.println(""+solutionNumber.getA()+""+solutionNumber.getB()+"i");
        }

        System.out.println("----------------------------");
    }
}
