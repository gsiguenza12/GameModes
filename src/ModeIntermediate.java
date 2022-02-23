/**
 * Created by Jorge Ezequiel Garcia Lopez.
 * Student ID:200863135
 */
import Mode_Interfaces.Mode_IF;

public class ModeIntermediate implements Mode_IF {
    private final String mode = "Intermediate";

    @Override
    public String getDescription() {
        return "Are you up for a challenge? If so, choose this intermediate mode.";
    }

    @Override
    public String getName() {
        return mode;
    }
}
