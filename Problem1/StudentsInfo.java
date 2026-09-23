/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem1;

/**
 *
 * @author User
 */
public class StudentsInfo {
     private int studentId;
    private String name;
    private String course;
    private double prelimGrade;
    private double midtermGrade;
    private double finalGrade;

    // Constructor
    public StudentsInfo(int studentId, String name, String course,
                   double prelimGrade, double midtermGrade, double finalGrade) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.prelimGrade = prelimGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

   
        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public double getPrelimGrade() {
            return prelimGrade;
        }

        public void setPrelimGrade(double prelimGrade) {
            this.prelimGrade = prelimGrade;
        }

        public double getMidtermGrade() {
            return midtermGrade;
        }

        public void setMidtermGrade(double midtermGrade) {
            this.midtermGrade = midtermGrade;
        }

        public double getFinalGrade() {
            return finalGrade;
        }

        public void setFinalGrade(double finalGrade) {
            this.finalGrade = finalGrade;
        }

  

    // Calculate average
    public double calculateAverage() {
        return (prelimGrade + midtermGrade + finalGrade) / 3;
    }

    // Get classification
    public String getClassification() {
        double average = calculateAverage();

        if (average >= 90) {
            return "Excellent";
        } else if (average >= 85) {
            return "Very Good";
        } else if (average >= 80) {
            return "Good";
        } else if (average >= 75) {
            return "Passing";
        } else {
            return "Failed";
        }
    }

    // Display student information
    public void displayStudentInfo() {
        double average = calculateAverage();

        System.out.println("===== STUDENT INFORMATION =====");
      
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println();
        System.out.println("Prelim Grade: " + prelimGrade);
        System.out.println("Midterm Grade: " + midtermGrade);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println();
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Classification: " + getClassification());
        System.out.println("Status: " + (average >= 75 ? "PASSED" : "FAILED"));
    }

}
