package Log;

import Heroes.Hero;
import Interfaces.Entity;
import SkillsAndUpgrades.Skill;

public class Log {

    public void info(String message) {
        System.out.println(message);
    }

    public void died(Entity entity) {
        System.out.print(ConsoleColors.RED);
        System.out.println(entity.getName() + " died.");
        System.out.print(ConsoleColors.RESET);
    }

    public void gameOver() {
        System.out.print(ConsoleColors.RED_UNDERLINED + "" + ConsoleColors.RED_BOLD);
        System.out.println("GAME OVER");
        System.out.println(ConsoleColors.RESET);
    }

    public void userChooses() {
        System.out.print(ConsoleColors.GREEN_BOLD);
        System.out.print(">> ");
        System.out.print(ConsoleColors.RESET);
    }

    public void heroMoneyAndHealth(Hero hero) {
        System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
        System.out.println("Current HP: " + hero.getHealth() + " | Max HP: " + hero.getBaseHealth());
        System.out.print(ConsoleColors.RESET);
        System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT);
        System.out.println("Available money: " + hero.getGatheredMoney() + "$");
        System.out.print(ConsoleColors.RESET);
    }

    public void potionsToBuy(Hero hero) {
        if(hero.getGatheredMoney() < 5) {
            System.out.print(ConsoleColors.WHITE);
            System.out.println("[1] Small healing potion (25% HP, 5$)");
            System.out.print(ConsoleColors.RESET);
        }
        else {
            System.out.println("[1] Small healing potion (25% HP, 5$)");
        }
        if(hero.getGatheredMoney() < 8) {
            System.out.print(ConsoleColors.WHITE);
            System.out.println("[2] Medium healing potion (50% HP, 8$)");
            System.out.print(ConsoleColors.RESET);
        }
        else {
            System.out.println("[2] Medium healing potion (50% HP, 8$)");
        }
        if(hero.getGatheredMoney() < 12) {
            System.out.print(ConsoleColors.WHITE);
            System.out.println("[3] Big healing potion (75% HP, 12$)");
            System.out.print(ConsoleColors.RESET);
        }
        else {
            System.out.println("[3] Big healing potion (75% HP, 12$)");
        }
    }

    public void goblinDroppedHundred() {
        System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT);
        System.out.println("Goblin dropped 100$");
        System.out.print(ConsoleColors.RESET);
    }

    public void waveNumber(int waveNum) {
        System.out.println(ConsoleColors.BLUE_BOLD);
        if(waveNum % 5 != 0) {
            System.out.println("Wave: " + waveNum);
        }
        else {
            System.out.println("BOSS WAVE");
        }
        System.out.print(ConsoleColors.RESET);
    }

    public void skillUpgraded(Skill skill) {
        System.out.print(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED);
        System.out.println(skill.getSkillName() + " upgraded");
        System.out.print(ConsoleColors.RESET);
    }

    public void notEnoughMoney() {
        System.out.print(ConsoleColors.RED_BOLD + ConsoleColors.RED_UNDERLINED);
        System.out.println("Not enough money!");
        System.out.print(ConsoleColors.RESET);
    }

    public void enemyInfoRed(String info) {
        System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
        System.out.println(info);
        System.out.print(ConsoleColors.RESET);
    }

    public void enemyInfoBlue(String info) {
        System.out.print(ConsoleColors.BLUE_BOLD_BRIGHT);
        System.out.println(info);
        System.out.print(ConsoleColors.RESET);
    }

    public void infoYellow(String info) {
        System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT);
        System.out.println(info);
        System.out.print(ConsoleColors.RESET);
    }
}
