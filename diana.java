import java.util.LinkedList;

public class diana {

    public static void main(String[] args) {
        LinkedList<String> person = new LinkedList<>();

// insertion
        person.add("Diana");
        person.addFirst("Pusang naliligo");
        person.addLast("Mariel");
        person.add(1, "Sopia");

        System.out.println("Linked List Original: " + person);
        System.out.println(person.size());

//  Seraching  
        if (person.contains("Sopia")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = person.contains("Sopia");
        System.out.println(containslion);

//        Deletion
//        animals.remove();
//        animals.removeFirst();
//        animals.removeLast();
//        animals.remove(2);
//        System.out.println("LinkedList After Deletion: " + animals);
//        Insertion:    add(); addFirst();  addLast();  add(index, data);
//         Deletion:    remove();   removeFirst();  removeLast(); remove(index);
//          Searching operation:        contains(element); size();
    }

}
