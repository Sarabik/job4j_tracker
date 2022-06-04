package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Книга джунглей", 231);
        Book book2 = new Book("Властелин колец", 639);
        Book book3 = new Book("Clean code", 453);
        Book book4 = new Book("Унесенные ветром", 278);
        Book[] library = {book1, book2, book3, book4};
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].getName() + ": " + library[i].getPageCount() + " стр.");
        }
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].getName() + ": " + library[i].getPageCount() + " стр.");
        }
        for (Book book : library) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + ": " + book.getPageCount() + " стр.");
            }
        }
    }
}
