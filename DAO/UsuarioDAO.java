package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.ClientImpl;

public class UsuarioDAO {
	
	Connection conn;
	
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	
	private static String CADASTRAR_CLIENTE = " INSERT INTO cadastro "
			+"(idCadastro, nomeCadastro, emailCadastro, telefoneCadastro, loginCadastro, senhaCadastro)"
			+ "VALUES (NULL, ?, ?, ?, ?, ?)";
	
	private static String CONSULTAR_CLIENTE = "SELECT *FROM cadastro"
			+"WHERE idCadastro = ?";
	
	private static String ALTERAR_CLIENTE = "UPDATE CLIENTE"
			+ "nomeCadastro = ?, emailCadastro = ?, telefoneCadastro = ?, loginCadastro = ?, senhaCadastro = ? ";
	
	private static String EXCLUIR_CLIENTE = "DELETE FROM cadastro"
	+ "WHERE ID = ?";
	
	private static String LISTAR_CLIENTE = "SELECT * FROM cadastro"
			+ "WHERE 1=1";
	
	private static String CONSULTAR_USUARIO = "SELECT loginCadastro, senhaCadastro"
			+ "FROM cadastro"
			+" WHERE loginCadastro = ?"
			+"SND senhaCadastro = ?";
	
	public UsuarioDAO() {
		
	}
	
	public void cadastrarCliente(ClientImpl cliente) {
		Connection conn = ConexaoDAO.getInstancia().abrirConexão();
	}
	
	
	
	
}
