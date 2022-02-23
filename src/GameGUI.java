/**
 * Concrete GUI class
 */

import java.awt.*;
import javax.swing.*;
public class GameGUI extends JFrame{

private Color backColor = new Color(147,147,147);
private Color offsetColor = new Color(192,192,192);

    JButton button1 = new JButton("beginner mode");
    JButton button2 = new JButton("intermediate mode");
    JButton button3 = new JButton("advanced mode");
    JPanel panel1 = new JPanel();

    // constructor
    GameGUI(){
        JFrame gameGUI = new JFrame();
        gameGUI.setSize(300,300);

        gameGUI.setTitle("Game Modes: Extreme Edition");
        gameGUI.setVisible(true);
        button1.setBackground(backColor);
//        button1.setHorizontalAlignment();
        panel1.setBackground(offsetColor);

        panel1.add(button1);
        gameGUI.add(panel1);


        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
