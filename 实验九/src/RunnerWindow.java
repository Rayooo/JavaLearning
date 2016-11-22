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
public class RunnerWindow extends JFrame {
    public static void main(String args[]){
        new RunnerWindow();
    }

    public RunnerWindow(){
        setSize(400,150);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Container container = getContentPane();
        getContentPane().setLayout(new FlowLayout());
        JTextField jt = new JTextField("",20);
        JButton jb = new JButton("Stop the process");
        jb.addActionListener(new stopButtonListener());

        JLabel label = new JLabel("This window displays the running letter:");
        container.add(label,BorderLayout.CENTER);
        container.add(jt,BorderLayout.CENTER);
        container.add(jb,BorderLayout.CENTER);

        setVisible(true);
    }

    private class stopButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MyDialog dialog = new MyDialog();
            dialog.setVisible(true);
        }
    }


}
