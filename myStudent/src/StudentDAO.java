import java.util.Map;

// DAO (Data Access Object) : DB로부터 데이터를 input output하는 객체
public class StudentDAO {
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
	}
	
	public void update(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public void delete(String id) {
		StudentRepository.getStDB().remove(id);
	}
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}

}
