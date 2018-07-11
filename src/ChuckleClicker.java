import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton b1, b2;
	
	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();

		c.makeButton();
	}

	void makeButton() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel pannel = new JPanel();
		frame.add(pannel);
		b1 = new JButton("Joke");
		b1.setOpaque(true);
		b2 = new JButton("Punchline");
		b2.setOpaque(true);
		b2.setEnabled(false);
		pannel.add(b1);
		pannel.add(b2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		b1.addActionListener(this);
		b2.addActionListener(this);

		b1.setBackground(Color.GREEN);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == b1) {

			JOptionPane.showMessageDialog(null, "why did the chicken cross the road?");
			b2.setEnabled(true);
			b1.setOpaque(false);
			b2.setBackground(Color.GREEN);
			
			
		} else if (e.getSource() == b2) {
			
			JOptionPane.showMessageDialog(null, "to get to the other side");
			b2.setOpaque(false);
			
		}
	}
}
