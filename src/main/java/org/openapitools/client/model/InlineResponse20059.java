/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.InlineResponse20056Emojis;

/**
 * InlineResponse20059
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20059 {
  public static final String SERIALIZED_NAME_EMOJIS = "emojis";
  @SerializedName(SERIALIZED_NAME_EMOJIS)
  private List<InlineResponse20056Emojis> emojis = null;

  public InlineResponse20059() { 
  }

  public InlineResponse20059 emojis(List<InlineResponse20056Emojis> emojis) {
    
    this.emojis = emojis;
    return this;
  }

  public InlineResponse20059 addEmojisItem(InlineResponse20056Emojis emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<InlineResponse20056Emojis>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

   /**
   * Get emojis
   * @return emojis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20056Emojis> getEmojis() {
    return emojis;
  }


  public void setEmojis(List<InlineResponse20056Emojis> emojis) {
    this.emojis = emojis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20059 inlineResponse20059 = (InlineResponse20059) o;
    return Objects.equals(this.emojis, inlineResponse20059.emojis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20059 {\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
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

