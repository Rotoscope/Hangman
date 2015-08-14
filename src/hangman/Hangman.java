package hangman;

import java.awt.Dimension;
import javax.swing.*;

public class Hangman {

    public static void main(String[] args) {
	// TODO code application logic here
	SwingUtilities.invokeLater(() -> {
	    createAndShowGUI();
	});
    }

    private static void createAndShowGUI() {
	System.out.println("Created GUI on EDT? "
		+ SwingUtilities.isEventDispatchThread());
	JFrame f = new JFrame("Hangman");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.add(new Splash());
	f.pack();
	f.setVisible(true);
    }

}
