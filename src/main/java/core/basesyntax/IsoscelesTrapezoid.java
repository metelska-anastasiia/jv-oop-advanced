package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int high;
    private final int sideA;
    private final int sideB;

    public IsoscelesTrapezoid(String color, int high, int sideA, int sideB) {
        super(color);
        this.high = high;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (double)((sideA + sideB) / 2) * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area:" + getArea() + "sq.units, high: "
                + high + " units, side A: " + sideA + " units, side B: "
                + sideB + " units, color: " + color);
    }
}
