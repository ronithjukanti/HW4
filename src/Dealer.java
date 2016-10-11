import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.SerializationUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static javax.print.attribute.standard.MediaSizeName.C;


public class Dealer implements Serializable{
    String name = "";
    int year;
    int price;
    boolean is4wd=false;
    int mpg;
    Inventory dealerInventory;

    public Dealer(){dealerInventory = new Inventory();}

    public Inventory getDealerInventory() {
        return dealerInventory;
    }
    public void setDealerInventory(Inventory dealerInventory) {
        this.dealerInventory = dealerInventory;
    }

    public void populateInventory() {
        InputStream in = null;
        try {
            in = new URL("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt").openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in, CharEncoding.UTF_8));
            LineIterator lines;
            lines = IOUtils.lineIterator(br);
            while (lines.hasNext()){
                is4wd = false;
                String line = lines.nextLine();
                String[] parts = line.split(",");
                name = parts[0];
                year = parseInt(parts[1]);
                price = parseInt(parts[2]);
                if (parts.length > 3) {
                    is4wd = true;
                }
                Vehicle e =new Vehicle(name, year, is4wd, price, mpg);
                dealerInventory.addInventory(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(in);
        }
    }
    public void serialize(Inventory e){
        try {
            File file = FileUtils.getFile("C:\\Users\\maverick\\Documents\\src.ser", "dealer1.ser");
            byte[] data = SerializationUtils.serialize(e);
            FileUtils.writeByteArrayToFile(file, data);
            System.out.printf("Serialized data is saved at C:\\Users\\maverick\\Documents\\src.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void deserialize(){
        byte[] dataToDeserialize = null;
        try {
            File file = FileUtils.getFile("C:\\Users\\maverick\\Documents\\src.ser", "dealer1.ser");
            dataToDeserialize=FileUtils.readFileToByteArray(file);
        } catch (IOException i) {
            i.printStackTrace();
        }
        Inventory deserializedInv = SerializationUtils.deserialize(dataToDeserialize);

    }
    public void printDealer(){
        for (Vehicle v : dealerInventory.getInventoryList()) {
            v.printVehicle();
        }
    }

    @Override
    public String toString(){
        return (year + " " +name + " " + price +" "+ mpg + " " + is4wd);
    }



}
