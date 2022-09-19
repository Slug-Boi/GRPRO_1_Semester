public class TraceOpg {
    static void start() { // <-- START HER!!!
        System.out.print(0);
        int number = randomNumber();
        System.out.print(1);
        int otherNumber = 0;
        System.out.print(2);
        if (number > 5) {
            System.out.print(3);
            otherNumber = veryImportantMethod();
            System.out.print(4);
        } else {
            System.out.print(5);
            otherNumber = otherImportantMethod();
            System.out.print(6);
        }
        System.out.print(7);
        System.out.println(otherNumber);
    }
        static int randomNumber() {
            System.out.print("A");
            return 5; // helt tilfældigt valgt!
            //System.out.print("B");
        }
        static int veryImportantMethod() {
            System.out.print("C");
            return newRandomNumber();
            //System.out.print("D");
        }
        static int otherImportantMethod() {
            System.out.print("E");
            int number = veryImportantMethod();
            System.out.print("F");
            return number;
            //System.out.print("G");
        }  
        static int newRandomNumber() {
            System.out.print("H");
            return 6; // også helt tilfældigt valgt!
            //System.out.println("I");
        }
    }
