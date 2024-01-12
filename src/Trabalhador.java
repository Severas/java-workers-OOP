
public class Trabalhador {
	private String nome;
	private int idade;
	private String profissao;
	
	public boolean isAposentado() {
		if(isMedico() && this.idade >= 60	) {
			return true;
		}
		else if(isProfessor() && this.idade >= 61) {
			return true;
		}
		else if(isMotorista() && this.idade >= 62) {
			return true;
		}
		else if(isPolicial() && this.idade >= 63) {
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public boolean isMedico() {
		if(this.profissao.equalsIgnoreCase("Medico")) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isProfessor() {
		if(this.profissao.equalsIgnoreCase("Professor")) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isMotorista() {
		if(this.profissao.equalsIgnoreCase("Motorista")) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isPolicial() {
		if(this.profissao.equalsIgnoreCase("Policial")) {
			return true;
		}
		else {
			return false;
		}
	}

}
