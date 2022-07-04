package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Inflection__1 {

    @SerializedName("domains")
    @Expose
    private List<Domain__8> domains = null;
    @SerializedName("grammaticalFeatures")
    @Expose
    private List<GrammaticalFeature__2> grammaticalFeatures = null;
    @SerializedName("inflectedForm")
    @Expose
    private String inflectedForm;
    @SerializedName("lexicalCategory")
    @Expose
    private LexicalCategory__1 lexicalCategory;
    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation__2> pronunciations = null;
    @SerializedName("regions")
    @Expose
    private List<Region__10> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__10> registers = null;

    public List<Domain__8> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__8> domains) {
        this.domains = domains;
    }

    public List<GrammaticalFeature__2> getGrammaticalFeatures() {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures(List<GrammaticalFeature__2> grammaticalFeatures) {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public String getInflectedForm() {
        return inflectedForm;
    }

    public void setInflectedForm(String inflectedForm) {
        this.inflectedForm = inflectedForm;
    }

    public LexicalCategory__1 getLexicalCategory() {
        return lexicalCategory;
    }

    public void setLexicalCategory(LexicalCategory__1 lexicalCategory) {
        this.lexicalCategory = lexicalCategory;
    }

    public List<Pronunciation__2> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation__2> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<Region__10> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__10> regions) {
        this.regions = regions;
    }

    public List<Register__10> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__10> registers) {
        this.registers = registers;
    }


}
