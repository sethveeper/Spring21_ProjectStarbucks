/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Seth Veeper
 */

// This does work, but we have to implement in both extended classes and use a generic (which is fine, but more work)
public class Circle extends GeoObject implements Comparable<GeoObject> {

    public double radius;
    
    public Circle(double inRadius)
    {
        this.color = "Red";
        this.filled = true;
        this.radius = inRadius;
    }
    
    @Override
    public double getArea() {
        double output = this.radius * this.radius * 3.14159;
        // Area of a circle equals PI*r^2
        return output;
    }
    
    @Override
    public double getPerimeter() {
        double output = this.radius * 2 * 3.14159;
        // Circumfrence of a circle equals PI*d
        return output;
    }

    @Override
    public int compareTo(GeoObject input) {
        double output = this.getArea() - input.getArea();
        return (int)output;
    }
    
}
