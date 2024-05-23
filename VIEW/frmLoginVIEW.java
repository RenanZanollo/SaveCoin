package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

import DAO.ConexaoDAO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;



import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;


public class frmLoginVIEW {

	private JFrame frame;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenhaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLoginVIEW window = new frmLoginVIEW();
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
	public frmLoginVIEW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(4, 41, 44));
		panel.setBounds(0, 0, 423, 463);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel SaveCoinLogo = new JLabel("New label");
		SaveCoinLogo.setIcon(new ImageIcon(frmLoginVIEW.class.getResource("/VIEW/SaveCoinLogo.jpg")));
		SaveCoinLogo.setBounds(47, 147, 331, 167);
		panel.add(SaveCoinLogo);

		JLabel lblNewLabel = new JLabel("Bem-Vindo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(162, 49, 104, 52);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(424, 0, 362, 463);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel TxtNomeUsuario = new JLabel("Nome do Usuario");
		TxtNomeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TxtNomeUsuario.setBounds(58, 136, 110, 19);
		panel_1.add(TxtNomeUsuario);

		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(58, 165, 184, 26);
		panel_1.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Senha do Usuario");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(58, 229, 121, 19);
		panel_1.add(lblNewLabel_1_1);

		JButton btnCadastroUsuario = new JButton("Cadastre-se");
		btnCadastroUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastroView frmCadastroView = new frmCadastroView();
				frmCadastroView.frame.setVisible(true);
			}
		});
		btnCadastroUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastroUsuario.setBounds(178, 354, 110, 31);
		panel_1.add(btnCadastroUsuario);

		JLabel lblNewLabel_1 = new JLabel("Login & Cadastro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(108, 44, 232, 51);
		panel_1.add(lblNewLabel_1);
		
		JButton btnLoginUsuario = new JButton("Login");
		btnLoginUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try { 	Connection conn = ConexaoDAO.faz_conexao();
					
					String sql = "select * from usuario where loginCadastro = ? and senhaCadastro = ?";
					
					PreparedStatement stnt = conn.prepareStatement(sql);

					stnt.setString(1, txtNomeUsuario.getText());
					stnt.setString(2, new String (txtSenhaUsuario.getPassword()));
					
					ResultSet rs = stnt.executeQuery();
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Esse usuario existe");	
						frmTelaPrincipalView frmTelaPrincipalView = new frmTelaPrincipalView();
						frmTelaPrincipalView.frame.setVisible(true);
						
					} else {
						JOptionPane.showMessageDialog(null, "Esse usuario não existe", "aviso", JOptionPane.WARNING_MESSAGE);
					}
					stnt.close();
					conn.close();
					
				} catch ( SQLException e1 ) {
					e1.printStackTrace();					
				}
			}
		});
		btnLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLoginUsuario.setBounds(58, 354, 110, 31);
		panel_1.add(btnLoginUsuario);
		
		txtSenhaUsuario = new JPasswordField();
		txtSenhaUsuario.setBounds(58, 258, 184, 26);
		panel_1.add(txtSenhaUsuario);
	}
}
	

		

		

