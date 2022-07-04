package com.simona.oxforddictionary4.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sense {

    @SerializedName("antonyms")
    @Expose
    private List<Antonym> antonyms = null;


    @SerializedName("constructions")
    @Expose
    private List<Construction> constructions = null;


    @SerializedName("crossReferenceMarkers")
    @Expose
    private List<String> crossReferenceMarkers = null;


    @SerializedName("crossReferences")
    @Expose
    private List<CrossReference__1> crossReferences = null;


    @SerializedName("definitions")
    @Expose
    private List<String> definitions = null;


    @SerializedName("domainClasses")
    @Expose
    private List<DomainClass> domainClasses = null;


    @SerializedName("domains")
    @Expose
    private List<Domain__6> domains = null;


    @SerializedName("etymologies")
    @Expose
    private List<String> etymologies = null;


    @SerializedName("examples")
    @Expose
    private List<Example__1> examples = null;


    @SerializedName("id")
    @Expose
    private String id;


    @SerializedName("inflections")
    @Expose
    private List<Inflection__1> inflections = null;


    @SerializedName("notes")
    @Expose
    private List<Note__3> notes = null;


    @SerializedName("pronunciations")
    @Expose
    private List<Pronunciation__3> pronunciations = null;


    @SerializedName("regions")
    @Expose
    private List<Region__12> regions = null;


    @SerializedName("registers")
    @Expose
    private List<Register__12> registers = null;


    @SerializedName("semanticClasses")
    @Expose
    private List<SemanticClass> semanticClasses = null;


    @SerializedName("shortDefinitions")
    @Expose
    private List<String> shortDefinitions = null;


    @SerializedName("subsenses")
    @Expose
    private List<Subsense> subsenses = null;


    @SerializedName("synonyms")
    @Expose
    private List<Synonym> synonyms = null;


    @SerializedName("thesaurusLinks")
    @Expose
    private List<ThesaurusLink> thesaurusLinks = null;


    @SerializedName("variantForms")
    @Expose
    private List<VariantForm> variantForms = null;



    public List<Antonym> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(List<Antonym> antonyms) {
        this.antonyms = antonyms;
    }

    public List<Construction> getConstructions() {
        return constructions;
    }

    public void setConstructions(List<Construction> constructions) {
        this.constructions = constructions;
    }

    public List<String> getCrossReferenceMarkers() {
        return crossReferenceMarkers;
    }

    public void setCrossReferenceMarkers(List<String> crossReferenceMarkers) {
        this.crossReferenceMarkers = crossReferenceMarkers;
    }

    public List<CrossReference__1> getCrossReferences() {
        return crossReferences;
    }

    public void setCrossReferences(List<CrossReference__1> crossReferences) {
        this.crossReferences = crossReferences;
    }

    public List<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<String> definitions) {
        this.definitions = definitions;
    }

    public List<DomainClass> getDomainClasses() {
        return domainClasses;
    }

    public void setDomainClasses(List<DomainClass> domainClasses) {
        this.domainClasses = domainClasses;
    }

    public List<Domain__6> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain__6> domains) {
        this.domains = domains;
    }

    public List<String> getEtymologies() {
        return etymologies;
    }

    public void setEtymologies(List<String> etymologies) {
        this.etymologies = etymologies;
    }

    public List<Example__1> getExamples() {
        return examples;
    }

    public void setExamples(List<Example__1> examples) {
        this.examples = examples;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Inflection__1> getInflections() {
        return inflections;
    }

    public void setInflections(List<Inflection__1> inflections) {
        this.inflections = inflections;
    }

    public List<Note__3> getNotes() {
        return notes;
    }

    public void setNotes(List<Note__3> notes) {
        this.notes = notes;
    }

    public List<Pronunciation__3> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation__3> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<Region__12> getRegions() {
        return regions;
    }

    public void setRegions(List<Region__12> regions) {
        this.regions = regions;
    }

    public List<Register__12> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register__12> registers) {
        this.registers = registers;
    }

    public List<SemanticClass> getSemanticClasses() {
        return semanticClasses;
    }

    public void setSemanticClasses(List<SemanticClass> semanticClasses) {
        this.semanticClasses = semanticClasses;
    }

    public List<String> getShortDefinitions() {
        return shortDefinitions;
    }

    public void setShortDefinitions(List<String> shortDefinitions) {
        this.shortDefinitions = shortDefinitions;
    }

    public List<Subsense> getSubsenses() {
        return subsenses;
    }

    public void setSubsenses(List<Subsense> subsenses) {
        this.subsenses = subsenses;
    }

    public List<Synonym> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<Synonym> synonyms) {
        this.synonyms = synonyms;
    }

    public List<ThesaurusLink> getThesaurusLinks() {
        return thesaurusLinks;
    }

    public void setThesaurusLinks(List<ThesaurusLink> thesaurusLinks) {
        this.thesaurusLinks = thesaurusLinks;
    }

    public List<VariantForm> getVariantForms() {
        return variantForms;
    }

    public void setVariantForms(List<VariantForm> variantForms) {
        this.variantForms = variantForms;
    }
}
