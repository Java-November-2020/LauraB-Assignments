import java.util.HashMap;
import java.util.Set;

public class Hashmaptique{
    public static void main(String[] args){

        //Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();
        //Add in at least 4 songs that are stored by title
        trackList.put("How Can It Be", "I am guilty. Ashamed of what I've done, what I've become. These hands are dirty...");
        trackList.put("Salt and Light", "Oh the beauty of a King. You make righteous those who seek. You have written and redeemed my story.");
        trackList.put("You Say", "I keep fighting voices in my mind that say I'm not enough. Every single lie that tells me I will never measure up. Am I more than just the sum of every high and every low. Remind me once again just who I am because I need to know. Ooh-oh...");
        trackList.put("I am Yours", "I see Your fingerprints, the work of Your hands. It's all in Your hands, I see the evidence, Leaving nothing to chance, the world's in Your hands. So I rest in Your promises. Now I am sure of this, I'm Yours.");

        //Pull out one of the songs by its track title
        System.out.println("\nTASK 3 --> Pull out one of the songs by its track title --> Lyrics for 'You Say': \n");
        System.out.println(trackList.get("You Say"));

        System.out.println("\n********************************************************************************************\n");


        //Print out all the track names and lyrics in the format Track: Lyrics
        System.out.println("\nTASK 4 --> Print out all the track names and lyrics in the format --> Track: Lyrics: \n");
        for(HashMap.Entry<String, String> music : trackList.entrySet()){
            // System.out.println("Track: " + music.getKey());
            // System.out.println("Lyrics: " + music.getValue() + "\n");
            System.out.println(music.getKey() + ": " + music.getValue() + "\n");
        }
    }
}
