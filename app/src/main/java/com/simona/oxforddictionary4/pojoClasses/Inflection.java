package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Inflection {

    @SerializedName("domains")
    @Expose
    private List<Domain__3> domains = null;
    @SerializedName("grammaticalFeatures")
    @Expose
    private List<GrammaticalFeature__1> grammaticalFeatures = null;
    @SerializedName("inflectedForm")
    @Expose
    private String inflectedForm;
    @SerializedName("lexicalCategory")
    @Expose
    private LexicalCategory lexicalCategory;
    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation> pronunciations = null;
    @SerializedName("regions")
    @Expose
    private List<Region__4> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__4> registers = null;

    public List<Domain__3> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__3> domains) {
        this.domains = domains;
    }

    public List<GrammaticalFeature__1> getGrammaticalFeatures() {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures(List<GrammaticalFeature__1> grammaticalFeatures) {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public String getInflectedForm() {
        return inflectedForm;
    }

    public void setInflectedForm(String inflectedForm) {
        this.inflectedForm = inflectedForm;
    }

    public LexicalCategory getLexicalCategory() {
        return lexicalCategory;
    }

    public void setLexicalCategory(LexicalCategory lexicalCategory) {
        this.lexicalCategory = lexicalCategory;
    }

    public List<Pronunciation> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<Region__4> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__4> regions) {
        this.regions = regions;
    }

    public List<Register__4> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__4> registers) {
        this.registers = registers;
    }


}
