package designPattern.strategy.attack.client;

import designPattern.strategy.attack.Knife;
import designPattern.strategy.attack.Sword;

public class Run {
	public static void main(String[] args) {
		Character character = new Character();
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
	}
}
