/**
This is an interface responsible for drawing all the shapes for the animated scene. 
It contains the abstract method draw that takes in a Graphics2D argument. 

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

public interface DrawingObject {
    void draw(Graphics2D g2d); // An abstract method implemented in all basic and composite shape classes. 

}
