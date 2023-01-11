package interfaces;

public class Duckling {
	
	/**
	 * This method uses the interface and overwriting the speak method.
	 * @param sound
	 */
	public static void makeSound(String sound) {
		LearnToSpeak learner = System.out::println;
		DuckHelper.teacher(sound, learner);
	}
}
