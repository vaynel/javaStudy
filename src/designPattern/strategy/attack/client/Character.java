package designPattern.strategy.attack.client;

import designPattern.strategy.attack.Weapon;

public class Character {

	private Weapon weapon;

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if(weapon==null) {
			System.out.println("맨손 공격");
		}
		else {
			weapon.attack();
		}
	}

}
