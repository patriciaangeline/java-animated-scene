/**
This is a class responsible for drawing rectangles-- one of the four basic shapes classes created. 
It implements the DrawingObject interface and contains the necessary properties for creating a rectangle. 

@author Patricia Angeline G. Tan (226189)
@version March 9, 2023
**/

/*
    I have not discussed the Java language code in my program 
    with anyone other than my instructor or the teaching assistants 
    assigned to this course.

    I have not used Java language code obtained from another student, 
    or any other unauthorized source, either modified or unmodified.

    If any Java language code or documentation used in my program 
    was obtained from another source, such as a textbook or website, 
    that has been clearly noted with a proper citation in the comments 
    of my program.
*/

import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject {
    private double rectanglepositionX; 
    private double rectanglepositionY; 
    private double rectangleWidth; 
    private double rectangleHeight; 
    private Color rectangleColor1; 
    private Color rectangleColor2; 

// The Rectangle constructor that takes in arguments for the required fields. 
    public Rectangle(double rx, double ry, double rw, double rh, Color rc1, Color rc2) {
        rectanglepositionX = rx;    // x position
        rectanglepositionY = ry;    // y position
        rectangleWidth = rw;        // width
        rectangleHeight = rh;       // height
        rectangleColor1 = rc1;      // color #1
        rectangleColor2 = rc2;      // color #2
    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates a Rectangle2D.Double object and its necessary methods to create a rectangle.
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double r = new Rectangle2D.Double(rectanglepositionX, rectanglepositionY, rectangleWidth, rectangleHeight);
        g2d.setPaint(new GradientPaint((float) rectanglepositionX, (float) rectanglepositionY, rectangleColor1, (float) rectangleWidth, (float) rectangleHeight, rectangleColor2));
        g2d.fill(r);
    }
    
}
