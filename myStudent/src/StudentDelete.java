
public class StudentDelete {
	StudentDAO dao;

	public StudentDelete(StudentDAO dao) {
		this.dao = dao;
	}

	public void delete (String id) {
		if(checkId(id)) { // 존재하면 
			dao.delete(id);
		} else {
			System.out.println("존재하지 않는 아이디");
		}
	}
	
	public boolean checkId(String id) {
		StudentVO st = dao.getStudentDB().get(id);
		return st != null ? true : false; // 존재하면 true
	}
}
