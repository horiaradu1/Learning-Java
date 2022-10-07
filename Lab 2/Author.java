public class Author {

    private  String name;
    private int yearOfBirth;

    public Author (String n, int b){
        this.name = n;
        this.yearOfBirth = b;
    }

    public String getAuthorName(){
        return name;
    }

    public void setAuthorName(String name){
        this.name = name;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setYearOfBirth(int b){
        this.yearOfBirth = b;
    }
}