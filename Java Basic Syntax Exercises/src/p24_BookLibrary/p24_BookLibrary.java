package p24_BookLibrary;

import java.util.*;

public class p24_BookLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Library library = new Library();

        Map<String, Double> authorsSum = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String title = input[0];
            String author = input[1];
            String publisher = input[2];
            String releaseDate = input[3];
            String isbn = input[4];
            double price = Double.parseDouble(input[5]);

            Book book = new Book(title, author, publisher, releaseDate, isbn, price);

            library.getBooks().add(book);
        }

        for (Book book : library.getBooks()) {
            if (authorsSum.containsKey(book.getAuthor())) {
                double oldValue = authorsSum.get(book.getAuthor());
                authorsSum.put(book.getAuthor(), oldValue + book.getPrice());
            } else {
                authorsSum.put(book.getAuthor(), book.getPrice());
            }
        }

        authorsSum.entrySet().stream().sorted((a, b) -> {
            int compareResult = Double.compare(b.getValue(), a.getValue());

            if (compareResult == 0) {
                compareResult = a.getKey().compareTo(b.getKey());
            }

            return compareResult;
        }).forEach(a -> System.out.printf("%s -> %.2f%n", a.getKey(), a.getValue()));
    }
}

class Book {
    private String title;
    private String author;
    private String publisher;
    private String releaseDate;
    private String isbn;
    private double price;

    Book(String title, String author, String publisher, String releaseDate, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.isbn = isbn;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class Library {

    private String author;
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    Library() {
        this.author = author;
        this.books = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }
}
