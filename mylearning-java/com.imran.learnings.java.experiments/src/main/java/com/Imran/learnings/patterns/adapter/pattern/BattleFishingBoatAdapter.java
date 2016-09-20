package com.Imran.learnings.patterns.adapter.pattern;

/**
 * This is tha adapter class which takes the interface {@link BattleShip}
 * and adapts {@link FishingBoat}
 *
 * @author enomoha
 */
public class BattleFishingBoatAdapter implements BattleShip

{
    private FishingBoat myAdaptee;

    BattleFishingBoatAdapter()
    {
        myAdaptee = getInstance();
    }

    private static FishingBoat getInstance()
    {
        return (new FishingBoat());
    }

    @Override
    public void FireTheEnemy()
    {
        System.out.println("Ok,I fire your enemy...");
    }

    @Override
    public void moveInDirections()
    {
        myAdaptee.sail();
    }
}
