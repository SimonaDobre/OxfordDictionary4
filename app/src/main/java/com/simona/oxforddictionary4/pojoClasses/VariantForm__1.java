package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VariantForm__1 {

    @SerializedName("domains")
    @Expose
    private List<Domain__11> domains = null;
    @SerializedName("notes")
    @Expose
    private List<Note__5> notes = null;
    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation__5> pronunciations = null;
    @SerializedName("regions")
    @Expose
    private List<Region__17> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__17> registers = null;
    @SerializedName("text")
    @Expose
    private String text;

    public List<Domain__11> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__11> domains) {
        this.domains = domains;
    }

    public List<Note__5> getNotes() {
        return notes;
    }

    public void setNotes(List<Note__5> notes) {
        this.notes = notes;
    }

    public List<Pronunciation__5> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation__5> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<Region__17> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__17> regions) {
        this.regions = regions;
    }

    public List<Register__17> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__17> registers) {
        this.registers = registers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
