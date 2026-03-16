class Course {
    int calculateGrade(int assignments, int exams) {
        return 0;
    }
}

class ProgrammingCourse extends Course {
    int calculateGrade(int assignments, int exams) {
        return (assignments * 40 / 100) + (exams * 60 / 100);
    }
}

class MathematicsCourse extends Course {
    int calculateGrade(int assignments, int exams) {
        return (assignments * 30 / 100) + (exams * 70 / 100);
    }
}

class DesignCourse extends Course {
    int calculateGrade(int assignments, int exams) {
        return (assignments * 50 / 100) + (exams * 50 / 100);
    }
}

public class Main {
    public static void main(String[] args) {

        Course c;

        c = new ProgrammingCourse();
        System.out.println("Programming Course Grade: " + c.calculateGrade(80, 90));

        c = new MathematicsCourse();
        System.out.println("Mathematics Course Grade: " + c.calculateGrade(80, 90));

        c = new DesignCourse();
        System.out.println("Design Course Grade: " + c.calculateGrade(80, 90));
    }
}
