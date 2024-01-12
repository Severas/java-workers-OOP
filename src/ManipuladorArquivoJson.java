

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class ManipuladorArquivoJson {
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	public List<Trabalhador> lerArquivoColecao() {
		ArrayList<Trabalhador> colecao = new ArrayList<Trabalhador>();
		try {
			FileReader reader = new FileReader("trabalhadores-idade.json");
			colecao = gson.fromJson(reader, new TypeToken<ArrayList<Trabalhador>>(){}.getType());
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ler arquivos");
		}
		return colecao;

	}

}