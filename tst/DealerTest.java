import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DealerTest {
    private Dealer happyDealer;

    @Before
    public  void Setup(){
        happyDealer = new Dealer();
    }

    @After
    public void cleanUpEverytime(){
        System.out.println("Cleaning up...");
    }

    @Test
    public void testHappyCase() {

        String name = "Ford";
        int year = 2003;
        int price = 35000;
        int mpg = 14;
        boolean isConv = false;
        boolean is4WD = true;
        happyDealer.populateInventory();
        //System.out.println(happyDealer);
        //System.out.println(happyDealer.dealerInventory);
        happyDealer.serialize(happyDealer.dealerInventory);
        happyDealer.deserialize();
        happyDealer.setDealerInventory(happyDealer.dealerInventory);
        //happyDealer.getDealerInventory().size();
        System.out.println(happyDealer.dealerInventory.inventoryList.size());

        //happyInventory.getInventoryList().size()


        //Given



        //When
        //happyDealer.printVehicle();

        //Then

/*        Assert.assertEquals("Model mismatch", name, happyDealer.getName());
        Assert.assertEquals("year mismatch", year, happyDealer.getYear());
        Assert.assertEquals("mpg mismatch", mpg, happyDealer.getMPG());
        Assert.assertEquals("4wd mismatch", is4WD, happyDealer.getFourWheelDrive());
        Assert.assertEquals("Convertible mismatch", isConv, happyDealer.isConvertible());
        Assert.assertEquals("price mismatch", price, happyDealer.getRetailPrice());*/

    }


    @Test
    public void testPopulateInventory() {
        //Given
        String nameOfFirstObject = "Ford F150";

        //When
        happyDealer.populateInventory();

        //Then
        Assert.assertEquals("Name Mismatch", nameOfFirstObject, happyDealer.dealerInventory.inventoryList.get(0).getName());
    }

    @Test
    public void testSerializeObject() {
        //Given
        happyDealer.populateInventory();
        happyDealer.serialize(happyDealer.dealerInventory);
        happyDealer.deserialize();

        //When
        happyDealer.deserialize();

        //Then
        //Array should contain 9 objects
        Assert.assertEquals("Array Mismatch", 9, happyDealer.dealerInventory.inventoryList.size());
    }
    @Test
    public void testPrintDealer() {
        //Given
        String nameOfFirstObject = "Ford F150";
        happyDealer.populateInventory();

        //When
        happyDealer.printDealer();

        //Then
        Assert.assertEquals("Name Mismatch", nameOfFirstObject, happyDealer.dealerInventory.inventoryList.get(0).getName());
    }
}

