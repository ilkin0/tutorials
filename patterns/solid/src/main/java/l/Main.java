package l;

public class Main {
    public static void main(String[] args) {

        Canli gul = new Bitki();
        Canli pisik = new Heyvan();

        System.out.println(gul.nefesAlir());
        System.out.println(pisik.yemekYeyir());
    }
}
