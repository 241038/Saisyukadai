public class Slime extends Monster {
    public Slime(String name,char suffix,int hp){
        super(name,hp,suffix);
    }
    @Override
    public void attack(Creature target){
        System.out.println(name + suffix + "は体当たり攻撃！" + target.getName() + "に５のダメージを与えた！");
        target.setHp(target.getHp()-5);
    }
}
