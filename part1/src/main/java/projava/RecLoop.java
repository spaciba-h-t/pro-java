package projava;

public class RecLoop {
    public static void main(String[] args) {
        loop(0);
    }
    static void loop(int i) {
        if(i >= 5) {
            return;
        }
        System.out.println(i);
        loop(i + 1);
    }
}
