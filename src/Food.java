import java.awt.Color;

public class Food extends Entity {
    
    private static final long serialVersionUID = 1L;

    public Food(){
        setBackground(Color.RED);
        setLocation(getRandomLocation(), getRandomLocation());
    }

    private int getRandomLocation(){
        return (int)Math.floor(Math.random() * 19) * 40;
    }
    
}
