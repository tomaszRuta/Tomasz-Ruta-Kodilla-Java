package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MovieStore {

    Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> moviesTitlesWithTranslations = new HashMap<>();
        moviesTitlesWithTranslations.put("IM", ironManTranslations);
        moviesTitlesWithTranslations.put("AV", avengersTranslations);
        moviesTitlesWithTranslations.put("FL", flashTranslations);

        return moviesTitlesWithTranslations;
    }

    private static Map<String, List<String>> movies;

    public MovieStore() {
        movies = getMovies();
    }
}