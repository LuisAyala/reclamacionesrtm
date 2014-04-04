package ventanas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class FLibroReclamaciones extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel pnlContenedorCentral;
	private JTabbedPane tbpReclamaciones;


	public FLibroReclamaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 519);
		setVisible(true);
		
		pnlContenedorCentral = new JPanel();
		pnlContenedorCentral.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlContenedorCentral);
		pnlContenedorCentral.setLayout(null);
		
		tbpReclamaciones = new JTabbedPane(JTabbedPane.TOP);
		tbpReclamaciones.setBounds(10, 64, 657, 325);
		pnlContenedorCentral.add(tbpReclamaciones);
		
	}
}
