/**
 * 
 */
package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;


/**
 * @author Céline
 *
 */
public class Window1 extends JFrame {

	private JFrame 	frmAcceuil = new JFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window1 window = new Window1();
					window.frmAcceuil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window1() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAcceuil.getContentPane().setBackground(Color.WHITE);

		frmAcceuil.setTitle("Accueil");
		frmAcceuil.setSize(getMaximumSize());
		frmAcceuil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAcceuil.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Vue Conducteur");
		btnNewButton.setBounds(200, 855, 114, 35);
		frmAcceuil.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Horaires Jour");
		btnNewButton_1.setBounds(350, 855, 105, 35);
		frmAcceuil.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Play/Pause");
		btnNewButton_2.setBounds(500, 855, 105, 34);
		frmAcceuil.getContentPane().add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("Gare");
		btnNewButton_3.addActionListener(new ActionButt3());

		btnNewButton_3.setIcon(new ImageIcon("./images/bouttonGare.png"));
		btnNewButton_3.setBounds(245,90, 14, 15);
		btnNewButton_3.setSize(20,20);

		frmAcceuil.getContentPane().add(btnNewButton_3);

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./images/fond.png"));
		lblNewLabel.setBounds(0, 0, 1650, 1000 );
		frmAcceuil.getContentPane().add(lblNewLabel);

		
		/** Clock ct = new Clock();
		 ct.setVisible(true);
		 textPane.setBounds(0, 0, 200, 89);
		 frmAcceuil.getContentPane().add(ct);**/
	}
	
	class ActionButt3 implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			new Window2().frmVueZoom.setVisible(true);
		
			System.out.println("ok");
		}
	}
}

