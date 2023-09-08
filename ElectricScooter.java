
/**
 * Write a description of class ElectricScooter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricScooter extends Vehicle
{   
   private int Range; 
   private int BatteryCapacity;
   private int Price; 
   private String ChargingTime;  
   private String Brand;
   private String Mileage;
   private boolean hasPurchased; 
   private boolean hasSold;
   //constructor of ElectricScooter
   public ElectricScooter(int Vehicle_ID, String Vehicle_Name ,
   String Vehicle_Weight, String Vehicle_Color, 
   String Vehicle_Speed, int BatteryCapacity)/*Constructor
    calls the superclass constructor for Vehicle ID, name , color and weight.
    Electric Scooter's battery capactiy is set in this constructor. 
    The range, price ares set to 0 and brand, mileage and charging time are
    set to "" in this class.*/ 
   {
       super(Vehicle_ID, Vehicle_Name,Vehicle_Color, Vehicle_Weight);
       setVehicleSpeed(Vehicle_Speed);
       setVehicleColor(Vehicle_Color);
       this.BatteryCapacity = BatteryCapacity;
       this.Range = 0;
       this.Price = 0;
       this.Brand = "";
       this.Mileage = "";
       this.ChargingTime = "";
       this.hasPurchased = false;
       this.hasSold = false;
   }
   //Getter/Accesor methods for all ElectricScooter
   public int getRange() //Getter Method for Range
   {
        return this.Range;
   }
   public int getBatteryCapacity() //Getter Method for BatteryCapacity
   {
        return this.BatteryCapacity;
   }
   public int getPrice() //Getter Method for Price
   {
        return this.Price;
   }
   public String getChargingTime() //Getter Method for ChargingTime
   {
        return this.ChargingTime;
   }
   public String getBrand() //Getter Method for Brand
   {
        return this.Brand;
   }
   public String getMileage() //Getter Method for Mileage
   {
        return this.Mileage;
   }
   public boolean gethasPurchased() //Getter Method for Purchased
   {
        return this.hasPurchased; 
   }
   public boolean gethasSold() //Getter Method for Sold
   {
        return this.hasSold; 
   }
   /*Creating a method in which the brand is updated if the scooter is not purchased. A notification stating that the item has already
    been purchased appears.*/
   public void setBrand(String NewBrand)
   {
       if (hasPurchased == false)
       {
           this.Brand = NewBrand;
       }
       else
       {
           System.out.println ("The scooter is already purchased and it's brand cannot be changed!");    
       }
   
   }
   //Creating a method in which if the scooter is not purchased, the brand is set and the purchase status is set to be true.
   public void Purchase(String Brand, int Price, String ChargingTime,String Mileage, int Range )
   {
       if (this.hasPurchased == false)
       {
           setBrand(Brand);
           this.Price = Price;
           this.ChargingTime = ChargingTime;
           this.Mileage = Mileage;
           this.Range = Range;           
           this.hasPurchased = true;
       }
   }
   //Creating a method to check if the scooter is sold or not.
   public void Sell(int NewPrice)
   {
       if (hasSold == false)
       {
           this.Price = NewPrice;
           this.Range = 0;
           this.ChargingTime = "";
           this.Mileage= "";
           this.BatteryCapacity = 0;
           this.hasSold = true;
           this.hasPurchased = false;
       }
       else
       {
           System.out.println ("The scooter has already been sold!");
       }
   }
   //Method to display if a scooter is purchased and it's all details
   public void display()
   {
       super.display();
       if(hasPurchased == true)
       {
           System.out.println("The brand of the scooter is: "+this.Brand);
           System.out.println("The battery capacity of the scooter is: "+this.BatteryCapacity);
           System.out.println("The mileage of the scooter is: "+this.Mileage);
           System.out.println("The range of the scooter is: "+this.Range);
           System.out.println("The time it takes to recharge the scooter is: "+this.ChargingTime);
       }
   }
}


