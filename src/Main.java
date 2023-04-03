import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Main {
    public static void main(String[] args) {
        Love love = new Love();
    }

}


class Love{

    public static JFrame jframe1;
    JLabel J1;
    JButton b1,b2;
    JPanel p1,p2,p3;


    Love(){
        jframe1 = new JFrame("（*＾-＾*）");
        jframe1.setBounds(200, 200, 800, 300);
        jframe1.setLayout(new GridLayout(3,1,5,5));
        p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
        jframe1.add(p1);jframe1.add(p2);jframe1.add(p3);


        J1 = new JLabel("（*＾-＾*）汪昱延 <strong>小</strong> 姐姐我们在一起好不好吗？");
        //setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        J1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 20));
        p2.add(J1);

        b1 = new JButton("好！");
        b1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b1);
        b2 = new JButton("不好！");
        b2.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b2);


        //喜欢
        b1.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(jframe1, "            恭喜你收获一只小幸运，汪汪仙贝！！！", "",
                        JOptionPane.PLAIN_MESSAGE);
                jframe1.setVisible(false);


            }
        });

        //不喜欢
        b2.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                new Love2();
                jframe1.setVisible(false);


            }
        });

        jframe1.setLocationRelativeTo(null);//居中显示
        jframe1.setVisible(true);
        jframe1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭


    }
}
class Love2{
    static JFrame jframe2;
    JLabel J1;
    JButton b1,b2;
    JPanel p1,p2,p3;


    Love2(){
        jframe2 = new JFrame("(ง •_•)ง");


        jframe2.setBounds(700, 190, 700, 250);
        jframe2.setLayout(new GridLayout(3,1,5,5));
        p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
        jframe2.add(p1);jframe2.add(p2);jframe2.add(p3);


        J1 = new JLabel("为什么要拒绝？我哪里还做的不够好吗？orz");
        //setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        J1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 24));
        p2.add(J1);

        b1 = new JButton("哎呀，手滑点错了！");
        b1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b1);
        b2 = new JButton("我再想想！");
        b2.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b2);

        b1.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jframe2, "            恭喜你收获一只小幸运，汪汪仙贝！！！", "",
                        JOptionPane.PLAIN_MESSAGE);
                jframe2.setVisible(false);

            }
        });

        b2.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Love3();
                jframe2.setVisible(false);

            }

        });

        jframe2.setVisible(true);

    }
}
class Love3{

    private JFrame jframe3;

    JLabel J1;
    JButton b1,b2;
    JPanel p1,p2,p3;


    Love3(){
        jframe3 = new JFrame("(ง •_•)ง");


        jframe3.setBounds(300, 190, 350, 250);
        jframe3.setLayout(new GridLayout(3,1,5,5));
        p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
        jframe3.add(p1);jframe3.add(p2);jframe3.add(p3);


        J1 = new JLabel("好吃的都给你！！");
        //setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        J1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 24));
        p2.add(J1);

        b1 = new JButton("好吧！");
        b1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b1);
        b2 = new JButton("你就是想把我吃胖！");
        b2.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b2);

        b1.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jframe3, "            恭喜你收获一只小幸运，汪汪仙贝！！！", "",
                        JOptionPane.PLAIN_MESSAGE);

                jframe3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭

                jframe3.setVisible(false);

            }
        });

        b2.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jframe3.setVisible(false);
                new Love4();
            }

        });


        jframe3.setVisible(true);


    }
}
class Love4{

    private JFrame jframe4;

    JLabel J1;
    JButton b1,b2;
    JPanel p1,p2,p3;


    Love4(){
        jframe4 = new JFrame("(ง •_•)ง");


        jframe4.setBounds(600, 500, 700, 250);
        jframe4.setLayout(new GridLayout(3,1,5,5));
        p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
        jframe4.add(p1);jframe4.add(p2);jframe4.add(p3);


        J1 = new JLabel("带你走遍你想去的地方！！");
        //setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        J1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 24));
        p2.add(J1);

        b1 = new JButton("我走不动时候你要背我！");
        b1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b1);
        b2 = new JButton("我考虑考虑！");
        b2.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b2);

        b1.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jframe4, "            恭喜你收获一只小幸运，汪汪仙贝！！！", "",
                        JOptionPane.PLAIN_MESSAGE);

                jframe4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭
                jframe4.setVisible(false);

            }
        });

        b2.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Love5();
                jframe4.setVisible(false);
            }

        });


        jframe4.setVisible(true);

    }
}
class Love5{

    private JFrame jframe5;

    JLabel J1;
    JButton b1,b2;
    JPanel p1,p2,p3;


    Love5(){
        jframe5 = new JFrame("(ง •_•)ง");


        jframe5.setBounds(350, 600, 350, 250);
        jframe5.setLayout(new GridLayout(3,1,5,5));
        p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
        jframe5.add(p1);jframe5.add(p2);jframe5.add(p3);


        J1 = new JLabel("所有的爱都给你的！！");
        //setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        J1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 24));
        p2.add(J1);

        b1 = new JButton("一言为定！");
        b1.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b1);
        b2 = new JButton("我们不合适～");
        b2.setFont(new Font("楷体", Font.PLAIN + Font.BOLD, 18));
        p3.add(b2);

        b1.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(jframe5, "            恭喜你收获一只小幸运，汪汪仙贝！！！", "",
                        JOptionPane.PLAIN_MESSAGE);
                jframe5.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭
                jframe5.setVisible(false);


            }
        });

        b2.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jframe5, "            不嘛！！！再选一次！！", "",
                        JOptionPane.PLAIN_MESSAGE);
                jframe5.setVisible(false);
                new Love();
            }
        });
        jframe5.setVisible(true);
    }
}











