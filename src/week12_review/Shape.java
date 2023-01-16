package week12_review;

import java.text.DecimalFormat;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calc_area();

    public abstract double calc_perimeter();


    // public abstract void eat(String food);

    @Override
    public String toString() {
        DecimalFormat df =new DecimalFormat("0.00");
        return name +"{" +
                "area='" + df.format(calc_area() ) + '\'' +
                ", perimeter='" + df.format(calc_perimeter() ) + '\'' +
                '}';
    }

}

/*
Shape Task:
    1. Create a class named Shape:
            Variables:
                name (final)
            Encapsulate all the fields
            Methods:
                calc_area();
                calc_perimeter()
                toString(): include the area & perimeter of the shape
 */


