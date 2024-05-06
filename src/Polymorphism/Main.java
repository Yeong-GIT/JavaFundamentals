package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Movie theMovie1 = new Adventure("Star Wars");
        theMovie1.watchMovie();

        Movie theMovie2 = new Comedy("Happy Wars");
        theMovie2.watchMovie();

        Movie theMovie3 = new ScienceFiction("Science Wars");
        theMovie3.watchMovie();
    }
}
