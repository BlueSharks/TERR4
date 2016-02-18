/**
 * 
 */
package gui;

/**
 * 
 */

/**
 * @author Céline
 *
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class Window2 extends JFrame{

	JFrame frmVueZoom;
	private JTextField txtInforamtions;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window2 window = new Window2();
					window.frmVueZoom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window2() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		System.out.println("ok2");
		frmVueZoom = new JFrame();
		frmVueZoom.getContentPane().setBackground(Color.WHITE);

		frmVueZoom.setBackground(Color.WHITE);
		frmVueZoom.setTitle("Vue Zoom");
		frmVueZoom.setSize(600, 600);
		frmVueZoom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVueZoom.getContentPane().setLayout(null);
		
		txtInforamtions = new JTextField();
		txtInforamtions.setToolTipText("");
		txtInforamtions.setHorizontalAlignment(SwingConstants.CENTER);
		txtInforamtions.setText("Liste des trains en circulation \r\nsur la portion de cantons:");
		txtInforamtions.setBounds(10, 355, 285, 25);
		frmVueZoom.getContentPane().add(txtInforamtions);
		txtInforamtions.setColumns(10);
		
		JButton btnNewButton = new JButton("Train1");
		btnNewButton.setBounds(86, 419, 89, 13);
		frmVueZoom.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Train2");
		btnNewButton_1.setBounds(87, 461, 88, 13);
		frmVueZoom.getContentPane().add(btnNewButton_1);
	}

}
