/**
 * Maintain a collection of song, movie, and book titles.
 * 
 * @author ckinnard
 * @version 3/5/16
 */
public class MediaLib
{
    public static void main()
    {
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song();
        System.out.println(song1);

        song1.setTitle("Johnny B. Goode");  
        System.out.println(song1.getTitle());
        song1.setRating(5);
        System.out.println(song1.getRating());

        Movie movie1 = new Movie();
        movie1.setTitle("Young Frankenstein");
        System.out.println(movie1.getTitle());
        movie1.setRating(5);
        System.out.println(movie1.getRating());

        Book book1 = new Book();
        book1.setTitle("To Kill A Mockingbird");
        System.out.println(book1.getTitle());
        book1.setRating(5);
        System.out.println(book1.getRating());
    }
}
    