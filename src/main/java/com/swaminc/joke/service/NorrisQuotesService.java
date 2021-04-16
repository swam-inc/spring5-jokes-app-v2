package com.swaminc.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class NorrisQuotesService implements QuoteService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;


    public NorrisQuotesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        String quote = chuckNorrisQuotes.getRandomQuote();
        return quote;
    }
}
