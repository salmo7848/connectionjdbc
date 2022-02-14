package br.com.dadosSimples.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import br.com.dadosSimples.connect.Connectors;
import br.com.dadosSimples.model.Complements;

public class DAO {
	
	public void save(Complements compls) {
	
	String sql = "(INSERT INTO= nome, email, telefone, data) VALUES(?, ?, ?, ?)";
	
	Connection conis = null;
	PreparedStatement pstm = null;
	
	try {
		
		conis = Connectors.CreatorConnectionToMysql();
		pstm = conis.prepareStatement(sql);
		
		pstm.setString(1, compls.getNome());
		pstm.setString(2, compls.getEmail());
		pstm.setInt(3, compls.getTelefone());
		pstm.setDate(4, new Date(compls.getDataCad().getTime()));
		
		pstm.execute();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(conis != null) {
				conis.close();
			}
			
			if(pstm != null) {
				pstm.close();
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}


