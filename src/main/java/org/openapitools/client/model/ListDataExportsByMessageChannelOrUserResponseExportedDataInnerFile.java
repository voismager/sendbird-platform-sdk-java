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
 * ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile
 */
@JsonPropertyOrder({
  ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile.JSON_PROPERTY_URL,
  ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile.JSON_PROPERTY_EXPIRES_AT
})
@JsonTypeName("listDataExportsByMessageChannelOrUserResponse_exported_data_inner_file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private BigDecimal expiresAt;

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile() { 
  }

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile expiresAt(BigDecimal expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(BigDecimal expiresAt) {
    this.expiresAt = expiresAt;
  }


  /**
   * Return true if this listDataExportsByMessageChannelOrUserResponse_exported_data_inner_file object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile listDataExportsByMessageChannelOrUserResponseExportedDataInnerFile = (ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile) o;
    return Objects.equals(this.url, listDataExportsByMessageChannelOrUserResponseExportedDataInnerFile.url) &&
        Objects.equals(this.expiresAt, listDataExportsByMessageChannelOrUserResponseExportedDataInnerFile.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

