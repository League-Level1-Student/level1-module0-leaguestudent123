import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener{
public static void main(String[] args) {

	FortuneCookie bob=new FortuneCookie();
	bob.showButton();
	
}
	public void showButton() {
	     
	     JFrame rob =new JFrame();
	     JPanel harry=new JPanel();
	     

	     JButton button = new JButton();
	     button.addActionListener(this);
	     harry.add(button);
	     rob.add(harry);
	     rob.setVisible(true);
	     rob.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button clicked");
		
		
		int rand = new Random().nextInt(5);
			if (rand==0) {
				JOptionPane.showMessageDialog(null,"you will have good luck");
			}
			if (rand==1) {
				JOptionPane.showMessageDialog(null,"you will have a great day");
			}
			if (rand==2) {
				JOptionPane.showMessageDialog(null,"you will find some thing that will help you in life in the future");
			}
			if (rand==3) {
				JOptionPane.showMessageDialog(null,"you will have GREAT grades or other");
			} 
			if (rand==4) {
				JOptionPane.showMessageDialog(null,"you will have special day");
			}
			
	}

}
