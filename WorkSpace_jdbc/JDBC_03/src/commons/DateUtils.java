package commons;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateUtils {

	public String getFormatDate(Timestamp ts) {
		return new SimpleDateFormat("yyy�⵵ MM�� dd�� SSS").format(ts);
	}
	
}
