public class main {

    public static void main(String[] args) {
        Archer a1 = new Archer("궁수", "상");
        Archer a2 = new Archer("궁", "상");

        System.out.println(a1.equals(a2));
    }
}