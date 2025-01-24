/**
This is a class responsible for drawing unfilled circles-- one of the four basic shapes created. 
It implements the DrawingObject interface and contains the necessary properties for creating an unfilled circle. 

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

public class UnfilledCircle implements DrawingObject{
    private double unfilledcirclepositionX; 
    private double unfilledcirclepositionY; 
    private double unfilledcircleSize; 
    private float unfilledcircleThickness; 
    private Color unfilledCircleColor; 

// The UnfilledCircle constructor that takes in arguments for the required fields. 
    public UnfilledCircle(double ucx, double ucy, double ucs, float uct, Color ucc) {
        unfilledcirclepositionX = ucx;  // x position
        unfilledcirclepositionY = ucy;  // y position
        unfilledcircleSize = ucs;       // size
        unfilledcircleThickness = uct;  // thickness
        unfilledCircleColor = ucc;      // color
    }

// The abstract method that was implemented from the Drawingobject interface. It instantiates an Ellipse2D.Double object and its necessary methods to create an unfilled circle. 
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double uc = new Ellipse2D.Double(unfilledcirclepositionX, unfilledcirclepositionY, unfilledcircleSize, unfilledcircleSize);
        g2d.setStroke(new BasicStroke(unfilledcircleThickness));
        g2d.setColor(unfilledCircleColor);
        g2d.draw(uc); // Uses the draw method instead of the fill method 
    }
}
