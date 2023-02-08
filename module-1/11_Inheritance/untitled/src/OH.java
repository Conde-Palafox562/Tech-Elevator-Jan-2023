public class OH {

    // #####################
// Greeting.java
// #####################

    public interface Greeting {
        String getGreeting();
    }

// #####################
// English.java
// #####################

    public class English implements Greeting {
        public String getGreeting() {
            return "Hello!";
        }
    }

// #####################
// French.java
// #####################

    public class French implements Greeting {
        public String getGreeting() {
            return "Bonjour!";
        }
    }

// #####################
// Spanish.java
// #####################

    public class Spanish implements Greeting {
        public String getGreeting() {
            return "Hola!";
        }
    }

// #####################
// Demo.java
// #####################

    public class Demo {

        public void main(String[] args) {
            Greeting[] greetings =
                    new Greeting[] { new French(), new English(), new Spanish() };

            for(Greeting g : greetings ) {
                System.out.print( g.getGreeting() + " " );
            }
        }
    }
}
