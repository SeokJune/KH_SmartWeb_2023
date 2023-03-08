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

			// 로그인 및 회원가입
			MembersDAO mDAO = new MembersDAO();
			while(true) {
				System.out.println("<<< 로그인 >>>");
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("3. 회원목록출력");
				System.out.println("4. 회원수정");
				System.out.println("5. 회원탈퇴");
				System.out.println("0. 시스템 종료");
				System.out.print(">>> ");
				String menu = scan.nextLine();

				try {
					if(menu.equals("0")) {
						System.out.println("<< 시스템 종료 >>");
						System.exit(0);
					} else if(menu.equals("1")) {
						System.out.println("<< 로그인 >>");
						MembersDTO mDTO = new MembersDTO();
						System.out.print("ID >> ");
						mDTO.setId(scan.nextLine());
						System.out.print("PW >> ");
						mDTO.setPw(EncryptionUtils.sha512(scan.nextLine()));
						
						if(mDAO.selectMembersByIdPw(mDTO)) {
							System.out.println("!! 로그인 성공 !!");
							break;
						} else {
							System.out.println("!! 로그인 실패 !!");
							continue;
						}
					} else if(menu.equals("2")) {
						System.out.println("<< 시스템 종료 >>");
						MembersDTO mDTO = new MembersDTO();
						System.out.print("ID >> ");
						mDTO.setId(scan.nextLine());
						
						if(mDAO.selectMembersById(mDTO)) {
							System.out.println("!! 중복된 ID !!");
							continue;
						}
						
						System.out.print("PW >> ");
						mDTO.setPw(EncryptionUtils.sha512(scan.nextLine()));
						System.out.print("이름 >> ");
						mDTO.setName(scan.nextLine());
						System.out.print("연락처 >> ");
						mDTO.setContact(scan.nextLine());

						System.out.println(mDAO.insertMembers(mDTO) > 0 ? "!! 가입 환영 !!" : "!! 가입 실패 !!");
					} else if(menu.equals("3")){
						System.out.println("<< 회원 목록 출력 >>");
						
						List<MembersDTO> list = mDAO.selectMembersAll();
						
						for(MembersDTO member : list) {
							System.out.println(member.getId() + "\t" + member.getFormatDate());
						}
						
					} else if(menu.equals("4")) {
						System.out.println("<< 회원정보 수정 >>");
						MembersDTO mDTO = new MembersDTO();
						System.out.print("ID >> ");
						mDTO.setId(scan.nextLine());
						System.out.print("PW >> ");
						mDTO.setPw(EncryptionUtils.sha512(scan.nextLine()));
						
						if(mDAO.selectMembersByIdPw(mDTO)) {
							System.out.println("!! 일치 !!");
						} else {
							System.out.println("!! 불일치 !!");
							continue;
						}

						System.out.print("PW >> ");
						mDTO.setCpw(EncryptionUtils.sha512(scan.nextLine()));
						System.out.print("이름 >> ");
						mDTO.setName(scan.nextLine());
						System.out.print("연락처 >> ");
						mDTO.setContact(scan.nextLine());
						
						System.out.println(mDAO.updateMembers(mDTO) > 0 ? "!! 수정 성공 !!" : "!! 수정 실패 !!");
						
					} else if(menu.equals("5")) {
						System.out.println("<< 회원 탈퇴 >>");
						MembersDTO mDTO = new MembersDTO();
						System.out.print("ID >> ");
						mDTO.setId(scan.nextLine());
						System.out.print("PW >> ");
						mDTO.setPw(EncryptionUtils.sha512(scan.nextLine()));
						
						System.out.println(mDAO.selectMembersByIdPw(mDTO) && mDAO.deleteMebers(mDTO) > 0 ? "!! 탈퇴 성공 !!" : "!!탈퇴 실패 !!");
					} else {
						System.out.println("!! 메뉴 확인 !!");
					}
				} catch (Exception e) {
					System.out.println("Error: 관리자에게 문의");
					e.printStackTrace();
				}
			}

			StudentsDAO sDAO = new StudentsDAO();
			while(true) {
				System.out.println("<<< 학생 정보 관리 시스템 >>>");
				System.out.println("1. 학생 정보 입력");
				System.out.println("2. 학생 목록 출력");
				System.out.println("3. 학생 정보 수정 (학번)");
				System.out.println("4. 학생 정보 삭제 (학번)");
				System.out.println("5. 학생 정보 검색 (이름)");
				System.out.println("0. 시스템 종료");
				System.out.print(">>> ");
				String menu = scan.nextLine();

				try {
					if(menu.equals("0")) {
						System.out.println("<< 시스템 종료 >>");
						System.exit(0);
					} else if(menu.equals("1")) {
						System.out.println("<< 학생 정보 입력 >>");
						StudentsDTO sDTO = new StudentsDTO();
						System.out.print("학생 이름 >> ");
						sDTO.setName(scan.nextLine());
						System.out.print("국어 점수 >> ");
						sDTO.setKor(Integer.parseInt(scan.nextLine()));
						System.out.print("영어 점수 >> ");
						sDTO.setEng(Integer.parseInt(scan.nextLine()));
						System.out.print("수학 점수 >> ");
						sDTO.setMath(Integer.parseInt(scan.nextLine()));

						System.out.println(sDAO.insertStudent(sDTO) > 0 ? "!! 입력 성공 !!" : "!! 입력 실패 !!");
					} else if(menu.equals("2")) {
						System.out.println("<< 학생 목록 출력 >>");

						List<StudentsDTO> result = sDAO.selectStuedntByAll();

						System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
						for(StudentsDTO student : result) {
							System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getKor() + "\t" + student.getEng() + "\t" + student.getMath() + "\t" + student.getTotal() + "\t" + student.getAvg());
						}
					} else if(menu.equals("3")) {
						System.out.println("<< 학생 정보 수정 (학번) >>");
						StudentsDTO sDTO = new StudentsDTO();
						System.out.print("학생 번호 >> ");
						sDTO.setId(Integer.parseInt(scan.nextLine()));

						if(!sDAO.selectStudentById(sDTO)) {
							System.out.println("!! 없는 학번 !!");
							continue;
						}

						System.out.print("학생 이름 >> ");
						sDTO.setName(scan.nextLine());
						System.out.print("국어 점수 >> ");
						sDTO.setKor(Integer.parseInt(scan.nextLine()));
						System.out.print("영어 점수 >> ");
						sDTO.setEng(Integer.parseInt(scan.nextLine()));
						System.out.print("수학 점수 >> ");
						sDTO.setMath(Integer.parseInt(scan.nextLine()));

						System.out.println(sDAO.updateStudentById(sDTO) > 0 ? "!! 수정 성공 !!" : "!! 수정 실패 !!");

					} else if(menu.equals("4")) {
						System.out.println("<< 학생 정보 삭제 (학번) >>");
						StudentsDTO sDTO = new StudentsDTO();
						System.out.print("학생 번호 >> ");
						sDTO.setId(Integer.parseInt(scan.nextLine()));

						if(!sDAO.selectStudentById(sDTO)) {
							System.out.println("!! 없는 학번 !!");
							continue;
						}

						System.out.println(sDAO.deleteStudentById(sDTO) > 0 ? "!! 삭제 성공 !!" : "!! 삭제 실패 !!");

					} else if(menu.equals("5")) {
						System.out.println("<< 학생 정보 검색 (이름) >>");
						StudentsDTO sDTO = new StudentsDTO();
						System.out.print("학생 이름 >> ");
						sDTO.setName(scan.nextLine());

						List<StudentsDTO> result = sDAO.selectStuedntByName(sDTO);

						System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
						for(StudentsDTO student : result) {
							System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getKor() + "\t" + student.getEng() + "\t" + student.getMath() + "\t" + student.getTotal() + "\t" + student.getAvg());
						}
					} else {
						System.out.println("!! 메뉴 확인 !!");
					}
				} catch (Exception e) {
					System.out.println("Error: 관리자에게 문의");
					e.printStackTrace();
				}
			}
		}
	}
}
