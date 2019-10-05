package _02_sea_creature;

public class CreatureSeaRunner {
	public static void main(String[] args) {

		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.eat();
		spongebob.laugh();
		
		SeaCreature patrick = new SeaCreature("Patrick");
		patrick.eat();
		patrick.laugh();
		
		SeaCreature squidward = new SeaCreature("Squidward");
		squidward.eat();
		squidward.laugh();
	}
}
