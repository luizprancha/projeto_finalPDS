import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;

public class Tela02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfTime;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela02 frame = new Tela02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do time:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(24, 23, 82, 14);
		contentPane.add(lblNewLabel);
		
		tfTime = new JTextField();
		tfTime.setBounds(116, 21, 86, 20);
		contentPane.add(tfTime);
		tfTime.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Série:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(24, 55, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rbA = new JRadioButton("A");
		rbA.setBounds(66, 52, 40, 23);
		contentPane.add(rbA);
		
		JRadioButton rbB = new JRadioButton("B");
		rbB.setBounds(106, 52, 40, 23);
		contentPane.add(rbB);
		
		JRadioButton rbC = new JRadioButton("C");
		rbC.setBounds(144, 52, 40, 23);
		contentPane.add(rbC);
		
		JRadioButton rbD = new JRadioButton("D");
		rbD.setBounds(186, 52, 40, 23);
		contentPane.add(rbD);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.setBounds(24, 207, 89, 23);
		contentPane.add(btCadastrar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.setBounds(324, 207, 89, 23);
		contentPane.add(btExcluir);
		
		JButton btEditar = new JButton("Editar");
		btEditar.setBounds(225, 207, 89, 23);
		contentPane.add(btEditar);
		
		JButton btVer = new JButton("Visualizar");
		btVer.setBounds(126, 207, 89, 23);
		contentPane.add(btVer);
		
		JLabel lblNewLabel_2 = new JLabel("Cidade:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(24, 99, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(116, 97, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

	}
}
