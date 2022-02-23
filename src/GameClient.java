/**
 * Created by Jorge Ezequiel Garcia Lopez.
 * Student ID:200863135
 */
import Mode_Interfaces.Mode_IF;

public class GameClient {
    public static void main(String[] args) {
        Mode_Factory mode_factory;
        mode_factory = Mode_Factory.getInstance();

        Mode_IF mode_if;

        mode_if = mode_factory.createMode(Mode_Factory.ADVANCED);
        System.out.println(mode_if.getDescription());

        mode_if = mode_factory.createMode(Mode_Factory.INTERMEDIATE);
        System.out.println(mode_if.getDescription());

        mode_if = mode_factory.createMode(Mode_Factory.BEGINNER);
        System.out.println(mode_if.getDescription());

        Player playa = new Player("Mike Hawk");
        playa.setSkill(mode_if.getName());

        System.out.println(playa.getName());
        System.out.println(playa.getSkill());
    }
}
