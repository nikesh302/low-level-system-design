public class Dice {
    private int numOfDice;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int roll() {
        int random = (int) (Math.random()*6);
        return random*numOfDice + 1;
    }
}
