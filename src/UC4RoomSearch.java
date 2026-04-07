import java.util.ArrayList;
import java.util.List;


public class UC4RoomSearch {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Book My Stay App");
        System.out.println("Hotel Booking System v4.1");
        System.out.println("Room Search");
        System.out.println("=================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Dynamic list of rooms
        List<Room> rooms = new ArrayList<>();
        rooms.add(new SingleRoom());
        rooms.add(new DoubleRoom());
        rooms.add(new SuiteRoom());

        System.out.println("\nAvailable Rooms:");

        // Dynamic search
        for (Room room : rooms) {

            int available = inventory.getAvailability(room.type);

            if (available > 0) {
                room.display();
                System.out.println("Available: " + available);
                System.out.println();
            }
        }
    }
}