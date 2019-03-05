
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib{
   public static void main(String agrs[]){

       String[] sharingFriends = {("Jamal"),
                  ("Emily"),
                  ("Destiny"),
                  ("Mateo"),
                  ("Sofia")
    };
    for (int i = 0; i < 5; i++){
    System.out.println(sharingFriends[i]);
}
{
    int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
    int total = 0;
    for(int val: daysBtwnPurchase) {
        total = total + val;
    }
    
    Song[] topTenSongs = {
        new Song("Bad Boy"),
        new Song("thank u,Next"),
        new Song("My blood"),
        new Song("Let you love me"),
        new Song("I found you"),
        new Song("Smooth Criminal"),
        new Song("Beat it"),
        new Song("Billie Jean"),
        new Song( "Like a Rolling Stone"),
        new Song( "Dear Mama")
    };
    for(Song s: topTenSongs)
    {
        System.out.println(s.getTitle());
    }
    System.out.println("-BEFORE--");
    for(Song changeSong : topTenSongs){
        changeSong.setTitle("test");
    }
    System.out.println("-AFTER--");
    for (Song showSong : topTenSongs){
        System.out.println(showSong.getTitle());
    }
  }
}
}