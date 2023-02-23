package AbstractExercise.MediaSubClass;

import AbstractExercise.Library;

public class Ebook extends Library {

    @Override
    protected String useCase() {
        return String.format("Read on tablet");
    }
}
