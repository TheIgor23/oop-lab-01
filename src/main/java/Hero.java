import movement.iMoveStrategy;

public class Hero {

    private iMoveStrategy moveStrategy;

    public Hero(iMoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void SetStrategy(iMoveStrategy newStrategy) {
        this.moveStrategy = newStrategy;
    }

    public void Move() {
        moveStrategy.Move();
    }
}
