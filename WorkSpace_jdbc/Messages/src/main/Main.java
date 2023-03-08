package main;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

import dao.MembersDAO;
import dao.MessagesDAO;
import dto.MembersDTO;
import dto.MessagesDTO;

public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in);) {
			try {
				String id = null;

				MembersDAO membersDAO = new MembersDAO();
				while(true) {
					System.out.println("<<< 로그인 및 회원가입 >>>");
					System.out.println("1. 로그인");
					System.out.println("2. 회원가입");
					System.out.println("3. 종료");
					System.out.print(">>> ");
					String menu = scan.nextLine();

					if(menu.equals("1")) {
						System.out.println("<< 로그인 >>");
						MembersDTO membersDTO = new MembersDTO();
						System.out.print("아이디 >> ");
						membersDTO.setId(scan.nextLine());
						System.out.print("패스워드 >> ");
						membersDTO.setPw(scan.nextLine());

						if(membersDAO.IsExistMember(membersDTO)) {
							System.out.println("!! 로그인 성공 !!");
							id = membersDTO.getId();
							break;
						} else {
							System.out.println("!! 로그인 실패 !!");
						}
					} else if(menu.equals("2")) {
						System.out.println("<< 회원가입 >>");
						MembersDTO membersDTO = new MembersDTO();
						System.out.print("아이디 >> ");
						membersDTO.setId(scan.nextLine());

						if(membersDAO.IsExistId(membersDTO)) {
							System.out.println("!! 중복된 아이디 !!");
							continue;
						}

						System.out.print("패스워드 >> ");
						membersDTO.setPw(scan.nextLine());
						System.out.print("이름 >> ");
						membersDTO.setName(scan.nextLine());
						System.out.print("연락처 >> ");
						membersDTO.setContact(scan.nextLine());

						System.out.println(membersDAO.insertMember(membersDTO) > 0 ? "!! 가입 성공 !!" : "!! 가입 실패 !!");
					} else if(menu.equals("3")) {
						System.out.println("<< 프로그램 종료 >>");
						System.exit(0);
					} else {
						System.out.println("!! 잘못된 메뉴 !!");
					}
				}

				MessagesDAO messagesDAO = new MessagesDAO();
				while(true) {
					System.out.println("<<< 계시판 >>>");
					System.out.println("1. 신규 메세지 등록");
					System.out.println("2. 메세지 목록 출력");
					System.out.println("3. 메세지 삭제 (SEQ)");
					System.out.println("4. 메세지 수정 (SEQ)");
					System.out.println("5. 메세지 검색");
					System.out.println("6. 내정보 보기");
					System.out.println("0. 시스템 종료");
					System.out.print(">>> ");
					String menu = scan.nextLine();

					if(menu.equals("1")) {
						System.out.println("<< 신규 메세지 등록 >>");
						MessagesDTO messagesDTO = new MessagesDTO();
						messagesDTO.setWriter(id);
						System.out.print("메세지 >> ");
						messagesDTO.setMessage(scan.nextLine());

						System.out.println(messagesDAO.insertMessage(messagesDTO) > 0 ? "!! 작성 완료 !!" : "!! 작성 실패 !!");
					} else if(menu.equals("2")) {
						System.out.println("<< 메세지 목록 출력 >>");
						List<MessagesDTO> list = messagesDAO.selectMessageALL();

						System.out.println("글 번호\t작성자\t작성일\t\t글 내용");
						for (MessagesDTO dto : list) {
							System.out.println(dto.getSeq() + "\t" + dto.getWriter() + "\t" + dto.getFormatDate() + "\t" + dto.getMessage());
						}
					} else if(menu.equals("3")) {
						System.out.println("<< 메세지 삭제 (SEQ) >>");
						MessagesDTO messagesDTO = new MessagesDTO();
						System.out.print("SEQ >> ");
						messagesDTO.setSeq(Long.parseLong(scan.nextLine()));

						if(!messagesDAO.IsExistSeq(messagesDTO)) {
							System.out.println("!! 없는 메세지 !!");
							continue;
						}

						System.out.println(messagesDAO.deleteMessage(messagesDTO) > 0 ? "!! 삭제 완료 !!" : "!! 삭제 실패 !!");
					} else if(menu.equals("4")) {
						System.out.println("<< 메세지 수정 (SEQ) >>");
						MessagesDTO messagesDTO = new MessagesDTO();
						System.out.print("SEQ >> ");
						messagesDTO.setSeq(Long.parseLong(scan.nextLine()));

						if(!messagesDAO.IsExistSeq(messagesDTO)) {
							System.out.println("!! 없는 메세지 !!");
							continue;
						}

						System.out.print("메세지 >> ");
						messagesDTO.setMessage(scan.nextLine());
						System.out.print("작성일 수정 (Y) >> ");
						String dateModify = scan.nextLine();
						
						if(dateModify.equals("Y")) {
							System.out.println("<< 작성일 수정 >>");
							String date = "";
							System.out.print("년도 (yyyy)>> ");
							date += scan.nextLine() + "-";
							System.out.print("월 (MM)>> ");
							date += scan.nextLine() + "-";
							System.out.print("일 (dd)>> ");
							date += scan.nextLine() + " ";
							System.out.print("시 (HH)>> ");
							date += scan.nextLine() + ":";
							System.out.print("분 (mm)>> ");
							date += scan.nextLine() + ":";
							System.out.print("초 (ss)>> ");
							date += scan.nextLine();
							messagesDTO.setWrite_date(Timestamp.valueOf(date));
						}

						System.out.println(messagesDAO.updateMessage(messagesDTO, dateModify) > 0 ? "!! 수정 완료 !!" : "!! 수정 실패 !!");
					} else if(menu.equals("5")) {
						System.out.println("<< 메세지 검색 >>");
						System.out.print("검색어 >> ");
						List<MessagesDTO> list = messagesDAO.selectMessagesByWord(scan.nextLine());

						System.out.println("글 번호\t작성자\t작성일\t\t글 내용");
						for (MessagesDTO dto : list) {
							System.out.println(dto.getSeq() + "\t" + dto.getWriter() + "\t" + dto.getFormatDate() + "\t" + dto.getMessage());
						}
					} else if(menu.equals("6")) {
						System.out.println("<< 내정보 보기 >>");
						List<MembersDTO> list = membersDAO.selectMember(id);

						System.out.println("아이디\t이름\t연락처\t\t가입일");
						for (MembersDTO dto : list) {
							System.out.println(dto.getId() + "\t" + dto.getName() + "\t" + dto.getContact() + "\t" + dto.getReg_date());
						}
					} else if(menu.equals("0")) {
						System.out.println("<< 프로그램 종료 >>");
						System.exit(0);
					} else {
						System.out.println("!! 잘못된 메뉴 !!");
					}
				}
			} catch (Exception e) {
				System.out.println("ERROR : 관리자에게 문의하세요.");
				e.printStackTrace();
			}
		}
	}
}
