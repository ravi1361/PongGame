import javax.swing.*;

import static java.awt.Color.black;

public class GameFrame {
    JFrame frame;
    GamePanel panel ;
    GameFrame()
    {
        frame = new JFrame("pong Game");
        //frame.setLayout(null);
        panel = new GamePanel();
        frame.add(panel);
        frame.setBackground(black);

        frame.pack() ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(1010,560);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}
