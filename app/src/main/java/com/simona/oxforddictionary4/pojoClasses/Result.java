package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("id")
    @Expose
    private String id;


    @SerializedName("language")
    @Expose
    private String language;


    @SerializedName("lexicalEntries")
    @Expose
    private List<LexicalEntry> lexicalEntries = null;


    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation__8> pronunciations = null;


    @SerializedName("type")
    @Expose
    private String type;


    @SerializedName("word")
    @Expose
    private String word;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<LexicalEntry> getLexicalEntries() {
        return lexicalEntries;
    }

    public void setLexicalEntries(List<LexicalEntry> lexicalEntries) {
        this.lexicalEntries = lexicalEntries;
    }

    public List<Pronunciation__8> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation__8> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
