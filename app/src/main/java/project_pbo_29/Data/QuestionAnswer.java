package project_pbo_29.Data;

public class QuestionAnswer {
    private String question;
    private String answer;
    private String next;

    public QuestionAnswer(String question, String answer, String next) {
        this.question = question;
        this.answer = answer;
        this.next = next;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getNext() {
        return next;
    }
}

