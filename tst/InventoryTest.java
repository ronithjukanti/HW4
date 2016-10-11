import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {
    private Inventory happyInventory;
    private Inventory inventoryWith4wd;
    private Inventory inventoryWithout4wd;

    @Before
    public void Setup() {
        happyInventory = new Inventory();
        inventoryWith4wd = new Inventory();
        inventoryWithout4wd = new Inventory();
    }

    @After
    public void cleanUpEverytime()
    {
        System.out.println("Cleaning up");
    }

    @Test
    public void testAddInventory() {
        String name = "Chevy Cruiser";
        int year = 2010;
        boolean is4wd = true;
        int price = 35000;
        int mpg = 14;
        Vehicle v = new Vehicle("Mustang GT", 2015, true, 32400, 15);
        Vehicle v2 = new Vehicle("Tata Indica", 2014, false, 12300, 12);
        Vehicle v3 = new Vehicle("Ford EcoSport", 2013, true, 14300, 30);

        happyInventory.addInventory(v);
        happyInventory.addInventory(v2);
        happyInventory.addInventory(v3);

        Assert.assertEquals("size mismatch", 3, happyInventory.getInventoryList().size());
        Assert.assertEquals("vehicle mismatch", v, happyInventory.getInventoryList().get(0));
        Assert.assertEquals("Name mismatch", name, happyInventory.getInventoryList().get(0).getName());
        Assert.assertEquals("Year mismatch", year, happyInventory.getInventoryList().get(0).getYear());
        Assert.assertEquals("4wd mismatch", is4wd, happyInventory.getInventoryList().get(0).getFourWheelDrive());
        Assert.assertEquals("Price mismatch", price, happyInventory.getInventoryList().get(0).getRetailPrice());
        Assert.assertEquals("MPG mismatch", mpg, happyInventory.getInventoryList().get(0).getMPG());
    }


    @Test
    public void testRemoveInventory()
    {
        Vehicle v = new Vehicle("Ford Icon", 2014, true, 74000, 8);
        happyInventory.addInventory(v);

        happyInventory.removeVehicle(v);

        Assert.assertEquals("size mismatch", 0, happyInventory.getInventoryList().size());


    }

    @Test
    public void testPrintAveragePrice() {
        Vehicle v = new Vehicle("Chevy Cruiser", 2010, true, 35000, 14);
        Vehicle v2 = new Vehicle("Chevy 35000", 2014, true, 43000, 14);
        Vehicle v3 = new Vehicle("Ford Focus", 2000, false, 12000, 30);

        happyInventory.addInventory(v);
        happyInventory.addInventory(v2);
        happyInventory.addInventory(v3);
        happyInventory.printAveragePriceOfAllVehicles();

        Assert.assertEquals("Price Mismatch", 30000, happyInventory.getAveragePrice());
    }

    @Test
    public void testFindCheapest() {
        String cheapest = "Ford Focus";

        Vehicle v = new Vehicle("Ford Focus", 2010, true, 35000, 14);
        Vehicle v2 = new Vehicle("Chevrolet Spark", 2014, true, 43000, 14);
        Vehicle v3 = new Vehicle("Ford Icon", 2000, false, 12000, 30);
        happyInventory.addInventory(v);
        happyInventory.addInventory(v2);
        happyInventory.addInventory(v3);
        Vehicle x = happyInventory.findCheapestVehicle();
        x.printVehicle();
        Assert.assertEquals("Name mismatch", cheapest, happyInventory.findCheapestVehicle().getName());

    }

    @Test
    public void findMostExpensiveVehicle() {
        String mostExpensive = "Chevy 3500";

        Vehicle v = new Vehicle("Ford Focus", 2010, true, 35000, 14);
        Vehicle v2 = new Vehicle("Chevrolet Spark", 2014, true, 43000, 14);
        Vehicle v3 = new Vehicle("Ford Icon", 2000, false, 12000, 30);

        happyInventory.addInventory(v);
        happyInventory.addInventory(v2);
        happyInventory.addInventory(v3);
        Vehicle y = happyInventory.findMostExpensiveVehicle();
        y.printVehicle();
        Assert.assertEquals("Most Expensive mismatch", mostExpensive, happyInventory.findMostExpensiveVehicle().getName());
    }

    @Test
    public void testPrint() {
        String name = "Chevrolet Cruiser";
        int year = 2010;
        boolean is4wd = true;
        int price = 35000;
        int mpg = 14;
        Vehicle v = new Vehicle("Ford Focus", 2010, true, 35000, 14);
        Vehicle v2 = new Vehicle("Chevrolet Spark", 2014, true, 43000, 14);
        Vehicle v3 = new Vehicle("Ford Icon", 2000, false, 12000, 30);

        happyInventory.addInventory(v);
        happyInventory.addInventory(v2);
        happyInventory.addInventory(v3);
        System.out.println(happyInventory);
        happyInventory.printInventoryList();


        Assert.assertEquals("size mismatch", 3, happyInventory.getInventoryList().size());
        Assert.assertEquals("vehicle mismatch", v, happyInventory.getInventoryList().get(0));
        Assert.assertEquals("Name mismatch", name, happyInventory.getInventoryList().get(0).getName());
        Assert.assertEquals("Year mismatch", year, happyInventory.getInventoryList().get(0).getYear());
        Assert.assertEquals("4wd mismatch", is4wd, happyInventory.getInventoryList().get(0).getFourWheelDrive());
        Assert.assertEquals("Price mismatch", price, happyInventory.getInventoryList().get(0).getRetailPrice());
        Assert.assertEquals("MPG mismatch", mpg, happyInventory.getInventoryList().get(0).getMPG());
    }
}
