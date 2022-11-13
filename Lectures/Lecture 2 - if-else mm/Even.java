
class Even {
    static void even() {
        int number = 42; // erstat med et andet tal...
        int evenOrOdd = number % 2;
        
        if (evenOrOdd == 0) {
         System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}