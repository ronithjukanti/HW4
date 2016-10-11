import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


//Alternate Constructor
// List<Inventory> inventoryList = new ArrayList<>();
//List<Vehicle> inventoryList = new ArrayList<>;


public class Inventory implements Serializable {
    String name = "";
    private int averagePrice;
    List<Vehicle> inventoryList;

    public Inventory() {
        inventoryList = new ArrayList<Vehicle>();
    }

    public void setAveragePrice(int averagePrice) {
        this.averagePrice = averagePrice;
    }

    public int getAveragePrice () {
        return averagePrice;
    }

    public List<Vehicle> getInventoryList() {
        return inventoryList;
    }

    public void addInventory(Vehicle e){
        inventoryList.add(e);
    }

    public void removeVehicle(Vehicle e){
        inventoryList.remove(e);
    }
    public Vehicle findCheapestVehicle(){
        for (int j = 0; j < inventoryList.size() - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < inventoryList.size(); k++)
            {
                if (inventoryList.get(k).getRetailPrice() < inventoryList.get(minIndex).getRetailPrice())
                {
                    minIndex = k;
                }
            }
            Vehicle temp = inventoryList.get(j);
            inventoryList.set(j,inventoryList.get(minIndex));
            inventoryList.set(minIndex, temp);
        }
        return inventoryList.get(0);
    }
    public Vehicle findMostExpensiveVehiclebySortin(){
        for (int j = 0; j < inventoryList.size() - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < inventoryList.size(); k++)
            {
                if (inventoryList.get(k).getRetailPrice() < inventoryList.get(minIndex).getRetailPrice())
                {
                    minIndex = k;
                }
            }
            Vehicle temp = inventoryList.get(j);
            inventoryList.set(j,inventoryList.get(minIndex));
            inventoryList.set(minIndex, temp);
        }

        return inventoryList.get(inventoryList.size()-1);
    }
    //better search only uses 1 for loop therefore reducing time cost... doesn't sort
    public Vehicle findMostExpensiveVehicle(){
        if (inventoryList.isEmpty()) {
            return null;
        }
        Vehicle v = inventoryList.get(0);
        for (Vehicle veh : inventoryList) {
            if (v.getRetailPrice() < veh.getRetailPrice()) {
                v=veh;
            }
        }
        return v;
    }

    public void printAveragePriceOfAllVehicles(){
        int allVehicleSum = 0;
        int averagePrice = 0;
        for (int j = 0; j < inventoryList.size(); j++)
        {
            allVehicleSum= allVehicleSum + inventoryList.get(j).getRetailPrice();
        }
        averagePrice = allVehicleSum/inventoryList.size();
        setAveragePrice(averagePrice);
        System.out.println("The average vehicle price is: " + averagePrice);
    }
    public String toString(){
        for (Vehicle vehicle: inventoryList)
            System.out.println(vehicle);
        return name;
    }
    public void printInventoryList(){
        for (Vehicle vehicle: inventoryList)
            System.out.println(vehicle.getYear() + " " + vehicle.getName() +
                    " $" + vehicle.getRetailPrice() + " MPG: " + vehicle.getMPG() + " 4WD " + vehicle.getFourWheelDrive()
            );
    }


/*    public int size() {
        System.out.println("HIIIIII");
        return inventoryList.size();
    }*/
}
