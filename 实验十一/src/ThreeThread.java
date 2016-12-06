import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Ray on 2016/12/6.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 11
 */
public class ThreeThread extends JFrame {

    private boolean isRunning = false;

    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    private ThreeThread(){
        setTitle("线程控制");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(300,130);
        getContentPane().setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        JLabel label1 = new JLabel("线程一          ");
        JLabel label2 = new JLabel("线程二");
        JLabel label3 = new JLabel("          线程三");
        textPanel.add(label1);
        textPanel.add(label2);
        textPanel.add(label3);
        getContentPane().add(textPanel,BorderLayout.NORTH);

        JPanel textFieldPanel = new JPanel();
        JTextField textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(80, 18));
        JTextField textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension(80, 18));
        JTextField textField3 = new JTextField();
        textField3.setPreferredSize(new Dimension(80, 18));
        textFieldPanel.add(textField1);
        textFieldPanel.add(textField2);
        textFieldPanel.add(textField3);
        getContentPane().add(textFieldPanel,BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton button = new JButton("开始");
        buttonPanel.add(button);
        getContentPane().add(buttonPanel,BorderLayout.SOUTH);


        button.addActionListener(e -> {
            isRunning = !isRunning;
            button.setText(isRunning? "停止":"开始");

            thread1 = new Thread(() -> {
                while (isRunning){
                    textField1.setText(getRandomCharacter());
                }
            });
            thread1.start();

            thread2 = new Thread(() -> {
                while (isRunning){
                    textField2.setText(getRandomCharacter());
                }
            });
            thread2.start();

            thread3 = new Thread(() -> {
                while (isRunning){
                    textField3.setText(getRandomCharacter());
                }
            });
            thread3.start();

        });

    }

    private String getRandomCharacter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
        return String.valueOf(c);
    }


    public static void main(String[] args){
        ThreeThread threeThread = new ThreeThread();
        threeThread.setVisible(true);
    }
}
