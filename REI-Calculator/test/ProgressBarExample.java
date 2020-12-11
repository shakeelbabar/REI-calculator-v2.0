///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author shakeel
// */
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
// 
//public class Test2 implements ActionListener, Runnable {    
//     
//    static JProgressBar jpb;
//    static Test2 _this;
//     
//    public Test2 (){
//       _this = this;
//    }
//     
//    private static void createAndShowGUI(){
//        JFrame aFrame = new JFrame("Swing Thread Example:  Fixed Threading");
//        JButton aButton = new JButton("Do Something");
//        aFrame.getContentPane().add(aButton, BorderLayout.SOUTH);
//        aButton.addActionListener(_this);        
//        JPanel aPanel = new JPanel();
//        aPanel.add(new JLabel("Progress:"));
//        jpb = new JProgressBar(0,100);      
//        aPanel.add(jpb);
//        aFrame.getContentPane().add(aPanel);                              
//        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        aFrame.pack();
//        aFrame.setVisible(true);  
//    }
//     
//    public static void main(String args[]){
//       Test2 t = new Test2();  
//       new Thread(t).start();
//       javax.swing.SwingUtilities.invokeLater(new Runnable() {
//        public void run() {
//            createAndShowGUI();
//        }
//    });
//    }
//     
//    public void actionPerformed(ActionEvent ae){            
//    // signal the worker thread to get crackin
//        synchronized(this){notifyAll();}
//    }
//     
//// worker thread 
//    public void run(){
//        while(true){
//         // wait for the signal from the GUI
//            try{synchronized(this){wait();}}
//            catch (InterruptedException e){}
//         // simulate some long-running process like parsing a large file
//            for (int i = 0; i <= 100; i++){
//               jpb.setValue(i);
//               System.out.println("actionPerformed sets jpb value to: "+i);
//               try{Thread.sleep(50);} // make the process last a while
//               catch (InterruptedException e){}
//           }
//        }
//    }
//}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by odinsbane on 9/22/14.
 *
 * This is a quick example of a progress bar that updates.
 *
 * This code is distributed as is; without warranty; or guarantee. It can
 * be freely used, modified and distributed without attribution.
 */
public class ProgressBarExample {
  ExecutorService service = Executors.newSingleThreadExecutor();
  /**
   * Sets up the gui, which is just a JFrame, JButton and a JProgressBar.
   */
  private void buildGui() {
    JFrame frame = new JFrame("progress bar example");
    final JButton start = new JButton("start");
    final JProgressBar progress = new JProgressBar();
    start.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent evt) {
            start.setEnabled(false);
            //starts long running task off of EDT.
            service.submit(new Runnable() {
              public void run() {
                for (int i = 0; i < 100; i++) {
                  //the portion of work.
                  try {
                    Thread.sleep(10);
                  } catch (InterruptedException e1) {
                    //this might be a good spot to quit working.
                    e1.printStackTrace();
                  }
                  //update the progress bar on the EDT.
                  final int j = i;
                  EventQueue.invokeLater(new Runnable() {
                    public void run() { 
                      progress.setValue(j);
                    }
                  });
                }
                //work finished.
                EventQueue.invokeLater(new Runnable() {
                  public void run() {
                    progress.setValue(100);
                    start.setEnabled(true);
                  }
                });
              }
            });
          }
        }
    );
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    frame.add(start);
    frame.add(progress);
    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    ProgressBarExample example = new ProgressBarExample();
    //ALL gui work should be managed on the EDT.
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        example.buildGui();
      }
    });
  }
}