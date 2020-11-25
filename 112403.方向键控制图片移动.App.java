import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class App {
    JPanel myPanel=new JPanel();
    JLabel label_plane=new JLabel();
    JLabel label_background=new JLabel();
    JTextArea textArea=new JTextArea();

    //构造方法
    int x=250;
    int y=610;
    Random random=new Random();
    public App() {

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                //上
                if (e.getKeyCode() == KeyEvent.VK_UP){

                    if (y>0){
                        y=y-20;
                        label_plane.setBounds(x,y,64,64);
                    }
                }//下
                if (e.getKeyCode() == KeyEvent.VK_DOWN){

                    if (y<616){
                        y=y+20;
                        label_plane.setBounds(x,y,64,64);
                    }
                }//左
                if (e.getKeyCode() == KeyEvent.VK_LEFT){

                    if (x>0){
                        x=x-20;
                        label_plane.setBounds(x,y,64,64);
                    }
                }//右
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){

                    if (x<426){
                        x=x+20;
                        label_plane.setBounds(x,y,64,64);
                    }

                }
            }
        });
    }
    //显示窗体方法
    void go(){

        java.net.URL ImgPL= App.class.getResource("img/plane4.png");
        label_plane.setIcon(new ImageIcon(ImgPL));
        label_plane.setBounds(x,y,64,64);
        java.net.URL ImgBack= App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(ImgBack));
        label_background.setBounds(0,0,512,720);


        JFrame frame = new JFrame("飞机大战");
        myPanel.setLayout(null);
        myPanel.add(label_plane);
        myPanel.add(label_background);
        myPanel.add(textArea);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
