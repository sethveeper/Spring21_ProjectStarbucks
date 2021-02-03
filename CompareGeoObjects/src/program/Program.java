/*
    Author: Dominic "Seth" Jones-Jackson (She/They)
    Initialized on: February 2, 2021
    
    Abstract: Implement Circles and Rectangles from the provided GeoObjects abstract class,
    as well as the built-in Comparable interface.
 */
package program;
public class Program {

    public static void main(String[] args) {
        System.out.println("Hello, fox. We're learning about shapes today.\n");
        // Ope
        
        Circle myCirc = new Circle(6.9);
        Rectangle myRect = new Rectangle(4.2, 6.21);
        // Here's our two objects.
        
        System.out.println("My circle:\n" + myCirc.toString());
        System.out.println("My rectangle:\n" + myRect.toString());
        // A quick look at them.
        
        // Time to compare. It's worth noting that, since compareTo() takes
        // a GeoObject, each class can accept either one or the other as an input.
        
        // (It does not, however, let me do what I thought it would and simply 
        // compare them with the normal operators. Bleh.)
        if(myRect.compareTo(myCirc) > 0)
            System.out.println("(As it happens, the rectangle is bigger.)");
        else if (myCirc.compareTo(myRect) > 0)
            System.out.println("(As it happens, the circle is bigger.)");
        else
        {
            System.out.println("(As it happens, they're somehow the same size.)");
            System.out.println("(Or something weird happened. IDK.)");
        }
        // End of If/Else block
    }
    // End of main method
}
// End of Program class
