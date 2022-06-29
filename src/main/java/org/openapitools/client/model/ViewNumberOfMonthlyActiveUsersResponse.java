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
 * ViewNumberOfMonthlyActiveUsersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T11:00:21.022543+01:00[Europe/London]")
public class ViewNumberOfMonthlyActiveUsersResponse {
  public static final String SERIALIZED_NAME_MAU = "mau";
  @SerializedName(SERIALIZED_NAME_MAU)
  private BigDecimal mau;

  public ViewNumberOfMonthlyActiveUsersResponse() { 
  }

  public ViewNumberOfMonthlyActiveUsersResponse mau(BigDecimal mau) {
    
    this.mau = mau;
    return this;
  }

   /**
   * Get mau
   * @return mau
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMau() {
    return mau;
  }


  public void setMau(BigDecimal mau) {
    this.mau = mau;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfMonthlyActiveUsersResponse viewNumberOfMonthlyActiveUsersResponse = (ViewNumberOfMonthlyActiveUsersResponse) o;
    return Objects.equals(this.mau, viewNumberOfMonthlyActiveUsersResponse.mau);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mau);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfMonthlyActiveUsersResponse {\n");
    sb.append("    mau: ").append(toIndentedString(mau)).append("\n");
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

