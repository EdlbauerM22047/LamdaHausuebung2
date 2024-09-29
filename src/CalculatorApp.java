import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorApp {
    public static void main(String[] args) {
        NumberTester numberTester=new NumberTester("numbers.txt");
        numberTester.testFile();
        //CalculationOperation calculationOperation=new CalculationOperation();
        Main main=new Main();
        main.starten();

    }
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new DataInputStream(System.in)));
    int calculator;
    int number_x_a;
    int number_x_b;
    int number_y_a;
    int number_y_b;
    int operation;
    //CalculateOperation calculateOperation;
    public void starten() {
        while (true){
            chooseCalculator();
            if(calculator==4)System.exit(0);
            enterNumbers();
            cooseOperation();
            while (operation==5){
                enterNumbers();
                cooseOperation();
            }
            System.out.println("----------------------");

            switch (calculator){
                //case 1:calculateOperation=new RationalCalculator()
            }
            //case 1:RationalCalculator rationalCalculator=new RationalCalculator(number_x_a,number_x_b,number_y_a,number_y_b);

        }
    }



    private void chooseCalculator(){
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
    private void enterNumbers(){

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

    private void cooseOperation(){
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
}
