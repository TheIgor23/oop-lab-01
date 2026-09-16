package movement;

public class WalkStrategy implements iMoveStrategy{
    @Override
    public void Move() {
        System.out.println("The hero walked");
    }
}
