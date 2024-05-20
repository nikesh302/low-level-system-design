import java.util.*;

public class GameEngine {
    private int gameId;
    private Board board;

    public void start() {
        this.setUp();

        Queue<Player> playerTurn = this.board.players;

        while(!playerTurn.isEmpty()) {
            Player curPlayer = playerTurn.poll();
            System.out.println(curPlayer.getName() + " is rolling the Dice.");
            int curPlayerNewPosition = this.board.move(curPlayer.getPosition());
            curPlayer.setPosition(curPlayerNewPosition);

            System.out.println("New Position of " + curPlayer.getName() + " is : " + curPlayerNewPosition);

            if(this.board.hasWon(curPlayerNewPosition)) {
                System.out.println(curPlayer.getName() + " has won the Game !!!");
                break;
            }

            this.board.players.offer(curPlayer);
        }

        System.out.println("Game Over !!!");
    }

    public void setUp() {
        Dice dice = new Dice(1);
        int boardSize = 100;
        int numOfPlayers = 2;
        List<Snake> snakes = generateSnakes(boardSize, 20);
        List<Ladder> ladders = generateLadders(boardSize, 15);
        Queue<Player> players = generatePlayers(numOfPlayers);

        this.board = new Board(boardSize, snakes, ladders, players, dice);
    }

    public List<Snake> generateSnakes(int boardSize, int numOfSnakes) {
        List<Snake> snakes = new ArrayList<>();
        int randomStartPoint;
        int randomEndPoint;

        snakes.add(new Snake(99, 52));
        snakes.add(new Snake(82, 25));
        snakes.add(new Snake(68, 40));
        snakes.add(new Snake(52, 21));
        snakes.add(new Snake(25, 2));
        snakes.add(new Snake(35, 15));
        snakes.add(new Snake(11, 1));

        /**
         *  TODO : Add snakes creation logic here
         */

        System.out.println("Snakes added to the Board");
        return snakes;
    }

    public List<Ladder> generateLadders( int boardSize, int numOfLadder) {
        List<Ladder> ladders = new ArrayList<>();
        int randomStartPoint;
        int randomEndPoint;

        ladders.add(new Ladder(3, 33));
        ladders.add(new Ladder(50, 95));
        ladders.add(new Ladder(39, 72));
        ladders.add(new Ladder(22, 55));
        ladders.add(new Ladder(7, 40));
        ladders.add(new Ladder(69, 83));

        /**
         *  TODO : Add ladder creation logic here
         */

         System.out.println("Ladders added to the Board");
        return ladders;
    }

    public Queue<Player> generatePlayers(int numOfPlayers) {
        Queue<Player> players = new LinkedList<>();
        players.offer(new Player("1", "Nikesh"));
        players.offer(new Player("2", "Minal"));

        /**
         *  TODO : Add better logic for player generation
         */
        System.out.println("Players added to the Board");
        return players;
    }
}
