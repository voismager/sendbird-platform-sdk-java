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

/**
 * UpdateDefaultChannelInvitationPreferenceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class UpdateDefaultChannelInvitationPreferenceResponse {
  public static final String SERIALIZED_NAME_AUTO_ACCEPT = "auto_accept";
  @SerializedName(SERIALIZED_NAME_AUTO_ACCEPT)
  private Boolean autoAccept;

  public UpdateDefaultChannelInvitationPreferenceResponse() { 
  }

  public UpdateDefaultChannelInvitationPreferenceResponse autoAccept(Boolean autoAccept) {
    
    this.autoAccept = autoAccept;
    return this;
  }

   /**
   * Get autoAccept
   * @return autoAccept
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoAccept() {
    return autoAccept;
  }


  public void setAutoAccept(Boolean autoAccept) {
    this.autoAccept = autoAccept;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDefaultChannelInvitationPreferenceResponse updateDefaultChannelInvitationPreferenceResponse = (UpdateDefaultChannelInvitationPreferenceResponse) o;
    return Objects.equals(this.autoAccept, updateDefaultChannelInvitationPreferenceResponse.autoAccept);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAccept);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDefaultChannelInvitationPreferenceResponse {\n");
    sb.append("    autoAccept: ").append(toIndentedString(autoAccept)).append("\n");
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

