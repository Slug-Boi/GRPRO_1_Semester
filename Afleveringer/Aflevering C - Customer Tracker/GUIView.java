import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;

public class GUIView extends JFrame{
    MockDB db;
    CustomerTracker cTracker;

    public GUIView() {
        super("Customer Tracker");
        db = new MockDB(); 
        cTracker = new CustomerTracker(db, 47);
        makeFrame();
    }

    private void makeFrame() {
        Container main = getContentPane();
        main.setLayout(new GridLayout(1,2));

        //Buttons container
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(3,1));
        JButton today = new JButton("TODAY");
        buttons.add(today);
        JButton avgThisWeek = new JButton("AVG. THIS WEEK");
        buttons.add(avgThisWeek);
        JButton compare = new JButton("COMPARE");
        buttons.add(compare);
        main.add(buttons);

        //Labels and input
        JPanel rightP = new JPanel(); 
        rightP.setLayout(new BorderLayout());
        JLabel print = new JLabel();
        print.setFont(new Font("Arial", Font.PLAIN, 20));
        rightP.add(print, BorderLayout.PAGE_START);
        
        JTextArea input = new JTextArea();
        rightP.add(input, BorderLayout.PAGE_END);
        main.add(rightP);

        //actionListeners
        today.addActionListener(e -> {
                print.setText("" + cTracker.today()); 
            });
        avgThisWeek.addActionListener(e -> {
                print.setText("" + cTracker.avgThisWeek()); 
            });
        // change this ti be 
        compare.addActionListener(e -> {
            try {
              print.setText(Double.toString((cTracker.comparedToWeek((Integer.parseInt(input.getText()))))));  
            } catch (NullPointerException npe){
                System.out.println("Illegal argument. Either number doesn't exist in database or illegal character used. Try a different number");
            }
            
            });

        main.setPreferredSize(new Dimension(600,600));
        
        main.show();
        pack();
        setVisible(true);

    }
}
