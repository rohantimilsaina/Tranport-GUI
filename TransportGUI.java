/**
 * Write a description of class TransportGUI here.
 *
 * @author (Rohan Timilsaina)
 * @version (2022/07/15)
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TransportGUI implements ActionListener
{
    //creating a new Arraylist Vehicle_list
    ArrayList<Vehicle> Vehicle_list= new ArrayList<Vehicle>();
    
    Font font_1= new Font("Dialog",Font.BOLD,19);
    Font font_2= new Font("DialogInput",Font.BOLD,13);
    
    private JFrame frame1,frame2,frame3;
    private JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8;
    
    private JLabel la1,la2,la3,la4,la5,la6,la8,la7,la9,la10,la11,la12,la13,la14,la15,
    le1,le2,le3,le4,le5,le6,le7,le8,le9,le10,le11,le12,le13,le14,le15;
    
    private JTextField t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t15,t16,
    tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15;
    
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b11,b12,b13,b14,
    btn11,btn22,btn33,btn44,btn55,btn66,btn77;
    
    private JComboBox a,b,c;
    

    public void TransportGUI()//creating TransportGUI method
    {
       
        
        frame1 = new JFrame("Vehicle Company");//creating frame1
        frame1.setBounds(250,100,550,350);
        
        panel1= new JPanel();//creating panel1
        panel1.setBounds(250,100,550,350);
        panel1.setLayout(null);
        panel1.setBackground(Color.YELLOW);
        
        la1= new JLabel();//creating JLabel la1 in panel1 
        la1.setText("Choose Vehicle");
        la1.setForeground(Color.BLUE);
        la1.setBounds(185,40,280,40);
        la1.setFont(font_1);
        panel1.add(la1);
        
        b1=new JButton("AutoRickshaw");//creating b1 JButton for choosing Autorickshaw
        b1.setBounds(50,150,180,55);
        b1.setFont(font_2);
        b1.setBackground(new Color(255,255,255));
        b1.addActionListener(this);//adding b1 JButton in ActionListener
        panel1.add(b1);//Adding b1 JButton in panel1
        
        
        b2=new JButton("Electric Scooter");//creating b2 JButton for choosing Electricscooter
        b2.setBounds(300,150,180,55);
        b2.setFont(font_2);
        b2.setBackground(new Color(255,255,255));
        b2.addActionListener(this);//adding b2 JButton in acttionlistener
        panel1.add(b2);//adding b2 in panel1
        
        frame1.add(panel1);//adding panel1 in frame1
        frame1.setVisible(true);
        frame1.setBounds(250,100,550,350);
        frame1.setResizable(false);
        frame1.setLayout(null);
        
    }
    
    public void AutoRickshaw()
    {
        frame2= new JFrame("Buy An AutoRickshaw");//creating frame2 for buying an autorickshaw
        frame2.setBounds(180,20,900,620);
        
        panel2= new JPanel();//creating panel2 
        panel2.setBounds(180,40,900,600);
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(null);
        
        la2= new JLabel();//creating la2 JLabel with text AutoRickshaw
        la2.setText("AutoRickshaw");
        la2.setBounds(380,5,300,45);
        la2.setFont(font_1);
        panel2.add(la2);
        
        b3= new JButton("Click for Scooter");//creating b3 JButton 
        b3.setBounds(740,8,140,45);
        b3.setBackground(new Color(160,160,160));
        b3.addActionListener(this);//adding b3 JButton in actionlistener
        panel2.add(b3);//adding b3 JButton in panel2

        panel3= new JPanel();//creating panel3 JPanel
        panel3.setBounds(10,60,870,230);
        panel3.setBackground(Color.CYAN);
        
        
        la3= new JLabel("Vehicle Id:");//creating la3 JLabel for Vehicle Id and adding it on panel3
        la3.setBounds(20,10,120,30);
        panel3.add(la3);
        
        t3= new JTextField();//creating t3 JTextField 
        t3.setBounds(150,10,160,30);
        panel3.add(t3);//adding t3 in panel3
        
        
        la4= new JLabel("Vehicle Name:");//creating la4 JLabel for Vehicle Name
        la4.setBounds(20,50,120,30);
        panel3.add(la4);//adding la4 JLabel in panel3
        
        
        t4= new JTextField();//creating t4 JTextField
        t4.setBounds(150,50,160,30);
        panel3.add(t4);//adding t4 JTextField in panel3
        
        la5= new JLabel("Vehicle Weight:");//creating la5 vehicle weight
        la5.setBounds(20,90,120,30);
        panel3.add(la5);//adding la5 in panel3
        
        t5= new JTextField();//creating t5 JTextField
        t5.setBounds(150,90,160,30);
        panel3.add(t5);//adding t5 JTextField in panel3
        
        la6= new JLabel("Vehicle Color:");//creating la6 JLabel Vehicle color and add it on panel 3
        la6.setBounds(20,130,120,30);
        panel3.add(la6);
        
        t6= new JTextField();//creating t6 JTextField and add it on panel3 JPanel
        t6.setBounds(150,130,160,30);
        panel3.add(t6);
        
        la7= new JLabel("Ground Clearance:");//creating la7 JLabel Ground Clearance and add it on panel3 JPanel
        la7.setBounds(20,170,120,30);
        panel3.add(la7);
        
        t7= new JTextField();//creating t7 JTextField and add it on panel3
        t7.setBounds(150,170,160,30);
        panel3.add(t7);
        
        
        la8= new JLabel("Vehicle Speed:");//creating la8 JLabel Vehicle Speed and add it on panel3 JPanel
        la8.setBounds(400,10,120,30);
        panel3.add(la8);
        
        t8= new JTextField();//creating t8 JTextField and add it on panel3 JPanel
        t8.setBounds(530,10,160,30);
        panel3.add(t8);
        
        la9= new JLabel("Engine Displacement:");//creating la9 JLabel Engine Displacement and add it on panel3 JPanel
        la9.setBounds(400,50,120,30);
        panel3.add(la9);
        
        t9= new JTextField();//creating t9 JTextField and add it on panel3 
        t9.setBounds(530,50,160,30);
        panel3.add(t9);
        
        la10= new JLabel("Torque:");//creating la10 JLabel Torque and add it on panel3
        la10.setBounds(400,90,130,30);
        panel3.add(la10);
        
        t10= new JTextField();//creating t10 JTextField and add it on panel3
        t10.setBounds(530,90,160,30);
        panel3.add(t10);
        
        la11= new JLabel("Fuel Tank Capacity:");//creating la11 JLabel Fuel Tank Capacity and add it on panel3
        la11.setBounds(400,130,120,30);
        panel3.add(la11);
        
        t11= new JTextField();//creating t11 JTextField and add it on panel3
        t11.setBounds(530,130,160,30);
        panel3.add(t11);
        
        b4= new JButton("Add An AutoRickshaw");//creating b4 JButton
        b4.setBounds(350,170,150,45);
        b4.setBackground(Color.PINK);
        b4.addActionListener(this);//adding b4 JButton in actionlistener
        panel3.add(b4);//adding b4 in panel3
              
        
        
        panel3.setLayout(null);
        panel2.add(panel3);
        
        panel4= new JPanel();//creating panel4
        panel4.setBounds(10,295,870,230);
                
        la12= new JLabel("Vehicle ID:");//creating la12 JLabel Vehicle ID and add it on panel4
        la12.setBounds(20,10,120,30);
        panel4.add(la12);
        
        t12= new JTextField();//creating t12 JTextField and add it on panel4
        t12.setBounds(150,10,160,30);
        panel4.add(t12);
        
        la13= new JLabel("No of Seats:");//creating la13 JLabel No of Seats and add it on panel4
        la13.setBounds(20,50,120,30);
        panel4.add(la13);
        
        t13= new JTextField();//creating t13 JTextField and add it on panel4
        t13.setBounds(150,50,160,30);
        panel4.add(t13);
        
        la14= new JLabel("Booked Date:");//creating la14 JLabel Booked Date and add it on panel4
        la14.setBounds(20,90,120,30);
        panel4.add(la14);
        // Creating an array of year, months, and days
        String[] year={"2018","2019","2020","2021","2022"};
        String[] months={"January","February","March","April","May","June","July","August","September",
            "October","November","December"};
        String[] days={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17",
            "18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        //creating a JComboBox a,b, and c
        a= new JComboBox(year);
        a.setBounds(150,90,60,30);
        b= new JComboBox(months);
        b.setBounds(220,90,80,30);
        c= new JComboBox(days);
        c.setBounds(310,90,50,30);
        //adding a, b, and c on panel4
        panel4.add(a);
        panel4.add(b);
        panel4.add(c);  
        
        la15= new JLabel("Charge Amount:");//creating la15 JLabel Charge Amount and add it on panel4
        la15.setBounds(20,130,120,30);
        panel4.add(la15);
        
        t15= new JTextField();//creating t15 JTextField and add it on panel4
        t15.setBounds(150,130,160,30);
        panel4.add(t15);
        
        b13= new JButton("Book an AutoRickshaw");//creating b13 JButton for Book an Autorickshaw 
        b13.setBounds(350,180,150,45);
        b13.setBackground(Color.PINK);
        b13.addActionListener(this);//adding b13 JButton in actionlistener
        panel4.add(b13);//adding b13 JButton in panel4
        
        panel4.setBackground(Color.CYAN);
        panel4.setLayout(null);
        panel4.setVisible(true);
        panel2.add(panel4);
        
        b6= new JButton("Back");//creating b6 JButton for Back
        b6.setBounds(10,530,100,35);
        b6.setBackground(Color.PINK);
        b6.addActionListener(this);//adding b6 JButton in actionlistener
        b6.setFont(font_2);
        panel2.add(b6);//adding b6 in panel2
        
        b7= new JButton("Clear");//creating b7 JButton for Clear 
        b7.setBounds(385,530,100,35);
        b7.setBackground(Color.RED);
        b7.addActionListener(this);//adding b7 JButton in actionlistener
        b7.setFont(font_2);
        panel2.add(b7);//adding b7 in panel2
        
        b8= new JButton("Display");//creating b8 JButton for Display
        b8.setBounds(780,530,100,35);
        b8.setBackground(Color.PINK);
        b8.addActionListener(this);//adding b8 JButton in actionlistener
        b8.setFont(font_2);
        panel2.add(b8);//adding b8 JButton in panel2
        
        frame2.add(panel2);//adding panel2 in frame2
        frame2.setResizable(false);
        frame2.setVisible(true);
        frame2.setLayout(null);
        
    }
    
    public void ElectricScooter()
    {
        frame3= new JFrame("Buy An ElectricScooter");
        frame3.setBounds(180,20,900,620);
        
        panel5= new JPanel();
        panel5.setBounds(180,40,900,620);
        panel5.setBackground(Color.WHITE);
        panel5.setLayout(null);
        
        le1= new JLabel();
        le1.setText("Electric Scooter");
        le1.setBounds(380,5,300,45);
        le1.setFont(font_1);
        panel5.add(le1);
        
        btn11= new JButton("Click for AutoRickshaw");
        btn11.setBounds(740,8,140,45);
        btn11.setBackground(new Color(160,160,160));
        btn11.addActionListener(this);
        panel5.add(btn11);
        
        panel6= new JPanel();
        panel6.setBounds(10,60,870,180);
        
        le2= new JLabel("Vehicle Id:");
        le2.setBounds(20,10,120,30);
        panel6.add(le2);
        
        tx2= new JTextField();
        tx2.setBounds(150,10,160,30);
        panel6.add(tx2);
        
        le3= new JLabel("Vehicle Name:");
        le3.setBounds(20,50,120,30);
        panel6.add(le3);
        
        tx3= new JTextField();
        tx3.setBounds(150,50,160,30);
        panel6.add(tx3);
        
        le4= new JLabel("Vehicle Weight:");
        le4.setBounds(20,90,120,30);
        panel6.add(le4);
        
        tx4= new JTextField();
        tx4.setBounds(150,90,160,30);
        panel6.add(tx4);
        
        le5= new JLabel("Vehicle Color:");
        le5.setBounds(400,90,120,30);
        panel6.add(le5);
        
        tx5= new JTextField();
        tx5.setBounds(530,90,160,30);
        panel6.add(tx5);

        le6= new JLabel("Vehicle Speed:");
        le6.setBounds(400,10,120,30);
        panel6.add(le6);
        
        tx6= new JTextField();
        tx6.setBounds(530,10,160,30);
        panel6.add(tx6);
        
        le7= new JLabel("Battery Capacity:");
        le7.setBounds(400,50,120,30);
        panel6.add(le7);
        
        tx7= new JTextField();
        tx7.setBounds(530,50,160,30);
        panel6.add(tx7);
        
        btn22= new JButton("Add An Electric Scooter");
        btn22.setBounds(350,130,150,45);
        btn22.setBackground(Color.PINK);
        btn22.addActionListener(this);
        panel6.add(btn22);
        
        panel6.setBackground(Color.CYAN);
        panel6.setLayout(null);
        panel5.add(panel6);
        
        panel7= new JPanel();
        panel7.setBounds(10,245,870,180);
        panel7.setBackground(Color.CYAN);
        
        le8= new JLabel("Vehicle Id:");
        le8.setBounds(20,10,120,30);
        panel7.add(le8);
        
        tx8= new JTextField();
        tx8.setBounds(150,10,160,30);
        panel7.add(tx8);
        
        le9= new JLabel("Brand:");
        le9.setBounds(400,10,120,30);
        panel7.add(le9);
        
        tx9= new JTextField();
        tx9.setBounds(530,10,160,30);
        panel7.add(tx9);
        
        le10= new JLabel("Price:");
        le10.setBounds(20,50,120,30);
        panel7.add(le10);
        
        tx10= new JTextField();
        tx10.setBounds(150,50,160,30);
        panel7.add(tx10);
        
        le11= new JLabel("Charging Time:");
        le11.setBounds(400,50,120,30);
        panel7.add(le11);
        
        tx11= new JTextField();
        tx11.setBounds(530,50,160,30);
        panel7.add(tx11);
        
        le12= new JLabel("Mileage:");
        le12.setBounds(20,90,120,30);
        panel7.add(le12);
        
        tx12= new JTextField();
        tx12.setBounds(150,90,160,30);
        panel7.add(tx12);
        
        le13= new JLabel("Range:");
        le13.setBounds(400,90,120,30);
        panel7.add(le13);
        
        tx13= new JTextField();
        tx13.setBounds(530,90,160,30);
        panel7.add(tx13);
        
        btn33= new JButton("Purchase An Electric Scooter");
        btn33.setBounds(350,125,150,45);
        btn33.setBackground(Color.PINK);
        btn33.addActionListener(this);
        panel7.add(btn33);
        
        panel7.setLayout(null);
        panel7.setVisible(true);
        panel5.add(panel7);
        
        panel8= new JPanel();
        panel8.setBounds(10,430,870,95);
        panel8.setBackground(Color.CYAN);
        
        le14= new JLabel("Vehicle Id:");
        le14.setBounds(20,10,120,30);
        panel8.add(le14);
        
        tx14= new JTextField();
        tx14.setBounds(150,10,160,30);
        panel8.add(tx14);
        
        le15= new JLabel("Price:");
        le15.setBounds(20,50,120,30);
        panel8.add(le15);
        
        tx15= new JTextField();
        tx15.setBounds(150,50,160,30);
        panel8.add(tx15);
        
        panel8.setLayout(null);
        panel8.setVisible(true);
        panel5.add(panel8);
        
        btn44= new JButton("Sell An Electric Scooter");
        btn44.setBounds(350,45,150,45);
        btn44.setBackground(Color.PINK);
        btn44.addActionListener(this);
        panel8.add(btn44);
        
        btn55= new JButton("Back");
        btn55.setBounds(10,530,100,35);
        btn55.setBackground(Color.PINK);
        btn55.addActionListener(this);
        btn55.setFont(font_2);
        panel5.add(btn55);
        
        btn66= new JButton("Clear");
        btn66.setBounds(385,530,100,35);
        btn66.setBackground(Color.RED);
        btn66.addActionListener(this);
        btn66.setFont(font_2);
        panel5.add(btn66);
        
        btn77= new JButton("Display");
        btn77.setBounds(780,530,100,35);
        btn77.setBackground(Color.PINK);
        btn77.addActionListener(this);
        btn77.setFont(font_2);
        panel5.add(btn77);
        
        frame3.add(panel5);
        frame3.setResizable(false);
        frame3.setVisible(true);
        frame3.setLayout(null);
    
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== b1)
        {
            AutoRickshaw();
            frame1.setVisible(false);
            
        }
        
        if(e.getSource()== b2)
        {
            ElectricScooter();
            frame1.setVisible(false);
        }
        
        if(e.getSource()== btn11)
        {
            AutoRickshaw();
            frame3.setVisible(false);
        }
        
        if (e.getSource()== b3)
        {
            ElectricScooter();
            frame2.setVisible(false);
        }
        
        if(e.getSource()== b6)
        {
            TransportGUI();
            frame2.setVisible(false);
            
        }
        
        if(e.getSource()==b7)
        { 
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t15.setText("");
            
        }
        
        if(e.getSource()== b5)
        {
            panel3.setVisible(false);
            b11.setVisible(true);
        }
        
        if(e.getSource()== b11)
        {
            panel3.setVisible(true);
            b11.setVisible(false);
        }
        
        if(e.getSource()==b12)
        {
            panel4.setVisible(false);
            b14.setVisible(true);
        }
        
        if(e.getSource()==b14)
        {
            panel4.setVisible(true);
            b14.setVisible(false);
        }
        
        if (e.getSource()==b4)
        { 
           
         try
         {
            int id= Integer.parseInt(t3.getText());
            String weight= t4.getText();
            String speed= t5.getText();
            String torque= t6.getText();
            String GroundClearance= t7.getText();
            String name= t8.getText();
            String color= t9.getText();
            int EngineDisplacement= Integer.parseInt(t10.getText());
            int FuelTankCapacity= Integer.parseInt(t11.getText());
            
            AutoRickshaw Ar1= new AutoRickshaw(id,name,weight,color,speed,
            EngineDisplacement,torque,FuelTankCapacity,GroundClearance);
            
            Vehicle_list.add(Ar1);
           
            JOptionPane.showMessageDialog( panel2,"Sucessfully filled the input");
        
         }catch(NumberFormatException n)
         {
            JOptionPane.showMessageDialog(panel2,"Invalid input...Try Again"); 
         }
        }
         
         if(e.getSource()==b13)
         {
          try{
             int Vehicle_Id= Integer.parseInt(t12.getText());
             int Seats= Integer.parseInt(t13.getText());
             int ChargeAmount= Integer.parseInt(t15.getText());
             
             String year= a.getSelectedItem().toString();
             String month=b.getSelectedItem().toString();
             String days= c.getSelectedItem().toString();
             
             String BookedDate=year+month+days;
             
            JOptionPane.showMessageDialog(panel2,"Values Succesfully Added");
                
            for(Vehicle obj: Vehicle_list)
            {    
              if(obj instanceof AutoRickshaw)
                {
                AutoRickshaw auto_obj= (AutoRickshaw)obj;
                
                 if (auto_obj.getVehicle_ID()== Vehicle_Id)
                   { 
                         JOptionPane.showMessageDialog(panel2,"Congrats,You Have Entered"+"\n"+"the Valid Vehicle Id");
                         JOptionPane.showMessageDialog(panel2,"Autorickshaw is Booked");
                         
                        
                         
                         JOptionPane.showMessageDialog(panel2,"Your Vehicle Id is"+" "+Vehicle_Id+"\n"+"Your Booked Date is"+""+BookedDate+"\n"
                         +"No of Seats are"+" "+ Seats +"\n"+""+""+"Charge Amount is"+" "+ChargeAmount);
                         
                     if(auto_obj.getisBooked()== false )
                     {
                         auto_obj.bookarickshaw(BookedDate,ChargeAmount,Seats);
                         break;
                     }
                     else if(auto_obj.getisBooked()== true) 
                     {
                        JOptionPane.showMessageDialog(panel2,"This Vehicle Id with "+" "+Vehicle_Id+" "+"is already Booked");
                        break;
                     } 
                    }
                 else
                   {
                    JOptionPane.showMessageDialog(panel2,"Enter the Valid Vehicle ID");
                   }
                    
                }  
            }
            }catch(NumberFormatException et)
             {
              JOptionPane.showMessageDialog(panel2,"Invalid Input..Try Again!!");
              
             }
        }   
        
        if(e.getSource()==btn22)
        {
            try{
                
            int VehicleId= Integer.parseInt(tx2.getText());
            String VehicleName= tx3.getText();
            String VehicleWeight=tx4.getText();
            String VehicleColor=tx5.getText();
            int Battery= Integer.parseInt(tx7.getText());
            String VehicleSpeed= tx6.getText();
            
            ElectricScooter Es1= new ElectricScooter(VehicleId,VehicleName,VehicleWeight,VehicleSpeed,VehicleColor,Battery);
            Vehicle_list.add(Es1);
            
            JOptionPane.showMessageDialog(panel5,"Sucessfully added the Scooter Values");
           } 
            catch(NumberFormatException nr)
            {
                JOptionPane.showMessageDialog(panel5,"Invalid Values..."+"\n" +"Try again!!");
            
            }
        
            
        }
        
        if (e.getSource()== btn33)
        {
            try
            {
                int VehicleId = Integer.parseInt(tx8.getText());
                String Brand= tx9.getText();
                int Price = Integer.parseInt(tx10.getText());
                String ChargingTime= tx11.getText();
                String Mileage= tx12.getText();
                int Range= Integer.parseInt(tx13.getText());
            
                JOptionPane.showMessageDialog(panel5,"Successfully flled the values to purchase");
                
            for(Vehicle elect:Vehicle_list)
            {
                if(elect instanceof ElectricScooter)
                {
                    ElectricScooter elect_obj= (ElectricScooter) elect;
                    
                          JOptionPane.showMessageDialog(panel5,"Your Vehicle Id is:"+" "+VehicleId+"\n"+" And brand name is:"+" "+Brand+"\n" + 
                            "While Price is:"+" "+Price +"\n");
                          JOptionPane.showMessageDialog(panel5,"Its Charging Time is:"+" "+ChargingTime+"\n"+"And mileage that it gives is:"+" "+Mileage+"\n"
                            +"While range for it is:"+" "+Range+"\n");
                            
                    if(elect_obj.getVehicle_ID()== VehicleId)
                    {
                        JOptionPane.showMessageDialog(panel5,"Congrats,You Have Entered"+"\n"+"the Valid Vehicle Id");
                        
                        if(elect_obj.gethasPurchased()== true)
                        {
                            JOptionPane.showMessageDialog(panel5,"This Scooter with Id:"+VehicleId +"\n"+"is already purchased"+"\n"
                            +"and its brand name cannot be changed");
                            break;
                        }
                        else
                        {
                            elect_obj.Purchase(Brand,Price,ChargingTime,Mileage,Range);
                            break;
                        }
                        
                    }
                    
                    else
                    {
                         JOptionPane.showMessageDialog(panel5,"You Have Entered an Invalid Id"+"\n"+"Try Again !!");
                    
                    }
                
                }
            
            }
            
            }
            catch(NumberFormatException tt)
            {
              JOptionPane.showMessageDialog(panel5,"Sorry Enter the Valid Values"+"\n");
            }        
        
        }
        
        if(e.getSource()== btn44)
        {
            try{
               int Vehicle_Id= Integer.parseInt(tx14.getText());
               int Price= Integer.parseInt(tx15.getText());
               
               JOptionPane.showMessageDialog(panel5,"Sucessfully Values added to sell");
               
               for(Vehicle sell:Vehicle_list)
               {
                   if(sell instanceof ElectricScooter)
                   {
                       ElectricScooter sell_obj=(ElectricScooter)sell;
                       
                       if(sell_obj.getVehicle_ID()== Vehicle_Id)
                       {
                           JOptionPane.showMessageDialog(panel5,"Congrats You have entered the Valid Vehicle Id");
                           
                           JOptionPane.showMessageDialog(panel5,"ID to sell Electric Scooter is:"+" "+Vehicle_Id +"\n"+"And price for sell is:"+" "+Price);
                           
                           if(sell_obj.gethasSold()== true)
                           {
                               JOptionPane.showMessageDialog(panel5,"The Electric Scooter with Id is:"+" "+Vehicle_Id+" "+"Already sold");
                               break;
                           }
                           else{
                               sell_obj.Sell(Price);
                               break;
                               }
                        
                       }
                       else{
                           JOptionPane.showMessageDialog(panel5,"Sorry you have entered invalid Id");
                        
                       }
                    
                   }
                
                
                }
               
            
              } 
               catch(NumberFormatException uu)
               {
                   JOptionPane.showMessageDialog(panel5,"Enter the valid input values ");
                }
              
        
           }
           
        if(e.getSource()==btn55)
        {
            TransportGUI();
            frame3.setVisible(false);
        }
        
        if(e.getSource()== btn66)
        {
           tx2.setText("");
           tx3.setText("");
           tx4.setText("");
           tx5.setText("");
           tx6.setText("");
           tx7.setText("");
           tx8.setText("");
           tx9.setText("");
           tx10.setText("");
           tx11.setText("");
           tx12.setText("");
           tx13.setText("");
           tx14.setText("");
           tx15.setText("");
           
        
        }
        
        if(e.getSource()== btn77)
        {
            for(Vehicle rpt:Vehicle_list)
            {
                if(rpt instanceof ElectricScooter)
                {
                    ElectricScooter display_obj=(ElectricScooter) rpt;
                    
                    display_obj.display();
                    
                
                
                }
            
            }
        

        }
        if(e.getSource()==b8){
            for(Vehicle kanxu:Vehicle_list)
            {
                if(kanxu instanceof AutoRickshaw){
                    AutoRickshaw elec_dis = (AutoRickshaw) kanxu;
                    elec_dis.display();
                }
            }
        }
        
  }
  
  public static void main(String[]args)
  {
      TransportGUI trans= new TransportGUI();
      trans.TransportGUI();
     
  }       
}

         
            
        
   
    
    
    
    
    
    
    
  
    

   
    
    
    
    
