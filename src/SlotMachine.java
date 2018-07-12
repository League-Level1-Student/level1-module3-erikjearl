import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel, p1, p2,p3;
	JButton spin;
	JLabel l1, l2,l3;

	
	public static void main(String[] args) {
		SlotMachine machine = new SlotMachine();
		machine.makeGUI();
	}
	
	void makeGUI() {
		frame = new JFrame();
		panel = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		spin = new JButton("Spin");
		spin.addActionListener(this);
		
		
		l1= loadImage("cherry.png");
		l2= loadImage("bar.png");
		l3= loadImage("orange.png");
		
		
		
		panel.add(spin);
		
		p2.add(l1);
		p1.add(l1);
		p3.add(l1);
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.pack();
	}
	
	
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		frame.remove(l1);
		frame.remove(l2);
		frame.remove(l3);
		
		for(int i = 0; i >3; i++) {
	
		Random r = new Random();
		int r1= r.nextInt(3);
		
		if (r1 == 0) {
			panel.add(l1);
		}
		else if (r1 == 1) {
			panel.add(l2);
		}
		else{
			panel.add(l3);
		}
		System.out.println(r1);
	
		}
	
	
		
		
		frame.pack();
		
		
	}
}
