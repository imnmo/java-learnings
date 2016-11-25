package imran.learnings.designpatterns.adapter.pattern;

/**
 * I'm the captain who is driving the things on my battle ship {@link BattleShip}
 *
 * @author enomoha
 */
public class Captain implements BattleShip

{
    private BattleShip myBattleShip;

    public Captain(BattleShip pBattleShip)
    {
        this.setMyBattleShip(pBattleShip);

    }

    @Override
    public void FireTheEnemy()
    {
        myBattleShip.FireTheEnemy();
    }

    @Override
    public void moveInDirections()
    {
        myBattleShip.moveInDirections();
    }

    public BattleShip getMyBattleShip()
    {
        return myBattleShip;
    }

    public void setMyBattleShip(BattleShip myBattleShip)
    {
        this.myBattleShip = myBattleShip;
    }

}
