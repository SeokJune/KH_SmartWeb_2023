package Custom;
/*
 * Class를 더 좋게 만드는 방법
 * 정보은닉 - 접근제한자 : public, protected, package = default, private
 * 외부애 노툴 될 필요가 없는 정보를 private 키워드로 숨겨서
 * 클래스 설계자의 의도대로 안정적인 클래스 운용이 가능하게 만드는 방식
 * 클래스 설계자에게 안정성을 제공
 * 클래스 사용자의 편의성에 영향을 줌.
*/

public class Student {

	/*
	 * Member Field : 멤버 변수
	 */
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	/*
	 * Constructor : 생성자
	 *  만들어진 인스턴스에 초기값을 세팅하기 위한 목적으로 사용되는 Method
	 *  Constructor Method의 이름은 Class 의 이름과 동일해야 된다.
	 *  Constructor Method는 다른 Method와 다르게 return 값을 가질 수 없다.
	 *  Constructor Method는 다른 Method와 다르게 Method Call 타이밍을 선택할 수 없가.
	 *  기타 특성은 일반 Method롸 동일하다.
	 */
	// Default Constructor : 기본 생성자
	// Default Constructor는 개발자의 Explicit Constructor에 의해 지워진다.
	public Student() {
		
	}
	// Explicit Constructor : 명시적 생성자
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
	//  단축키 : Alt + s > r > a > r
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
