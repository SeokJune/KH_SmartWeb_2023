package commons;

import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm��ss.ms��");
		System.out.println(System.currentTimeMillis());
		System.out.println(sdf.format(System.currentTimeMillis()));
		
	}
}
