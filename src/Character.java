public abstract class Character implements Creature {
    private String name;
    private int hp;

    Character(String name, int hp) {
        this.setName(name);
        this.hp = hp;
    }

    public boolean isAlive() {
        if (hp > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void showStatus() {
        System.out.println(name + ":hp" + hp);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {this.name=name;}
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}