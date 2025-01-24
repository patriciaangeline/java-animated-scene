/**
This is a class responsible for starting the application. 
It contains the main method and calls methods such as setUpGUI() from SceneFrame and playMusic() from MusicPlayer for all the shapes to appear and the music to be played, respectively.

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

public class SceneStarter {
    public static void main(String[] args) {
        SceneFrame sf = new SceneFrame(1024, 768);
        sf.setUpGUI();
        
        String musicFilePath = "Once Upon a Dream.wav";
        MusicPlayer musicObject = new MusicPlayer();
        musicObject.playMusic(musicFilePath);
    }
}
