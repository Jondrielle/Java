public class Interface101 implements Movie {
    private String genre;

    public static void main(String[] args){
        Interface101 movie1 = new Interface101();
        movie1.setGenre("action");
        movie1.watch();
    }

    @Override
    public void watch() {
        System.out.println("Lets watch an " + genre + " movie");
    }

    @Override
    public void setGenre(String genre){
        this.genre = genre;
    }
}
