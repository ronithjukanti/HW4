import java.io.Serializable;


public class Vehicle implements Serializable{
    private String name;
    private int year;
    private boolean fourWheelDrive = false;
    private int retailPrice;
    private int mPG;
    boolean conv;
    boolean stepSide;
    int towCap;
    //constructor
    public Vehicle (String name, int year, boolean fourWheelDrive, int retailPrice, int mPG){
        this.name = name;
        this.year = year;
        this.fourWheelDrive = fourWheelDrive;
        this.retailPrice = retailPrice;
        this.mPG = mPG;
    }
    //setters set variables

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setmPG(int mPG) {
        this.mPG = mPG;
    }

    public void setConv(boolean conv) {
        this.conv = conv;
    }

    public void setStepSide(boolean stepSide) {
        this.stepSide = stepSide;
    }

    public void setTowCap(int towCap) {
        this.towCap = towCap;
    }

    /////////////getters get variable
    public String getName () {
        return name;
    }
    public int getYear () {
        return year;
    }
    public boolean getFourWheelDrive () {
        return fourWheelDrive;
    }
    public int getRetailPrice () {
        return retailPrice;
    }
    public int getMPG () {
        return mPG;
    }
    public String toString(){
        return (year + " " +name + " " + retailPrice +" "+ mPG + " " + fourWheelDrive);
    }
    public void printVehicle(){
        System.out.println();
        System.out.println(getYear() + " " + getName());
        if (getFourWheelDrive())      //if 4wd, prints 4wd, otherwise prints No 4wd
            System.out.println("4WD");
        else if(!getFourWheelDrive())
            System.out.println("No 4WD");
        System.out.println("$" +getRetailPrice());
        System.out.println(getMPG()+ "MPG");
    }
}
