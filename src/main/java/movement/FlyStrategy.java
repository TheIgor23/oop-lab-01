package movement;

public class FlyStrategy implements iMoveStrategy{
    @Override
    public void Move() {
        System.out.println("The hero flew by");
    }
}
