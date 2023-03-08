package commons;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateUtils {

	public String getFormatDate(Timestamp ts) {
		return new SimpleDateFormat("yyy년도 MM월 dd일 SSS").format(ts);
	}
	
}
