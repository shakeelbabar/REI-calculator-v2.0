/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rei.calculator;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Shakeel Ahmed
 */
public class REICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
                
        MainWindow ob = new MainWindow();
        ob.setTitle("REI-Calculator");
        ob.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("./res/SFI.png");
        ob.setIconImage(icon.getImage());
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setVisible(true);
    }
}
