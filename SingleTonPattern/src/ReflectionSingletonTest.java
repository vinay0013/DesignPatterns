import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
		SingletonEnum instanceOne1 = SingletonEnum.INSTANCE;
		SingletonEnum instanceTwo1 = null;
		try {
			Constructor[] constructors = SingletonEnum.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo1 = (SingletonEnum) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne1.hashCode());
		System.out.println(instanceTwo1.hashCode());
	}
}
