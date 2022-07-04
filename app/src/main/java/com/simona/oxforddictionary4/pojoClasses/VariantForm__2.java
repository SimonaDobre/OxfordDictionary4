package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VariantForm__2 {

    @SerializedName("domains")
    @Expose
    private List<Domain__14> domains = null;
    @SerializedName("notes")
    @Expose
    private List<Note__7> notes = null;
    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation__7> pronunciations = null;
    @SerializedName("regions")
    @Expose
    private List<Region__22> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__22> registers = null;
    @SerializedName("text")
    @Expose
    private String text;

    public List<Domain__14> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__14> domains) {
        this.domains = domains;
    }

    public List<Note__7> getNotes() {
        return notes;
    }

    public void setNotes(List<Note__7> notes) {
        this.notes = notes;
    }

    public List<Pronunciation__7> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation__7> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<Region__22> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__22> regions) {
        this.regions = regions;
    }

    public List<Register__22> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__22> registers) {
        this.registers = registers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
