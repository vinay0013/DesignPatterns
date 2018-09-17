
public class PC implements Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram+":PC";
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd+":PC";
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu+":PC";
	}

}
