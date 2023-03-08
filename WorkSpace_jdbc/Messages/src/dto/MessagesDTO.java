package dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class MessagesDTO {
	private long seq;
	private String writer;
	private String message;
	private Timestamp write_date;

	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Timestamp getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}

	public String getFormatDate() {
		//return new SimpleDateFormat("[MM/dd]").format(this.getWrite_date());
		Long time = (System.currentTimeMillis() - this.getWrite_date().getTime());
		
		if(time / 1000 < 60) {
			return "��� ��\t";
		} else if(time / 1000 < 60 * 5) {
			return "5�� �̳�\t";
		} else if(time / 1000 < 60 * 60) {
			return "1�ð� �̳�\t";
		} else if(time / 1000 < 60 * 60 * 24) {
			return "����\t";
		} else {
			return new SimpleDateFormat("yy/MM/dd").format(this.getWrite_date().getTime());
			
			// ������ �����ߴ� ������ �� �ð� ������ �ð� ���̷� �� ������ ǥ���ϱ� �����ε�
			// ��¥�� �״�� ����� ���� �ۼ����� �״�� ����ϸ� �ǰ���.
			// �׷��Ƿ� ������ �ð����� this.getwrite_date().getTime() �� Ȱ���Ͻø� �˴ϴ�.
			// return new SimpleDateFormat("yy/MM/dd").format(this.getWrite_date());
			
		}
	}
}