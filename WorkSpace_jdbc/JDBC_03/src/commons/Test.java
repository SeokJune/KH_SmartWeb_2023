package commons;

import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss.ms초");
		System.out.println(System.currentTimeMillis());
		System.out.println(sdf.format(System.currentTimeMillis()));
		
	}
}
