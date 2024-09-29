public class ComplexCalculator extends AbstractCalculator{


    public ComplexCalculator() {
        super(
                (x, y) -> (new Number(x.getA()+ y.getA(), x.getB()+y.getB())),
                (x, y) -> (new Number(x.getA()- y.getA(), x.getB()-y.getB())),
                (x, y) -> (new Number(x.getA()* y.getA()- x.getB()* y.getB(),x.getA()*y.getB()+ x.getB()* y.getA())),
                (x, y) -> {
                    double oben_x = x.getA() * y.getA() - x.getB() * (-1) * y.getB();
                    double oben_y = x.getB() * y.getA() + x.getA() * (-1) * y.getB();
                    double unten = y.getA() * y.getA() - y.getB() * (-1) * y.getB();
                    return new Number(oben_x / unten, oben_y / unten);

                }

        );
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
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
