package rabyrinth.gdx.screen.game;

/** @author Sino */
public enum InstructionType {
	WALK ("Walk"),
	TURN_LEFT ("Turn Left"),
	TURN_RIGHT ("Turn Right");

	private final String label;

	InstructionType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
