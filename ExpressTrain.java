/**
 * This class inherits from the superclass, Train.
 * Each instance of this class, a fast train object, will have a set speed of 500 ms-1 which is declared in the superclass.
 * @author 0808148w
 */
public class ExpressTrain extends Train {
	private final int FAST_TRAIN_SPEED = 500;
	
	/**
	 * Each instance of this class will call the constructor in the superclass
	 * The speed is set using the constant, FAST_TRAIN_SPEED, defined as a class variable for this subclass
	 * @param name of a train
	 */
	public ExpressTrain(String name) {
		super(name);
		this.setSpeed(this.FAST_TRAIN_SPEED);
	}
}

