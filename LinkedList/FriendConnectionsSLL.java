import java.util.*;

class User {
    int id;
    String name;
    int age;
    ArrayList<Integer> friends;
    User next;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }
}

public class FriendConnectionsSLL {
    static User head = null;

    public static void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    public static User findUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public static void addFriend(int uid1, int uid2) {
        User u1 = findUser(uid1);
        User u2 = findUser(uid2);
        if (u1 != null && u2 != null && !u1.friends.contains(uid2)) {
            u1.friends.add(uid2);
            u2.friends.add(uid1);
        }
    }

    public static void removeFriend(int uid1, int uid2) {
        User u1 = findUser(uid1);
        User u2 = findUser(uid2);
        if (u1 != null && u2 != null) {
            u1.friends.remove(Integer.valueOf(uid2));
            u2.friends.remove(Integer.valueOf(uid1));
        }
    }

    public static void mutualFriends(int uid1, int uid2) {
        User u1 = findUser(uid1), u2 = findUser(uid2);
        if (u1 != null && u2 != null) {
            System.out.print("Mutual Friends: ");
            for (int fid : u1.friends) {
                if (u2.friends.contains(fid)) System.out.print(fid + " ");
            }
            System.out.println();
        }
    }

    public static void displayFriends(int uid) {
        User user = findUser(uid);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friends);
        }
    }

    public static void searchUser(String keyword) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(keyword) || String.valueOf(temp.id).equals(keyword)) {
                System.out.println("User Found: " + temp.name + " (" + temp.id + ")");
            }
            temp = temp.next;
        }
    }

    public static void friendCounts() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends.");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addUser(1, "Alice", 22);
        addUser(2, "Bob", 23);
        addUser(3, "Charlie", 24);
        addFriend(1, 2);
        addFriend(1, 3);
        displayFriends(1);
        mutualFriends(2, 3);
        searchUser("Charlie");
        friendCounts();
    }
}
