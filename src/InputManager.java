import java.awt.event.*;

public class InputManager implements KeyListener{

    private Player player;
    private Thread inputThread;

    public InputManager(Player player){
        this.player = player;
        inputThread = new Thread();
        inputThread.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        return;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            //w
            case 87:
                if(player.getVerticalDirection() == 0){
                    player.setDirection(0, -1);
                }
                break;
            //s
            case 83:
            if(player.getVerticalDirection() == 0){
                player.setDirection(0, 1);
            }
                break;
            //a
            case 65:
            if(player.getHorizontalDirection() == 0){
                player.setDirection(-1, 0);
            }
                break;
            //d
            case 68:
            if(player.getHorizontalDirection() == 0){
                player.setDirection(1, 0);
            }
                break;
            default:
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        return;        
    }
    
}
