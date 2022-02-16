package aplication;

import java.util.Date;

import br.com.dadosSimples.DAO.DadosDAO;
import br.com.dadosSimples.model.Complements;

public class Main {

	public static void main(String[] args) {
		
		Complements compls = new Complements();
		DadosDAO dadosDao = new DadosDAO();		
		
		compls.setNome("nome");
		compls.setEmail("email");
		compls.setTelefone("telefone");
		compls.setDataCad(new Date());
		
		dadosDao.save(compls);
		

	}

}
