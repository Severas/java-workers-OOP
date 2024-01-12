

import java.util.List;

public class AnalisadorDados {
	private int medicosAtivos = 0;
	private int professoresAtivos = 0;
	private int policiaisAtivos = 0;
	private int motoristasAtivos = 0;
	private int aposentados = 0;
	

	public void analisarDados(List<Trabalhador> trabalhadores) {
		for (Trabalhador trabalhador : trabalhadores) {
			if (trabalhador.isAposentado()) {
				aposentados++;
			} else {
				if (trabalhador.isMedico()) {
					medicosAtivos++;
				} else if (trabalhador.isProfessor()) {
					professoresAtivos++;
				} else if (trabalhador.isMotorista()) {
					motoristasAtivos++;
				} else if (trabalhador.isPolicial()) {
					policiaisAtivos++;
				}
			}
		}
	}

	public int getNumeroMedicosAtivos() {
		return medicosAtivos;
	}

	public int getNumeroProfessoresAtivos() {
		return professoresAtivos;
	}

	public int getNumeroPoliciaisAtivos() {
		return policiaisAtivos;
	}

	public int getNumeroMotoristasAtivos() {
		return motoristasAtivos;
	}

	public int getNumeroAposentados() {
		return aposentados;
	}

}
