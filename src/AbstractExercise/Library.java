package AbstractExercise;

import AbstractExercise.MediaSubClass.Ebook;

abstract public class Library {
    private String title;
    private int year;

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Library(String title, int year) {
        this.title = title;
        this.year=year;
    }

    protected abstract String getInfo();

    public static void main(String[] args) {
        Ebook book1 = new Ebook("To kill a mockingbird", 2023,"awd123");

        System.out.println(book1.getInfo());

    }

}
