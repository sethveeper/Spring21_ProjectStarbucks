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
public class Rectangle extends GeoObject implements Comparable<GeoObject> {

    public double len;
    public double wid;

    
    public Rectangle(double inLength, double inWidth)
    {
        this.color = "Blue";
        this.filled = true;
        this.len = inLength;
        this.wid = inWidth;
    }
    
    @Override
    public double getArea() {
        double output = this.len * this.wid;
        // Area of rectangle equals L * W;
        return output;
    }

    @Override
    public double getPerimeter() {
        double output = (this.len + this.wid) * 2;
        // Perimeter of rectangle equals (L+W) * 2
        return output;
    }

    @Override
    public int compareTo(GeoObject input) {
        double output = this.getArea() - input.getArea();
        return (int)output;
    }
}
