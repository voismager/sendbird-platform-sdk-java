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
 * AddHmsPushConfigurationResponsePushConfigurations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class AddHmsPushConfigurationResponsePushConfigurations {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PUSH_TYPE = "push_type";
  @SerializedName(SERIALIZED_NAME_PUSH_TYPE)
  private String pushType;

  public static final String SERIALIZED_NAME_HUAWEI_APP_ID = "huawei_app_id";
  @SerializedName(SERIALIZED_NAME_HUAWEI_APP_ID)
  private String huaweiAppId;

  public static final String SERIALIZED_NAME_HUAWEI_APP_SECRET = "huawei_app_secret";
  @SerializedName(SERIALIZED_NAME_HUAWEI_APP_SECRET)
  private String huaweiAppSecret;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public AddHmsPushConfigurationResponsePushConfigurations() { 
  }

  public AddHmsPushConfigurationResponsePushConfigurations id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AddHmsPushConfigurationResponsePushConfigurations pushType(String pushType) {
    
    this.pushType = pushType;
    return this;
  }

   /**
   * Get pushType
   * @return pushType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushType() {
    return pushType;
  }


  public void setPushType(String pushType) {
    this.pushType = pushType;
  }


  public AddHmsPushConfigurationResponsePushConfigurations huaweiAppId(String huaweiAppId) {
    
    this.huaweiAppId = huaweiAppId;
    return this;
  }

   /**
   * Get huaweiAppId
   * @return huaweiAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHuaweiAppId() {
    return huaweiAppId;
  }


  public void setHuaweiAppId(String huaweiAppId) {
    this.huaweiAppId = huaweiAppId;
  }


  public AddHmsPushConfigurationResponsePushConfigurations huaweiAppSecret(String huaweiAppSecret) {
    
    this.huaweiAppSecret = huaweiAppSecret;
    return this;
  }

   /**
   * Get huaweiAppSecret
   * @return huaweiAppSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHuaweiAppSecret() {
    return huaweiAppSecret;
  }


  public void setHuaweiAppSecret(String huaweiAppSecret) {
    this.huaweiAppSecret = huaweiAppSecret;
  }


  public AddHmsPushConfigurationResponsePushConfigurations pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushSound() {
    return pushSound;
  }


  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddHmsPushConfigurationResponsePushConfigurations addHmsPushConfigurationResponsePushConfigurations = (AddHmsPushConfigurationResponsePushConfigurations) o;
    return Objects.equals(this.id, addHmsPushConfigurationResponsePushConfigurations.id) &&
        Objects.equals(this.pushType, addHmsPushConfigurationResponsePushConfigurations.pushType) &&
        Objects.equals(this.huaweiAppId, addHmsPushConfigurationResponsePushConfigurations.huaweiAppId) &&
        Objects.equals(this.huaweiAppSecret, addHmsPushConfigurationResponsePushConfigurations.huaweiAppSecret) &&
        Objects.equals(this.pushSound, addHmsPushConfigurationResponsePushConfigurations.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pushType, huaweiAppId, huaweiAppSecret, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHmsPushConfigurationResponsePushConfigurations {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pushType: ").append(toIndentedString(pushType)).append("\n");
    sb.append("    huaweiAppId: ").append(toIndentedString(huaweiAppId)).append("\n");
    sb.append("    huaweiAppSecret: ").append(toIndentedString(huaweiAppSecret)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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

