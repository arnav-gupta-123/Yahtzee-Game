import java.util.Scanner;

public class Yahtzee {
  private int dice1_Value;
  private int dice2_Value;
  private int dice3_Value;
  private int dice4_Value;
  private int dice5_Value;
  private int numberOfYahtzees;

  public Yahtzee(int dice1_Value, int dice2_Value, int dice3_Value, int dice4_Value, int dice5_Value, int numberOfYahtzees) {
    this.dice1_Value = dice1_Value;
    this.dice2_Value = dice2_Value;
    this.dice3_Value = dice3_Value;
    this.dice4_Value = dice4_Value;
    this.dice5_Value = dice5_Value;
    this.numberOfYahtzees = numberOfYahtzees;
  }

  public int getNumberOfYahtzees() {
    return numberOfYahtzees;
  }

  public void rollDie(int diceNum) {
    if (diceNum == 1) {
      int randnum1 = ((int) (Math.random() * 6) + 1);
      this.dice1_Value = randnum1;
    }
    else if (diceNum == 2) {
      int randnum2 = ((int) (Math.random() * 6) + 1);
      this.dice2_Value = randnum2;
    }
    else if (diceNum == 3) {
      int randnum3 = ((int) (Math.random() * 6) + 1);
      this.dice3_Value = randnum3;
    }
    else if (diceNum == 4) {
      int randnum4 = ((int) (Math.random() * 6) + 1);
      this.dice4_Value = randnum4;
    }
    else if (diceNum == 5) {
      int randnum5 = ((int) (Math.random() * 6) + 1);
      this.dice5_Value = randnum5;
    }
  }

  public boolean isYahtzee() {
    if (dice1_Value == dice2_Value && dice2_Value == dice3_Value && dice3_Value == dice4_Value && dice4_Value == dice5_Value) {
      this.numberOfYahtzees += 1;
      return true;
    }
    else {
      return false;
    }
  }

  public void roll() {
    rollDie(1);
    rollDie(2);
    rollDie(3);
    rollDie(4);
    rollDie(5);
    System.out.println(toString());
  }

  public void reroll() {
    boolean allNumbers = true;
    boolean OneisRolled = false;
    boolean TwoisRolled = false;
    boolean ThreeisRolled = false;
    boolean FourisRolled = false;
    boolean FiveisRolled = false;
    int diceNumber;
    Scanner scan = new Scanner(System.in);
    while (allNumbers) {
      System.out.print("Which die (1-5) would you like to reroll? (Enter 0 for none) ");
      diceNumber = scan.nextInt();
      System.out.println();
      if (diceNumber == 1 && OneisRolled == false) {
        rollDie(1);
        System.out.println(toString());
        OneisRolled = true;
      }
      if (diceNumber == 2 && TwoisRolled == false) {
        rollDie(2);
        System.out.println(toString());
        TwoisRolled = true;
      }
      if (diceNumber == 3 && ThreeisRolled == false) {
        rollDie(3);
        System.out.println(toString());
        ThreeisRolled = true;
      }
      if (diceNumber == 4 && FourisRolled == false) {
        rollDie(4);
        System.out.println(toString());
        FourisRolled = true;
      }
      if (diceNumber == 5 && FiveisRolled == false) {
        rollDie(5);
        System.out.println(toString());
        FiveisRolled = true;
      }
      if ((OneisRolled && TwoisRolled && ThreeisRolled && FourisRolled && FiveisRolled) || (isYahtzee())) {
        allNumbers = false;
      }
      if (diceNumber == 0) {
        allNumbers = false;
      }
    }
  }
    
  public String toString() {
    return "Dice 1 Value: " + this.dice1_Value + "\n" + "Dice 2 Value: " + this.dice2_Value + "\n" + "Dice 3 Value: " + this.dice3_Value + "\n" + "Dice 4 Value: " + this.dice4_Value + "\n" + "Dice 5 Value: " + this.dice5_Value + "\n" + "Number of Yahtzees: " + this.numberOfYahtzees + "\n";
  }
}
