/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String a = "https://i.ytimg.com/vi/9rQiZZFuYSg/hqdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component b = createImage(a);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(b);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String c = JOptionPane.showInputDialog(null, "Who Is This???");
		// 7. print "CORRECT" if the user gave the right answer
		if (c.equals("pepe")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "NOPE!!!!!");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(b);
		// 10. find another image and create it (might take more than one line of code)
		String d = "https://i.ytimg.com/vi/MkmBNw1_jFw/hqdefault.jpg";

		Component e = createImage(d);

		quizWindow.add(e);
		
		quizWindow.pack();

		String g = JOptionPane.showInputDialog(null, "Now, Who is this??????");
		if (g.equals("jerry")) {
			JOptionPane.showMessageDialog(null, "YES!!");
		} else {
			JOptionPane.showMessageDialog(null, "NNNNNNNOOOOOOOOOOO!!!!!!!");
		}
		quizWindow.remove(e);
		;
		// 11. add the second image to the quiz window
		String f = "https://i0.wp.com/www.usmagazine.com/wp-content/uploads/2018/01/515514538_logan-paul-jake-paul-zoom.jpg?crop=209px%2C0px%2C1639px%2C926px&resize=1600%2C900&ssl=1";
		Component h = createImage(f);
		quizWindow.add(h);
		quizWindow.pack();
		String i = JOptionPane.showInputDialog(null, "who is this?? (must say both last name and people)");

		if (f.equals("logan paul and jake paul")) {
			JOptionPane.showMessageDialog(null, "no cringe");
		} else {
			JOptionPane.showMessageDialog(null, " cringe");
		}
		quizWindow.remove(h);
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
