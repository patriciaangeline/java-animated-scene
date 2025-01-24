/**
This is a class responsible for playing music. 
It uses exception handling to determine if the imported .wav file exists and loops it continuously. 

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

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicPlayer {

// The playMusic method takes in a String argument (name of the .wav file) and incorporates it into the Java program.
    // Source: https://www.youtube.com/watch?v=TErboGLHZGA&t=0s
    void playMusic(String musicLocation) {
        try {

            File musicPath = new File(musicLocation);
            
            if(musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip musicClip = AudioSystem.getClip();
                musicClip.open(audioInput);
                musicClip.start();
                musicClip.loop(musicClip.LOOP_CONTINUOUSLY);
            
            } else {
                System.out.println("Cannot find file.");
            }

        } catch (Exception e) {
            
        }
    }
}
