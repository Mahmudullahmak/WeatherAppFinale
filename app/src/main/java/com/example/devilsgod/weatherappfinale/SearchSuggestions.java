package com.example.devilsgod.weatherappfinale;

/**
 * Created by Devils God on 1/8/2018.
 */

import android.content.SearchRecentSuggestionsProvider;



public class SearchSuggestions extends SearchRecentSuggestionsProvider {
    public static final String AUTHORITY ="com.example.devilsgod.weatherappfinale.SearchSuggestions";
    public static final int MODE = DATABASE_MODE_QUERIES;

    public SearchSuggestions() {
        setupSuggestions(AUTHORITY,MODE);
    }
}
