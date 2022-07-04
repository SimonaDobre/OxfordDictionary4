package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pronunciation__2 {

    @SerializedName("audioFile")
    @Expose
    private String audioFile;
    @SerializedName("dialects")
    @Expose
    private List<String> dialects = null;
    @SerializedName("phoneticNotation")
    @Expose
    private String phoneticNotation;
    @SerializedName("phoneticSpelling")
    @Expose
    private String phoneticSpelling;
    @SerializedName("regions")
    @Expose
    private List<Region__9> regions = null;
    @SerializedName("registers")
    @Expose
    private List<Register__9> registers = null;

    public String getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(String audioFile) {
        this.audioFile = audioFile;
    }

    public List<String> getDialects() {
        return dialects;
    }

    public void setDialects(List<String> dialects) {
        this.dialects = dialects;
    }

    public String getPhoneticNotation() {
        return phoneticNotation;
    }

    public void setPhoneticNotation(String phoneticNotation) {
        this.phoneticNotation = phoneticNotation;
    }

    public String getPhoneticSpelling() {
        return phoneticSpelling;
    }

    public void setPhoneticSpelling(String phoneticSpelling) {
        this.phoneticSpelling = phoneticSpelling;
    }

    public List<Region__9> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__9> regions) {
        this.regions = regions;
    }

    public List<Register__9> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__9> registers) {
        this.registers = registers;
    }

}
