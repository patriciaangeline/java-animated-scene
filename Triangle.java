/**
This is a class responsible for drawing triangles-- one of the four basic shapes created. 
It implements the DrawingObject interface and contains the necessary properties for creating a triangle. 

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

public class Triangle implements DrawingObject {
    private double startTriangleX; 
    private double startTriangleY; 
    private double line1X; 
    private double line1Y; 
    private double line2X; 
    private double line2Y; 
    private Color triangleColor; 

// The Triangle constructor that takes in arguments for the required fields.
    public Triangle(double startX, double startY, double x1, double y1, double x2, double y2, float tt, Color tc) {
        startTriangleX = startX;    // x position for starting point 
        startTriangleY = startY;    // y position for starting point
        line1X = x1;                // x position for second point
        line1Y = y1;                // y position for second point
        line2X = x2;                // x position for third point
        line2Y = y2;                // y position for third point 
        triangleColor = tc;         // color 
    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates a Path2D.Double object and its necessary methods to create a triangle. 
    public void draw(Graphics2D g2d) {
        Path2D.Double triangle  = new Path2D.Double(); 
        triangle.moveTo(startTriangleX, startTriangleY);
        triangle.lineTo(line1X, line1Y);
        triangle.lineTo(line2X, line2Y);
        triangle.closePath();
        g2d.setColor(triangleColor);
        g2d.fill(triangle);
        
    }
}
