package extra.pong.data;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class sensitive_keyboard implements KeyListener{
	JFrame sal=new JFrame();
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	sensitive_keyboard(){
		sal.setVisible(true);
		sal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sal.addKeyListener(this);
	}

	public static void main(String[] args) {
		sensitive_keyboard a=new sensitive_keyboard();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hey that hurtedededededededdeed");
		speak("stop");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
