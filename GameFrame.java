package snakeGame;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public GameFrame() {
        SwingUtilities.invokeLater(() -> {
            GamePanel gamePanel = new GamePanel();
            this.add(gamePanel);
            this.setTitle("Snake");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(true);
            this.pack();
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        });
    }

    public static void main(String[] args) {
        new SnakeProject();
    }
}
