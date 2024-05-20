import java.util.PriorityQueue;

public class Elevator {
    int floor;
    Direction direction;
    PriorityQueue<Request> upRequests;
    PriorityQueue<Request> downRequests;

    public Elevator() {
        this.floor = 0;
        this.direction = Direction.IDEAL;
        this.upRequests = new PriorityQueue<>((a,b) -> a.getDesiredFloor() - b.getDesiredFloor());
        this.downRequests = new PriorityQueue<>((a,b) -> b.getDesiredFloor() - a.getDesiredFloor());
    }

    public void run() {
        while(!this.upRequests.isEmpty() || !this.downRequests.isEmpty()) {
            if(this.direction != direction.DOWN) {
                serveUpRequests(this.upRequests);
            }
            else {
                serveDownRequest(this.downRequests);
            }
        }

        this.direction = Direction.IDEAL;
    }

    private void serveDownRequest(PriorityQueue<Request> downRequests) {
        while (!downRequests.isEmpty()) {
            Request curRequest = downRequests.poll();
            System.out.println("Elevator going DOWN");
            System.out.println("Elevator reached floor : " + curRequest.getDesiredFloor());
        }
    }

    private void serveUpRequests(PriorityQueue<Request> upRequests) {
        while (!upRequests.isEmpty()) {
            Request curRequest = upRequests.poll();
            System.out.println("Elevator going UP");
            System.out.println("Elevator reached floor : " + curRequest.getDesiredFloor());
        }
    }

    public void addRequest(Request request) {
        if(request.getRequestLocation() == RequestLocation.OUTSIDE_ELEVATOR) {
            request.setDesiredFloor(request.getCurrentFloor());
        }

        if(request.getDirection() == Direction.UP) {
            this.upRequests.add(request);
        }
        else {
            this.downRequests.add(request);
        }

        System.out.println("Request sent to Elevator");
    }
}
