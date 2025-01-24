/**
This is a class responsible for drawing squares-- one of the three required basic shape classes. 
It implements the DrawingObject interface and contains the necessary properties for creating a square. 

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

public class Square implements DrawingObject {
    private double squarepositionX; 
    private double squarepositionY; 
    private double squareSize; 
    private Color squareColor1; 
    private Color squareColor2; 

// The Square constructor that takes in arguments for the required fields
    public Square(double sx, double sy, double ss, Color sc1, Color sc2) {
        squarepositionX = sx;   // x position
        squarepositionY = sy;   // y position
        squareSize = ss;        // size
        squareColor1 = sc1;     // color #1
        squareColor2 = sc2;     // color #2

    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates a Rectangle2D.Double object and its necessary methods to create a square.
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double square = new Rectangle2D.Double(squarepositionX, squarepositionY, squareSize, squareSize);
        g2d.setPaint(new GradientPaint((float) squarepositionX, (float) squarepositionY, squareColor1, (float) squareSize, (float) squareSize, squareColor2));
        g2d.fill(square);
    }
    
}
