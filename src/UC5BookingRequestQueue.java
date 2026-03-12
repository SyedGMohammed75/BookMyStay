import java.util.LinkedList;
import java.util.Queue;

public class UC5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Book My Stay App");
        System.out.println("Hotel Booking System v5.1");
        System.out.println("Booking Request Queue");
        System.out.println("=================================");

        // Create booking queue
        Queue<Reservation> bookingQueue = new LinkedList<>();

        // Guests submit booking requests
        bookingQueue.add(new Reservation("Alice", "Single Room"));
        bookingQueue.add(new Reservation("Bob", "Double Room"));
        bookingQueue.add(new Reservation("Charlie", "Suite Room"));
        bookingQueue.add(new Reservation("David", "Single Room"));

        System.out.println("\nBooking Requests in Arrival Order:");

        // Display queue without modifying system state
        for (Reservation reservation : bookingQueue) {
            reservation.displayRequest();
        }

        System.out.println("\nTotal Requests in Queue: " + bookingQueue.size());
    }
}