import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Mon Jul 26 08:57:24 BRT 2021
 */



/**
 * @author lucas
 */
public class SomaValores extends JFrame {
	public SomaValores() {
		initComponents();
	}

	private void btnSomaActionPerformed(ActionEvent e) {
		// TODO add your code here
		int n1 =  Integer.parseInt( txtNota1.getText());
		int n2 = Integer.parseInt( txtNota2.getText());
		int soma =n1+n2;
		lblResultado.setText(Integer.toString(soma));
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - lucas
		txtNota1 = new JTextField();
		label1 = new JLabel();
		label2 = new JLabel();
		txtNota2 = new JTextField();
		btnSoma = new JButton();
		lblResultado = new JLabel();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));
		contentPane.add(txtNota1, "cell 1 1 3 1,wmax 100");

		//---- label1 ----
		label1.setText("+");
		contentPane.add(label1, "cell 3 1");

		//---- label2 ----
		label2.setText("+");
		contentPane.add(label2, "cell 4 1");
		contentPane.add(txtNota2, "cell 5 1 3 1,wmax 100");

		//---- btnSoma ----
		btnSoma.setText("=");
		btnSoma.addActionListener(e -> {
			btnSomaActionPerformed(e);
			btnSomaActionPerformed(e);
			btnSomaActionPerformed(e);
		});
		contentPane.add(btnSoma, "cell 9 1");

		//---- lblResultado ----
		lblResultado.setText("0");
		contentPane.add(lblResultado, "cell 10 1 2 1,wmax 100");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - lucas
	private JTextField txtNota1;
	private JLabel label1;
	private JLabel label2;
	private JTextField txtNota2;
	private JButton btnSoma;
	private JLabel lblResultado;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	public static void main(String[] args ) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 SomaValores GUI = new SomaValores();
                 GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 GUI.setVisible(true);
            }
        });
	}
	
}
