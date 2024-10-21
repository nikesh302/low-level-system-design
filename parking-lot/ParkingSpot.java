import vehicle.Vehicle;

public class ParkingSpot {

    private String slotId;
    private ParkingSlotStatus status;
    private ParkingSlotType type;
    private Vehicle vehicle;

    public void bookParkingSlot() {
        this.status = ParkingSlotStatus.BOOKED;
    }

    public void freeParkingSlot() {
        this.status = ParkingSlotStatus.AVAILABLE;
    }
}
