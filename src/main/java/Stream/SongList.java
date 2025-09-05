package Stream;

import java.util.List;

public class SongList {

    public List<Song> getSongs(){
        return List.of(
                new Song("Shape of You", "Ed Sheeran", "Pop", 2017, 520),
                new Song("Blinding Lights", "The Weeknd", "Synthwave", 2019, 610),
                new Song("Bohemian Rhapsody", "Queen", "Rock", 1975, 420),
                new Song("Someone Like You", "Adele", "Soul", 2011, 330),
                new Song("Smells Like Teen Spirit", "Nirvana", "Grunge", 1991, 380),
                new Song("Bad Guy", "Billie Eilish", "Pop", 2019, 290),
                new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars", "Funk", 2014, 410),
                new Song("Hotel California", "Eagles", "Rock", 1977, 350),
                new Song("Rolling in the Deep", "Adele", "Soul", 2010, 370),
                new Song("Stairway to Heaven", "Led Zeppelin", "Rock", 1971, 295),
                new Song("Levitating", "Dua Lipa", "Pop", 2020, 265),
                new Song("Thriller", "Michael Jackson", "Pop", 1982, 450),
                new Song("Thinking Out Loud", "Ed Sheeran", "Pop", 2014, 310),
                new Song("Lose Yourself", "Eminem", "Hip-Hop", 2002, 500),
                new Song("Hey Jude", "The Beatles", "Rock", 1968, 275),
                new Song("Halo", "Beyoncé", "R&B", 2008, 295),
                new Song("Shake It Off", "Taylor Swift", "Pop", 2014, 285),
                new Song("Wonderwall", "Oasis", "Britpop", 1995, 260),
                new Song("Poker Face", "Lady Gaga", "Pop", 2008, 305),
                new Song("Enter Sandman", "Metallica", "Metal", 1991, 340)
        );
    }
}
