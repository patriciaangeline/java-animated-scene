/**
This is a class responsible for drawing a spinning wheel-- one of the three composite shape classes created. 
It implements the DrawingObject interface and is a combination of the UnfilledCircle, Circle, and Line basic shape classes. 

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

public class SpinningWheel implements DrawingObject{
    private double angle; 
    private double wheelX; 
    private double wheelY; 
    private double wheelendX; 
    private double wheelendY; 
    private double wheelSize; 
    private double wheelWidth; 
    private double wheelHeight; 
    private float wheelThickness;
    private Color wheelColor;
    
// The SpinningWheel constructor that takes in arguments for the required fields. 
    public SpinningWheel(double wa, double wx, double wy, double wex, double wey, double ws, double ww, double wh, float wt, Color wc) {
        angle = wa;             // angle 
        wheelX = wx;            // x position for starting point
        wheelY = wy;            // y position for starting point
        wheelendX = wex;        // x position for ending point
        wheelendY = wey;        // y position for ending point
        wheelSize = ws;         // size
        wheelWidth = ww;        // width
        wheelHeight = wh;       // height
        wheelThickness = wt;    // thickness
        wheelColor = wc;        // color
    
    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates multiple UnfilledCircle, Circle, and Line objects and its necessary methods to create the spinning wheel. 
    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();

        // Rotate around the spinning wheel's center 
            // Source: https://stackoverflow.com/questions/8807717/java-rotate-rectangle-around-the-center
        g2d.rotate(Math.toRadians(angle), wheelX + wheelSize/2, wheelY + wheelSize/2);
    
    // Movable Components
        UnfilledCircle greenLight = new UnfilledCircle(wheelX, wheelY, wheelSize, wheelThickness+15, Color.decode("#006400"));
        greenLight.draw(g2d);

        UnfilledCircle driveWheel = new UnfilledCircle(wheelX, wheelY, wheelSize, wheelThickness, wheelColor);
        driveWheel.draw(g2d);

        Circle pivotWheel = new Circle(wheelX+120, wheelY+115, wheelSize/5, wheelColor); 
        pivotWheel.draw(g2d);

        Line spoke1 = new Line(wheelX+150, wheelY+130, wheelendX+35, wheelendY, wheelThickness-5, wheelColor);
        spoke1.draw(g2d);

        Line spoke2 = new Line(wheelX+128, wheelY+145, wheelendX+175, wheelendY+139, wheelThickness-5, wheelColor);
        spoke2.draw(g2d);

        Line spoke3 = new Line(wheelX+150, wheelY+145, wheelendX+36, wheelendY+283, wheelThickness-5, wheelColor);
        spoke3.draw(g2d);

        Line spoke4 = new Line(wheelX+10, wheelY+148, wheelendX+5, wheelendY+143, wheelThickness-5, wheelColor);
        spoke4.draw(g2d);

        Line spoke5 = new Line(wheelX+170, wheelY+130, wheelendX+130, wheelendY+45, wheelThickness-5, wheelColor);
        spoke5.draw(g2d);

        Line spoke6 = new Line(wheelX+160, wheelY+150, wheelendX+130, wheelendY+250, wheelThickness-5, wheelColor);
        spoke6.draw(g2d);

        Line spoke7 = new Line(wheelX+150, wheelY+145, wheelWidth+210, wheelHeight-120, wheelThickness-5, wheelColor);
        spoke7.draw(g2d);

        Line spoke8 = new Line(wheelX+55, wheelY+40, wheelendX+25, wheelendY+130, wheelThickness-5, wheelColor);
        spoke8.draw(g2d);

    // The setTransform method was called here so that only the components that constitute the wheel itself will rotate 
        g2d.setTransform(reset); 

    // Immovable Components
        Line bench = new Line(wheelX-60, wheelY+333, wheelendX+160, wheelendY+330, wheelThickness+5, wheelColor);
        bench.draw(g2d);

        Line leg1 = new Line(wheelX+230, wheelY+340, wheelendX+160, wheelendY+420, wheelThickness+5, wheelColor);
        leg1.draw(g2d);

        Line leg2 = new Line(wheelX-30, wheelY+340, wheelendX-170, wheelendY+420, wheelThickness+5, wheelColor);
        leg2.draw(g2d);

        Line bearing1 = new Line(wheelX-6, wheelY+380, wheelendX-190, wheelendY+120, wheelThickness-3, wheelColor);
        bearing1.draw(g2d);
        
        Circle outerSpindle = new Circle(wheelX-80, wheelY+150, wheelSize/8, Color.orange);  
        outerSpindle.draw(g2d);

        Circle innerSpindle = new Circle(wheelX-74, wheelY+156, wheelSize/12, wheelColor); 
        innerSpindle.draw(g2d);

        Line band1 = new Line(wheelX-50, wheelY+150, wheelendX-100, wheelendY+75, wheelThickness-10, wheelColor);
        band1.draw(g2d);

        Line band2 = new Line(wheelX-50, wheelY+185, wheelendX-90, wheelendY+230, wheelThickness-10, wheelColor);
        band2.draw(g2d);       
        
    }

// The adjustAngle method that shall be used to infinitely animate the SpinningWheel. It takes in a double argument that shall increment the angle of rotation. 
    public void adjustAngle(double angleAmount) {
        angle += angleAmount; 
    }

}
