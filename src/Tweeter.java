import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Tweeter implements ActionListener {
	JFrame frame;
	JPanel p1, p2;
	JButton b1;
	JTextField field;
	JTextPane pane;
	String input;
	
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
		frame.setTitle("Tweet");
		
		p1 = new JPanel();
		p2 = new JPanel();
		p1.setBorder(BorderFactory.createEtchedBorder());
		p1.setBackground(Color.BLUE);
		frame.add(p1, BorderLayout.NORTH);
		
		
		b1 = new JButton("Search the Twitterverse");
		field = new JTextField(15);
		
		p1.add(field);
		p1.add(b1);
		b1.addActionListener(this);
	
		
		p2.setBackground(Color.CYAN);
		p2.setBorder(BorderFactory.createEtchedBorder());
		p2.setPreferredSize(new Dimension (1100,100));
		frame.add(p2, BorderLayout.SOUTH);
		
		
		pane = new JTextPane();
		pane.setEditable(false);
		pane.setForeground(Color.magenta);
		pane.setBackground(null);
		p2.add(pane);
		
		frame.pack();
		
		
		
	}
	
	private String getLatestTweet(String searchingFor) {

	      Twitter twitter = new TwitterFactory().getInstance();

	      AccessToken accessToken = new AccessToken(
	            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

	      twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

	      twitter.setOAuthAccessToken(accessToken);
	      String allTweets= "";
	      
	      Query query = new Query(searchingFor);
	      try {
	            QueryResult result = twitter.search(query);
	            
	           
	          
	            for (int i=0; i <  result.getCount(); i++) {
	            
	            allTweets += "\n" +	result.getTweets().get(i).getText();
	           
	            }
	           
	        
	
	           
	     
	      
	         	
	      } catch (Exception e) {
	            System.err.print(e.getMessage());
	            return "What the heck is that?";
	      }
	      return allTweets;
	      
	      
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		input = field.getText();
		System.out.println(input);
		
		String tweet = getLatestTweet(input);
		System.out.println(tweet);
		pane.setText(tweet);
		frame.pack();
		
		
		
		
		
	
	}
	
	
	
}
