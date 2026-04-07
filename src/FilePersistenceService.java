import java.io.*;
import java.util.*;

public class FilePersistenceService {

    public void saveInventory(RoomInventory inventory, String filePath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write("Single=" + inventory.getAvailability("Single"));
            writer.newLine();
            writer.write("Double=" + inventory.getAvailability("Double"));
            writer.newLine();
            writer.write("Suite=" + inventory.getAvailability("Suite"));
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error saving inventory.");
        }
    }

    public void loadInventory(RoomInventory inventory, String filePath) {

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("No valid inventory data found. Starting fresh.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("=");

                if (parts.length == 2) {
                    String roomType = parts[0];
                    int count = Integer.parseInt(parts[1]);
                    inventory.updateAvailability(roomType, count);
                }
            }

        } catch (Exception e) {
            System.out.println("Error loading inventory. Starting fresh.");
        }
    }
}