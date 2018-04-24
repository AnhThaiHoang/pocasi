/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocasi;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;



public class Okno extends JFrame{
   private String nadpis;
   private int vyska,sirka;
   private JFrame frame;
   private JPanel backgroundImageOnPanel;
   private MujPanel mujpanel;
   private Handler handler;
    
    public Okno(String nadpis, int sirka, int vyska){
        this.nadpis = nadpis;
        this.sirka = sirka;
        this.vyska = vyska;
        

        udělatDisplay();
       
    }
    
    
     public void udělatDisplay(){
     frame = new JFrame(nadpis); 
     frame.setSize(sirka, vyska);
     frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     frame.setVisible(true);
     frame.setLocationRelativeTo(null);
     frame.setResizable(true); 
     
     handler = new Handler(this);
     mujpanel = new MujPanel(handler,sirka,vyska);
     
     backgroundImageOnPanel = new BackgroundImageOnPanel("src\\obrazky\\heaven.jpg",handler);
     backgroundImageOnPanel.setLayout(new GridBagLayout());

     frame.setContentPane(backgroundImageOnPanel);   
     frame.getContentPane().addComponentListener(new ComponentAdapter() {
         @Override
         public void componentResized(ComponentEvent e){  
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         sirka = (int) screenSize.getWidth();
         vyska = (int) screenSize.getHeight();
         }
});
     backgroundImageOnPanel.add(mujpanel.getPanel());
     frame.pack();

     }     

    public int getVyska() {
        return vyska;
    }

    public int getSirka() {
        return sirka;
    }
     
    public MujPanel getMujPanel(){
        return mujpanel;
    }
}

