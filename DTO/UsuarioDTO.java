package DTO;

public class UsuarioDTO {

	private int idUsuario;
	private String loginUsuario, senhaUsuario;

	public UsuarioDTO(int idUsuario, String loginUsuario, String senhaUsuario) {
		
		super();
		this.idUsuario = idUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
 
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) throws Exception {
		this.loginUsuario = loginUsuario;
		if(loginUsuario.equals("") || loginUsuario.isEmpty());
		throw new Exception("Login não lode ser vazio.");
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) throws Exception {
		this.senhaUsuario = senhaUsuario;
		if(senhaUsuario.equals("") || senhaUsuario.isEmpty());
		throw new Exception("Login não lode ser vazio.");
	}
}
