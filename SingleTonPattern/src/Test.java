import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectOutput;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Eager Initialized Singleton
		EagerInitializedSingleton objEagerInitializedSingleton = EagerInitializedSingleton.getInstance();
		System.out.println("EagerInitialized obj1 hashcode: " + objEagerInitializedSingleton.hashCode());
		EagerInitializedSingleton objEagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();
		System.out.println("EagerInitialized obj2 hashcode: " + objEagerInitializedSingleton2.hashCode());

		// Staticblock Singleton
		StaticBlockSingleton objStaticBlockSingleton = StaticBlockSingleton.getInstance();
		System.out.println("StaticBlock obj1 hashcode: " + objStaticBlockSingleton.hashCode());
		StaticBlockSingleton objStaticBlockSingleton2 = StaticBlockSingleton.getInstance();
		System.out.println("StaticBlock obj2 hashcode: " + objStaticBlockSingleton2.hashCode());

		// LazyInitialized Singleton
		LazyInitializedSingleton objLazyInitializedSingleton = LazyInitializedSingleton.getInstance();
		System.out.println("LazyInitialized obj1 hashcode: " + objLazyInitializedSingleton.hashCode());
		LazyInitializedSingleton objLazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();
		System.out.println("LazyInitialized obj2 hashcode: " + objLazyInitializedSingleton2.hashCode());

		// ThreadSafe Singleton
		ThreadSafeSingleton objThreadSafeSingleton = ThreadSafeSingleton.getInstance();
		System.out.println("ThreadSafe obj1 hashcode: " + objThreadSafeSingleton.hashCode());
		ThreadSafeSingleton objThreadSafeSingleton2 = ThreadSafeSingleton.getInstance();
		System.out.println("ThreadSafe obj2 hashcode: " + objThreadSafeSingleton2.hashCode());

		// BillPugh Singleton
		BillPughSingleton objBillPughSingleton = BillPughSingleton.getInstance();
		System.out.println("BillPugh obj1 hashcode: " + objBillPughSingleton.hashCode());
		BillPughSingleton objBillPughSingleton2 = BillPughSingleton.getInstance();
		System.out.println("BillPugh obj2 hashcode: " + objBillPughSingleton2.hashCode());
		
		//Enum Singleton
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		System.out.println("Enum obj1 hashcode: " + singleton.hashCode());
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		System.out.println("Enum obj2 hashcode: " + singleton1.hashCode());
		
		
		//Serialized Singleton
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOnehashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwohashCode=" + instanceTwo.hashCode());
	}

}
