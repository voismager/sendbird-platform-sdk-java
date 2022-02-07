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
import java.math.BigDecimal;

/**
 * InlineResponse2009PeakConnections
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse2009PeakConnections {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_PEAK_CONNECTIONS = "peak_connections";
  @SerializedName(SERIALIZED_NAME_PEAK_CONNECTIONS)
  private BigDecimal peakConnections;

  public InlineResponse2009PeakConnections() { 
  }

  public InlineResponse2009PeakConnections date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public InlineResponse2009PeakConnections peakConnections(BigDecimal peakConnections) {
    
    this.peakConnections = peakConnections;
    return this;
  }

   /**
   * Get peakConnections
   * @return peakConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPeakConnections() {
    return peakConnections;
  }


  public void setPeakConnections(BigDecimal peakConnections) {
    this.peakConnections = peakConnections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009PeakConnections inlineResponse2009PeakConnections = (InlineResponse2009PeakConnections) o;
    return Objects.equals(this.date, inlineResponse2009PeakConnections.date) &&
        Objects.equals(this.peakConnections, inlineResponse2009PeakConnections.peakConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, peakConnections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009PeakConnections {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    peakConnections: ").append(toIndentedString(peakConnections)).append("\n");
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

