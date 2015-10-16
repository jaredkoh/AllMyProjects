import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.io.*;
import java.util.StringTokenizer;

public class GUI extends JFrame implements ActionListener
{ JPanel panel = new JPanel();
  Controller cont = Controller.inst();
  JButton loadModelButton = new JButton("loadModel");
  JButton saveModelButton = new JButton("saveModel");
  JButton checkButton = new JButton("check");
  JButton task2Button = new JButton("task2");
  JButton migrateGPButton = new JButton("migrateGP");
  JButton task3Button = new JButton("task3");

 public GUI()
  { super("Select use case to execute");
    setContentPane(panel);
    addWindowListener(new WindowAdapter() 
    { public void windowClosing(WindowEvent e)
      { System.exit(0); } });
  panel.add(loadModelButton);
  loadModelButton.addActionListener(this);
  panel.add(saveModelButton);
  saveModelButton.addActionListener(this);
  panel.add(checkButton);
  checkButton.addActionListener(this);
  panel.add(task2Button);
  task2Button.addActionListener(this);
  panel.add(migrateGPButton);
  migrateGPButton.addActionListener(this);
  panel.add(task3Button);
  task3Button.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  { if (e == null) { return; }
    String cmd = e.getActionCommand();
    if ("loadModel".equals(cmd))
    { Controller.loadModel("in.txt");
      cont.checkCompleteness();
      System.err.println("Model loaded");
      return; } 
    if ("saveModel".equals(cmd))
    { cont.saveModel("out.txt");  
      cont.saveXSI("xsi.txt"); 
      return; } 
    if ("check".equals(cmd))
    {  cont.check() ;  return; } 
    if ("task2".equals(cmd))
    {  cont.task2() ;  return; } 
    if ("migrateGP".equals(cmd))
    {  cont.migrateGP() ;  return; } 
    if ("task3".equals(cmd))
    {  cont.task3() ;  return; } 
  }

  public static void main(String[] args)
  {  GUI gui = new GUI();
    gui.setSize(400,400);
    gui.setVisible(true);
  }
 }
