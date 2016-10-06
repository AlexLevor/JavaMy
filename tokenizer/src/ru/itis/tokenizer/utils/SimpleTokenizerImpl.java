package ru.itis.tokenizer.utils;

import ru.itis.tokenizer.tokens.*;     // как соотносится эта строка и
import ru.itis.tokenizer.tokens.Token;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

/**
 * Created by user on 06.10.2016.
 */
public class SimpleTokenizerImpl implements Tokenizer {
    private String inputString;
    private String inputIntoToken="";
    @Override
    public List<Token> parse(String text) {
        List<Token> tokens = new ArrayList<>();
        this.inputString = text;
        int flag=0;
        for (int i=0; i<this.inputString.length();i++){
            while(Character.isLetter(this.inputString.charAt(i))== true) {
                inputIntoToken = inputIntoToken + this.inputString.charAt(i);
                i++;
                flag++;
            }
            if (flag>0) {
                Token token = new WordToken(i-flag, i, Tokens.WORD, inputIntoToken);
                tokens.add(token);
                flag=0;
                inputIntoToken="";
            }

            while(Character.isDigit(this.inputString.charAt(i))== true) {
                inputIntoToken = inputIntoToken + this.inputString.charAt(i);
                i++;
                flag++;

            }
            if (flag>0) {
                Token token = new WordToken(i-flag, i, Tokens.NUMBER, inputIntoToken);
                tokens.add(token);
                flag=0;
                inputIntoToken="";
            }
            if(Character.isSpaceChar(this.inputString.charAt(i))== false){
                inputIntoToken=inputIntoToken+this.inputString.charAt(i);
                Token token = new WordToken(i, i, Tokens.SYMBOL, inputIntoToken);
                tokens.add(token);
                inputIntoToken="";
            }
        }
        return tokens;
    }
}
