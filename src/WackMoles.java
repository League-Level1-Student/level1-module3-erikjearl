import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WackMoles implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	
	public static void main(String[] args) {
		WackMoles m = new WackMoles();
		
		m.makeGUI();
		
		Random r = new Random();
		m.drawButtons(r.nextInt(25));
	}
	
	void makeGUI() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.add(panel);
		
		
		frame.setSize(250, 300);
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
		
		if (whichB.equals("Mole!")) {
			System.out.println("good");
		}
		else {
			speak("Wrong");
		}
		
	}
	
		
}
