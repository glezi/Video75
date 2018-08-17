/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video75;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gleez
 */
public class Video75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MarcoFoco mimarco = new MarcoFoco(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
class MarcoFoco extends JFrame{
    public MarcoFoco(){
        setVisible(true); 
        setBounds(300,300,600,450); 
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        setLayout(null); 
        
        cuadro1=new JTextField(); 
        cuadro2=new JTextField(); 
        
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        
        add(cuadro1); 
        
        add(cuadro2); 
        
        LanzaFocos elFoco = new LanzaFocos(); 
        cuadro1.addFocusListener(elFoco);
    }
   private class LanzaFocos implements FocusListener {

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Has perdido el foco");
    }

    @Override
    public void focusLost(FocusEvent e) {
       String email=cuadro1.getText(); 
       
       boolean comprobacion= false;
               for (int i=0; i<email.length(); i++){
                   if(email.charAt(i)=='@'){
                       comprobacion=true; 
                   }
               }
       if(comprobacion){
           System.out.println("Correcto");
       }else {
           System.out.println("Incorrecto");
       }
    }
 }
    JTextField cuadro1; 
    JTextField cuadro2;
}

