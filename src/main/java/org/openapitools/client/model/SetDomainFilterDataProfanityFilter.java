/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SetDomainFilterDataProfanityFilterRegexFiltersInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SetDomainFilterDataProfanityFilter
 */
@JsonPropertyOrder({
  SetDomainFilterDataProfanityFilter.JSON_PROPERTY_KEYWORDS,
  SetDomainFilterDataProfanityFilter.JSON_PROPERTY_REGEX_FILTERS,
  SetDomainFilterDataProfanityFilter.JSON_PROPERTY_TYPE,
  SetDomainFilterDataProfanityFilter.JSON_PROPERTY_SHOULD_CHECK_GLOBAL
})
@JsonTypeName("setDomainFilterData_profanity_filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class SetDomainFilterDataProfanityFilter {
  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<String> keywords = null;

  public static final String JSON_PROPERTY_REGEX_FILTERS = "regex_filters";
  private List<SetDomainFilterDataProfanityFilterRegexFiltersInner> regexFilters = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_SHOULD_CHECK_GLOBAL = "should_check_global";
  private Boolean shouldCheckGlobal;

  public SetDomainFilterDataProfanityFilter() { 
  }

  public SetDomainFilterDataProfanityFilter keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public SetDomainFilterDataProfanityFilter addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public SetDomainFilterDataProfanityFilter regexFilters(List<SetDomainFilterDataProfanityFilterRegexFiltersInner> regexFilters) {
    this.regexFilters = regexFilters;
    return this;
  }

  public SetDomainFilterDataProfanityFilter addRegexFiltersItem(SetDomainFilterDataProfanityFilterRegexFiltersInner regexFiltersItem) {
    if (this.regexFilters == null) {
      this.regexFilters = new ArrayList<>();
    }
    this.regexFilters.add(regexFiltersItem);
    return this;
  }

   /**
   * Get regexFilters
   * @return regexFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGEX_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SetDomainFilterDataProfanityFilterRegexFiltersInner> getRegexFilters() {
    return regexFilters;
  }


  @JsonProperty(JSON_PROPERTY_REGEX_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegexFilters(List<SetDomainFilterDataProfanityFilterRegexFiltersInner> regexFilters) {
    this.regexFilters = regexFilters;
  }


  public SetDomainFilterDataProfanityFilter type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public SetDomainFilterDataProfanityFilter shouldCheckGlobal(Boolean shouldCheckGlobal) {
    this.shouldCheckGlobal = shouldCheckGlobal;
    return this;
  }

   /**
   * Get shouldCheckGlobal
   * @return shouldCheckGlobal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_CHECK_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldCheckGlobal() {
    return shouldCheckGlobal;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_CHECK_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldCheckGlobal(Boolean shouldCheckGlobal) {
    this.shouldCheckGlobal = shouldCheckGlobal;
  }


  /**
   * Return true if this setDomainFilterData_profanity_filter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDomainFilterDataProfanityFilter setDomainFilterDataProfanityFilter = (SetDomainFilterDataProfanityFilter) o;
    return Objects.equals(this.keywords, setDomainFilterDataProfanityFilter.keywords) &&
        Objects.equals(this.regexFilters, setDomainFilterDataProfanityFilter.regexFilters) &&
        Objects.equals(this.type, setDomainFilterDataProfanityFilter.type) &&
        Objects.equals(this.shouldCheckGlobal, setDomainFilterDataProfanityFilter.shouldCheckGlobal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, regexFilters, type, shouldCheckGlobal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDomainFilterDataProfanityFilter {\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    regexFilters: ").append(toIndentedString(regexFilters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shouldCheckGlobal: ").append(toIndentedString(shouldCheckGlobal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

