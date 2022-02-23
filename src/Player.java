/**
 * Created by Jorge Ezequiel Garcia Lopez.
 * Student ID:200863135
 */
public class Player {
    private String name;
    private String skill;
    private String character;
    private String weapon;

    public Player(String name) {
        this.name = name;
        skill = null;
        character = null;
        weapon = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
