
public class Truck extends Vehicle {
    ///Setters setting values & using super() class functions
    public Truck (String name, int year, boolean fourWheelDrive, int retailPrice, int mPG, boolean stepSide, int towCap) {
        super(name,year,fourWheelDrive,retailPrice,mPG);
        this.stepSide=stepSide;
        this.towCap=towCap;
    }
    //getters for Truck specific characteristics
    public boolean isStepSide() {
        return stepSide;
    }
    public int getTowCap() {
        return towCap;
    }
    public void printVehicle() {
        super.printVehicle();
        if (isStepSide()) {
            System.out.println("StepSide");
        } else System.out.println("No StepSide");
        System.out.println("Towing Capacity: " + getTowCap());
    }
}

