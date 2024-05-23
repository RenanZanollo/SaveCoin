package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import DAO.ConexaoDAO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class frmCadastroView {

	JFrame frame;
	private JTextField txtNomeCadastro;
	private JTextField txtEmailCadastro;
	private JTextField txtTelefoneCadastro;
	private JTextField txtLoginCadastro;
	private JTextField txtSenhaCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastroView window = new frmCadastroView();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmCadastroView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 486, 363);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 91, 84, 24);
		panel.add(lblNewLabel);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(230, 175, 84, 24);
		panel.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(10, 175, 84, 24);
		panel.add(lblEmail);
		
		txtNomeCadastro = new JTextField();
		txtNomeCadastro.setBounds(10, 125, 404, 19);
		panel.add(txtNomeCadastro);
		txtNomeCadastro.setColumns(10);
		
		txtEmailCadastro = new JTextField();
		txtEmailCadastro.setBounds(10, 209, 184, 19);
		panel.add(txtEmailCadastro);
		txtEmailCadastro.setColumns(10);
		
		txtTelefoneCadastro = new JTextField();
		txtTelefoneCadastro.setColumns(10);
		txtTelefoneCadastro.setBounds(230, 209, 184, 19);
		panel.add(txtTelefoneCadastro);
		
		txtLoginCadastro = new JTextField();
		txtLoginCadastro.setColumns(10);
		txtLoginCadastro.setBounds(10, 292, 184, 19);
		panel.add(txtLoginCadastro);
		
		JLabel td = new JLabel("Senha:");
		td.setFont(new Font("Tahoma", Font.PLAIN, 14));
		td.setBounds(230, 258, 84, 24);
		panel.add(td);
		
		JLabel usuario = new JLabel("Usuario:");
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usuario.setBounds(10, 258, 84, 24);
		panel.add(usuario);
		
		txtSenhaCadastro = new JTextField();
		txtSenhaCadastro.setColumns(10);
		txtSenhaCadastro.setBounds(230, 292, 184, 19);
		panel.add(txtSenhaCadastro);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(194, 10, 120, 64);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(frmCadastroView.class.getResource("/VIEW/SaveCoinLogoMenor.jpg")));
		lblNewLabel_2.setBounds(365, 20, 100, 52);
		panel.add(lblNewLabel_2);
		
		JButton btnCadastraCadastro = new JButton("Cadastrar");
		btnCadastraCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection conn = ConexaoDAO.faz_conexao();
					String sql = "insert into usuario (nomeCadastro, emailCadastro, telefoneCadastro, loginCadastro, SenhaCadastro"
							+ "value (?, ?, ?, ?)";
					PreparedStatement stmt = conn.prepareStatement(sql);
					
					stmt.setString(1, txtNomeCadastro.getText());
					stmt.setString(1, txtEmailCadastro.getText());
					stmt.setString(1, txtTelefoneCadastro.getText());
					stmt.setString(1, txtLoginCadastro.getText());
					stmt.setString(1, txtSenhaCadastro.getText());
				
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		btnCadastraCadastro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastraCadastro.setBounds(186, 329, 108, 24);
		panel.add(btnCadastraCadastro);
	}

}
