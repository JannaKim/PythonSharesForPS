import java.awt.BorderLayout;

import javax.swing.*;

public class CtoFconvertTest extends JFrame
{
    public CtoFconvertTest()
    {
        setTitle("섭씨 -> 화씨 변환");

        JPanel p1 = new JPanel();
        JLabel JL = new JLabel("섭씨", JLabel.LEFT);
        JTextField cTemp = new JTextField(10);
        p1.add(JL);
        p1.add(cTemp);

        JPanel p2 = new JPanel();
        JLabel JL2 = new JLabel("화씨", JLabel.LEFT);
        JTextField cTemp2 = new JTextField(10);
        p2.add(JL2);
        p2.add(cTemp2);

        JPanel p3 = new JPanel();
        JButton b = new JButton("변환");
        p3.add(b);

        JPanel panel = new JPanel();

        add(p1,BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 140);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new CtoFconvertTest();
    }
}
