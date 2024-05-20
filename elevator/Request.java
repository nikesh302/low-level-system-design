public class Request {
    private int currentFloor;
    private int desiredFloor;
    private Direction direction;
    private RequestLocation requestLocation;


    public Request(int currentFloor, int desiredFloor, Direction direction, RequestLocation requestLocation) {
        this.currentFloor = currentFloor;
        this.desiredFloor = desiredFloor;
        this.direction = direction;
        this.requestLocation = requestLocation;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public int getDesiredFloor() {
        return desiredFloor;
    }
    public void setDesiredFloor(int desiredFloor) {
        this.desiredFloor = desiredFloor;
    }
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public RequestLocation getRequestLocation() {
        return requestLocation;
    }
    public void setRequestLocation(RequestLocation requestLocation) {
        this.requestLocation = requestLocation;
    }

    
}
