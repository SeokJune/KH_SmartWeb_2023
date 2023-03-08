package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.MoviesDTO;

// �����ͷ� ������ ��� �۾��� �Ѱ��ϴ� Ŭ����
// DAO : Data Access Object
public class MoviesDAO {

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String id = "kh";
	private String pwd = "kh";

	// DATA ����
	public int movieInsert(MoviesDTO mDTO) throws Exception {
		int result = 0;

		String sql = "INSERT INTO MOVIES VALUES (MOVIES_SEQ.NEXTVAL, '?', '?')";

		try(Connection conn = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstat = conn.prepareStatement(sql);) {
			pstat.setString(1, mDTO.getTitle());
			pstat.setString(2, mDTO.getGanre());

			result = pstat.executeUpdate();

			conn.commit();
		}
		return result;
	}

	public List<MoviesDTO> movieSelectAll() throws Exception {
		List<MoviesDTO> mlist = new ArrayList<MoviesDTO>();

		String sql = "SELECT ID, TITLE, GERNE FROM MOVIES ORDER BY ID";

		try(Connection conn = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstat = conn.prepareStatement(sql);
				ResultSet rs = pstat.executeQuery();) {
			while(rs.next()) {
				MoviesDTO mDTO = new MoviesDTO();
				mDTO.setId(rs.getInt("ID"));
				mDTO.setTitle(rs.getString("TITLE"));
				mDTO.setGanre(rs.getString("GERNE"));
				mlist.add(mDTO);
			}
		}
		return mlist;
	}

	public boolean isIdExist(MoviesDTO mDTO) throws Exception {
		boolean result = false;

		String sql = "SELECT TITLE FROM MOVIES WHERE ID = ?";

		try(Connection conn = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstat = conn.prepareStatement(sql);) {
			pstat.setInt(1, mDTO.getId());
			try(ResultSet rs = pstat.executeQuery();) {
				result = rs.next();
			}
		}
		return result;
	}

	public List<MoviesDTO> movieSerchByTitle(MoviesDTO mDTO) throws Exception {
		List<MoviesDTO> mlist = new ArrayList<MoviesDTO>();

		String sql = "SELECT ID, TITLE, GERNE FROM MOVIES WHERE TITLE LIKE ?";
		try(Connection conn = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstat = conn.prepareStatement(sql);) {
			pstat.setString(1, "%" + mDTO.getTitle() + "%");
			try(ResultSet rs = pstat.executeQuery();) {
				while(rs.next()) {
					MoviesDTO movieDTO = new MoviesDTO();
					movieDTO.setId(rs.getInt("ID"));
					movieDTO.setTitle(rs.getString("TITLE"));
					movieDTO.setGanre(rs.getString("GERNE"));
					mlist.add(movieDTO);
				}
			}
		}
		return mlist;
	}

	public int movieUpdate(MoviesDTO mDTO) throws Exception {
		int result = 0;
		
		String sql = "UPDATE MOVIES SET TITLE = ?, gerne = ? WHERE ID = ?";
		
		try(Connection conn = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstat = conn.prepareStatement(sql);) {
			pstat.setString(1, mDTO.getTitle());
			pstat.setString(2, mDTO.getGanre());
			pstat.setInt(3, mDTO.getId());

			result = pstat.executeUpdate();

			conn.commit();
		}
		return result;
	}

	public int movieDelete(MoviesDTO mDTO) throws Exception {
		int result = 0;
		
		String sql = "DELETE FROM MOVIES WHERE ID = ?";
		
		try(Connection conn = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstat = conn.prepareStatement(sql);) {
			pstat.setInt(1, mDTO.getId());

			result = pstat.executeUpdate();

			conn.commit();
		}
		return result;
	}

}
