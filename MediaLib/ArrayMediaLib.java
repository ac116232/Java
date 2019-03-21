public class ArrayMediaLib{
   public static void main(String agrs[])
{
    int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
    int total = 0;
    int average;
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
    }
    System.out.println("-AFTER--");
    for (Song showSong : topTenSongs){
        System.out.println(showSong.getTitle());
    }
    int index = SongFinder.findTitle(topTenSongs, "Mack the Knife");
    if (index >=0 ) {
    System.out.println("Found " + topTenSongs[index].getTitle());
}
else  {
    System.out.println("Song not found!");
}
index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
if (index >= 0 ) {
    System.out.println("Discount found " + topTenSongs[index].getTitle());
}
else {
    System.out.println("No songs are discounted");
}
System.out.println("--Find last song --");
index = SongFinder.getIndexLastTitle(topTenSongs);
if (index >= 0 ) {
System.out.println("Last title: " + topTenSongs[index].getTitle());
}
else {
System.out.println("You have a blank title!");
}
}
}