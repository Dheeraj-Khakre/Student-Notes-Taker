package mapping.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private int q_id;
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public Question(int q_id, String que, List<Answer> answer) {
		super();
		this.q_id = q_id;
		this.que = que;
		this.answer = answer;
	}
	private String que;
	@OneToMany(mappedBy = "question" ,fetch = FetchType.EAGER)
	private List<Answer> answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
