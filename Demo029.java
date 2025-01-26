import java.util.ArrayList;

public class Demo029 {
    public static void main(String[] args) {
        // Create an ArrayList to store the names of friends
        ArrayList<String> friends = new ArrayList<>();

        // Add 10 friends' names to the ArrayList
        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");
        friends.add("Diana");
        friends.add("Ethan");
        friends.add("Fiona");
        friends.add("George");
        friends.add("Hannah");
        friends.add("Ian");
        friends.add("Julia");

        // Print the names of all friends
        System.out.println("List of Friends:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}

