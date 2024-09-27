import java.io.*;

public class NumberTester {
    String fileName;
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palidromeTester;

    public NumberTester(String fileName){
        this.fileName=fileName;
    }
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester=oddTester;
    }
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester=primeTester;
    }

    public void setPalidromeTester(NumberTest palidromeTester){
        this.palidromeTester=palidromeTester;
    }

    public void testFile(){

        int testfaelle;
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(new File(fileName)));
            testfaelle=Integer.parseInt(bufferedReader.readLine());

            for(int i=1;i<=testfaelle;i++){
                String line= bufferedReader.readLine();
                String []splittedLine=line.split(" ");
                int wasWirdUeberprueft=Integer.parseInt(splittedLine[0]);
                int zahlMitDerGerechnetWird=Integer.parseInt(splittedLine[1]);

                switch (wasWirdUeberprueft){
                    case 1:setOddEvenTester((n)->n%2==0);
                        System.out.println(oddTester.testNumber(zahlMitDerGerechnetWird) ? "ODD": "EVEN" );break;
                    case 2:setPrimeTester(this::isPrime);
                        System.out.println(primeTester.testNumber(zahlMitDerGerechnetWird) ? "PRIME":"NO PRIME");break;
                    case 3:setPalidromeTester((n)->{
                        String str = "" + n;
                        return str.equals(new StringBuilder(str).reverse().toString());
                    }); System.out.println(palidromeTester.testNumber(zahlMitDerGerechnetWird) ?"Palindrom": "No palindrom");break;

                }
            }
        } catch (IOException e) {
            System.err.println("Fehler mit BufferdReadeer");
        }


        }
    private boolean isPrime(int zahl){

        for(int i=2;i<Math.sqrt(zahl);i++){
            if(zahl==i){
                return true;
            }else if(zahl%i==0){
                return false;
            }
        }
        return true;
    }
}
