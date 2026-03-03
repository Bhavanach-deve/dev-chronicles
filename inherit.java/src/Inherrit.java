class Inherrit {
        Inherrit() {
            System.out.println("Base Constructor");
        }
    }
    class Derived extends Inherrit {
        Derived() {
            System.out.println("Derived Constructor");
        }
    }
    public class Main {
        public static void main(String[] args) {
            Derived obj = new Derived();
        }
    }
