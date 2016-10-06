package ru.itis.tokenizer.tokens;

/**
 * Created by user on 06.10.2016.
 */
public class WordToken extends TokenImpl {
    public WordToken(int start, int end, Tokens type, String content) {
        this.start = start;
        this.end = end;
        this.type = type;
        this.content = content;
    }

    public String toString() {
        return super.toString() + ", ClassName of WordToken: " + this.getClass().getName();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !this.getClass().equals(object.getClass())) {
            return false;
        } else {
            WordToken that = (WordToken)object;
            return this.start == that.start
                    && this.end == that.end
                    && this.content.equals(that.content)
                    && this.type.equals(that.type);
        }
    }
}
