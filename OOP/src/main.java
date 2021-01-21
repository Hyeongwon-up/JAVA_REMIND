public class main {
    public static void main(String[] args) {


        Hero[] hero = new Hero[3];

        hero[0] = new Warrior("전사");
        hero[1] = new Archer("궁수");
        hero[2] = new Magician("마법사");


        for(int i = 0 ; i < 3; i++ ) {
            hero[i].attac();

            if(hero[i] instanceof Warrior ) {
                ((Warrior) hero[i]).groundCutting();
            }


        }
    }
}
