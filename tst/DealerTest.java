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

        String name = "Honda";
        int year = 2014;
        int price = 12300;
        int mpg = 15;
        boolean isConv = true;
        boolean is4WD = false;
        happyDealer.populateInventory();
        happyDealer.serialize(happyDealer.dealerInventory);
        happyDealer.deserialize();
        happyDealer.setDealerInventory(happyDealer.dealerInventory);
        System.out.println(happyDealer.dealerInventory.inventoryList.size());

    }


    @Test
    public void testPopulateInventory() {
        String nameOfFirstObject = "Nissan GT";
        happyDealer.populateInventory();
        Assert.assertEquals("Name Mismatch", nameOfFirstObject, happyDealer.dealerInventory.inventoryList.get(0).getName());
    }

    @Test
    public void testSerializeObject() {
        happyDealer.populateInventory();
        happyDealer.serialize(happyDealer.dealerInventory);
        happyDealer.deserialize();
        happyDealer.deserialize();
        Assert.assertEquals("Array Mismatch", 9, happyDealer.dealerInventory.inventoryList.size());
    }
    @Test
    public void testPrintDealer() {
        String nameOfFirstObject = "Nissan GT";
        happyDealer.populateInventory();
        happyDealer.printDealer();
        Assert.assertEquals("Name Mismatch", nameOfFirstObject, happyDealer.dealerInventory.inventoryList.get(0).getName());
    }
}

