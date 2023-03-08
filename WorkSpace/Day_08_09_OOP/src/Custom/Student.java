package Custom;
/*
 * Class�� �� ���� ����� ���
 * �������� - ���������� : public, protected, package = default, private
 * �ܺξ� ���� �� �ʿ䰡 ���� ������ private Ű����� ���ܼ�
 * Ŭ���� �������� �ǵ���� �������� Ŭ���� ����� �����ϰ� ����� ���
 * Ŭ���� �����ڿ��� �������� ����
 * Ŭ���� ������� ���Ǽ��� ������ ��.
*/

public class Student {

	/*
	 * Member Field : ��� ����
	 */
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	/*
	 * Constructor : ������
	 *  ������� �ν��Ͻ��� �ʱⰪ�� �����ϱ� ���� �������� ���Ǵ� Method
	 *  Constructor Method�� �̸��� Class �� �̸��� �����ؾ� �ȴ�.
	 *  Constructor Method�� �ٸ� Method�� �ٸ��� return ���� ���� �� ����.
	 *  Constructor Method�� �ٸ� Method�� �ٸ��� Method Call Ÿ�̹��� ������ �� ����.
	 *  ��Ÿ Ư���� �Ϲ� Method�� �����ϴ�.
	 */
	// Default Constructor : �⺻ ������
	// Default Constructor�� �������� Explicit Constructor�� ���� ��������.
	public Student() {
		
	}
	// Explicit Constructor : ����� ������
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	/*
	 * Member Method
	 */
	// Setter & Getter
	//  ����Ű : Alt + s > r > a > r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//
	public int getSum() {
		return this.kor + this.eng + this.math;
	}
	
	public double getAvg() {
		return getSum() / 3.0;
	}
	
}
