package cla;

public class StudentGrades {
    private double[] grades;
    private int count;

    public StudentGrades(int numGrades) {
        grades = new double[numGrades];
        count = 0;
    }

    public void addGrade(double grade) {
        if (count < grades.length) {
            grades[count++] = grade;
        } else {
            System.out.println("Cannot add more grades.");
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        return sum / count;
    }

    public char determineLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        StudentGrades student = new StudentGrades(5);
        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(78);
        student.addGrade(88);
        student.addGrade(90);
        
        double average = student.calculateAverage();
        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + student.determineLetterGrade(average));
    }
}
