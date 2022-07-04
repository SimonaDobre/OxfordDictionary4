package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Construction {

    @SerializedName("domains")
    @Expose
    private List<Domain__5> domains = null;
    @SerializedName("examples")
    @Expose
    private List<List<String>> examples = null;
    @SerializedName("notes")
    @Expose
    private List<Note__1> notes = null;
    @SerializedName("regions")
    @Expose
    private List<Region__7> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__7> registers = null;
    @SerializedName("text")
    @Expose
    private String text;

    public List<Domain__5> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__5> domains) {
        this.domains = domains;
    }

    public List<List<String>> getExamples() {
        return examples;
    }

    public void setExamples(List<List<String>> examples) {
        this.examples = examples;
    }

    public List<Note__1> getNotes() {
        return notes;
    }

    public void setNotes(List<Note__1> notes) {
        this.notes = notes;
    }

    public List<Region__7> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__7> regions) {
        this.regions = regions;
    }

    public List<Register__7> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__7> registers) {
        this.registers = registers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
