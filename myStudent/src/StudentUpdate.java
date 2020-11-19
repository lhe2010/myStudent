import java.util.Scanner;

public class StudentUpdate {
	StudentDAO dao;

	Scanner scan = new Scanner(System.in);

	public StudentUpdate(StudentDAO dao) {
		this.dao = dao;
	}
	
	public void update(String id) {
		StudentVO st = dao.getStudentDB().get(id);
		if(st != null) {
			System.out.print("번호를 입력하세요 : ");
			int num = scan.nextInt();
			
			System.out.print("이름을 입력하세요 : ");
			String name = scan.next();
			
			dao.update(new StudentVO(id, num, name));
		} else {
			System.out.println("없는 아이디 입니다. ");
		}
		
	}
}
