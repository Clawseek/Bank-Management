
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class SignupOne extends JFrame implements ActionListener{
    
        long random;
        JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
        JButton next;
        JRadioButton male, female, other, married, unmarried; 
        JDateChooser dateChooser;

   
    SignupOne(){  
          
        setLayout(null);
          
        Random ran = new Random();  // it present in java util package
        random = Math.abs((ran.nextLong()%9000L)+ 1000L); // decraring the type of random number will be generate either it is long aur int
          
          
       
        JLabel formno = new JLabel("APPLICATION FORM NO." + random); // now passing the reference of the random in the formno.
        formno.setFont(new Font("Raleway",Font.BOLD, 38)); // setting the font of form
        formno.setBounds(140,20, 600, 40);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(formno);
          
          
        JLabel personalDetails = new JLabel("Page 1: Personal Details"); // now passing the reference of the random in the formno.
        personalDetails.setFont(new Font("Raleway",Font.BOLD, 22)); // setting the font of form
        personalDetails.setBounds(290,80, 400, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(personalDetails);
        
          
        JLabel name = new JLabel("Name:"); // now passing the reference of the random in the formno.
        name.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        name.setBounds(100,140, 100, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(name);
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        
        
        
        JLabel fname = new JLabel("Father's Name:"); // now passing the reference of the random in the formno.
        fname.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        fname.setBounds(100,190, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
           
        JLabel dob = new JLabel("Date of Birth"); // now passing the reference of the random in the formno.
        dob.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        dob.setBounds(100,240, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(dob);
        
         dateChooser = new JDateChooser();  //impoting Jcalender jar file and creating object of it and importing import com.toedter.calendar.JDateChooser;
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105)); // setting the color of the text
        add(dateChooser);
              
         
        JLabel gender = new JLabel("Gender"); // now passing the reference of the random in the formno.
        gender.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        gender.setBounds(100,290, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female= new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        //now the problem is if we select the male and female it get selected both but we want to set single radio at a time
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        
        JLabel email = new JLabel("Email Address:"); // now passing the reference of the random in the formno.
        email.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        email.setBounds(100,340, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
          
        JLabel marital = new JLabel("Marital Status:"); // now passing the reference of the random in the formno.
        marital.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        marital.setBounds(100,390, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(marital); 
       
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        //now the problem is if we select the male and female it get selected both but we want to set single radio at a time
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        
        
        
        
        
        
        JLabel address = new JLabel("Address:"); // now passing the reference of the random in the formno.
        address.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        address.setBounds(100,440, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        
        JLabel city = new JLabel("City:"); // now passing the reference of the random in the formno.
        city.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        city.setBounds(100,490, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        
        
        JLabel state = new JLabel("State:"); // now passing the reference of the random in the formno.
        state.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        state.setBounds(100,540, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(state);
        
         stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin code:"); // now passing the reference of the random in the formno.
        pincode.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        pincode.setBounds(100,590, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
          
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true); 
    }
        public void actionPerformed(ActionEvent ae){
        String formno = "" + random;  //long to convert it in string form
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected())
        {
            gender = "Male";
        } else if (female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        } else if (unmarried.isSelected()){
            marital = "Unmarried";
        } else if (other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        
        
        
        try{
           
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";                      
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
        }
                }catch(Exception e){
            System.out.println(e);
        }
            }
        
        
        public static void main(String args[]) {
        // TODO code application logic here
   
        new SignupOne();   // object of the constructor for the direct access of the 
}
}
