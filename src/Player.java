import java.awt.Color;
import java.awt.Point;

public class Player extends Entity {

    private static final long serialVersionUID = 1L;

    private int verticalDirection;
    private int horizontalDirection;

    public int getVerticalDirection(){
        return this.verticalDirection;
    }

    public int getHorizontalDirection(){
        return this.horizontalDirection;
    }

    public Player(){
        this.horizontalDirection = 1;
        this.verticalDirection = 0;
        setBackground(Color.GREEN);
    }

    public void setDirection(int horizontal, int vertical){
        this.horizontalDirection = horizontal;
        this.verticalDirection = vertical;
    }

    public void move() {
        Point currentLocation = this.getLocation();
        currentLocation.x += this.getWidth() * horizontalDirection;
        currentLocation.y += this.getWidth() * verticalDirection;

        if(currentLocation.x == 800){
            currentLocation.x = 0;
        } else if (currentLocation.x == -40){
            currentLocation.x = 760;
        }

        if(currentLocation.y == 800){
            currentLocation.y = 0;
        } else if (currentLocation.y == -40){
            currentLocation.y = 760;
        }

        this.setLocation(currentLocation);
    }

    public boolean detectCollisionWithFood(Food food){
        Point foodLocation = food.getLocation();
        Point playerLocation = this.getLocation();

        if(foodLocation.x == playerLocation.x &&
            foodLocation.y == playerLocation.y){
                return true;
        }
        return false;
    }

    public void addTail(){

    }

    public void updateTail(){
        
    }


}
