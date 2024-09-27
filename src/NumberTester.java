import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NumberTester {


    String filename;

    public void setPalindromeTester(NumberTest palindromeTester) {

        palindromeTester=(n)->{
            String nstring=""+n;
            char[] chars=nstring.toCharArray();
            for(int i=0;i<nstring.length();i++){
                if(chars[i]!=chars[chars.length-1-i]){
                    return false;
                }
            }
            return false;
        };
    }

    public NumberTester(String filename) {

    }

    public void setOddEvenTester (NumberTest oddTester ) {
            oddTester =(n)->(n%2)==0;

    }

    public void setPrimeTester(NumberTest primeTester){
        primeTester=(n)-> isPrime(n);
    }

    public void testFile(){
        
    }

    public  boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
