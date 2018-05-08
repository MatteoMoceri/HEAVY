package classes;

import function.Abilities;

public class Mystic implements Abilities {
	public double hp;
	public double def;
	public double atk;
	public String name;
	public String type = "Mystic";
	public boolean flight = false;

	public Mystic(String n) {
		name = n;
	}

	@Override
	public void mainAbility() {
		System.out.println("Telekinesis Active");

	}

	@Override
	public void secondaryAbility() {
		System.out.println("Force Pulse Complete");

	}

	@Override
	public void specialAbility() {
		if (flight == false) {
			System.out.println("Flight Activated");
			flight = true;
		} else if (flight == true) {
			System.out.println("Flight Deactivated");
			flight = false;
		}

	}

	@Override
	public void activate() {
		System.out.println("Not Applicable");

	}
}
