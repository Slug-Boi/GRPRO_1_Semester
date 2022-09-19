public class Dog {
    private String name;
    private int age;
    private String race;
    
    public Dog(String navn , int alder, String hundeRace) {
        name = navn;
        age = alder;
        race = hundeRace;
        
    
    }
    public class Main {
        public void main(String[] args) {
            Dog hund = new Dog("Fido", 4, "Labradoodle");
            hund.commandSit();
            hund.goForAWalk();
            }        
        }
    void commandSit() {
            System.out.println("Fido' sits down nicely");
        }
    void goForAWalk () {
            System.out.println("You and Fido go for a walk");
        }
    }
