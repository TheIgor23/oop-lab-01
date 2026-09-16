import movement.FlyStrategy;
import movement.HorseRideStrategy;
import movement.WalkStrategy;
import movement.iMoveStrategy;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<iMoveStrategy> strategies = List.of(
                new WalkStrategy(),
                new HorseRideStrategy(),
                new FlyStrategy()
        );

        Hero hero = new Hero(strategies.getFirst());

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("""
                        Choose movement:
                        1. Walk
                        2. Ride horse
                        3. Fly
                        0. Exit
                        -> """);

                int choice = scanner.nextInt();

                if (choice == 0) {
                    break;
                }

                if (choice < 1 || choice > strategies.size()) {
                    System.out.println("Invalid choice");
                    continue;
                }

                hero.SetStrategy(strategies.get(choice - 1));
                hero.Move();
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Exit");
        }
    }
}
