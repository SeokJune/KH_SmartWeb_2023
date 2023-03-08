package exam01;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Movie> movies = new ArrayList<>();

	/*
	 * ��ü ��ȭ ���� ����Ʈ ��ȯ
	 * select()
	 * Parameter:
	 * return: ArrayList<Movie>
	 */
	public ArrayList<Movie> select() {
		return this.movies;
	}

	/*
	 * ��ȭ �������� �˻� -> ��ȭ ���� ����Ʈ ��ȯ
	 * select
	 * Parameter: String title, - �˻��� ����
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
	 * ��ȭ �������� �˻� -> ��ȭ ���� ����Ʈ ��ȯ
	 * selectIndex
	 * Parameter: String title, - �˻��� ����
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
	 * ��ȭ �߰�
	 * insert
	 * Parameter: Movie movie	- ���� ��ü
	 * return:
	 */
	public void insert(Movie movie) {
		this.movies.add(movie);
	}

	/*
	 * ��ȭ ���� �˻� -> ����
	 * update
	 * Parameter: int index,		- ������ �ε���
	 * 			  Movie movie		- ������ ��ȭ�� ��ü
	 * return:
	 */
	public void update(int index, Movie movie) {
		this.movies.set(index, movie);
	}

	/*
	 * ��ȭ ���� �˻� -> ����
	 * update
	 * Parameter: int index		- ������ �ε���
	 * return:
	 */
	public void delete(int index) {
		this.movies.remove(index);
	}
}
