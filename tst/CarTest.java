import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by Shawn on 9/21/2016.
 */

public class CarTest {
    private  Car carWithConvertible;
    private  Car happyCar;
    private Car testCar;
    private Car carWithoutConvertible;

    @Before
    public  void Setup(){
        carWithConvertible = new Car("Mercury Sable", 1999, true, 35000, 14, true);
        happyCar = new Car("Ford", 2003, true, 35000, 14, false);
        testCar = new Car ("Chevy Corvette", 2014, false, 12323, 14,true);
        carWithoutConvertible = new Car ("Chevy Pinto", 1978, false, 2500, 32, false);
    }

    @After
    public void cleanUpEverytime(){
        System.out.println("Cleaning up...");
    }

    @Test
    public void testHappyCase(){

        String name = "Ford";
        int year = 2003;
        int price = 35000;
        int mpg = 14;
        boolean isConv = false;
        boolean is4WD = true;


        //Given

        //happyCar = new Car("Ford", 2003, true, 35000, 14, false);


        //When
        happyCar.printVehicle();

        //Then
        Assert.assertEquals("Model mismatch", name, happyCar.getName());
        Assert.assertEquals("year mismatch", year, happyCar.getYear());
        Assert.assertEquals("mpg mismatch", mpg, happyCar.getMPG());
        Assert.assertEquals("4wd mismatch", is4WD, happyCar.getFourWheelDrive());
        Assert.assertEquals("Convertible mismatch", isConv, happyCar.isConvertible());
        Assert.assertEquals("price mismatch", price, happyCar.getRetailPrice());
    }

    @Test

    public void testCarNoConv(){

        String name = "Chevy Pinto";
        int year = 1978;
        int price = 2500;
        boolean isConv = false;


        //Given

        //carWithoutConvertible = new Car ("Chevy Pinto", 1978, false, 2500, 32, false);


        //When
        carWithoutConvertible.printVehicle();

        //Then
        Assert.assertEquals("Model mismatch", name, carWithoutConvertible.getName());
        Assert.assertEquals("year mismatch", year, carWithoutConvertible.getYear());
        Assert.assertEquals("Convertible mismatch", isConv, carWithoutConvertible.isConvertible());
        Assert.assertEquals("price mismatch", price, carWithoutConvertible.getRetailPrice());
    }


    @Test
    public void testCarWithConv(){

        String name = "Mercury Sable";
        int year = 1999;
        int price = 35000;
        boolean isConv = true;
        boolean is4WD = true;


        //Given

        //carWithConvertible = new Car("Mercury Sable", 1999, true, 35000, 14, true);

        //When
        carWithConvertible.printVehicle();

        //Then
        Assert.assertEquals("Model mismatch", name, carWithConvertible.getName());
        Assert.assertEquals("year mismatch", year, carWithConvertible.getYear());
        Assert.assertEquals("4wd mismatch", is4WD, carWithConvertible.getFourWheelDrive());
        Assert.assertEquals("Convertible mismatch", isConv, carWithConvertible.isConvertible());
        Assert.assertEquals("price mismatch", price, carWithConvertible.getRetailPrice());
    }
}


