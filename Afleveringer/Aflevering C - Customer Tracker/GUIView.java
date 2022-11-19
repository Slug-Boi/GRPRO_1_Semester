import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIView extends JFrame{
    public GUIView() {
        super("Customer Tracker");
        makeFrame();
    }

    private void makeFrame() {
        Container main = getContentPane();
        main.setLayout(new GridLayout(0,2));
        //fejl evt?????
        Container buttons = getContentPane();
        buttons.setLayout(new GridLayout(0,3));

        JButton today = new JButton("TODAY");
        JButton avgThisWeek = new JButton("AVG. THIS WEEK");
        JButton compare = new JButton("COMPARE");
        buttons.add(today);
        buttons.add(avgThisWeek);
        buttons.add(compare);
        main.add(buttons);

        JLabel print = new JLabel("temp");


        pack();
        setVisible(true);

    }
}
