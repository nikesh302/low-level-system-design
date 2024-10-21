import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ParkingLot
 */
public class ParkingLot {

    private List<Floor> floors;
    private List<Booking> bookings;

    public Map<String, List<ParkingSpot>> getAvailableSlots() {
        Map<String, List<ParkingSpot>> floorWiseSlots = new HashMap<>();
        for (Floor floor : floors) {
            String floorId = floor.getFloorId();
            floorWiseSlots.put(floorId, floor.getAvailableSlots());
        }

        return floorWiseSlots;
    }

    public Booking bookSlot(ParkingSpot parkingSlot) {
        parkingSlot.bookParkingSlot();
        return null;
    }

    public void unBookSlot(ParkingSpot parkingSlot) {

    }
}