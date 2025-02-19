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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * UpdateExtraDataInMessageResponseSortedMetaarrayInner
 */
@JsonPropertyOrder({
  UpdateExtraDataInMessageResponseSortedMetaarrayInner.JSON_PROPERTY_VALUE,
  UpdateExtraDataInMessageResponseSortedMetaarrayInner.JSON_PROPERTY_KEY
})
@JsonTypeName("updateExtraDataInMessageResponse_sorted_metaarray_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class UpdateExtraDataInMessageResponseSortedMetaarrayInner {
  public static final String JSON_PROPERTY_VALUE = "value";
  private List<String> value = null;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public UpdateExtraDataInMessageResponseSortedMetaarrayInner() { 
  }

  public UpdateExtraDataInMessageResponseSortedMetaarrayInner value(List<String> value) {
    this.value = value;
    return this;
  }

  public UpdateExtraDataInMessageResponseSortedMetaarrayInner addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(List<String> value) {
    this.value = value;
  }


  public UpdateExtraDataInMessageResponseSortedMetaarrayInner key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * Return true if this updateExtraDataInMessageResponse_sorted_metaarray_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExtraDataInMessageResponseSortedMetaarrayInner updateExtraDataInMessageResponseSortedMetaarrayInner = (UpdateExtraDataInMessageResponseSortedMetaarrayInner) o;
    return Objects.equals(this.value, updateExtraDataInMessageResponseSortedMetaarrayInner.value) &&
        Objects.equals(this.key, updateExtraDataInMessageResponseSortedMetaarrayInner.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExtraDataInMessageResponseSortedMetaarrayInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

