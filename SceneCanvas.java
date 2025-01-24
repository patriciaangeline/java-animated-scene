/**
This is a class responsible for drawing all the necessary shapes needed for the animated scene. 
It extends JComponent and adds all the shapes into the ArrayList shapes. 

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
import javax.swing.*;
import java.awt.geom.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class SceneCanvas extends JComponent {
    private int width; 
    private int height; 
    private GradientPaint backgroundGradient; 
    private ArrayList<DrawingObject> shapes; 
    private Rectangle rectanglePage; 
    private Square squareInitial; 
    private TextOrnamentation underText; 
    private Bookmark bookmarkPage;
    private SpinningWheel wheelSpinning;  
    private Font ancientMedium;
    private Font bradleyGratis;

// The SceneCanvas constructor that instantiates the ArrayList shapes and adds all the necessary shapes to it.
    public SceneCanvas(int w, int h) {
        width = w;
        height = h; 
        backgroundGradient = new GradientPaint(0, 0, Color.decode("#5F3100"), w, h, Color.decode("#CEAF8C"));

    // Exception handling required to import non-native fonts into the Java program 
        // Source: https://www.youtube.com/watch?v=g-wrebFVP3E
        // Source: https://stackoverflow.com/questions/5652344/how-can-i-use-a-custom-font-in-java
        try {
            InputStream stream = getClass().getResourceAsStream("Ancient Medium.ttf"); 
            ancientMedium = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(200F);

            InputStream stream2 = getClass().getResourceAsStream("Bradley Gratis.ttf");
            bradleyGratis = Font.createFont(Font.TRUETYPE_FONT, stream2).deriveFont(70F);

        } catch(IOException | FontFormatException e) {

        }
        

        shapes = new ArrayList<>();

        rectanglePage = new Rectangle(10, 13, 1003, 745, Color.decode("#D2A87D"), Color.decode("#D7C8B4")); 
        shapes.add(rectanglePage); 
    
        squareInitial = new Square(25, 40, 155, Color.decode("#FB8B24"), Color.decode("#FFBF61"));  
        shapes.add(squareInitial);
        
        underText = new TextOrnamentation(25, 225, 25, 100, 155, 500, 2, Color.decode("#0077B6"), Color.decode("#0096C7")); 
        shapes.add(underText);
        
        bookmarkPage = new Bookmark(480, 0, 95, 500, Color.decode("#480CA8"), Color.decode("#9D4EDD")); 
        shapes.add(bookmarkPage);
        
        wheelSpinning = new SpinningWheel(0, 675, 145, 790, 150, 300, 510, 510, 15, Color.decode("#411D13")); 
        shapes.add(wheelSpinning);

        setPreferredSize(new Dimension(width, height));
    }

// Method overriding of the paintComponent method to create Graphics2D objects 
    @Override 
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
    // Setting up of background properties
        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
        g2d.setPaint(backgroundGradient);
        g2d.fill(background);

    // For loop that calls the draw() method on all the components inside the shapes ArrayList.
        for(DrawingObject d : shapes) {
            d.draw(g2d);
        }  

    // Uses the drawString() method that designates the String to be drawn and its x and y coordinates.  
        // Source: https://kodejava.org/how-do-i-draw-a-string-in-java-2d/
        g2d.setFont(ancientMedium);
        g2d.setPaint(Color.black);
        g2d.drawString("O", 35, 175);

        g2d.setFont(bradleyGratis);
        g2d.setPaint(Color.black);
        g2d.drawString("n her 16th", 205, 185);
        g2d.drawString("birthday, a", 205, 285);
        g2d.drawString("dancing", 205, 385);
        g2d.drawString("green light", 205, 485);
        g2d.drawString("lured her to", 205 , 585);
        g2d.drawString("a tower.", 205, 685);

    }

// The method getSpinningWheel() returns the instantiated wheelSpinning object. It is necessary so that the adjustment of its angle of rotation can occur in the SceneFrame class. 
    public SpinningWheel getSpinningWheel() {
        return wheelSpinning;
    }
    
}

