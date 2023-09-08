
/**
 * Write a description of class Vehicle here.
 *
 * @author (Rohan Timilsaina)
 * @version (a version number or a date)
 */
public class Vehicle //Creating Vehicle class
{    
   private int Vehicle_ID; 
   private String Vehicle_Name;
   private String Vehicle_Color;
   private String Vehicle_Speed;
   private String Vehicle_Weight;
   
   //constructor of parent class
   public Vehicle(int Vehicle_ID, String Vehicle_Name, String Vehicle_Color, String Vehicle_Weight) //Constructor of class Vehicle
   {
        this.Vehicle_ID = Vehicle_ID ;
        this.Vehicle_Name = Vehicle_Name;
        this.Vehicle_Color = Vehicle_Color;
        this.Vehicle_Weight = Vehicle_Weight;     
   }
   //Getter/Accessor method for all Vehicle Class
   public int getVehicle_ID() //Getter Method for Vehicle_ID
   {
       return this.Vehicle_ID;
   }
   public String getVehicle_Name() //Getter Method for Vehicle_Name
   {
       return this.Vehicle_Name;
   }
    public String getVehicle_Weight() //Getter Method for Vehicle_Weight
   {
       return this.Vehicle_Weight;
   }
     public String getVehicle_Color() //Getter Method for Vehicle_Color
   {
       return this.Vehicle_Color;
   }
     public String getVehicle_Speed() //Getter Method for Vehicle_Speed
   {
       return this.Vehicle_Speed;
   }  
   //setter method for Vehicle_Color
   public void setVehicleColor(String Vehicle_Color) 
   {
        this.Vehicle_Color = Vehicle_Color;
   }
   //setter method for Vehicle_Speed
   public void setVehicleSpeed(String Vehicle_Speed) 
   {
        this.Vehicle_Speed = Vehicle_Speed;
   }
   //Creating display Method to display all the details of Vehicle Class
   public void display()
   {
       System.out.println (" VehicleID is :"+this.Vehicle_ID);
       System.out.println ("Name of the vehicle is :"+this.Vehicle_Name);
       System.out.println ("Color of the vehicle is :"+this.Vehicle_Color);
       System.out.println ("Speed of the vehicle is :"+this.Vehicle_Speed);
       if (this.Vehicle_Weight == "")//If..Else used to check if vehicle weight is given.
       {
           System.out.println("Error: No Vehicle Weight Input!!!!");
       }
       else{
       System.out.println ("Weight of the vehicle is :"+this.Vehicle_Weight);
    }
   }
}




