import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {

	JFrame frame;
	JLabel label;
	Character currentLetter;
	int count;
	int right;
	
	Date timeAtStart = new Date();
	
	public static void main(String[] args) {
		TypingTutor t = new TypingTutor();
		
		t.makeFrame();
	}
	
	
	void makeFrame(){
		frame = new JFrame();
		frame.setBackground(Color.BLUE);
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		currentLetter = generateRandomLetter();
		
		label = new JLabel();
		label.setOpaque(true);
		
		
		label.setText(currentLetter.toString());
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label);
		
		frame.addKeyListener(this);

	}
	
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26)+'a');
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		count++;
		
		if (count > 10) {
			showTypingSpeed(right);
		}
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed "+ e.getKeyChar());
		
		if(e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			
			label.setBackground(Color.GREEN);
			right++;
		}
		else {
			label.setBackground(Color.RED);
		}
		
		
		currentLetter = generateRandomLetter();
		label.setText(currentLetter.toString());
		
		
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	

	
	
	
	
	
}
