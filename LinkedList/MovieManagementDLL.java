class Movie {
    String title, director;
    int year;
    float rating;
    Movie prev, next;

    Movie(String title, String director, int year, float rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieManagementDLL {
    static Movie head = null, tail = null;

    public static void addMovie(String title, String director, int year, float rating) {
        Movie newNode = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public static void removeMovie(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
    }

    public static void updateRating(String title, float rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = rating;
                return;
            }
            temp = temp.next;
        }
    }

    public static void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director + " - " + temp.rating);
            temp = temp.next;
        }
    }

    public static void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director + " - " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        addMovie("Inception", "Nolan", 2010, 8.8f);
        addMovie("Interstellar", "Nolan", 2014, 8.6f);
        addMovie("Dunkirk", "Nolan", 2017, 7.5f);
        displayForward();
        updateRating("Dunkirk", 8.0f);
        removeMovie("Interstellar");
        System.out.println("After Update and Removal:");
        displayForward();
        System.out.println("Reverse:");
        displayReverse();
    }
}
