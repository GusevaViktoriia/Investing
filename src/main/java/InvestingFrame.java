import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InvestingFrame extends JFrame{

        public InvestingFrame (){

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(400, 200, 700, 500);
            setTitle("Инвестиции");

            Container cont = getContentPane();

            JButton growUp = new JButton("Взлёт дня");
            growUp.setLocation(180, 140);
            growUp.setSize(300, 75);
            ActionListener grow_Up = new GrowUpListener();
            growUp.addActionListener(grow_Up);
            cont.add(growUp);

            /*JButton fallDown = new JButton("Падение дня");
            fallDown.setLocation(280, 220);
            fallDown.setSize(300, 75);
            ActionListener fallDown_ = new FallDownListener();
            fallDown.addActionListener(fallDown_);
            cont.add(fallDown);*/

        }
    }


