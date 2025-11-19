import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Tela01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private String usuario = "prancha";
	private String senha = "69";
	private JPasswordField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 frame = new Tela01();
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
	public Tela01() {
		setTitle("Tela de login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(37, 38, 77, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(37, 122, 77, 36);
		contentPane.add(lblNewLabel_1);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(134, 50, 114, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if ( tfUsuario.getText().equals(usuario) && tfSenha.getText().equals(senha)) {
					
					JOptionPane.showMessageDialog(null, "Voce acessou");
				}
				else {
					JOptionPane.showMessageDialog(null, "Acesso negado");
				}
				
			}
		});
		btEntrar.setBounds(107, 210, 89, 23);
		contentPane.add(btEntrar);
		
		tfSenha = new JPasswordField();
		tfSenha.setBounds(134, 134, 114, 20);
		contentPane.add(tfSenha);

	}
}
