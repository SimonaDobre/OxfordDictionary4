package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example__1 {

    @SerializedName("definitions")
    @Expose
    private List<String> definitions = null;


    @SerializedName("domains")
    @Expose
    private List<Domain__7> domains = null;


    @SerializedName("notes")
    @Expose
    private List<Note__2> notes = null;

    @SerializedName("regions")
    @Expose
    private List<Region__8> regions = null;


    @SerializedName("registers")
    @Expose
    private List<Register__8> registers = null;


    @SerializedName("senseIds")
    @Expose
    private List<String> senseIds = null;


    @SerializedName("text")
    @Expose
    private String text;



    public List<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<String> definitions) {
        this.definitions = definitions;
    }

    public List<Domain__7> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__7> domains) {
        this.domains = domains;
    }

    public List<Note__2> getNotes() {
        return notes;
    }

    public void setNotes(List<Note__2> notes) {
        this.notes = notes;
    }

    public List<Region__8> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__8> regions) {
        this.regions = regions;
    }

    public List<Register__8> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__8> registers) {
        this.registers = registers;
    }

    public List<String> getSenseIds() {
        return senseIds;
    }

    public void setSenseIds(List<String> senseIds) {
        this.senseIds = senseIds;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
