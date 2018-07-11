import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Tweeter {
	JFrame frame;
	JPanel p1, p2;
	JButton b1;
	
	public static void main(String[] args) {
		Tweeter t = new Tweeter();
		
		t.makeGUI();
	}
	
	void makeGUI(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.cyan);
		frame.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		p1.setBorder(BorderFactory.createEtchedBorder());
		p1.setBackground(Color.BLUE);
		frame.add(p1, BorderLayout.NORTH);
		
		
		b1 = new JButton("Search the Twitterverse");
		JTextField field = new JTextField(15);
		
		p1.add(field);
		p1.add(b1);
		
		frame.add(p2, BorderLayout.SOUTH);
		JTextPane pane = new JTextPane();
		p2.setBackground(Color.CYAN);
		p2.setBorder(BorderFactory.createEtchedBorder());
		p2.add(pane);
		
		frame.pack();
		
		
		
	}
	
}
