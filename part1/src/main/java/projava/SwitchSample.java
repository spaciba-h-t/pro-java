package projava;

public class SwitchSample {
    public static void main(String[] args) {
        var a = 3;
        switch (a) {
            case 1, 2 -> System.out.println("one-two");
            case 3 -> System.out.printf("three");
            case 4 -> System.out.printf("four");
            default -> System.out.println("other");
        }
    }
}
