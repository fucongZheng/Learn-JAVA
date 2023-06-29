package com.fucongzheng.map;

import java.util.HashMap;
import java.util.Map;

public class StudentGradeManagementSystem {
    /*
    以下是一个案例题，旨在帮助巩固你对 Java Map 集合嵌套的知识：

    假设你正在设计一个学生成绩管理系统。每个学生有唯一的学号和对应的姓名，每门科目都有唯一的课程代码和对应的成绩。设计一个程序，使用嵌套的 Map 集合来管理学生成绩，并实现以下功能：

    添加学生信息：根据给定的学号和姓名，将学生信息添加到学生成绩管理系统中。
    添加学生成绩：根据给定的学号和课程代码，将学生的成绩添加到相应的学生记录中。
    查找学生信息：根据给定的学号，查询学生的姓名和所有课程的成绩。
    显示所有学生信息：打印出学生成绩管理系统中所有学生的学号、姓名和对应的课程成绩。
     */
    private Map<String, Map<String, Integer>> studentGrades;

    public StudentGradeManagementSystem() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String studentId, String name) {
        studentGrades.put(studentId, new HashMap<>());
    }

    public void addGrade(String studentId, String courseCode, int grade) {
        if (studentGrades.containsKey(studentId)) {
            Map<String, Integer> studentRecord = studentGrades.get(studentId);
            studentRecord.put(courseCode, grade);
        }
    }

    public void findStudentInfo(String studentId) {
        if (studentGrades.containsKey(studentId)) {
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + getStudentName(studentId));
            System.out.println("Grades:");
            Map<String, Integer> studentRecord = studentGrades.get(studentId);
            for (Map.Entry<String, Integer> entry : studentRecord.entrySet()) {
                String courseCode = entry.getKey();
                int grade = entry.getValue();
                System.out.println("Course Code: " + courseCode + ", Grade: " + grade);
            }
        } else {
            System.out.println("Student not found!");
        }
    }

    public void displayAllStudents() {
        for (Map.Entry<String, Map<String, Integer>> studentEntry : studentGrades.entrySet()) {
            String studentId = studentEntry.getKey();
            String name = getStudentName(studentId);
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Grades:");
            Map<String, Integer> studentRecord = studentEntry.getValue();
            for (Map.Entry<String, Integer> gradeEntry : studentRecord.entrySet()) {
                String courseCode = gradeEntry.getKey();
                int grade = gradeEntry.getValue();
                System.out.println("Course Code: " + courseCode + ", Grade: " + grade);
            }
            System.out.println("--------------------");
        }
    }

    private String getStudentName(String studentId) {
        // Assuming student names are stored elsewhere or retrieved from a database
        // In this example, we will simply return a default name
        return "John Doe";
    }

    public static void main(String[] args) {
        StudentGradeManagementSystem system = new StudentGradeManagementSystem();

        // 添加学生信息
        system.addStudent("1001", "Alice");
        system.addStudent("1002", "Bob");

        // 添加学生成绩
        system.addGrade("1001", "CSC101", 85);
        system.addGrade("1001", "MAT201", 90);
        system.addGrade("1002", "CSC101", 75);

        // 查找学生信息
        System.out.println("----- Student Information -----");
        system.findStudentInfo("1001");

        // 显示所有学生信息
        System.out.println("----- All Students -----");
        system.displayAllStudents();
    }
}
