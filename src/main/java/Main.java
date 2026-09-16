import movement.FlyStrategy;
import movement.HorseRideStrategy;
import movement.WalkStrategy;

public class Main {
    public static void main(String args[]) {
        Hero h = new Hero(new WalkStrategy());
        h.Move();

        h.SetStrategy(new HorseRideStrategy());
        h.Move();

        h.SetStrategy(new FlyStrategy());
        h.Move();

        h.SetStrategy(new WalkStrategy());
        h.Move();
    }
}
