public class Wizard extends Character {

     int mp;
    public super(String name,int hp,String wepon){
        int mp = 30;
        }
    public void attack(Creature target ){
        System.out.println("「[name]は火の玉をとなえた！[target.name]に3のダメージを与えた！」");
        target.setHp(target.getHp()-3);
        wizard.setmp(wizard.getMp()-1);
    }
}
