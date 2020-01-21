package co.exam.dto;

public class QuestDto {
	private int quest_no;
	private String quest_content;
	private String quest_type;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String right_answer;
	private String explain;
	public int getQuest_no() {
		return quest_no;
	}
	public void setQuest_no(int quest_no) {
		this.quest_no = quest_no;
	}
	public String getQuest_content() {
		return quest_content;
	}
	public void setQuest_content(String quest_content) {
		this.quest_content = quest_content;
	}
	public String getQuest_type() {
		return quest_type;
	}
	public void setQuest_type(String quest_type) {
		this.quest_type = quest_type;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	public String getRight_answer() {
		return right_answer;
	}
	public void setRight_answer(String right_answer) {
		this.right_answer = right_answer;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	@Override
	public String toString() {
		return "QuestDto [quest_no=" + quest_no + ", quest_content=" + quest_content + ", quest_type=" + quest_type
				+ ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4
				+ ", right_answer=" + right_answer + ", explain=" + explain + "]";
	}
	
	
}
