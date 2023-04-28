package com.example.dictionary.model;

public class Entry {

    String word;            // key
    String definition;      // value

    //constructors
    public Entry() {
    }

    public Entry(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    //getters
    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

    //setters
    public void setWord(String word) {
        this.word = word;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entry{");
        sb.append("word='").append(word).append('\'');
        sb.append(", definition='").append(definition).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
