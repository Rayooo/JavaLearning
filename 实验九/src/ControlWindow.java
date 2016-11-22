import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ray on 2016/11/22.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 9
 */
public class ControlWindow extends JFrame{
    public static void main(String args[]){
        new ControlWindow();
    }
    JTextField textField = null;
    public ControlWindow(){
        setSize(300,150);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container container = getContentPane();
        getContentPane().setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        getContentPane().add(p1,BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        getContentPane().add(p2,BorderLayout.CENTER);

        JPanel p3 = new JPanel();
        getContentPane().add(p3,BorderLayout.SOUTH);


        JLabel label = new JLabel("This window displays the running letter:");
        p1.add(label);

        textField = new JTextField("",20);
        p2.add(textField);

        JButton forwardButton = new JButton("Forward");
        JButton backwardButton = new JButton("BackWard");
        forwardButton.addActionListener(new buttonListener());
        backwardButton.addActionListener(new buttonListener());
        p3.add(forwardButton);
        p3.add(backwardButton);
        setVisible(true);


    }

    private class buttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonText = ((JButton)e.getSource()).getText();
            if(buttonText.equals("Forward")){
                String text = textField.getText();
                textField.setText(text + "M");
            }
            else if(buttonText.equals("BackWard")){
                String text = textField.getText();
                if(text.length() > 0){
                    textField.setText(text.substring(0, text.length()-1));
                }
            }


        }
    }

}
