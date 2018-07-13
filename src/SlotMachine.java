import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton spin;
	

	
	public static void main(String[] args) {
		SlotMachine machine = new SlotMachine();
		machine.makeGUI();
	}
	
	void makeGUI() {
		frame = new JFrame();
		panel = new JPanel();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		
		makeButton();
		
		frame.pack();
	}
	
	void makeButton(){
		spin = new JButton("Spin");
		spin.addActionListener(this);
		panel.add(spin);
		
	}
	
	
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JLabel l1, l2,l3;
		
		int c = 0;
		int b = 0;
		int o = 0;
		
		
		panel.removeAll();
		makeButton();
		
		System.out.println("Spun");
		
		for(int i = 0; i <3; i++) {
	
		Random r = new Random();
		int r1= r.nextInt(3);
		
		
		if (r1 == 0) {
			
			l1= loadImage("cherry.png");
			panel.add(l1);
			System.out.println("cherry");
			c++;
			
		}
		else if (r1 == 1) {
			l2= loadImage("bar.png");
			panel.add(l2);
			System.out.println("bar");
			b++;
		}
		else{
			l3= loadImage("orange.png");
			panel.add(l3);
			System.out.println("orange");
			o++;
		}
		
		
		
		
		}
	
		
		frame.pack();
		
		
		if (c == 3 || b ==3 || o == 3) {
			JOptionPane.showMessageDialog(null, "Winner winner chicken dinner");
			
			
		}
		
	}
}
