/**
 * Created by Jorge Ezequiel Garcia Lopez.
 * Student ID:200863135
 */
import Mode_Interfaces.Mode_IF;

public class ModeAdvanced implements Mode_IF {
    private final String mode = "Advanced";

    @Override
    public String getDescription() {
        return "Dare to be brave? Are you the best? If so, choose this advanced mode.";
    }

    @Override
    public String getName() {
        return mode;
    }
}
