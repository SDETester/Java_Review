package week12_review;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double calc_area() {
        return side * side;
    }

    @Override
    public double calc_perimeter() {
        return 4 * side;
    }




}
