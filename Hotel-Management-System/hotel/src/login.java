//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
//import java.sql.*;
//public class login extends JFrame implements ActionListener {
//	JTextField username,Password;
//	JButton login,cancel;
//	login(){
//		getContentPane().setBackground(Color.WHITE);
//		setLayout(null);
//		
//		JLabel user=new JLabel("Username");
//		user.setBounds(40,20,100,30);
//		add(user);
//		
//	    username=new JTextField();
//		username.setBounds(150,20,150,30);
//		add(username);
//		
//		JLabel pass=new JLabel("Password");
//		pass.setBounds(40,70,100,30);
//		add(pass);
//		JPasswordField Password=new JPasswordField();
//		Password.setBounds(150,70,150,30);
//		add(Password);
//		
//		login=new JButton("login");
//		login.setBounds(40,150,120,30);
//		login.setBackground(Color.BLACK);
//		login.setForeground(Color.WHITE);
//		login.addActionListener(this);
//		add(login);
//		
//		cancel=new JButton("Cancel");
//		cancel.setBounds(180,150,120,30);
//		cancel.setBackground(Color.BLACK);
//		cancel.setForeground(Color.WHITE);
//		add(cancel);
//		cancel.addActionListener(this);
//		
//		
//		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ic/second.jpg"));
//		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//		ImageIcon i3=new ImageIcon(i2);
//		JLabel Image=new JLabel(i3);
//		Image.setBounds(350,10,200,200);
//		add(Image);
//		
//		
//		
//		setBounds(500,200,600,300);
//		setVisible(true);
//	}
//	public void actionPerformed(ActionEvent ae) {
//		if(ae.getSource()==cancel)
//		{
//			setVisible(false);
//		}
//		if(ae.getSource()==login)
//		{
//			String user=username.getText();
//			String pass=Password.getText();
//			try
//			{
//				conn c=new conn();
//				String query="select * from login where username = ' "+user+" ' and password =' " +pass+" ' ";
//				ResultSet rs=c.s.executeQuery(query);
//				if(rs.next())
//				{
//					setVisible(false);
//					new Dashboard();
//					
//				}else
//				{
//					JOptionPane.showMessageDialog(null,"invalid username or Password");
//					setVisible(false);
//				}
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//		
//	}
//	public static void main(String[] args)
//	{
//		new login();
//	}
//}
//
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login(){

        super("login");

        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ic/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,10,150,150);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(600,350);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        try{
            conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){ 
                new Dashboard().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(ae.getSource()==b2){
            System.exit(0);
        }
    }
    public static void main(String[] arg){
        new login();
    }
}
