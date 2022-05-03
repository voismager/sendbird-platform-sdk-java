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

/**
 * GcRegisterOperatorsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class GcRegisterOperatorsResponse {
  public static final String SERIALIZED_NAME_OPERATOR_IDS = "operator_ids";
  @SerializedName(SERIALIZED_NAME_OPERATOR_IDS)
  private List<String> operatorIds = null;

  public GcRegisterOperatorsResponse() { 
  }

  public GcRegisterOperatorsResponse operatorIds(List<String> operatorIds) {
    
    this.operatorIds = operatorIds;
    return this;
  }

  public GcRegisterOperatorsResponse addOperatorIdsItem(String operatorIdsItem) {
    if (this.operatorIds == null) {
      this.operatorIds = new ArrayList<String>();
    }
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Get operatorIds
   * @return operatorIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOperatorIds() {
    return operatorIds;
  }


  public void setOperatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcRegisterOperatorsResponse gcRegisterOperatorsResponse = (GcRegisterOperatorsResponse) o;
    return Objects.equals(this.operatorIds, gcRegisterOperatorsResponse.operatorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcRegisterOperatorsResponse {\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
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

