
public class TestBuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp = new Computer.ComputerBuilder(
				 "500 GB", "2 GB").setBluetoothEnabled(true)
				 .setGraphicsCardEnabled(true).build();
	}

}
