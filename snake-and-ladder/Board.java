import java.util.*;

public class Board {
    private int size;
    List<Snake> snakes;
    List<Ladder> ladders;
    private Dice dice;
    Queue<Player> players;

    public Board(int size, List<Snake> snakes, List<Ladder> ladders, Queue<Player> players, Dice dice) {
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
        this.dice = dice;
        this.players = players;
    }

    public boolean hasWon(int position) {
        return position == this.size;
    }

    public int move(int curPosition) {
        int numOnDice = this.dice.roll();
        int newPosition = curPosition + numOnDice;

        if(newPosition > this.size) {
            return curPosition;
        }

        newPosition = isSnakePosition(newPosition);
        newPosition = isLadderPosition(newPosition);

        return newPosition;
    }

    public int isSnakePosition(int curPosition) {
        for(Snake snake : this.snakes) {
            if(snake.getStartPoint() == curPosition) {
                System.out.println("You were bitten by Snake !!");
                return snake.getEndPoint();
            }
        }

        return curPosition;
    }

    public int isLadderPosition(int curPosition) {
        for(Ladder ladder : ladders) {
            if(ladder.getStartPoint() == curPosition) {
                System.out.println("You just hit on a Ladder !!");
                return ladder.getEndPoint();
            }
        }

        return curPosition;
    }

}
