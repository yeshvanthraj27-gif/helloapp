public class HelloApp {

    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length > 0) {

            // Join all names with comma and space
            String names = String.join(", ", args);

            // Print greeting with all names
            System.out.println("Hello, " + names + "!");
        } 
        else {

            // Default message when no argument is given
            System.out.println("Hello, World!");
        }

    }
}
