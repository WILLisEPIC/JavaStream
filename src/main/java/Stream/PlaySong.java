package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class PlaySong {
    public static void main(String[] args) {
        List<Song> songs = new SongList().getSongs();
        //Rock Songs
        List<Song> rock = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .toList();
        System.out.println("Rock Songs");
        rock.forEach(song -> System.out.println("->"+song.getTitle()));

        //The Beatles' Songs
        List<Song> beatles = songs.stream()
                .filter(song -> song.getArtist().equals("The Beatles"))
                .toList();
        System.out.println("\nThe Beatles");
        beatles.forEach(song -> System.out.println("->"+song.getTitle()));

        //Start with <H>
        List<Song> startWithH = songs.stream()
                .filter(song -> song.getTitle().startsWith("H"))
                .toList();
        System.out.println("\nStart with H");
        startWithH.forEach(song -> System.out.println("->"+song.getTitle()));

        //Recent Than 1995
        List<Song> recent = songs.stream()
                .filter(song -> song.getYear() > 1995)
                .toList();
        System.out.println("\nRecent than 1995");
        recent.forEach(song -> System.out.println("->"+song.getTitle()));

        //List of genres based on play times
        Map<String, Integer> popularity = songs.stream()
                .collect(Collectors.groupingBy(
                        Song::getGenre,
                        Collectors.summingInt(Song::getTimesPlayed)
                ));
        System.out.println("\nTrying Map");
        popularity.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(entry ->
                System.out.println(entry.getKey() + " = " + entry.getValue())
        );

        //Collectors.joining()
        String cvs = songs.stream()
                .map(Song::getTitle)
                .collect(Collectors.joining(";"));
        System.out.println("\nCollectors.joining\n"+cvs);

        //other terminal operators
        System.out.println("\nTesting different terminal operators");
        boolean anyCheck = songs.stream()
                .anyMatch(song -> song.getGenre().equals("Rap"));
        System.out.println("anyMatch");
        System.out.println(anyCheck);

        Optional<Song> optionalSong = songs.stream()
                        .min(Comparator.comparingInt(Song::getYear));
        System.out.println("\nOptional/ max()");
        optionalSong.map(Song::getTitle).ifPresent(System.out::println);

        Optional<Integer> timesPlayedOptional = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .map(Song::getTimesPlayed)
                .reduce(Integer::sum);
        System.out.println("\nOptional/ reduce() (return Optional)");
        timesPlayedOptional.ifPresent(System.out::println);

        int timesPlayedInt = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .map(Song::getTimesPlayed)
                .reduce(0, Integer::sum);
        System.out.println("\nOptional/ reduce() (return Integer)");
        System.out.println(timesPlayedInt);
    }
}
