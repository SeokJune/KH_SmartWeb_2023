package main;

import java.util.List;
import java.util.Scanner;

import commons.EncryptionUtils;
import dao.MembersDAO;
import dao.StudentsDAO;
import dto.MembersDTO;
import dto.StudentsDTO;

public class Main {
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public static String id = "kh";
	public static String pw = "kh";
	
	//final Pattern SpecialChars = Pattern.compile("['\"\\-#()@;=*/+]");

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in);) {

			// �α��� �� ȸ������
			MembersDAO mDAO = new MembersDAO();
			while(true) {
				System.out.println("<<< �α��� >>>");
				System.out.println("1. �α���");
				System.out.println("2. ȸ������");
				System.out.println("3. ȸ��������");
				System.out.println("4. ȸ������");
				System.out.println("5. ȸ��Ż��");
				System.out.println("0. �ý��� ����");
				System.out.print(">>> ");
				String menu = scan.nextLine();

				try {
					if(menu.equals("0")) {
						System.out.println("<< �ý��� ���� >>");
						System.exit(0);
					} else if(menu.equals("1")) {
						System.out.println("<< �α��� >>");
						MembersDTO mDTO = new MembersDTO();
						System.out.print("ID >> ");
						mDTO.setId(scan.nextLine());
						System.out.print("PW >> ");
						mDTO.setPw(EncryptionUtils.sha512(scan.nextLine()));
						
						if(mDAO.selectMembersByIdPw(mDTO)) {
							System.out.println("!! �α��� ���� !!");
							break;
						} else {
							System.out.println("!! �α��� ���� !!");
							continue;
						}
					} else if(menu.equals("2")) {
						System.out.println("<< �ý��� ���� >>");
						MembersDTO mDTO = new MembersDTO();
						System.out.print("ID >> ");
						mDTO.setId(scan.nextLine());
						
						if(mDAO.selectMembersById(mDTO)) {
							System.out.println("!! �ߺ��� ID !!");
							continue;
						}
						
						System.out.print("PW >> ");
						mDTO.setPw(EncryptionUtils.sha512(scan.nextLine()));
						System.out.print("�̸� >> ");
						mDTO.setName(scan.nextLine());
						System.out.print("����ó >> ");
						mDTO.setContact(scan.nextLine());

						System.out.println(mDAO.insertMembers(mDTO) > 0 ? "!! ���� ȯ�� !!" : "!! ���� ���� !!");
					} else if(menu.equals("3")){
						System.out.println("<< ȸ�� ��� ��� >>");
						
						List<MembersDTO> list = mDAO.selectMembersAll();
						
						for(MembersDTO member : list) {
							System.out.println(member.getId() + "\t" + member.getFormatDate());
						}
						
					} else if(menu.equals("4")) {
						System.out.println("<< ȸ������ ���� >>");
						MembersDTO mDTO = new MembersDTO();
						System.out.print("ID >> ");
						mDTO.setId(scan.nextLine());
						System.out.print("PW >> ");
						mDTO.setPw(EncryptionUtils.sha512(scan.nextLine()));
						
						if(mDAO.selectMembersByIdPw(mDTO)) {
							System.out.println("!! ��ġ !!");
						} else {
							System.out.println("!! ����ġ !!");
							continue;
						}

						System.out.print("PW >> ");
						mDTO.setCpw(EncryptionUtils.sha512(scan.nextLine()));
						System.out.print("�̸� >> ");
						mDTO.setName(scan.nextLine());
						System.out.print("����ó >> ");
						mDTO.setContact(scan.nextLine());
						
						System.out.println(mDAO.updateMembers(mDTO) > 0 ? "!! ���� ���� !!" : "!! ���� ���� !!");
						
					} else if(menu.equals("5")) {
						System.out.println("<< ȸ�� Ż�� >>");
						MembersDTO mDTO = new MembersDTO();
						System.out.print("ID >> ");
						mDTO.setId(scan.nextLine());
						System.out.print("PW >> ");
						mDTO.setPw(EncryptionUtils.sha512(scan.nextLine()));
						
						System.out.println(mDAO.selectMembersByIdPw(mDTO) && mDAO.deleteMebers(mDTO) > 0 ? "!! Ż�� ���� !!" : "!!Ż�� ���� !!");
					} else {
						System.out.println("!! �޴� Ȯ�� !!");
					}
				} catch (Exception e) {
					System.out.println("Error: �����ڿ��� ����");
					e.printStackTrace();
				}
			}

			StudentsDAO sDAO = new StudentsDAO();
			while(true) {
				System.out.println("<<< �л� ���� ���� �ý��� >>>");
				System.out.println("1. �л� ���� �Է�");
				System.out.println("2. �л� ��� ���");
				System.out.println("3. �л� ���� ���� (�й�)");
				System.out.println("4. �л� ���� ���� (�й�)");
				System.out.println("5. �л� ���� �˻� (�̸�)");
				System.out.println("0. �ý��� ����");
				System.out.print(">>> ");
				String menu = scan.nextLine();

				try {
					if(menu.equals("0")) {
						System.out.println("<< �ý��� ���� >>");
						System.exit(0);
					} else if(menu.equals("1")) {
						System.out.println("<< �л� ���� �Է� >>");
						StudentsDTO sDTO = new StudentsDTO();
						System.out.print("�л� �̸� >> ");
						sDTO.setName(scan.nextLine());
						System.out.print("���� ���� >> ");
						sDTO.setKor(Integer.parseInt(scan.nextLine()));
						System.out.print("���� ���� >> ");
						sDTO.setEng(Integer.parseInt(scan.nextLine()));
						System.out.print("���� ���� >> ");
						sDTO.setMath(Integer.parseInt(scan.nextLine()));

						System.out.println(sDAO.insertStudent(sDTO) > 0 ? "!! �Է� ���� !!" : "!! �Է� ���� !!");
					} else if(menu.equals("2")) {
						System.out.println("<< �л� ��� ��� >>");

						List<StudentsDTO> result = sDAO.selectStuedntByAll();

						System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
						for(StudentsDTO student : result) {
							System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getKor() + "\t" + student.getEng() + "\t" + student.getMath() + "\t" + student.getTotal() + "\t" + student.getAvg());
						}
					} else if(menu.equals("3")) {
						System.out.println("<< �л� ���� ���� (�й�) >>");
						StudentsDTO sDTO = new StudentsDTO();
						System.out.print("�л� ��ȣ >> ");
						sDTO.setId(Integer.parseInt(scan.nextLine()));

						if(!sDAO.selectStudentById(sDTO)) {
							System.out.println("!! ���� �й� !!");
							continue;
						}

						System.out.print("�л� �̸� >> ");
						sDTO.setName(scan.nextLine());
						System.out.print("���� ���� >> ");
						sDTO.setKor(Integer.parseInt(scan.nextLine()));
						System.out.print("���� ���� >> ");
						sDTO.setEng(Integer.parseInt(scan.nextLine()));
						System.out.print("���� ���� >> ");
						sDTO.setMath(Integer.parseInt(scan.nextLine()));

						System.out.println(sDAO.updateStudentById(sDTO) > 0 ? "!! ���� ���� !!" : "!! ���� ���� !!");

					} else if(menu.equals("4")) {
						System.out.println("<< �л� ���� ���� (�й�) >>");
						StudentsDTO sDTO = new StudentsDTO();
						System.out.print("�л� ��ȣ >> ");
						sDTO.setId(Integer.parseInt(scan.nextLine()));

						if(!sDAO.selectStudentById(sDTO)) {
							System.out.println("!! ���� �й� !!");
							continue;
						}

						System.out.println(sDAO.deleteStudentById(sDTO) > 0 ? "!! ���� ���� !!" : "!! ���� ���� !!");

					} else if(menu.equals("5")) {
						System.out.println("<< �л� ���� �˻� (�̸�) >>");
						StudentsDTO sDTO = new StudentsDTO();
						System.out.print("�л� �̸� >> ");
						sDTO.setName(scan.nextLine());

						List<StudentsDTO> result = sDAO.selectStuedntByName(sDTO);

						System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
						for(StudentsDTO student : result) {
							System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getKor() + "\t" + student.getEng() + "\t" + student.getMath() + "\t" + student.getTotal() + "\t" + student.getAvg());
						}
					} else {
						System.out.println("!! �޴� Ȯ�� !!");
					}
				} catch (Exception e) {
					System.out.println("Error: �����ڿ��� ����");
					e.printStackTrace();
				}
			}
		}
	}
}