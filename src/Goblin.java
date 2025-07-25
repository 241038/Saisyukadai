public class Goblin extends Monster {
    public Goblin(String name,char suffix,int hp){
        super(name,hp,suffix);
    }
    @Override
    public void attack(Creature target){
        System.out.println(name + suffix + "はナイフで切り付けた！" + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }
}
