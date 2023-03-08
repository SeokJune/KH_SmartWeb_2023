package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import dto.MembersDTO;
import main.Main;

public class MembersDAO_ {
	
	public int insertMembers(MembersDTO mDTO) throws Exception {
		int result = 0;

		String sql = "INSERT INTO MEMBERS (ID, PW, NAME, CONTACT) VALUES ('" + mDTO.getId() + "', '" + mDTO.getPw() + "', '" + mDTO.getName() + "', '" + mDTO.getContact() + "')";

		try(Connection conn = DriverManager.getConnection(Main.url, Main.id, Main.pw);
				Statement stat = conn.createStatement();) {
			result = stat.executeUpdate(sql);
			
			conn.commit();
		}
		
		return result;
	}
	
	public boolean selectMembersByIdPw(MembersDTO mDTO) throws Exception {
		boolean result = false;
		
		String sql = "SELECT * FROM MEMBERS WHERE ID = '" + mDTO.getId() + "' AND PW = '" + mDTO.getPw() + "'";
		
		try(Connection conn = DriverManager.getConnection(Main.url, Main.id, Main.pw);
				Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery(sql);) {
			result = rs.next();
		}
		
		return result;
	}

	public int updateMembers(MembersDTO mDTO) throws Exception {
		int result = 0;

		String sql = "UPDATE MEMBERS SET PW = '" + mDTO.getCpw() + "', NAME = '" + mDTO.getName() + "', CONTACT = '" + mDTO.getContact() + "', U_DATE = DEFAULT WHERE ID = '" + mDTO.getId() + "'";

		try(Connection conn = DriverManager.getConnection(Main.url, Main.id, Main.pw);
				Statement stat = conn.createStatement();) {
			result = stat.executeUpdate(sql);
			
			conn.commit();
		}
		
		return result;
	}

	public int deleteMebers(MembersDTO mDTO) throws Exception {
		int result = 0;

		String sql = "DELETE FROM MEMBERS WHERE ID = '" + mDTO.getId() + "'";

		try(Connection conn = DriverManager.getConnection(Main.url, Main.id, Main.pw);
				Statement stat = conn.createStatement();) {
			result = stat.executeUpdate(sql);
			
			conn.commit();
		}
		
		return result;
	}
}
