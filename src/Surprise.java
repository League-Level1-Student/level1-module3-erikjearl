import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Surprise implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	
	
	public static void main (String[] args) {
		Surprise s = new Surprise();
		s.createUI();
	}

	
	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton b1 = new JButton("Trick");
		JButton b2 = new JButton("Treat");
		
		
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.setVisible(true);
		
		frame.pack();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		//System.out.println(e.getSource());

				
		if (buttonPressed.getText() == "Treat") {
			
		
			showPictureFromTheInternet("https://i.ytimg.com/vi/AZ2ZPmEfjvU/maxresdefault.jpg");

		}
		
		else if (buttonPressed.getText() == "Trick") {
			showPictureFromTheInternet("https://i.ytimg.com/vi/AZ2ZPmEfjvU/maxresdefault.jpg");
		}
	}
	
	
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	
	
}
