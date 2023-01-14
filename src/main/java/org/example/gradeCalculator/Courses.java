package org.example.gradeCalculator;

import java.util.List;

public class Courses {

    /**
     * 일급 컬렉션이란?
     * List/Stream 형태로 된 Course 정보들로만 인스턴스 변수로 가지는 Class
     * 해당 정보를 가지고 처리할 수 있는 책임들이 해당 클래스 안에 집합되어 있어야 함
     */
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return  courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();

        return totalCompletedCredit;
    }
}
