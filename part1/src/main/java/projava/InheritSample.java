package projava;

import javax.security.auth.Subject;
import java.util.List;

public class InheritSample {
    static class User {
        String name;

        User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    static class Student extends User {
        @Override
        public String toString() {
            return "%sの%s".formatted(getClass().getSimpleName(), getName());
        }

        int score;

        Student(String name, int score) {
            super(name);
            this.name = name;
            this.score = score;
        }

        public int getScore(){
            return score;
        }
    }

    static class Teacher extends User {
        String subject;

        Teacher(String name, String subject) {
            super(name);
            this.name = name;
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }
    }

    public static void main(String[] args) {
        List<User> people = List.of(new Student("kis", 80),
                new Teacher("hosoya", "Math"));
        for (var p : people) {
            System.out.println("こんにちは%sさん".formatted(p.getName()));
            System.out.println(p.toString());
        }
    }
}
