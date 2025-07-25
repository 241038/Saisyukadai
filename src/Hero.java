public class Hero extends Character {
    private String weapon;
     public Hero(String name,int hp,String wepon){
        super(name,hp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println("「[name]は[weapon]で攻撃！[target.name]に10のダメージを与えた！」");
        target.setHp(target.getHp()-10);
    }
}