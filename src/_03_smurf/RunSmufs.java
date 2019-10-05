package _03_smurf;

public class RunSmufs {
	public static void main(String[] args) {
		Smurf handysmurf = new Smurf("HandySmurf");
		handysmurf.eat();
		System.out.println(handysmurf.getName());

		Smurf papasmurf = new Smurf("PapaSmurf");
	
		System.out.println(papasmurf.isGirlOrBoy());
		System.out.println(papasmurf.getHatColor());
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.isGirlOrBoy());
		System.out.println (smurfette.getHatColor());
	}
}
