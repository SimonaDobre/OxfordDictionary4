package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VariantForm {

    @SerializedName("domains")
    @Expose
    private List<Domain__10> domains = null;
    @SerializedName("notes")
    @Expose
    private List<Note__4> notes = null;
    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation__4> pronunciations = null;
    @SerializedName("regions")
    @Expose
    private List<Region__15> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__15> registers = null;
    @SerializedName("text")
    @Expose
    private String text;

    public List<Domain__10> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__10> domains) {
        this.domains = domains;
    }

    public List<Note__4> getNotes() {
        return notes;
    }

    public void setNotes(List<Note__4> notes) {
        this.notes = notes;
    }

    public List<Pronunciation__4> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation__4> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<Region__15> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__15> regions) {
        this.regions = regions;
    }

    public List<Register__15> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__15> registers) {
        this.registers = registers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
