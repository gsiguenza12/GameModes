package Mode_Interfaces;

public interface ModeFactory_IF {
    /**
     * This method creates a mode based
     * on the selected mode.
     */
    public Mode_IF createMode(String mode);
}
