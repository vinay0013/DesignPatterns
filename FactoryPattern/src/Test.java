
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16GB", "1 TB", "2.9 GHz");
		System.out.println("Factory PC Config::" + pc.getCPU());
		System.out.println("Factory Server Config::" + server.getCPU());
	}

}
