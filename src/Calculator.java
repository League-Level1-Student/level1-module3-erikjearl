import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Calculator implements ActionListener {
	JFrame frame;
	JPanel p1, panel;
	JButton add, sub, mul, div;
	JTextField field, f1;
	String input, i1;
	JTextPane pane;
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.makeGUI();
	}
	
	void makeGUI() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		panel = new JPanel();
		frame.add(p1, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.SOUTH);
		
		field = new JTextField(15);
		f1 = new JTextField(15);
		p1.add(field);
		p1.add(f1);
		
		add = new JButton("add");
		sub = new JButton("sub");
		mul = new JButton("mul");
		div = new JButton("div");
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);

		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		
		pane = new JTextPane();
		panel.add(pane);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		input = field.getText();
		i1 = f1.getText();
		
		double int1 = Integer.parseInt(input);
		double int2 = Integer.parseInt(i1);
		double fAns = 0;
		
		String whichB = e.getActionCommand();
		
		if(whichB.equals("add")) {
			System.out.println(input + "+" + i1);
			
			fAns = int1 +int2;
			
		}
		else if(whichB.equals("sub")) {
			fAns = int1 -int2;
		}
		else if(whichB.equals("mul")) {
			fAns = int1 *int2;
		}
		else if(whichB.equals("div")) {
			fAns = int1 /int2;
		}
		
		System.out.println(fAns);
		pane.setText("="+fAns);
		
	}
	
	
}
