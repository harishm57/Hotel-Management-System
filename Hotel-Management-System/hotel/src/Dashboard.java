//import javax.swing.*;
//import java.awt.*;
//
//public class Dashboard extends JFrame{
//	Dashboard(){
//		setBounds(0,0,1550,1000);
//		setLayout(null);
//		 ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("ic/third.jpg"));
//		 Image i2=i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
//			ImageIcon i3=new ImageIcon(i2);
//			JLabel Image=new JLabel(i3);
//			Image.setBounds(0,0,1550,1000);
//			add(Image);
//			
//			JLabel text=new JLabel("THE TAJ GROUP WELCOMES YOU!");
//			text.setBounds(350,80,1000,50);
//			text.setForeground(Color.WHITE);
//			text.setFont(new Font("Tahoma",Font.PLAIN,50));
//			Image.add(text);
//			
//			JMenuBar mb=new JMenuBar();
//			mb.setBounds(0,0,1550,30);
//			Image.add(mb);
//			
//			JMenu hotel=new JMenu("HOTEL MANAGEMENT");
//			hotel.setForeground(Color.RED);
//			mb.add(hotel);
//			
//			JMenu reception=new JMenu("RECEPTION");
//			hotel.add(reception);
//			
//			JMenu admin=new JMenu("ADMIN");
//			admin.setForeground(Color.BLUE);
//			mb.add(admin);
//			
//			JMenu addemployee=new JMenu("ADD EMPLOYEE");
//			admin.add(addemployee);
//			
//			JMenu addrooms=new JMenu("ADD ROOMS");
//			admin.add(addrooms);
//			
//			JMenu adddriver=new JMenu("ADD DRIVERS");
//			admin.add(adddriver);
//			
//		
//		setVisible(true);
//		
//	}
//
//public static void main(String[] args)
//{
//	new Dashboard();
//}
//}
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ic/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel AirlineManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
	AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	AirlineManagementSystem.setBounds(400, 60, 1000, 85);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("HOTEL MANAGEMENT");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
	AirlineSystem.add(FlightDetails);
		
	JMenu AirlineSystemHello = new JMenu("ADMIN");
        AirlineSystemHello.setForeground(Color.RED);
	menuBar.add(AirlineSystemHello);
        
        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
	AirlineSystemHello.add(FlightDetailshello1);
        
        FlightDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
	AirlineSystemHello.add(FlightDetailshello2);
        
        FlightDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});
        
        
        JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
	AirlineSystemHello.add(FlightDetailshello3);
        
	FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}