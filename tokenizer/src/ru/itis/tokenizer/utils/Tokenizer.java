
package ru.itis.tokenizer.utils;

        import ru.itis.tokenizer.tokens.Token;

        import java.util.List;

/**
 * Created by user on 06.10.2016.
 */
public interface Tokenizer {

    List<Token> parse(String text);
}