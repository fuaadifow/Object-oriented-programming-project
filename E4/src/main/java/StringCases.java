public class StringCases {

    public static String camelCase(String inputString) {
        //complete this method
        inputString = inputString.toLowerCase();
        String[] parts = inputString.split(" ");
        String output = "";
        for (int i = 0; i < parts[0].length(); i++) {
            if (Character.isLetter(parts[0].charAt(i))) {
                output += parts[0].charAt(i);
            }
        }
        for (int i = 1; i < parts.length; i++) {
            String word = "";
            for (int j = 0; j < parts[i].length(); j++) {
                if (Character.isLetter(parts[i].charAt(j))) {
                    if (word.isEmpty()) {
                        word += Character.toUpperCase(parts[i].charAt(j));
                    } else {
                        word += parts[i].charAt(j);
                    }
                }
            }
            output += word;
        }
        return output;
    }

    public static String pascalCase(String inputString) {
        //complete this method
        inputString = inputString.toLowerCase();
        String[] parts = inputString.split(" ");
        String output = "";
        for (int i = 0; i < parts.length; i++) {
            String word = "";
            for (int j = 0; j < parts[i].length(); j++) {
                if (Character.isLetter(parts[i].charAt(j))) {
                    if (word.isEmpty()) {
                        word += Character.toUpperCase(parts[i].charAt(j));
                    } else {
                        word += parts[i].charAt(j);
                    }
                }
            }
            output += word;
        }
        return output;
    }


    public static String snakeCase(String inputString) {
        inputString = inputString.toLowerCase();
        String[] parts = inputString.split(" ");
        String output = "";
        for (int i = 0; i < parts.length; i++) {
            String word = "";
            for (int j = 0; j < parts[i].length(); j++) {
                if (Character.isLetter(parts[i].charAt(j))) {
                    word += parts[i].charAt(j);
                }
            }
            if (!word.isEmpty() && !output.isEmpty()) {
                output += "_" + word;
            } else if (!word.isEmpty() && output.isEmpty()) {
                output += word;
            }
        }
        return output;
    }

    public static String screamingSnakeCase(String inputString) {
        inputString = inputString.toUpperCase();
        String[] parts = inputString.split(" ");
        String output = "";
        for (int i = 0; i < parts.length; i++) {
            String word = "";
            for (int j = 0; j < parts[i].length(); j++) {
                if (Character.isLetter(parts[i].charAt(j))) {
                    word += parts[i].charAt(j);
                }
            }
            if (!word.isEmpty() && !output.isEmpty()) {
                output += "_" + word;
            } else if (!word.isEmpty() && output.isEmpty()) {
                output += word;
            }
        }
        return output;
    }

    public static String alternateCase(String inputString) {
        inputString = inputString.toLowerCase();
        String[] parts = inputString.split(" ");
        String output = "";
        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts[i].length(); j++) {
                if (Character.isLetter(parts[i].charAt(j))) {
                    if (output.length() % 2 == 0) {
                        output += Character.toUpperCase(parts[i].charAt(j));
                    } else {
                        output += Character.toLowerCase(parts[i].charAt(j));
                    }
                }
            }
        }
        return output;
    }
}
