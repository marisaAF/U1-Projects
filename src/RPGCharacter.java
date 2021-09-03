import javax.swing.JOptionPane;
public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    public static void main(String[] args) {
    String inputString;
    double strength;
    double charisma;
    double intelligence;
    double constitution;
    double wealth;
    double damage;
    double empathy;
    double armor;

    inputString = JOptionPane.showInputDialog(" Out of 100 how strong is your character? use a decimal ");
    strength = Double.parseDouble(inputString);

    inputString = JOptionPane.showInputDialog(" Out of 100 how persuasive/charming is your character? use a decimal ");
    charisma = Double.parseDouble(inputString);

    inputString = JOptionPane.showInputDialog(" Out of 100 how smart is your character? use a decimal ");
    intelligence = Double.parseDouble(inputString);

    inputString = JOptionPane.showInputDialog(" Out of 100 how good is your characters health? use a decimal ");
    constitution = Double.parseDouble(inputString);

    damage = strength * intelligence - constitution;
    wealth = charisma * intelligence;
    empathy = strength + intelligence * constitution/charisma;
    armor = strength + constitution;

    JOptionPane.showMessageDialog(null, " Your wealth is " + wealth);
    JOptionPane.showMessageDialog(null, " Your damage is " + damage);
    JOptionPane.showMessageDialog(null, " Your empathy is " + empathy);
    JOptionPane.showMessageDialog(null, " Your armor is " + armor);

    System.exit(0);
    }
}


