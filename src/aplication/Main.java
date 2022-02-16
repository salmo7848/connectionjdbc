package aplication;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.dadosSimples.DAO.DadosDAO;
import br.com.dadosSimples.model.Complements;

public class Main {

	public static void main(String[] args) {
		
		Complements compls = new Complements();
		DadosDAO dadosDao = new DadosDAO();
		
		
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		
		String email = JOptionPane.showInputDialog("Informe o email: ");
		
		String telefone = JOptionPane.showInputDialog("Informe o telefone: ");
	    JOptionPane.showMessageDialog(null, "Data de resgistro: "+new Date());
			                     
		
		
		compls.setNome(nome);
		compls.setEmail(email);
		compls.setTelefone(telefone);
		compls.setDataCad(new Date());
		
		dadosDao.save(compls);
		
		
		
		
	}

}
