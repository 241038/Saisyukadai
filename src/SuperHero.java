public class SuperHero extends Hero {
    public SuperHero(String name,int hp, String weapon) {
        super(name, hp, weapon);
    }
    @Override
    public void attack(Creature target) {
        System.out.println("「[name]は[weapon]で攻撃！[target.name]に25のダメージを与えた！」");
        target.setHp(target.getHp() - 25);
    }
}