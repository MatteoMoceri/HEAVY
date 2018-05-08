package classes;

import java.util.*;

import function.Abilities;

public class Mage implements Abilities {
	Scanner mageScanner = new Scanner(System.in);
	public double hp;
	public double def;
	public double atk;
	public String name;
	public String type = "Mage";
	public boolean beacon = false;

	public Mage(String n) {
		name = n;
	}

	@Override
	public void mainAbility() {
		System.out.println("Healing Activated");
	}

	@Override
	public void secondaryAbility() {
		System.out.println("Force Shield Activated");
	}

	@Override
	public void specialAbility() {
		if (beacon == false) {
			System.out.println("Teleportation Beacon Placed");
		}else {
			System.out.println("Beacon already placed. You cannot place another beacon.");
		}
		
		beacon = true;
	}

	@Override
	public void activate() throws InterruptedException {
		System.out.println("Teleport too beacon?");
		String option = mageScanner.next();
		if(beacon == true) {
			switch(option) {
			case "yes":
				System.out.println("Teleporting to beacon");
				Thread.sleep(1000);
				System.out.println("Teleport Complete");
				break;
			case "no":
				System.out.println("Teleport canceled");
				break;
			}	
		}else {
			System.out.println("No Beacon Placed");
		}
	}
}
