import java.util.List;

public class Floor {

    private String floorId;
    private List<ParkingSpot> parkingSlots;

    public List<ParkingSpot> getAvailableSlots() {
        // return all parking slots with AVAILABLE status
        return null;
    }

    public String getFloorId() {
        return this.floorId;
    }
}
