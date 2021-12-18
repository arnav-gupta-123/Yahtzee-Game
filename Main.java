class Main {
  public static void main(String[] args) {
    Yahtzee yahtzeeGame = new Yahtzee(0, 0, 0, 0, 0, 0);
    int numberOfGames = 0;
    while (numberOfGames < 3) {
      System.out.println("Game " + (numberOfGames + 1));
      System.out.println();
      yahtzeeGame.roll();
      if (yahtzeeGame.isYahtzee() == false) {
        yahtzeeGame.reroll();
      }
      numberOfGames += 1;
    }
    if (yahtzeeGame.getNumberOfYahtzees() == 0) {
      System.out.println("You Lose");
      System.out.println();
    }
    else {
      System.out.println("You Win!");
      System.out.println();
    }
  }
}
