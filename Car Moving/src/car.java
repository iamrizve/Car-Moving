
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

// Md.Syeed Imtiaz Chowdhury
//ID:C193067 , 4BM

public class car extends JPanel {
    Image carImage;
    public int x=0;
   car()
   {
       carImage = new ImageIcon("blacktank.jfif").getImage();
   }
    public void whenKeyPressed(KeyEvent e)
    {
        int k=e.getKeyCode();
        if(k==39)
            x+=10;
        if(k==37)
            x-=10 ;
    }


}
