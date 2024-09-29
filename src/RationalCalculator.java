public class RationalCalculator extends AbstractCalculator{



    public RationalCalculator() {
        super(
                ((x, y) -> new Number(x.getA()+x.getB(), y.getA()+ y.getB())),
                ((x, y) -> new Number(x.getA()-x.getB(), y.getA()- y.getB())),
                ((x, y) -> new Number(x.getA()*x.getB(), y.getA()* y.getB())),
                (x, y) -> {
                    if (x.getB() == 0 || y.getB() == 0) {
                        System.out.println("Not allowed to divide by 0");
                        return null;
                    }
                    return new Number(x.getA() / x.getB(), y.getA() / y.getB());
                });}



    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
        //return new Number(a.getA()+a.getB(),b.getA()+b.getB());
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
       return divide.calc(a,b);
    }
}
