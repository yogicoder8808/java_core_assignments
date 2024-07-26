package completableFuture;
import java.util.*;
import java.util.concurrent.CompletableFuture;

public class Service {
    private final List<Person> people = new ArrayList<>();
    private final List<User> users = new ArrayList<>();

    public CompletableFuture<Void> addPerson(Person person) {
        return CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            people.add(person);
            System.out.println("Added person: " + person);
        });
    }

    public CompletableFuture<Void> addUser(User user) {
        return CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            users.add(user);
            System.out.println("Added user: " + user);
        });
    }

    public CompletableFuture<List<Person>> fetchPeople() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return new ArrayList<>(people);
        });
    }

    public CompletableFuture<List<User>> fetchUsers() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return new ArrayList<>(users);
        });
    }
}

