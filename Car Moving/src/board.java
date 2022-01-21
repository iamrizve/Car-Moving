// Md.Syeed Imtiaz Chowdhury
//ID:C193067 , 4BM
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class board extends JPanel implements ActionListener {
    Image img;
car car;
    Timer timer;
    public board() {
        img=new ImageIcon("battle.jpg").getImage();
        car=new car();
        addKeyListener(new AL());
        timer =new Timer(5,this);
        timer.start();
        setFocusable(true);

    }
    public class AL extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);

            car.whenKeyPressed(e);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img,0,0,1500,900,this);
        g.drawImage(car.carImage,car.x,450,350,200,this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}


