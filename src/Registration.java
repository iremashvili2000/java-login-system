import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registration implements ActionListener {
	JFrame frame=new JFrame("Registration");
	JLabel registLabel=new JLabel("HI :)))");

	 
	JButton loginButton=new JButton("back");
	JButton resetButton= new JButton("Reset");
	JButton registButton=new JButton("registration");
	JTextField userIDField=new JTextField();
	JPasswordField userPasswordField= new JPasswordField();
	JLabel userIDLabel =new JLabel("eneter username:  ");
	JLabel userpasswordIDLabel =new JLabel("enter password:  ");
	JLabel massageLabel=new JLabel("hii");
	
	Registration(){
		userIDLabel.setBounds(50,50,125,125);
		userpasswordIDLabel.setBounds(50,100,125,125);
		
		massageLabel.setBounds(125,250,250,35);
		massageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(200,100,200,25);
		userPasswordField.setBounds(200,150,200,25);
		
		loginButton.setBounds(150,250,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(250,250,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		registButton.setBounds(350,250,100,25);
		registButton.setFocusable(false);
		registButton.addActionListener(this);
		
		
		frame.add(userIDLabel);
		frame.add(userpasswordIDLabel);
		frame.add(massageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(registButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==registButton) {
			String userID=userIDField.getText();
			String password=String.valueOf(userPasswordField.getPassword());
			boolean succes=false;
			if(userID.length()>0 && password.length()>0) {
				succes=true;
			}
			
			
			if(succes) {
			massageLabel.setForeground(Color.black);
			massageLabel.setText("registr successful");
		//	IDandPasswords idandpassword=new IDandPasswords(userIDField.getText(),userPasswordField.getText());
			
				}else {
					massageLabel.setForeground(Color.RED);
					massageLabel.setText("Error please enter login and password");
				}
			}
		
		if(e.getSource()==loginButton) {
			frame.dispose();
			IDandPasswords idandPasswords=new IDandPasswords();
			LoginPage loginPage=new LoginPage(idandPasswords.getLoginInfo());
		}
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
	}

}
