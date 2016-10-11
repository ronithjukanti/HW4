import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TruckTest {
    private Truck happyTruck;
    private  Truck truckWithStep;
    private  Truck truckWithoutStep;


    @Before
    public  void Setup(){
        happyTruck = new Truck("Ford Fiesta", 2013, false, 45600, 17, true, 7890);
        truckWithStep = new Truck ("Tata Indigo", 2015, true, 78900, 14,false, 45600);
        truckWithoutStep = new Truck ("Nissan GT", 1999, false, 1230, 32, false, 78950);
    }

    @After
    public void cleanUpEverytime(){
        System.out.println("Cleaning up");
    }

    @Test
    public void testHappyCase(){

        String name = "Ford Fiesta";
        int year = 2012;
        int price = 456;
        boolean isStepSide = true;
        boolean is4WD = false;
        int mpg = 17;
        int towCap=12300;

        happyTruck.printVehicle();

        Assert.assertEquals("Model mismatch", name, happyTruck.getName());
        Assert.assertEquals("year mismatch", year, happyTruck.getYear());
        Assert.assertEquals("mpg mismatch", mpg, happyTruck.getMPG());
        Assert.assertEquals("4wd mismatch", is4WD, happyTruck.getFourWheelDrive());
        Assert.assertEquals("Step mismatch", isStepSide, happyTruck.isStepSide());
        Assert.assertEquals("price mismatch", price, happyTruck.getRetailPrice());
    }

    @Test

    public void testTruckNoStep(){

        String name = "Mustang GT";
        boolean isStepside = true;

        truckWithoutStep.printVehicle();

        Assert.assertEquals("Model mismatch", name, truckWithoutStep.getName());
        Assert.assertEquals("StepSide mismatch", isStepside, truckWithoutStep.isStepSide());
    }

    @Test
    public void testTruckWithConv(){

        String name = "Chevrolet 123";
        boolean isStepside = true;

        truckWithStep.printVehicle();

        Assert.assertEquals("Model mismatch", name, truckWithStep.getName());
        Assert.assertEquals("StepSide mismatch", isStepside, truckWithStep.isStepSide());
    }
}
