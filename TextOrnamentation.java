/**
This is a class responsible for drawing the design component underneath the historiated initial -- one of the three composite shape classes created. 
It implements the DrawingObject interface and is a combination of the Rectangle, Line, and Diamond basic shape classes. 

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

public class TextOrnamentation implements DrawingObject {
    private double ornamentationX;
    private double ornamentationY; 
    private double ornamentationendX; 
    private double ornamentationendY; 
    private double ornamentationWidth; 
    private double ornamentationHeight; 
    private float ornamentationThickness; 
    private Color ornamentationColor1; 
    private Color ornamentationColor2; 

// The TextOrnamentation constructor that takes in arguments for the required fields. 
    public TextOrnamentation(double ox, double oy, double oex, double oey, double ow, double oh, float ot, Color oc1, Color oc2) {
        ornamentationX = ox;            // x position for starting point
        ornamentationY = oy;            // y position for starting point
        ornamentationendX = oex;        // x position for ending point
        ornamentationendY = oey;        // y position for ending point
        ornamentationWidth = ow;        // width
        ornamentationHeight = oh;       // height
        ornamentationThickness = ot;   // thickness
        ornamentationColor1 = oc1;     // color #1
        ornamentationColor2 = oc2;     // color #2
    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates multiple Rectangle, Line, and Diamond objects and its necessary methods to create the text ornamentation.
    public void draw(Graphics2D g2d) {
        Rectangle ornamentationBody = new Rectangle(ornamentationX, ornamentationY, ornamentationWidth, ornamentationHeight, ornamentationColor1, ornamentationColor2);
        ornamentationBody.draw(g2d);

        Line line1 = new Line(ornamentationX+26, ornamentationY+48, ornamentationendX+26, ornamentationendY+575, ornamentationThickness, Color.decode("#C0C0C0"));
        line1.draw(g2d); 

        Line line2 = new Line(ornamentationX+77, ornamentationY+48, ornamentationendX+77, ornamentationendY+575, ornamentationThickness, Color.decode("#C0C0C0"));
        line2.draw(g2d);

        Line line3 = new Line(ornamentationX+128, ornamentationY+48, ornamentationendX+128, ornamentationendY+575, ornamentationThickness, Color.decode("#C0C0C0"));
        line3.draw(g2d);

        Diamond diamondBorder1 = new Diamond(ornamentationX+26, ornamentationY, ornamentationWidth/4.25, Color.decode("#6EC6F4")); 
        diamondBorder1.draw(g2d);

        Diamond diamondBorder2 = new Diamond(ornamentationX+77, ornamentationY, ornamentationWidth/4.25, Color.decode("#357DED"));
        diamondBorder2.draw(g2d);

        Diamond diamondBorder3 = new Diamond(ornamentationX+129, ornamentationY, ornamentationWidth/4.25, Color.decode("#3F37C9"));
        diamondBorder3.draw(g2d);

        Diamond diamondBorder4 = new Diamond(ornamentationX+26, ornamentationY+449, ornamentationWidth/4.25, Color.decode("#6EC6F4"));
        diamondBorder4.draw(g2d);
        
        Diamond diamondBorder5 = new Diamond(ornamentationX+77, ornamentationY+449, ornamentationWidth/4.25, Color.decode("#357DED"));
        diamondBorder5.draw(g2d);

        Diamond diamondBorder6 = new Diamond(ornamentationX+129, ornamentationY+449, ornamentationWidth/4.25, Color.decode("#3F37C9"));
        diamondBorder6.draw(g2d);

    }

}
