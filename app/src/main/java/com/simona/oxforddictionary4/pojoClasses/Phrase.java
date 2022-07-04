package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Phrase {

    @SerializedName("domains")
    @Expose
    private List<Domain__13> domains = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("regions")
    @Expose
    private List<Region__19> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__19> registers = null;
    @SerializedName("text")
    @Expose
    private String text;

    public List<Domain__13> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__13> domains) {
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

    public List<Region__19> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__19> regions) {
        this.regions = regions;
    }

    public List<Register__19> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__19> registers) {
        this.registers = registers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
