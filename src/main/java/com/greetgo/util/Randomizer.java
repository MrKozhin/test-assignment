package com.greetgo.util;

import java.util.Random;

public class Randomizer {

    public static String getRandomString(int stringLength) {

        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < stringLength; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        return String.valueOf(sb);
    }
}
