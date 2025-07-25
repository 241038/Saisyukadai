public abstract class Monster implements Creature {
    String name;
    int hp;
    char suffix;

    Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    public final boolean isAlive() {
        return (hp > 0);
    }

    public void showStatus() {
        System.out.println(name + suffix + " HP:" + hp);
    }

    public String getName() {
        return name;
    }
    public int getHp() {
        return this.hp;
    }

    public char getSuffix() {
        return this.suffix;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
}