import java.awt.event.WindowAdapter;
import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero  hero = new Hero("勇者",100,"剣");
        Wizard wizard = new Wizard("魔法使い",60,30);
        Thief thief = new Thief("盗賊",70);
        ArrayList<Character> party = new ArrayList<>();
        party.add(hero);
        party.add(wizard);
        party.add(thief);

        Goblin goblin = new Goblin("ゴブリン",'A',50);
        Matango matango = new Matango("マタンゴ",'A',45);
        Slime slime = new Slime("スライム",'A',40);
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(goblin);
        monsters.add(matango);
        monsters.add(slime);

    for (Character character : party) {
        character.showStatus();
    }
    for(Monster monster : monsters){
        monster.showStatus();
    }



    }


}
