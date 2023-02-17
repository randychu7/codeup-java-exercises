package movies;

public class Movie {
    private String name;
    private String category;


    //Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }


    public Movie(String name, String category){
        this.name = name;
        this.category=category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
