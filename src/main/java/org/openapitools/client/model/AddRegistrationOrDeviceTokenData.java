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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * AddRegistrationOrDeviceTokenData
 */
@JsonPropertyOrder({
  AddRegistrationOrDeviceTokenData.JSON_PROPERTY_GCM_REG_TOKEN,
  AddRegistrationOrDeviceTokenData.JSON_PROPERTY_HUAWEI_DEVICE_TOKEN,
  AddRegistrationOrDeviceTokenData.JSON_PROPERTY_APNS_DEVICE_TOKEN
})
@JsonTypeName("addRegistrationOrDeviceTokenData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class AddRegistrationOrDeviceTokenData {
  public static final String JSON_PROPERTY_GCM_REG_TOKEN = "gcm_reg_token";
  private String gcmRegToken;

  public static final String JSON_PROPERTY_HUAWEI_DEVICE_TOKEN = "huawei_device_token";
  private String huaweiDeviceToken;

  public static final String JSON_PROPERTY_APNS_DEVICE_TOKEN = "apns_device_token";
  private String apnsDeviceToken;

  public AddRegistrationOrDeviceTokenData() { 
  }

  public AddRegistrationOrDeviceTokenData gcmRegToken(String gcmRegToken) {
    this.gcmRegToken = gcmRegToken;
    return this;
  }

   /**
   * Specifies a registration token for Firebase Cloud Messaging (formerly [Google Cloud Messaging](https://developers.google.com/cloud-messaging/)).
   * @return gcmRegToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a registration token for Firebase Cloud Messaging (formerly [Google Cloud Messaging](https://developers.google.com/cloud-messaging/)).")
  @JsonProperty(JSON_PROPERTY_GCM_REG_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGcmRegToken() {
    return gcmRegToken;
  }


  @JsonProperty(JSON_PROPERTY_GCM_REG_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGcmRegToken(String gcmRegToken) {
    this.gcmRegToken = gcmRegToken;
  }


  public AddRegistrationOrDeviceTokenData huaweiDeviceToken(String huaweiDeviceToken) {
    this.huaweiDeviceToken = huaweiDeviceToken;
    return this;
  }

   /**
   * Specifies a device token for Huawei Mobile Services.
   * @return huaweiDeviceToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a device token for Huawei Mobile Services.")
  @JsonProperty(JSON_PROPERTY_HUAWEI_DEVICE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHuaweiDeviceToken() {
    return huaweiDeviceToken;
  }


  @JsonProperty(JSON_PROPERTY_HUAWEI_DEVICE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHuaweiDeviceToken(String huaweiDeviceToken) {
    this.huaweiDeviceToken = huaweiDeviceToken;
  }


  public AddRegistrationOrDeviceTokenData apnsDeviceToken(String apnsDeviceToken) {
    this.apnsDeviceToken = apnsDeviceToken;
    return this;
  }

   /**
   * Specifies a device token for Apple Push Notification Service.
   * @return apnsDeviceToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a device token for Apple Push Notification Service.")
  @JsonProperty(JSON_PROPERTY_APNS_DEVICE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApnsDeviceToken() {
    return apnsDeviceToken;
  }


  @JsonProperty(JSON_PROPERTY_APNS_DEVICE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApnsDeviceToken(String apnsDeviceToken) {
    this.apnsDeviceToken = apnsDeviceToken;
  }


  /**
   * Return true if this addRegistrationOrDeviceTokenData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData = (AddRegistrationOrDeviceTokenData) o;
    return Objects.equals(this.gcmRegToken, addRegistrationOrDeviceTokenData.gcmRegToken) &&
        Objects.equals(this.huaweiDeviceToken, addRegistrationOrDeviceTokenData.huaweiDeviceToken) &&
        Objects.equals(this.apnsDeviceToken, addRegistrationOrDeviceTokenData.apnsDeviceToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcmRegToken, huaweiDeviceToken, apnsDeviceToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRegistrationOrDeviceTokenData {\n");
    sb.append("    gcmRegToken: ").append(toIndentedString(gcmRegToken)).append("\n");
    sb.append("    huaweiDeviceToken: ").append(toIndentedString(huaweiDeviceToken)).append("\n");
    sb.append("    apnsDeviceToken: ").append(toIndentedString(apnsDeviceToken)).append("\n");
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

