package exam01;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Movie> movies = new ArrayList<>();

	/*
	 * 전체 영화 정보 리스트 반환
	 * select()
	 * Parameter:
	 * return: ArrayList<Movie>
	 */
	public ArrayList<Movie> select() {
		return this.movies;
	}

	/*
	 * 영화 제목으로 검색 -> 영화 정보 리스트 반환
	 * select
	 * Parameter: String title, - 검색할 제목
	 * return: ArrayList<Movie>
	 */
	public ArrayList<Movie> select(String title) {
		ArrayList<Movie> tmp = new ArrayList<Movie>();
		for(Movie m : this.movies) {
			if(m.getTitle().contains(title)) {
				tmp.add(m);
			}
		}
		return tmp;
	}

	/*
	 * 영화 제목으로 검색 -> 영화 정보 리스트 반환
	 * selectIndex
	 * Parameter: String title, - 검색할 제목
	 * return: int
	 */
	public int selectIndex(String title) {
		for(int i = 0 ; i < this.movies.size() ; i++) {
			if(this.movies.get(i).equals(title)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * 영화 추가
	 * insert
	 * Parameter: Movie movie	- 무비 객체
	 * return:
	 */
	public void insert(Movie movie) {
		this.movies.add(movie);
	}

	/*
	 * 영화 제목 검색 -> 수정
	 * update
	 * Parameter: int index,		- 변경할 인덱스
	 * 			  Movie movie		- 변경할 영화의 객체
	 * return:
	 */
	public void update(int index, Movie movie) {
		this.movies.set(index, movie);
	}

	/*
	 * 영화 제목 검색 -> 삭제
	 * update
	 * Parameter: int index		- 변경할 인덱스
	 * return:
	 */
	public void delete(int index) {
		this.movies.remove(index);
	}
}
