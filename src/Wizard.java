public class Wizard extends Character {
    int mp;
    public Wizard(String name,int hp,int mp){
        super(name,hp);
        setMp(mp);
    }

    public void attack(Creature target ){
        System.out.println(getName() + "は火の玉をとなえた！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp()-3);
        this.setMp(this.getMp()-1);
    }
    public int getMp(){ return this.mp;}
    public void setMp(int mp){
        this.mp = mp;
    }
}
