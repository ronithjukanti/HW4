import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Shawn on 9/21/2016.
 */

public class TruckTest {
    private Truck happyTruck;
    private  Truck truckWithStep;
    private  Truck truckWithoutStep;


    @Before
    public  void Setup(){
        happyTruck = new Truck("Ford F150", 2013, true, 35000, 14, true, 22000);
        truckWithStep = new Truck ("Chevy 3500", 2014, true, 43000, 14,true, 32000);
        truckWithoutStep = new Truck ("Ford Ranger", 1978, false, 2500, 32, false, 4000);
    }

    @After
    public void cleanUpEverytime(){
        System.out.println("Cleaning up...");
    }

    @Test
    public void testHappyCase(){

        String name = "Ford F150";
        int year = 2013;
        int price = 35000;
        boolean isStepSide = true;
        boolean is4WD = true;
        int mpg = 14;
        int towCap=22000;


        //Given

        //happyTruck = new Truck("Ford F150", 2013, true, 35000, 14, true, 22000);


        //When
        happyTruck.printVehicle();

        //Then
        Assert.assertEquals("Model mismatch", name, happyTruck.getName());
        Assert.assertEquals("year mismatch", year, happyTruck.getYear());
        Assert.assertEquals("mpg mismatch", mpg, happyTruck.getMPG());
        Assert.assertEquals("4wd mismatch", is4WD, happyTruck.getFourWheelDrive());
        Assert.assertEquals("Step mismatch", isStepSide, happyTruck.isStepSide());
        Assert.assertEquals("price mismatch", price, happyTruck.getRetailPrice());
    }

    @Test

    public void testTruckNoStep(){

        String name = "Ford Ranger";
        boolean isStepside = false;


        //Given

        //truckWithoutStep = new Truck ("Ford Ranger", 1978, false, 2500, 32, false, 4000);


        //When
        truckWithoutStep.printVehicle();

        //Then
        Assert.assertEquals("Model mismatch", name, truckWithoutStep.getName());
        Assert.assertEquals("StepSide mismatch", isStepside, truckWithoutStep.isStepSide());
    }


    @Test
    public void testTruckWithConv(){

        String name = "Chevy 3500";
        boolean isStepside = true;


        //Given

        //truckWithStep = new Truck ("Chevy 3500", 2014, true, 43000, 14,true, 32000);

        //When
        truckWithStep.printVehicle();

        //Then
        Assert.assertEquals("Model mismatch", name, truckWithStep.getName());
        Assert.assertEquals("StepSide mismatch", isStepside, truckWithStep.isStepSide());
    }
}
