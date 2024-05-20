public class Player {
    private String id;
    private String name;
    private int position;
    
    public Player(String id, String name) {
        this.id = id;
        this.name = name;
        this.position = -1;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    
}
