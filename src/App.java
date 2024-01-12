
import java.util.List;

public class App {

	public static void main(String[] args) {
		ManipuladorArquivoJson manipuladorArquivoJson = new ManipuladorArquivoJson();
		List<Trabalhador> trabalhadores = manipuladorArquivoJson.lerArquivoColecao();

		AnalisadorDados analisadorDados = new AnalisadorDados();
		analisadorDados.analisarDados(trabalhadores);

		System.out.println("Total de trabalhadores: " + trabalhadores.size());
		System.out.println("Total de trabalhadores que podem se aposentar: " + analisadorDados.getNumeroAposentados());
		System.out.println("Total de medicos que nao podem se aposentar: " + analisadorDados.getNumeroMedicosAtivos());
		System.out.println("Total de professores que nao podem se aposentar: " + analisadorDados.getNumeroProfessoresAtivos());
		System.out.println("Total de motoristas que nao podem se aposentar: " + analisadorDados.getNumeroMotoristasAtivos());
		System.out.println("Total de policiais que nao podem se aposentar: " + analisadorDados.getNumeroPoliciaisAtivos());

	}
}
