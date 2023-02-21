package AbstractExercise.MediaSubClass;

import AbstractExercise.Library;

public class Ebook extends Library {
    private String serial;

    public String getSerial() {
        return serial;
    }

    public Ebook(String title, int year, String serial) {
        super(title,year);
        this.serial = serial;
    }

    @Override
    public String getInfo() {
       return String.format("The title is: " + getTitle() + "\nThe year is:" +getYear()+"\nThe serial is: " + getSerial()) ;
    }

}
