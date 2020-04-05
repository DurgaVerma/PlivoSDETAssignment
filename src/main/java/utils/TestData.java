package utils;

import java.util.Random;

public class TestData {
	
	public static  String generateRandomName() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder builder = new StringBuilder();
        Random rnd = new Random();
        while (builder.length() < 12) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            builder.append(SALTCHARS.charAt(index));
        }
        String builderStr = builder.toString();
        return builderStr;

    }
}
