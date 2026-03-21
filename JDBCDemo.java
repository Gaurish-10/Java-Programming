package Unit_4;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class JDBCDemo extends JFrame implements ActionListener{
	ResultSet rs = null;
	Connection con =null;
	Statement stmt = null;
	
	JLabel uname , pass , cpass;
	JButton register , reset , exit;
	JTextField tname , tpass , tcpass;
	public JDBCDemo(String title) {
		
		super(title);
		
		uname =  new JLabel("User name");
		pass = new JLabel("Password");
		cpass =  new JLabel("Confirm Password");
		tname = new JTextField(40);
		tpass = new JTextField(40);
		tcpass = new JTextField(40);
		register = new JButton("Register");
		reset = new JButton("Reset");
		exit = new JButton("Exit");
		
		setLayout(new FlowLayout());
		
		add(uname); add(tname);
		add(pass); add(tpass);
		add(cpass); add(tcpass);
		add(register); add(reset);add(exit);
		
		register.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		setLocation(100 , 100);
		setSize(500 , 500);
		setVisible(true);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			String url = "jdbc:mysql://localhost:3306/university";
			String user = "root";
			String password = "1Chinu2jinu";
			con = DriverManager.getConnection(url , user , password);
			System.out.println("Connection Successful");
			stmt = con.createStatement();
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == register) {
			String str1 = tname.getText();
			String str2 = tpass.getText();
			String str3 = tcpass.getText();
			String query = "insert into register values('" + str1 + "','" + str2 + "','" + str3 + "')";
			System.out.println(query);
			try {
			int count = stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(this , "Insertion is successful");
			}
			catch(SQLException err) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		new JDBCDemo("Registration Form");
	}
}
