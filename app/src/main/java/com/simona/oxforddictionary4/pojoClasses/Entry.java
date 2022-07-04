package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Entry {
    @SerializedName("crossReferenceMarkers")
    @Expose
    private List<String> crossReferenceMarkers = null;


    @SerializedName("crossReferences")
    @Expose
    private List<CrossReference> crossReferences = null;


    @SerializedName("etymologies")
    @Expose
    private List<String> etymologies = null;


    @SerializedName("grammaticalFeatures")
    @Expose
    private List<GrammaticalFeature> grammaticalFeatures = null;


    @SerializedName("homographNumber")
    @Expose
    private String homographNumber;


    @SerializedName("inflections")
    @Expose
    private List<Inflection> inflections = null;


    @SerializedName("notes")
    @Expose
    private List<Note> notes = null;


    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation__1> pronunciations = null;


    @SerializedName("senses")
    @Expose
    private List<Sense> senses = null;


    @SerializedName("variantForms")
    @Expose
    private List<VariantForm__1> variantForms = null;



    public List<String> getCrossReferenceMarkers() {
        return crossReferenceMarkers;
    }

    public void setCrossReferenceMarkers(List<String> crossReferenceMarkers) {
        this.crossReferenceMarkers = crossReferenceMarkers;
    }

    public List<CrossReference> getCrossReferences() {
        return crossReferences;
    }

    public void setCrossReferences(List<CrossReference> crossReferences) {
        this.crossReferences = crossReferences;
    }

    public List<String> getEtymologies() {
        return etymologies;
    }

    public void setEtymologies(List<String> etymologies) {
        this.etymologies = etymologies;
    }

    public List<GrammaticalFeature> getGrammaticalFeatures() {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures(List<GrammaticalFeature> grammaticalFeatures) {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public String getHomographNumber() {
        return homographNumber;
    }

    public void setHomographNumber(String homographNumber) {
        this.homographNumber = homographNumber;
    }

    public List<Inflection> getInflections() {
        return inflections;
    }

    public void setInflections(List<Inflection> inflections) {
        this.inflections = inflections;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Pronunciation__1> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation__1> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<Sense> getSenses() {
        return senses;
    }

    public void setSenses(List<Sense> senses) {
        this.senses = senses;
    }

    public List<VariantForm__1> getVariantForms() {
        return variantForms;
    }

    public void setVariantForms(List<VariantForm__1> variantForms) {
        this.variantForms = variantForms;
    }

}
