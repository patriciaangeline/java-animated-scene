/**
This is a class responsible for drawing lines-- one of the three required basic shape classes. 
It implements the DrawingObject interface and contains the necessary properties for creating a line. 

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
import java.awt.Graphics2D;

public class Line implements DrawingObject{
    private double startingX; 
    private double startingY; 
    private double endingX; 
    private double endingY; 
    private float lineThickness; 
    private Color lineColor; 

// The Line constructor that takes in arguments for the required fields. 
    public Line(double x1, double y1, double x2, double y2, float lt, Color lc) {
        startingX = x1;     // x position for starting point
        startingY = y1;     // y position for starting point
        endingX = x2;       // x position for ending point
        endingY = y2;       // y position for ending point
        lineThickness = lt; // thickness of the line
        lineColor = lc;     // color
    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates a Line2D.Double object and its necessary methods to create a line. 
    public void draw(Graphics2D g2d) {

        Line2D.Double line = new Line2D.Double(startingX, startingY, endingX, endingY);
        g2d.setColor(lineColor);
        g2d.setStroke(new BasicStroke(lineThickness));
        g2d.draw(line); 
    }
}
