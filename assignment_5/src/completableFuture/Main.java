package completableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        CompletableFuture<Void> user1 = service.addUser(new User("bala456", "bala@example.com"));
        CompletableFuture<Void> user2 = service.addUser(new User("arun123", "arun@example.com"));

        CompletableFuture<Void> person1 = service.addPerson(new Person("Bala", 25));
        CompletableFuture<Void> person2 = service.addPerson(new Person("Arun", 30));

        CompletableFuture.allOf(user1, user2, person1, person2).join();

        CompletableFuture<List<Person>> peopleFuture = service.fetchPeople();
        CompletableFuture<List<User>> usersFuture = service.fetchUsers();

        try {
            List<Person> people = peopleFuture.join();
            List<User> users = usersFuture.join();

            System.out.println("Fetched People: " + people);
            System.out.println("Fetched Users: " + users);
        } catch (CompletionException e) {
            e.printStackTrace();
        }
    }
}


