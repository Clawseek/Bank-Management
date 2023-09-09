
package bank.management.system;

import javax.swing.*;    //swing come from java extends (java extend features)javax is extended feature of java
import java.awt.*;     // image class is in AWT package not in swing package so we will import awt package
import java.awt.event.*;  // if you want to include all the actions ibcluding ActionListener so you can import all the event package of awt package
//import java.awt.event.ActionListener;   // to perform all the action while clicking on the button
import java.sql.*;


public class Login extends JFrame implements ActionListener{    // JFrame is a Swing Class import from swing package

    JButton login, signup, clear; // we have defined the buttons globally so that it can be accesssed outside the class also.
    
    JTextField cardTextField ;// we have defined the buttons globally so that it can be accesssed outside the class also.
    
    JPasswordField pinTextField;
    
    
    Login(){     // when we create the objecty then frame will be called
     
        setTitle("AUTOMATED TELLER MACHINE");   //  set the title of your page
      
        setLayout(null); // because we need to set the custom layout for the 
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));  //classloader  is class used to add things like image from your system        
//now we have to  paste this image on the frame we cannot directly paste it on the frame so we have to  use JLabel
        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);  // for the sizing of the image on the frame 
        ImageIcon i3 = new ImageIcon(i2); // now we have stored the image on the icon form 
        JLabel label = new JLabel(i3);   // we can store the image icon in JLabel not the image
        label.setBounds(70, 10, 100, 100); // location in the frame
        add(label);
        
        
        JLabel text = new JLabel("Welcome to ATM");// we can write any content on the frame with the help of JLabel
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);  // setting the location on the frame
        add(text);
        
        
        JLabel cardno = new JLabel("Card No.");// we can write any content on the frame with the help of JLabel
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);  // setting the location on the frame
        add(cardno);
        
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        
         JLabel pin = new JLabel("PIN:");// we can write any content on the frame with the help of JLabel
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);  // setting the location on the frame
        add(pin);
        
        
        pinTextField = new  JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        
       
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);  // setting the background color of sign in button
        login.setForeground(Color.WHITE); // letter on the sign in button isof white color
        login.addActionListener(this);  // to perform action 
        add(login);  
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);  // setting the background color of sign in button
        clear.setForeground(Color.WHITE); // letter on the sign in button isof white color
        clear.addActionListener(this);  // to perform action 
        add(clear); 
        
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);  // setting the background color of sign in button
        signup.setForeground(Color.WHITE); // letter on the sign in button isof white color
        signup.addActionListener(this);  // to perform action 
        add(signup);
        
         
        
        
        getContentPane().setBackground(Color.WHITE);  // we can set the background color of the background
         
        setSize(800, 480);   // define the dimension of your frame but not visible to  make it visible we have to use
        setVisible(true);  // to  make it visible we have to call  this function for visibility by making it true
        setLocation(350,200);
    }
   
    @Override
    public void actionPerformed(ActionEvent ae)  // you to override method of awt.event because it is an abstract method
    {
        if(ae.getSource() == clear)
        {
           cardTextField.setText("");
           pinTextField.setText("");
        }
        else if (ae.getSource() == login)
        {
        Conn conn = new Conn();
        String cardnumber = cardTextField.getText();
        String pinnumber = pinTextField.getText(); 
        String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
        try{
          ResultSet rs =  conn.s.executeQuery(query);
          if(rs.next()){
              setVisible(false);
              new Transactions(pinnumber).setVisible(true);
          }else{
              JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
          }
        }
        catch(Exception e){
           
            System.out.println(e);
        }
    }
        else if (ae.getSource() == signup)
        {
        setVisible(false);
        new SignupOne().setVisible(true);
        
        }
    }
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        //now ceateing object of the class and creating anonymous of class
        //when we run the class then frame will be open
        
        new Login();  //now constructor will be called
    }
}
