package academy.learnprogramming;

import com.sun.jdi.Value;

public class Main {

    public static void main(String[] args) {

	byte challengeByte = 10;
	short challengeShort = 20;
	int challengeInt = 50;

	long challengeLong = 50000 + 10* (challengeByte + challengeShort + challengeInt);
		System.out.println("Wynik czelendżu to: " + challengeLong);

	short shortTotal = (short) (1000 + 10 * (challengeByte + challengeShort + challengeInt));
		System.out.println(shortTotal);
    }
}