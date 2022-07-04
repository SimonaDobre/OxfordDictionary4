package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LexicalEntry {

    @SerializedName("compounds")
    @Expose
    private List<Compound> compounds = null;


    @SerializedName("derivativeOf")
    @Expose
    private List<DerivativeOf> derivativeOf = null;


    @SerializedName("derivatives")
    @Expose
    private List<Derivative> derivatives = null;


    @SerializedName("entries")
    @Expose
    private List<Entry> entries = null;


    @SerializedName("grammaticalFeatures")
    @Expose
    private List<GrammaticalFeature__3> grammaticalFeatures = null;


    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("lexicalCategory")
    @Expose
    private LexicalCategory__2 lexicalCategory;
    @SerializedName("notes")
    @Expose
    private List<Note__6> notes = null;
    @SerializedName("phrasalVerbs")
    @Expose
    private List<PhrasalVerb> phrasalVerbs = null;
    @SerializedName("phrases")
    @Expose
    private List<Phrase> phrases = null;
    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation__6> pronunciations = null;
    @SerializedName("root")
    @Expose
    private String root;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("variantForms")
    @Expose
    private List<VariantForm__2> variantForms = null;




    public List<Compound> getCompounds() {
        return compounds;
    }

    public void setCompounds(List<Compound> compounds) {
        this.compounds = compounds;
    }

    public List<DerivativeOf> getDerivativeOf() {
        return derivativeOf;
    }

    public void setDerivativeOf(List<DerivativeOf> derivativeOf) {
        this.derivativeOf = derivativeOf;
    }

    public List<Derivative> getDerivatives() {
        return derivatives;
    }

    public void setDerivatives(List<Derivative> derivatives) {
        this.derivatives = derivatives;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public List<GrammaticalFeature__3> getGrammaticalFeatures() {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures(List<GrammaticalFeature__3> grammaticalFeatures) {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LexicalCategory__2 getLexicalCategory() {
        return lexicalCategory;
    }

    public void setLexicalCategory(LexicalCategory__2 lexicalCategory) {
        this.lexicalCategory = lexicalCategory;
    }

    public List<Note__6> getNotes() {
        return notes;
    }

    public void setNotes(List<Note__6> notes) {
        this.notes = notes;
    }

    public List<PhrasalVerb> getPhrasalVerbs() {
        return phrasalVerbs;
    }

    public void setPhrasalVerbs(List<PhrasalVerb> phrasalVerbs) {
        this.phrasalVerbs = phrasalVerbs;
    }

    public List<Phrase> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    public List<Pronunciation__6> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation__6> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<VariantForm__2> getVariantForms() {
        return variantForms;
    }

    public void setVariantForms(List<VariantForm__2> variantForms) {
        this.variantForms = variantForms;
    }

}
