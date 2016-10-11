
public class Car extends Vehicle {
    public Car (String name, int year, boolean fourWheelDrive, int retailPrice, int mPG, boolean conv) {
        super(name,year,fourWheelDrive,retailPrice,mPG);
        this.conv=conv;
    }
     public boolean isConvertible()

     {
        return conv;
     }

    public void printVehicle(){
        super.printVehicle();
        if (isConvertible()) {
            System.out.println("Convertible");}
        else System.out.println("No Convertible");
    }
}