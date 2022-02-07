import java.util.*;

public class CatDemo {
    public static void main(String[] args) throws InvalidAgeException {
        List<Cat> cats = new ArrayList<>(Arrays.asList(
            new Cat("Meowth", "Persian", 21),
            new Cat("Grumpy Cat", "Mixed", 5),
            new Cat("Grumpy Cat", "Mixed", 7),
            new Cat("Garfield", "Ginger Tobby", 39)
            
            
        ));

        System.out.print("Not Sorted:\n");
        for (Cat c : cats){
            if (c != null)
            {
                System.out.println(c);
            }
        }
        
        Collections.sort(cats);
        

        System.out.print("Sorted:\n");
        for (Cat c : cats){
            if (c != null)
            {
                System.out.println(c);
            }
        }

    }
    
}
