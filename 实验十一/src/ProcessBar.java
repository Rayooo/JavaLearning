import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ray on 2016/12/6.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 11
 */
public class ProcessBar extends JFrame {
    private JProgressBar processBar;
    private ProcessBar(){
        setTitle("多线程");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(300,100);
        getContentPane().setLayout(new BorderLayout());

        JPanel processBarPanel = new JPanel();
        processBar = new JProgressBar();
        processBar.setStringPainted(true);
        processBar.setString("完成进度");
        processBarPanel.add(processBar);
        JLabel label = new JLabel("0%");
        processBarPanel.add(label);
        getContentPane().add(processBarPanel,BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        JButton threadButton = new JButton("线程方式运行");
        JButton notThreadButton = new JButton("非线程方式运行");
        buttonPanel.add(threadButton);
        buttonPanel.add(notThreadButton);
        getContentPane().add(buttonPanel,BorderLayout.SOUTH);

        threadButton.addActionListener(e -> {
            new Thread(){
                public void run(){
                    int sum = 20000;
                    for (int i = 0; i <= sum; i++) {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        processBar.setValue((int)(i * 1.0/sum * 100));
                        label.setText((int)(i*1.0/sum * 100) + "%");
                    }
                }
            }.start();
        });

        notThreadButton.addActionListener(e -> {
            int sum = 20000;
            for (int i = 0; i <= sum; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException error) {
                    error.printStackTrace();
                }
                processBar.setValue((int)(i*1.0/sum * 100));
                label.setText((int)(i*1.0/sum * 100) + "%");
            }
        });


    }

    public static void main(String[] args){
        ProcessBar processBar = new ProcessBar();
        processBar.setVisible(true);
    }
}
