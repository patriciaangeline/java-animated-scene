/**
This is a class that creates the JFrame for the GUI. 
It creates an instance of SceneCanvas and adds it to the center of the JFrame. 

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
import java.awt.event.*;
import javax.swing.*;

public class SceneFrame {
    private JFrame frame;
    private int width; 
    private int height; 
    private SceneCanvas sceneCanvas; 

// The SceneFrame constructor that takes in arguments for the required fields.
    public SceneFrame(int w, int h) {
        width = w; 
        height = h; 
        frame = new JFrame();
        sceneCanvas = new SceneCanvas(width, height);

    // The SpinWheel inner class that implements the ActionListener interface. It uses the Timer object to update the angle of rotation of the spinning wheel infinitely. 
        // Source: https://www.youtube.com/watch?v=CQi7XorjECs
        class SpinWheel implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = 5; 
                SpinningWheel spinningWheel = sceneCanvas.getSpinningWheel();
                spinningWheel.adjustAngle(amount);
                sceneCanvas.repaint();
            }

        }

        ActionListener wheelListener = new SpinWheel(); 
        Timer timer = new Timer(0, wheelListener);
        timer.start();

    }

// The setUpGUI() method is responsible for customizing the JFrame and adds sceneCanvas to the frame.
    public void setUpGUI() {
        Container cp = frame.getContentPane();
        cp.add(sceneCanvas, BorderLayout.CENTER);

        frame.setTitle("Midterm Project- Tan, Patricia - 226189");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(sceneCanvas);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}