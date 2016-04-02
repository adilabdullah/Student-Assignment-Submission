package Front;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Splash extends JWindow {
  private static JProgressBar progress;  
  private int count=1;
  private static int pause=100;
  private static int max=105;
  private static Timer timer;
  Splash()
  {
  CreateSplash();
  }
  public void CreateSplash()
  {
  JPanel pnl=new JPanel();
  pnl.setLayout(new BorderLayout());
  JLabel splach=new JLabel(new ImageIcon("C:\\Users\\pc\\Desktop\\screen.png"));
  pnl.add(splach);
  
  progress=new JProgressBar();
  progress.setMaximum(max);
  progress.setForeground(Color.blue);
  progress.setBorder(BorderFactory.createLineBorder(Color.black));
  progress.setStringPainted(true);
  pnl.add(progress,BorderLayout.SOUTH);
  this.setContentPane(pnl);
  this.pack();
  this.setLocationRelativeTo(null);
  this.setVisible(true);
 startprogress();
  }
  private void startprogress()
  {
Front fr=new Front();
      timer =new Timer(50,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
progress.setValue(count);
if(max==count)
{
Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    Splash.this.dispose();
fr.setExtendedState(fr.getExtendedState()|JFrame.MAXIMIZED_BOTH);
//fr.setSize(dim.width,dim.height);
    //fr.setSize(800,600);
fr.setVisible(true);
timer.stop();
}
   count++;     }
    });
 timer.start();
  }
  public static void main(String[] args)
  {
  new Splash();
  }
}
