import javax.swing.JFrame;

public class Window extends JFrame{
    
    private static final long serialVersionUID = 1L;

    public Window() {
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(800, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }
}
