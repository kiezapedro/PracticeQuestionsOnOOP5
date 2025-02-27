public class Main {
    public static void main(String[] args) {
        // Part (b): Kieza's Computer Science course
        Course cs = new Course("Computer Science", 4);
        cs.setGrade(3.7);

        Student kieza = new Student("Kieza", 1234);
        kieza.addCourse(cs);
        System.out.println("Kieza's Initial GPA: " + kieza.getGPA());

        // Part (c): Add Math course to kieza
        Course math = new Course("Math", 3);
        kieza.addCourse(math);
        math.setGrade(4.0);
        System.out.println("Kieza's Updated GPA: " + kieza.getGPA());

        // Part (e): Bob's courses
        Course csBob = new Course("Computer Science", 4);
        csBob.setGrade(3.0);

        Course mathBob = new Course("Math", 3);
        mathBob.setGrade(3.5);
        Student bob = new Student("Bob", 5678);
        bob.addCourse(csBob);
        bob.addCourse(mathBob);

        System.out.println("\nBob's GPA: " + bob.getGPA());
        System.out.println("Bob's Transcript: \n" + bob.getTranscript());
    }
}
