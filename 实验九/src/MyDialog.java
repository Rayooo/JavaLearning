import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ray on 2016/11/22.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 9
 */
public class MyDialog extends JDialog{
    public MyDialog(){
        setSize(200,80);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        Container container = getContentPane();
        JLabel label = new JLabel("THe Program exits");
        container.add(label,BorderLayout.CENTER);

        JButton jb = new JButton("确定");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        container.add(jb,BorderLayout.CENTER);


    }

}
