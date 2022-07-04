package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Antonym {

    @SerializedName("domains")
    @Expose
    private List<Domain__4> domains = null;


    @SerializedName("id")
    @Expose
    private String id;


    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("regions")
    @Expose
    private List<Region__6> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__6> registers = null;
    @SerializedName("text")
    @Expose
    private String text;

    public List<Domain__4> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__4> domains) {
        this.domains = domains;
    }

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

    public List<Region__6> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__6> regions) {
        this.regions = regions;
    }

    public List<Register__6> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__6> registers) {
        this.registers = registers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
