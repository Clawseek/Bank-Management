
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener{
    
        
        JTextField  pan, aadhar;
        JButton next;
        JRadioButton syes, sno, eyes, eno; 
        JComboBox religion, category, occupation, education, income;
        String formno;
        
        
    SignupTwo(String formno){  
          
        this.formno = formno;
        setLayout(null);
          
        setTitle("NEW ACCOUNT APPLICATION FROM - PAGE 2");
          
          
          
        JLabel additionalDetails = new JLabel("Page 2: Additional Details"); // now passing the reference of the random in the formno.
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22)); // setting the font of form
        additionalDetails.setBounds(290,80, 400, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(additionalDetails);
        
          
        JLabel name = new JLabel("Religion:"); // now passing the reference of the random in the formno.
        name.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        name.setBounds(100,140, 100, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(name);
        
        
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christan", "Other"};
         religion = new JComboBox(valReligion);    // using this JCombo we can access the class dropbox of the religion
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        JLabel fname = new JLabel("Category:"); // now passing the reference of the random in the formno.
        fname.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        fname.setBounds(100,190, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(fname);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
         category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
           
        JLabel dob = new JLabel("Income:"); // now passing the reference of the random in the formno.
        dob.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        dob.setBounds(100,240, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(dob);
        
        String incomevalcategory[] = {"Null", "< 1,50,000", "< 2,50,000", "5,00,000", "Upto 10,00,000"};
         income = new JComboBox(incomevalcategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
      
         
        JLabel gender = new JLabel("Educational:"); // now passing the reference of the random in the formno.
        gender.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        gender.setBounds(100,290, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(gender);
        
        
        
        
        JLabel email = new JLabel("Qualification:"); // now passing the reference of the random in the formno.
        email.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        email.setBounds(100,315, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(email);
        
         String educationValues[] = {"Null", "Graduation", "Graduate", "Post Graduation", "Doctrate", "Others"};
         education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
          
        JLabel marital = new JLabel("Occupation:"); // now passing the reference of the random in the formno.
        marital.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        marital.setBounds(100,390, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(marital); 
       
        
         String occupationValues[] = {"Null", "Salaried", "Self Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        
        
        
        
        
        
        
        JLabel address = new JLabel("PAN NUMBER:"); // now passing the reference of the random in the formno.
        address.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        address.setBounds(100,440, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        
        JLabel city = new JLabel("Aadhar Number:"); // now passing the reference of the random in the formno.
        city.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        city.setBounds(100,490, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        
        
        JLabel state = new JLabel("Senior Citizen:"); // now passing the reference of the random in the formno.
        state.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        state.setBounds(100,540, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(state);
        
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
       
         
        JLabel pincode = new JLabel("Existing Account:"); // now passing the reference of the random in the formno.
        pincode.setFont(new Font("Raleway",Font.BOLD, 20)); // setting the font of form
        pincode.setBounds(100,590, 200, 30);  // now setting the form into the frame 
        //setBounds work only if setLayout is null then only setBounds will work
        add(pincode);
        
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
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
       
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()){
            seniorcitizen = "No";
        }
        
        String exisitingaccount = null;
        if(eyes.isSelected()){
            exisitingaccount = "Married";
        } else if (eno.isSelected()){
            exisitingaccount = "No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();
       
        
        
        
        
        try{
           
                Conn c = new Conn();
                String query ="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";                      
                c.s.executeUpdate(query);
                
                //signup3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
          }catch(Exception e){
            System.out.println(e);
        }
            }
        
        
        public static void main(String args[]) {
        // TODO code application logic here
   
        new SignupTwo("");   // object of the constructor for the direct access of the 
}
}
