package t10_VO;

import java.util.ArrayList;
import java.util.Scanner;

public class SungjukService {
	Scanner scanner = new Scanner(System.in);
	
	SungjukDAO dao = new SungjukDAO();
	SungjukVO vo = null;

	// 성적 입력처리
	public void setInput() {
		vo = new SungjukVO();
		while(true) {
			System.out.println("\n** 성적 입력처리");
			System.out.print("성명: ");  vo.setName(scanner.next());	// String name = scanner.next();
			System.out.print("국어: ");  vo.setKor(scanner.nextInt()); // int kor = scanner.nextInt();
			System.out.print("영어: ");  vo.setEng(scanner.nextInt());
			System.out.print("수학: ");  vo.setMat(scanner.nextInt());
			
			// 동명2인처리(같은자료를 입력시키지 않도록 한다.)
			SungjukVO vo2 = dao.getSearch(vo.getName());
			
			if(vo2 != null) {
				System.out.println("같은 성명을 가진 자료가 존재합니다. 다시 입력하세요.");
				continue;
			}
			
			vo = calculator(vo);		// 입력자료의 총점/평균/학점 계산하기
			
			//int res = dao.setInput(name,kor,eng,mat,tot,avg,grage);				// 신규 자료 DB에 등록하기
			int res = dao.setInput(vo);				// 신규 자료 DB에 등록하기
			if(res == 1) System.out.print("등록되었습니다.");
			else System.out.print("등록실패~~");
			
			System.out.print(" 계속할까요?(Y/N)");
			String ans = scanner.next();
			if(ans.toUpperCase().equals("N")) break;
		}
		
	}

	public SungjukVO calculator(SungjukVO vo) {
		vo.setTot(vo.getKor() + vo.getEng() + vo.getMat());
		double avg = vo.getTot() / 3.0;
		vo.setAvg(avg);
		
		String grade = "";
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else grade = "F";
		vo.setGrade(grade);
		
		return vo;
	}

	// 전체조회
	public void setList() {
		ArrayList<SungjukVO> vos = dao.getList();
		
		System.out.println("\n\t\t** 전체 성적 리스트 **");
		System.out.println("============================================");
		System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("--------------------------------------------");
		for(int i=0; i<vos.size(); i++) {
			vo = vos.get(i);
			System.out.print(vo.getIdx() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.print(vo.getAvg() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.println();
		}
		System.out.println("============================================");
		System.out.println("\t총 인원수 : " + vos.size());
	}

	// 개별조회하기
	public void setSearch() {
		while(true) {
			System.out.print("\n조회할 성명을 입력하세요? ");
			String name = scanner.next();
			
			vo = dao.getSearch(name);
			
			if(vo != null) {
				System.out.println("\n고유번호 : " + vo.getIdx());
				System.out.println("성명 : " + vo.getName());
				System.out.println("국어 : " + vo.getKor());
				System.out.println("영어 : " + vo.getEng());
				System.out.println("수학 : " + vo.getMat());
				System.out.println("총점 : " + vo.getTot());
				System.out.println("평균 : " + String.format("%.1f", vo.getAvg()));
				System.out.println("학점 : " + vo.getGrade());
			}
			else {
				System.out.println("검색하신 "+name+" 님은 없습니다.");
			}
			
			System.out.print("계속 검색하시겠습니까?(Y/N)");
			String ans = scanner.next();
			if(ans.toUpperCase().equals("N")) break;
		}
	}

	// 자료 삭제처리
	public void setDelete() {
		System.out.print("\n삭제할 성명을 입력하세요? ");
		String name = scanner.next();
		
		vo = dao.getSearch(name);
		
		if(vo != null) {
			int res = dao.setDelete(name);
			if(res == 1) System.out.println("자료가 삭제되었습니다.");
			else System.out.println("자료가 삭제실패~~");
		}
		else {
			System.out.println("검색하신 "+name+" 님은 없습니다.");
		}
	}

	// 자료 수정처리
	public void setUpdate() {
		System.out.print("\n수정할 성명을 입력하세요? ");
		String name = scanner.next();
		
		vo = dao.getSearch(name);
		
		if(vo != null) {
			System.out.println("\n고유번호 : " + vo.getIdx());
			System.out.println("성명 : " + vo.getName());
			System.out.println("국어 : " + vo.getKor());
			System.out.println("영어 : " + vo.getEng());
			System.out.println("수학 : " + vo.getMat());
			System.out.println("총점 : " + vo.getTot());
			System.out.println("평균 : " + String.format("%.1f", vo.getAvg()));
			System.out.println("학점 : " + vo.getGrade());
			
			while(true) {
				System.out.println("수정할 항목을 선택하세요?");
				System.out.print("1:국어   2:영어   3:수학   0:종료 => ");
				int choice = scanner.nextInt();
				if(choice == 0) break;
				
				String[] title = {"국어","영어","수학"};
				
				System.out.println("수정할 "+title[choice-1]+" 점수를 입력하세요? ");
				int jumsu = scanner.nextInt();
				
				if(choice == 1) vo.setKor(jumsu);
				else if(choice == 2) vo.setEng(jumsu);
				else vo.setMat(jumsu);
				
				calculator(vo);	// 재계산...
				
				int res = dao.setUpdate(vo);
				
				if(res == 1) System.out.println(vo.getName() + "님 자료가 수정되었습니다.");
				else System.out.println(vo.getName() + "님 자료 수정 실패~~~");
			}
		}
		else {
			System.out.println("검색하신 "+name+" 님은 없습니다.");
		}
	}
	
	// 평점 구하기
	public double getAverage(String grade) {
		double average = 0.0;
		
		if(grade.equals("A")) average = 4.0;
		else if(grade.equals("B")) average = 3.0;
		else if(grade.equals("C")) average = 2.0;
		else if(grade.equals("D")) average = 1.0;
		else average = 0.0;
		
		return average;
	}

}
