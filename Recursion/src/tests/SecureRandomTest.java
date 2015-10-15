package tests;

import java.security.SecureRandom;

public class SecureRandomTest {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		byte ran[] = random.generateSeed(20);
		for (int i = 0; i < ran.length; i++) {
			System.out.println(ran[i]);
		}
	}
}
