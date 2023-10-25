/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author VIANE
 */

public class HelloMessageDialog extends JFrame {
/**
 *
 * @author fathiamaulida
 */
public HelloMessageDialog(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    
    JButton button = new JButton("klik");
    button.setBounds(130,100,100,40);
    
    button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(HelloMessageDialog.this,
                "Halo,Selamat Datang di Praktikum Pemograman II");
        
        }

});
    this.add(button);
    this.setSize(200,200);
    
}
public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
public void run() {
    HelloMessageDialog h = new HelloMessageDialog();    
    h.setVisible(true);
   }
});
}
}