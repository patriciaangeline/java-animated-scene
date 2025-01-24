/**
This is a class responsible for drawing diamonds-- one of the four basic shapes classes created. 
It implements the DrawingObject interface and contains the necessary properties for creating a diamond. 

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

public class Diamond implements DrawingObject{
    private double diamondpositionX; 
    private double diamondpositionY; 
    private double diamondSize;
    private Color diamondColor;

// The Diamond constructor that takes in arguments for the required fields.
    public Diamond(double dx, double dy, double ds, Color dc) {
        diamondpositionX = dx;      // x position
        diamondpositionY = dy;      // y position
        diamondSize = ds;           // size
        diamondColor = dc;          // color
    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates a Rectangle2D.Double object and its necessary methods to create a diamond.
    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform(); // Used to rotate the rectangle 
    
        Rectangle2D.Double diamond = new Rectangle2D.Double(diamondpositionX, diamondpositionY, diamondSize, diamondSize);
        g2d.rotate(Math.toRadians(45), diamondpositionX, diamondpositionY);
        g2d.setColor(diamondColor);
        g2d.fill(diamond);
        g2d.setTransform(reset);
    }
}
