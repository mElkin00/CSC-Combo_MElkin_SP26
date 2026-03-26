
public class Driver {

	public static void main(String[] args) {
		Person hero = new Person();
		hero.setHealth(100);
		hero.setStrength(25);
		hero.setName("Batman");
		hero.setWeapon("Batarang", 15);
		System.out.println(hero);
		Person villan = new Person(100, 35, "The Joker", "Cane", 10);
		System.out.println(villan);
		
		while(hero.getHealth() > 0 && villan.getHealth() > 0) {
			int hDamage = 0;
			int vDamage = 0;
			if(hero.getHealth() > 0) {
				hDamage = hero.hit(villan);
				System.out.print(hero.getName() + " hits " + villan.getName() + " for " + hDamage + " damage ");
				//hero.hit(villan);
			}
			if(villan.getHealth() > 0) {
				vDamage = villan.hit(hero);
				System.out.print(villan.getName() + " hits " + hero.getName() + " for " + vDamage + " damage ");
				//villan.hit(hero);
			}
			

			
		}
		if(hero.getHealth() > 0) System.out.println(hero.getName() + " wins");
		else System.out.println(villan.getName() + " wins");

	}

}
