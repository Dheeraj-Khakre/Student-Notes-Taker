package mapping.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	 @Id
	 private int a_id;
	 private String ans;
	 @ManyToOne()
	 private Question question;
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer(int a_id, String ans, Question question) {
		super();
		this.a_id = a_id;
		this.ans = ans;
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
