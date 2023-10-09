package projava;

public class InstanceMethodSample {
    record Student(String name, int englishScore, int mathScore){
        int avarage() {
            return (this.englishScore() + this.mathScore()) / 2;
        }

        int maxScore() {
            return Math.max(englishScore(), mathScore());
        }
    }

    public static void main(String[] args) {
        var kis = new Student("kis", 60, 80);
        var a = kis.avarage();
        System.out.println("平均点は%sです".formatted(a));

        int max = kis.maxScore();
        System.out.println("最高点は%sです".formatted(max));
    }
}
