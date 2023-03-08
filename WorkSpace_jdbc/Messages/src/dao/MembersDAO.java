package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import dto.MembersDTO;

public class MembersDAO {
	private BasicDataSource basicDataSource;
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "board";
	private String password = "board";
	private int initialSize = 1;

	public MembersDAO() {
		this.basicDataSource = new BasicDataSource();
		this.basicDataSource.setUrl(this.url);
		this.basicDataSource.setUsername(this.username);
		this.basicDataSource.setPassword(this.password);
		this.basicDataSource.setInitialSize(this.initialSize);
	}

	public int insertMember(MembersDTO dto) throws Exception {
		int result = 0;

		try(Connection conn = this.basicDataSource.getConnection();) {
			String sql = "INSERT INTO MEMBERS VALUES (?, ?, ?, ?, DEFAULT)";
			try(PreparedStatement pstat = conn.prepareStatement(sql);) {
				pstat.setString(1, dto.getId());
				pstat.setString(2, dto.getPw());
				pstat.setString(3, dto.getName());
				pstat.setString(4, dto.getContact());

				result = pstat.executeUpdate();

				conn.commit();
			}
		}
		return result;
	}

	public Boolean IsExistId(MembersDTO dto) throws Exception {
		Boolean result = false;

		try(Connection conn = this.basicDataSource.getConnection();) {
			String sql = "SELECT * FROM MEMBERS WHERE ID = ?";
			try(PreparedStatement pstat = conn.prepareStatement(sql);) {
				pstat.setString(1, dto.getId());
				try(ResultSet rs = pstat.executeQuery();) {
					result = rs.next();
				}
			}
		}
		return result;
	}
	
	public Boolean IsExistMember(MembersDTO dto) throws Exception {
		Boolean result = false;

		try(Connection conn = this.basicDataSource.getConnection();) {
			String sql = "SELECT * FROM MEMBERS WHERE ID = ? AND PW = ?";
			try(PreparedStatement pstat = conn.prepareStatement(sql);) {
				pstat.setString(1, dto.getId());
				pstat.setString(2, dto.getPw());
				try(ResultSet rs = pstat.executeQuery();) {
					result = rs.next();
				}
			}
		}
		return result;
	}
	
	public List<MembersDTO> selectMember(String id) throws Exception {
		List<MembersDTO> result = new ArrayList<MembersDTO>();
		try(Connection conn = this.basicDataSource.getConnection();) {
			String sql = "SELECT * FROM MEMBERS WHERE ID = ?";
			try(PreparedStatement pstat = conn.prepareStatement(sql);) {
				pstat.setString(1, id);
				try(ResultSet rs = pstat.executeQuery();) {
					while(rs.next()) {
						MembersDTO dto = new MembersDTO();
						dto.setId(rs.getString("ID"));
						dto.setName(rs.getString("NAME"));
						dto.setContact(rs.getString("CONTACT"));
						dto.setReg_date(rs.getTimestamp("REG_DATE"));
						
						result.add(dto);
					}
				}
			}
		}
		return result;
	}

}
