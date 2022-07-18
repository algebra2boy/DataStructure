import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphic_User_Interface implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    public Graphic_User_Interface(){
         frame = new JFrame();
         panel = new JPanel();
         button = new JButton("Click Me");
         button.addActionListener(this);
         label = new JLabel("Number of clicks: 0" );

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args){
        new Graphic_User_Interface();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks:"+ count);
    }
}
