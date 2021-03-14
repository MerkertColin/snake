
public class Main{

    private static Window window;
    public static void main(String[] args) {
        window = new Window();
        window.setVisible(true);
        gameLoop();
    }

    private static void gameLoop(){
        Player player = new Player();
        window.add(player);
        Apple apple = new Apple();
        window.add(apple);


    }
}
