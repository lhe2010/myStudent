import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	
			
		while (true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				StudentInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentVO(id , num , name));
				
			} else if (selectMenu == 2) {
				// 첫번째에는 메인에서 아예 아이디 검사를 해서 VO로 넘겼다. 
				// 이번(두번째)에서는 아이디만 넘기고 서비스에서 바꿀 정보를 받아서 VO로 넘겼다. 
				// 이 예제에서는 두 방법 다 크게 상관은 없다. 
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentUpdate stUpdate = controller.getUpdate();
				stUpdate.update(id);
				
			} else if (selectMenu == 3) {
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentDelete stDelete = controller.getDelete();
				stDelete.delete(id);
			} else if (selectMenu == 4) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			
			} else if (selectMenu == 5) {
				
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
			
			} else if (selectMenu == 6) {
				
				System.out.println("종료");
				scan.close();
				break;
			}
		}
	}
}
