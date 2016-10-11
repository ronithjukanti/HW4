import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CarTest {
    private  Car carWithConvertible;
    private  Car happyCar;
    private Car testCar;
    private Car carWithoutConvertible;

    @Before
    public  void Setup(){
        carWithConvertible = new Car("Mercedes F1", 2012, true, 123000, 17, true);
        happyCar = new Car("Ford Fiesta", 2005, true, 65400, 18, true);
        testCar = new Car ("Renault Kwid", 2009, true, 12453, 14,false);
        carWithoutConvertible = new Car ("Tata Indigo", 1978, true, 3425, 78, false);
    }

    @After
    public void cleanUpEverytime(){
        System.out.println("Cleaning up...");
    }

    @Test
    public void testHappyCase(){

        String name = "Mercedes F1";
        int year = 2012;
        int price = 123000;
        int mpg = 17;
        boolean isConv = true;
        boolean is4WD = true;

        happyCar.printVehicle();

        Assert.assertEquals("Model mismatch", name, happyCar.getName());
        Assert.assertEquals("year mismatch", year, happyCar.getYear());
        Assert.assertEquals("mpg mismatch", mpg, happyCar.getMPG());
        Assert.assertEquals("4wd mismatch", is4WD, happyCar.getFourWheelDrive());
        Assert.assertEquals("Convertible mismatch", isConv, happyCar.isConvertible());
        Assert.assertEquals("price mismatch", price, happyCar.getRetailPrice());
    }

    @Test

    public void testCarNoConv(){

        String name = "Chevy GT";
        int year = 1999;
        int price = 12300;
        boolean isConv = false;

        carWithoutConvertible.printVehicle();

        Assert.assertEquals("Model mismatch", name, carWithoutConvertible.getName());
        Assert.assertEquals("year mismatch", year, carWithoutConvertible.getYear());
        Assert.assertEquals("Convertible mismatch", isConv, carWithoutConvertible.isConvertible());
        Assert.assertEquals("price mismatch", price, carWithoutConvertible.getRetailPrice());
    }


    @Test
    public void testCarWithConv(){

        String name = "Nissan GT";
        int year = 1945;
        int price = 12300;
        boolean isConv = true;
        boolean is4WD = true;

        carWithConvertible.printVehicle();

        Assert.assertEquals("Model mismatch", name, carWithConvertible.getName());
        Assert.assertEquals("year mismatch", year, carWithConvertible.getYear());
        Assert.assertEquals("4wd mismatch", is4WD, carWithConvertible.getFourWheelDrive());
        Assert.assertEquals("Convertible mismatch", isConv, carWithConvertible.isConvertible());
        Assert.assertEquals("price mismatch", price, carWithConvertible.getRetailPrice());
    }
}