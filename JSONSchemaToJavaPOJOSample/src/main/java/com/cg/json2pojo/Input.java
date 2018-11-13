
package com.cg.json2pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "sport",
    "age",
    "id",
    "lastScores"
})
public class Input {

    @JsonProperty("name")
    private String name;
    @JsonProperty("sport")
    private String sport;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("lastScores")
    private List<Integer> lastScores = new ArrayList<Integer>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Input withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("sport")
    public String getSport() {
        return sport;
    }

    @JsonProperty("sport")
    public void setSport(String sport) {
        this.sport = sport;
    }

    public Input withSport(String sport) {
        this.sport = sport;
        return this;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    public Input withAge(Integer age) {
        this.age = age;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Input withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("lastScores")
    public List<Integer> getLastScores() {
        return lastScores;
    }

    @JsonProperty("lastScores")
    public void setLastScores(List<Integer> lastScores) {
        this.lastScores = lastScores;
    }

    public Input withLastScores(List<Integer> lastScores) {
        this.lastScores = lastScores;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
