
/**
 * Write a description of class AutoRikshaw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AutoRickshaw extends Vehicle
{   
    private int EngineDisplacement;
    private String Torque;
    private int NumberofSeats;
    private int FuelTankCapacity;
    private String GroundClearance;
    private int ChargeAmount;
    private String BookedDate;
    private boolean isBooked;
    //constructor of AutoRickshaw
    public AutoRickshaw(int Vehicle_ID, String Vehicle_Name ,
    String Vehicle_Weight, String Vehicle_Color,
    String Vehicle_Speed, int EngineDisplacement,
    String Torque, int FuelTankCapacity, String GroundClearance) /*For Vehicle ID, name, color, and weight, the constructor invokes the superclass 
    constructor. Engine displacement is set in this constructor. Vehicle Speed and Color is also set 
    in this class. The booked status is set to 'false' in the constructor.*/ 
    {
         super(Vehicle_ID, Vehicle_Name,Vehicle_Color, Vehicle_Weight);
         this.EngineDisplacement = EngineDisplacement;
         this.Torque=Torque;
         this.FuelTankCapacity=FuelTankCapacity;
         this.GroundClearance=GroundClearance;
         setVehicleSpeed(Vehicle_Speed);
         setVehicleColor(Vehicle_Color);
         isBooked = false;   
    }
    //Getter/Accesor methods for all AutoRickshaw class
    public int getEngineDisplacement() //Getter Method for EngineDisplacement
    {
        return this.EngineDisplacement;
    }
    public String getTorque() //Getter Method for Torque
    {
        return this.Torque;
    }
    public int getNumberofSeats() //Getter Method for NumberofSeats
    {
        return this.NumberofSeats;
    }
    public int getFuelTankCapacity() //Getter Method for FuelTankCapacity
    {
        return this.FuelTankCapacity;
    }
    public String getGroundClearance() //Getter Method for GroundClearance
    {
        return this.GroundClearance;
    }
    public int getChargeAmount() //Getter Method for ChargeAmount
    {
        return this.ChargeAmount;
    }
    public String getBookedDate() //Getter Method for BookedDate
    {
        return this.BookedDate;
    }
    public boolean getisBooked() //Getter Method for isBooked
    {
        return this.isBooked;
    }
    //setter method for ChargeAmount
    public void setChargeAmount(int NewChargeAmount)
    {
        this.ChargeAmount = NewChargeAmount;
    }
    //setter method for NumberofSeats
    public void setNumberofSeats(int NumberofSeats)
    {
        this.NumberofSeats = NumberofSeats;
    }
    /*Creating of method to book a rickshaw. If the rickshaw isn't booked the status is set to booked and the booked date is updated. The
    auto rickshaw's ID is displayed as booked*/
    public void bookarickshaw(String BookedDate, int ChargeAmount, int NumberofSeats)
    {
        if (this.isBooked == false)
        {
            this.isBooked = true;
            this.BookedDate = BookedDate;
            setChargeAmount(ChargeAmount);
            setNumberofSeats(NumberofSeats);
            System.out.println("car with Car ID"+getVehicle_ID()+" is booked");
        }
        else
        {
            System.out.println("Booked Status : Booked!!");
            System.out.println("Autorickshaw is already booked!");
        }
    }
    /*To examine the Vehicle ID, Name, Color and Weight, the show method invokes the superclass display method. The if statement is used to determine 
       whether or not an autorickshaw is booked, and if it is, the engine displacement, torque, fuel tank capacity, ground clearance, charge amount,
       number of seats, and booking date are all displayed.*/
    public void display()
    {
        super.display();
        if (this.isBooked == true)
        {
            System.out.println("Auto rickshaw's engine displacement is "+this.EngineDisplacement);
            System.out.println("Auto rickshaw's torque is "+this.Torque);
            System.out.println("Auto rickshaw's fuel tank capacity is "+this.FuelTankCapacity);
            System.out.println("Auto rickshaw's ground clearance is "+this.GroundClearance);
            System.out.println("Auto rickshaw is booked for "+this.BookedDate);
            if(this.ChargeAmount == 0 ) /*To verify if the number of seats is set to 0 and report the output, use a nested if loop.*/
            {
                System.out.println("Charge amount is not given!!");
            }
            if(this.NumberofSeats == 0 )/*To verify if the number of seats is set to 0 and report the output, use a nested if loop.*/
            {
                System.out.println("Number of seats is not given!!");
            }
            if(this.ChargeAmount != 0 && this.NumberofSeats != 0)/*To check if the charge amount and number of 
            seats are set, use a nested if loop and print the output accordingly.*/
            {
                System.out.println("Number of seats are: "+this.NumberofSeats+" and Charge amount is: "+this.ChargeAmount);
            }
        }
        
    }
}


