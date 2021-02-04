package bitCoin;

public class App {

    public static void main(String[] args) {
        String str = "Addfhjhgfdsfghjghfdgh";
        int width = 50;
//        SttringFormatter s = new SttringFormatter();
        String ss = SttringFormatter.center(str,width);
        System.out.println(ss);
    }
}
