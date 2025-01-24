/**
This is a class responsible for drawing a bookmark-- one of the three composite shape classes created. 
It implements the DrawingObject interface and is a combination of the Rectangle, Triangle, and Diamond basic shape classes. 

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

public class Bookmark implements DrawingObject {
    private double bookmarkpositionX; 
    private double bookmarkpositionY; 
    private double bookmarkWidth; 
    private double bookmarkHeight; 
    private Color bookmarkColor1; 
    private Color bookmarkColor2; 

// The Bookmark Constructor that takes in arguments for the required fields.
    public Bookmark(double bx, double by, double bw, double bh, Color bc1, Color bc2) {
        bookmarkpositionX = bx;     // x position
        bookmarkpositionY = by;     // y position
        bookmarkWidth = bw;         // width
        bookmarkHeight = bh;        // height
        bookmarkColor1 = bc1;       // color #1
        bookmarkColor2 = bc2;       // color #2
    }

// The abstract method that was implemented from the DrawingObject interface. It instantiates a Rectangle, Triangle, and Diamond object and its necessary methods to create the bookmark. 
    public void draw(Graphics2D g2d) {
        Rectangle bookmarkBody = new Rectangle(bookmarkpositionX, bookmarkpositionY, bookmarkWidth, bookmarkHeight, bookmarkColor1, bookmarkColor2); 
        bookmarkBody.draw(g2d);
        
        Triangle triangleDesign = new Triangle(bookmarkpositionX, bookmarkHeight, bookmarkpositionX+95, bookmarkHeight, bookmarkpositionX+47, bookmarkHeight+85, 3, Color.decode("#FFA200")); 
        triangleDesign.draw(g2d);

        Diamond diamondDesign = new Diamond(bookmarkpositionX+47, bookmarkHeight+83, bookmarkWidth-25, Color.decode("#FFB700"));
        diamondDesign.draw(g2d);

    }
}

