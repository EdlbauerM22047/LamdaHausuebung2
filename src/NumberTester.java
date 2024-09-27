public class NumberTester {

    NumberTester oddTester;
    NumberTester primeTester;

    NumberTester palindromeTester;

    public void setPalindromeTester(NumberTester palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public NumberTester(NumberTester oddTester, NumberTester primeTester, NumberTester palindromeTester) {
        this.oddTester = oddTester;
        this.primeTester = primeTester;
        this.palindromeTester = palindromeTester;
    }

    public void setOddEvenTester (NumberTester oddTester ) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTester primeTester){
        this.primeTester=primeTester;
    }

    public void testFile(){
        
    }



}
