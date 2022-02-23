/**
 * Created by Jorge Ezequiel Garcia Lopez.
 * Student ID:200863135
 */
import Mode_Interfaces.Mode_IF;

public class ModeBeginner implements Mode_IF {
    private final String mode = "Beginner";
    @Override

    public String getDescription() {
        return "Start your journey here. Choose this beginner mode.";
    }

    @Override
    public String getName() {
        return mode;
    }
}
