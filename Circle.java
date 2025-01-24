/**
This is a class responsible for drawing circles-- one of the three required basic shape classes. 
It implements the DrawingObject interface and contains the necessary properties for creating a circle. 

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

public class Circle implements DrawingObject {
    private double circlepositionX; 
    private double circlepositionY; 
    private double circleSize; 
    private Color circleColor; 

// The Circle constructor that takes in arguments for the required fields.
    public Circle(double cx, double cy, double cs, Color cc) {
        circlepositionX = cx;   // x position
        circlepositionY = cy;   // y position
        circleSize = cs;        // size
        circleColor = cc;       // color
    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates a Ellipse2D.Double object and its necessary methods to create a circle.
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double c = new Ellipse2D.Double(circlepositionX, circlepositionY, circleSize, circleSize);
        g2d.setColor(circleColor);
        g2d.fill(c);
    }

}