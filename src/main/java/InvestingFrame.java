import Listener.FallDownListener;
import Listener.GrowUpListener;
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
            growUp.setLocation(60, 40);
            growUp.setSize(300, 75);
            ActionListener grow_Up = (ActionListener) new GrowUpListener(); // создаём объект-обработчик события
            growUp.addActionListener(grow_Up);// назначаем этот обработчик кнопке
            cont.add(growUp); // прикрепляем действие к кнопке (сработает по нажатии на неё)

            JButton soup = new JButton("Падение дня");
            soup.setLocation(280, 220);
            soup.setSize(100, 25);
            ActionListener fallDown = new FallDownListener();
            soup.addActionListener(fallDown);
            cont.add(soup);

        }
    }


