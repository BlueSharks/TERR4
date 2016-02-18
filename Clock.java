package gui;


/**
 * @author Céline
 *
 */
import java.util.Calendar;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class Clock extends JComponent 
{
 
  public Clock( ) {

    setSize(300, 100);

    HorlogeLabel clock = new HorlogeLabel( );

  }
 
  public static void main(String args[]) {
	  Clock ct = new Clock( );
    ct.setVisible(true);
  }
 
  class HorlogeLabel extends JLabel implements ActionListener 
  	{
 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public HorlogeLabel( ) {
    super("" + Calendar.getInstance());
    Timer t = new Timer(1000, this);
    t.start( );
  }
 
  public void actionPerformed(ActionEvent ae) {
    setText(String.format("%tT", Calendar.getInstance()));
  }
   }
 
  }
