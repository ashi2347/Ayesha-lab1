class Task9{

    public static void main(String[] args) {
        String input;
        double num1, num2, result = 0;
        char operation;
        System.out.print("Enter the first number: ");
        input = System.console().readLine();
        num1 = Double.parseDouble(input);
        System.out.print("Enter the second number: ");
        input = System.console().readLine();
        num2 = Double.parseDouble(input);
        System.out.print("Enter the operation (+, -, *, /): ");
        input = System.console().readLine();
        operation = input.charAt(0);
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero.");
                return; // Exit the program
            }
        } else {
            System.out.println("Invalid operation!");
            return; // Exit the program
        }
        System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is: " + result);
    }
}