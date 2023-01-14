package org.example.gradeCalculator;

public class Course {

    private final String subject;   // 과목명
    public final int credit;        // 학점
    public final String grade;      // 성적

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    // Getter 이용하는 방식은 수정 시 사용하는 모든 곳에서 수정을 해야 했기에 리팩토링(응집도↓)
    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double grade = 0;
        switch (this.grade){
            case "A+":
                grade = 4.5;
                break;
            case "A":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C":
                grade = 2.0;
                break;
            default: grade = 0;
        }
        return grade;
    }


}
