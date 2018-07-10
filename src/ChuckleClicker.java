import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ChuckleClicker {
	
	
	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		
		makeButton("name");
		
	}
	
	
		static void makeButton(String buttonName){
		//JButton button = new JButton(button);
		//return(button);
		
		JOptionPane.showMessageDialog(null, buttonName);
		
	}
	
}
