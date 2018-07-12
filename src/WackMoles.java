import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WackMoles implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	int counter=0;
	Date timeAtStart = new Date();
	
	
	public static void main(String[] args) {
		WackMoles m = new WackMoles();
		
		m.makeGUI();
		
		
	}
	
	void makeGUI() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.add(panel);
		
		
		frame.setSize(250, 300);
		
		Random r = new Random();
		drawButtons(r.nextInt(25));
		
	}
	
	void drawButtons(int random){
		
		ArrayList<JButton> jb = new ArrayList<JButton>();
		
		for (int i = 0; i < 24; i++) {
			jb.add(new JButton());
			jb.get(i).addActionListener(this);
			panel.add(jb.get(i));
		}
		
		jb.get(random).setText("Mole!");
		
	}
		
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String whichB = e.getActionCommand();
		
		if (counter > 9) {
			endGame(timeAtStart,counter);
		}
		else if (whichB.equals("Mole!")) {
			System.out.println(counter + " moles wacked!");
			counter++;
			playSound("moo.wav");
			
			frame.dispose();
			makeGUI();
			
			
		}
		else {
			speak("Wrong");
			System.out.println("Swing and a Miss");
		}
		
		
		
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	     frame.dispose();
	}
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
		
}
