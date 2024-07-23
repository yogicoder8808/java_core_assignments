package completableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        // Adding users and persons
        CompletableFuture<Void> user1 = service.addUser(new User("bala456", "bala@example.com"));
        CompletableFuture<Void> user2 = service.addUser(new User("arun123", "arun@example.com"));

        CompletableFuture<Void> person1 = service.addPerson(new Person("Bala", 25));
        CompletableFuture<Void> person2 = service.addPerson(new Person("Arun", 30));

        // Waiting for all additions to complete
        CompletableFuture.allOf(user1, user2, person1, person2).join();

        // Fetching and display
        CompletableFuture<List<Person>> peopleFuture = service.fetchPeople();
        CompletableFuture<List<User>> usersFuture = service.fetchUsers();

        List<Person> people = peopleFuture.join();
        List<User> users = usersFuture.join();

        System.out.println("Fetched People: " + people);
        System.out.println("Fetched Users: " + users);
    }
}

