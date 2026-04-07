public class ReservationValidator {

    public void validate(
            String guestName,
            String roomType,
            RoomInventory inventory
    ) throws InvalidBookingException {

        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        if (!roomType.equals("Single") &&
                !roomType.equals("Double") &&
                !roomType.equals("Suite")) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        int available = inventory.getAvailability(roomType);

        if (available <= 0) {
            throw new InvalidBookingException("No rooms available for selected type.");
        }
    }
}