package projava;

public class ForSample {
    public static void main(String[] args) {
        for(int i=0; i<5;i++){
            if(i==2) {
                System.out.println("finish");
                break;
            }else {
                System.out.println(i);
            }
        }
    }
}
