package com.silvers.spring5jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes(); // not recommended way
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
