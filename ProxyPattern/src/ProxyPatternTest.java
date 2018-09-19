
public class ProxyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "J@urnalD$v");
		try {
//			executor.runCommand("java -version");
//			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}
	}

}
