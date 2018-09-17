
public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton objEagerInitializedSingleton = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return objEagerInitializedSingleton;
	}

}
