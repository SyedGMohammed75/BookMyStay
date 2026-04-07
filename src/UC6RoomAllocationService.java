import java.util.LinkedList;
import java.util.Queue;


public class UC6RoomAllocationService {


    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        RoomInventory inventory = new RoomInventory();
        RoomAllocationService allocator = new RoomAllocationService();

        Queue<Reservation> bookingQueue = new LinkedList<>();

        bookingQueue.add(new Reservation("Abhi", "Single"));
        bookingQueue.add(new Reservation("Subha", "Single"));
        bookingQueue.add(new Reservation("Vannathi", "Suite"));

        while (!bookingQueue.isEmpty()) {

            Reservation reservation = bookingQueue.poll();

            allocator.allocateRoom(reservation, inventory);
        }
    }
}