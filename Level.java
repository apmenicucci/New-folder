public class Level {
/** Returns true if the player reached the goal on this level and returns false otherwise */
public boolean goalReached()
{ /* implementation not shown */ }

/** Returns the number of points (a positive integer) recorded for this level */
public int getPoints()
{ /* implementation not shown */ }

// There may be instance variables, constructors, and methods that are not shown.
}

public class Game
{
private Level levelOne;
private Level levelTwo;
private Level levelThree;

/** Postcondition: All instance variables have been initialized. */
public Game()
{ /* implementation not shown */ }

/** Returns true if this game is a bonus game and returns false otherwise */
public boolean isBonus()
{ /* implementation not shown */ }

/** Simulates the play of this Game (consisting of three levels) and updates all relevant game data */
public void play()
{ /* implementation not shown */ }

/** Returns the score earned in the most recently played game, as described in part (a) */
public int getScore()
{ /* to be implemented in part (a) */ }


/** Simulates the play of num games and returns the highest score earned, as described in part (b) || Precondition: num > 0 */
public int playManyTimes(int num)
{ /* to be implemented in part (b) */ }

// There may be instance variables, constructors, and methods that are not shown.
}