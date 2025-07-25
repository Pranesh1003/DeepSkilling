import java.util.*;

public class LibraryManagementSystem {

    static class Book {
        int bookId;
        String title;
        String author;

        public Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "BookID: " + bookId + ", Title: " + title + ", Author: " + author;
        }
    }

    public static Book linearSearchByTitle(List<Book> books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearchByTitle(List<Book> books, String targetTitle) {
        int low = 0, high = books.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);
            int compare = midBook.title.compareToIgnoreCase(targetTitle);

            if (compare == 0) {
                return midBook;
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        library.add(new Book(1, "Atomic Habits", "James Clear"));
        library.add(new Book(2, "The Psychology of Money", "Morgan Housel"));
        library.add(new Book(3, "The Power of your subconscious mind", "Joseph Murphy"));
        library.add(new Book(4, "The Alchemist", "Paulo Coelho"));

        library.sort(Comparator.comparing(b -> b.title.toLowerCase()));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title to search: ");
        String titleToSearch = scanner.nextLine();

        Book foundLinear = linearSearchByTitle(library, titleToSearch);
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not Found"));

        Book foundBinary = binarySearchByTitle(library, titleToSearch);
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}
