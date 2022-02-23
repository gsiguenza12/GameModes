/**
 * Created by Jorge Ezequiel Garcia Lopez.
 * Student ID:200863135
 */

import Mode_Interfaces.ModeFactory_IF;
import Mode_Interfaces.Mode_IF;

public class Mode_Factory implements ModeFactory_IF {
    private static Mode_Factory myInstance = new Mode_Factory();

    public final static String ADVANCED = "Advanced";
    public final static String INTERMEDIATE = "Intermediate";
    public final static String BEGINNER = "Beginner";

    @Override
    public Mode_IF createMode(String mode) {
        Mode_IF returnMode = null;
        switch (mode) {
            case "Advanced" -> returnMode = createAdvancedMode();
            case "Intermediate" -> returnMode = createIntermediateMode();
            case "Beginner" -> returnMode = createBeginnerMode();
        }
        return returnMode; // should not happen
    }

    public static Mode_Factory getInstance() {
        return myInstance;
    }

    /**
     * Creates the advanced game mode.
     * @return
     */
    private Mode_IF createAdvancedMode() {
        return new ModeAdvanced();
    }

    /**
     * Creates the intermediate game mode.
     * @return
     */
    private Mode_IF createIntermediateMode() {
        return new ModeIntermediate();
    }

    /**
     * Creates the beginner game mode.
     * @return
     */
    private Mode_IF createBeginnerMode() {
        return new ModeBeginner();
    }
}
