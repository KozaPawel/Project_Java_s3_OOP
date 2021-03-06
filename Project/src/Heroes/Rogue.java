package Heroes;
import SkillsAndUpgrades.Skill;

public class Rogue extends Hero {

    public Rogue(String name) {
        super(name);
        this.baseHealth = 80;
        this.currentHealth = baseHealth;
        this.alive = true;
        skills();
    }

    @Override
    void skills() {
        addSkill(new Skill("Stab Attack ", 14))
                .addSkill(new Skill("Arrow Hit", 10));
    }
}
