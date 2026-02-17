package lab1.problem5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boyCount = 0;

        for (Person p : kidnappedPeople) {
            if (p.getGender() == Gender.BOY) {
                boyCount++;
            } else {
                if (boyCount > 0) {
                    boyCount--;
                } else {
                    return true;
                }
            }
        }

        return boyCount > 0;
    }

    public static void main(String[] args) {
        DragonLaunch dragon = new DragonLaunch();

        dragon.kidnap(new Person(Gender.BOY, "B1"));
        dragon.kidnap(new Person(Gender.BOY, "B2"));
        dragon.kidnap(new Person(Gender.GIRL, "G1"));
        dragon.kidnap(new Person(Gender.GIRL, "G2"));

        if (dragon.willDragonEatOrNot()) {
            System.out.println("Dragon eats!");
        } else {
            System.out.println("Dragon does not eat!");
        }
    }
}