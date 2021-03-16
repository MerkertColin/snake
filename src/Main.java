public class Main{

    private static Window window;
    private static Board board;
    private static Player player;
    private static Food food;
    private static InputManager im;
    public static void main(String[] args) {

        window = new Window();
        window.setVisible(true);

        board = new Board();
        window.add(board);

        createNewPlayer();
        
        createNewFood();

        im = new InputManager(player);

        window.addKeyListener(im);

        gameLoop();
    }

    private static void gameLoop(){
        while(true){
            player.move();
            CheckCollision();
            try{
                Thread.sleep(1000);
            } catch (Exception e){}
        }
    }

    private static void CheckCollision(){
        if(player.detectCollisionWithFood(food)){
            removeFood();
            createNewFood();
        }
    }


    private static void createNewFood(){
        food = new Food();
        System.out.println(food.getLocation());
        board.add(food);
        food.repaint();

    }

    private static void createNewPlayer(){
        player = new Player();
        board.add(player);
    }

    private static void removeFood(){
        board.remove(food);
    }
}
