public class HelloApp {

    public static void main(String[] args) {

        String result;

        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder namesBuilder = new StringBuilder();

            for (String name : args) {
                if (namesBuilder.length() > 0) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
            }

            result = namesBuilder.toString();
        }

        System.out.println("Hello, " + result + "!");
    }
}