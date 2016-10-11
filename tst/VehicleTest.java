import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class VehicleTest {
    private Vehicle happyVehicle;
    private  Vehicle vehicleWith4wd;
    private  Vehicle vehicleWithout4wd;

    @Before
    public  void Setup(){
        happyVehicle = new Vehicle("Chevy Cruiser", 2010, true, 35000, 14);
        vehicleWith4wd = new Vehicle ("Chevy 3500", 2014, true, 43000, 14);
        vehicleWithout4wd = new Vehicle ("Harley 1200", 1978, false, 2500, 32);
    }

    @After
    public void cleanUpEverytime(){
        System.out.println("Cleaning up...");
    }

    @Test
    public void testHappyCase(){

        String name = "Chevy Cruiser";
        int year = 2010;
        int price = 35000;
        boolean is4WD = true;
        int mpg = 14;

        happyVehicle.printVehicle();
        Assert.assertEquals("Model mismatch", name, happyVehicle.getName());
        Assert.assertEquals("year mismatch", year, happyVehicle.getYear());
        Assert.assertEquals("mpg mismatch", mpg, happyVehicle.getMPG());
        Assert.assertEquals("4wd mismatch", is4WD, happyVehicle.getFourWheelDrive());
        Assert.assertEquals("price mismatch", price, happyVehicle.getRetailPrice());
    }

    @Test

    public void testVehicleNo4wd(){

        String name = "Harley 1200";
        boolean is4WD = false;
        vehicleWithout4wd = new Vehicle ("Harley 1200", 1978, false, 2500, 32);

        vehicleWithout4wd.printVehicle();

        Assert.assertEquals("Model mismatch", name, vehicleWithout4wd.getName());
        Assert.assertEquals("4wd mismatch", is4WD, vehicleWithout4wd.getFourWheelDrive());
    }


    @Test
    public void testVehicleWith4wd(){
        String name = "Chevy 3500";
        boolean is4WD = true;
        vehicleWith4wd.printVehicle();

        Assert.assertEquals("Model mismatch", name, vehicleWith4wd.getName());
        Assert.assertEquals("4wd mismatch", is4WD, vehicleWith4wd.getFourWheelDrive());
    }
}