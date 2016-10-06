package ru.itis.tokenizer.tokens;

/**
 * Created by user on 05.10.2016.
 */
public interface Token {

    int start();

    int end();

    Tokens type();

    String content();
}
