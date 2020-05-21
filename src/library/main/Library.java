package library.main;

import library.books.Fiction;
import library.books.NonFiction;
import library.enums.BookTypes;
import library.libraryitems.Book;
import library.enums.SubscriptionPeriods;
import library.periodicals.Newspaper;

public class Library {

    public static void main(String[] args) {
        Book harryPotter1 = new Book("Harry Potter", 1, 5, 1.99,
                true, 2003, 543, "Hard",
                "J. K. Rowling", "Scholastic Press", BookTypes.NOVEL);
        System.out.println(harryPotter1.toString());

        Fiction harryPotter2 = new Fiction("Harry Potter", 2, 5, 1.99,
                true, 2003, 543, "Hard",
                "J. K. Rowling", "Scholastic Press", BookTypes.NOVEL, "Adventure/Fantasy");
        System.out.println(harryPotter2.getGenre());

        Newspaper newsAndObserver = new Newspaper("Harry Potter", 3, 5, 1.99,
                true, SubscriptionPeriods.DAILY, true, 15);
        newsAndObserver.isItBlackAndWhite();

        NonFiction dictionary = new NonFiction("Dictionary", 4, 7, 2.99,
                true, 1999, 888, "Hard", "Merriam-Webster",
                "Merriam-Webster", BookTypes.DICTIONARY, "English");
        System.out.println(dictionary.getBookTypes());
    }
}
