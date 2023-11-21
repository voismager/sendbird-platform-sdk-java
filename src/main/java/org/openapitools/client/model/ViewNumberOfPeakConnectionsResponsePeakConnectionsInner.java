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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ViewNumberOfPeakConnectionsResponsePeakConnectionsInner
 */
@JsonPropertyOrder({
  ViewNumberOfPeakConnectionsResponsePeakConnectionsInner.JSON_PROPERTY_DATE,
  ViewNumberOfPeakConnectionsResponsePeakConnectionsInner.JSON_PROPERTY_PEAK_CONNECTIONS
})
@JsonTypeName("viewNumberOfPeakConnectionsResponse_peak_connections_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class ViewNumberOfPeakConnectionsResponsePeakConnectionsInner {
  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_PEAK_CONNECTIONS = "peak_connections";
  private BigDecimal peakConnections;

  public ViewNumberOfPeakConnectionsResponsePeakConnectionsInner() { 
  }

  public ViewNumberOfPeakConnectionsResponsePeakConnectionsInner date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public ViewNumberOfPeakConnectionsResponsePeakConnectionsInner peakConnections(BigDecimal peakConnections) {
    this.peakConnections = peakConnections;
    return this;
  }

   /**
   * Get peakConnections
   * @return peakConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PEAK_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPeakConnections() {
    return peakConnections;
  }


  @JsonProperty(JSON_PROPERTY_PEAK_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeakConnections(BigDecimal peakConnections) {
    this.peakConnections = peakConnections;
  }


  /**
   * Return true if this viewNumberOfPeakConnectionsResponse_peak_connections_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfPeakConnectionsResponsePeakConnectionsInner viewNumberOfPeakConnectionsResponsePeakConnectionsInner = (ViewNumberOfPeakConnectionsResponsePeakConnectionsInner) o;
    return Objects.equals(this.date, viewNumberOfPeakConnectionsResponsePeakConnectionsInner.date) &&
        Objects.equals(this.peakConnections, viewNumberOfPeakConnectionsResponsePeakConnectionsInner.peakConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, peakConnections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfPeakConnectionsResponsePeakConnectionsInner {\n");
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

