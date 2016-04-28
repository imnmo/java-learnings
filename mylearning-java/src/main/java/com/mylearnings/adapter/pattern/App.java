package com.mylearnings.adapter.pattern;

/**
 * This is Adapter pattern main class which contains {@link BattleShip} interface
 * and the {@link BattleFishingBoatAdapter} adpater class followed by the
 * adaptee {@link FishingBoat}
 * @author enomoha
 *
 */

public class App
{

    public static void main(String[] args) 
    {
        BattleShip myBattleShip = new Captain(new BattleFishingBoatAdapter());
        myBattleShip.FireTheEnemy();
        myBattleShip.moveInDirections();
    }

}
