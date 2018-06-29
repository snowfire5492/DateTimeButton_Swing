import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import java.util.Date;

public class DateTime implements ActionListener{

	JLabel myLabel = new JLabel("");
	
	DateTime(){
		
		JFrame frame = new JFrame("Date and Time");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(new GridLayout(2,1));
		
		ImageIcon icon = new 
ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//JClock.png");
		frame.setIconImage(icon.getImage());
		JButton dateButton = new JButton("Date");
		
		dateButton.addActionListener(this);
		dateButton.setMnemonic('d');
		
		frame.getRootPane().setDefaultButton(dateButton);
		
		
		JPanel bottomPane = new JPanel();
		
		bottomPane.add(dateButton);
		
		frame.add(myLabel);
		frame.add(bottomPane);
		
		new Timer(1000, ae-> {
			myLabel.setText(new Date().toString());
		}).start();
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
													
// import java.util.Date;
		Date date = new Date();						
// date class to get timestamp
		
		A: if(ae.getActionCommand() == "Date"){
				
				System.out.println(ae.getModifiers());
				//System.out.println(ae.CTRL_MASK );
				//System.out.println(ae.SHIFT_MASK);
				//System.out.println(ae.ALT_MASK);
				//System.out.println(ae.CTRL_MASK + 
ae.SHIFT_MASK);
				
			
			if(ae.getModifiers() == (16 + 
ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK)){
					myLabel.setText("Wubbudubbulubb! 
buurp!");
					break A;
				}
			
			
				myLabel.setText(date.toString());	
// Date().toString() returns timestamp
		}
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(()-> 
		new DateTime());
	}
	
	
	
	
	
}

