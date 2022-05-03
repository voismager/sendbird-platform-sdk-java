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
 * AddApnsPushConfigurationResponsePushConfigurations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class AddApnsPushConfigurationResponsePushConfigurations {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PUSH_TYPE = "push_type";
  @SerializedName(SERIALIZED_NAME_PUSH_TYPE)
  private String pushType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_APNS_CER_ENV_TYPE = "apns_cer_env_type";
  @SerializedName(SERIALIZED_NAME_APNS_CER_ENV_TYPE)
  private String apnsCerEnvType;

  public static final String SERIALIZED_NAME_APNS_EXPIRATION = "apns_expiration";
  @SerializedName(SERIALIZED_NAME_APNS_EXPIRATION)
  private BigDecimal apnsExpiration;

  public static final String SERIALIZED_NAME_APNS_NAME = "apns_name";
  @SerializedName(SERIALIZED_NAME_APNS_NAME)
  private String apnsName;

  public static final String SERIALIZED_NAME_HAS_UNREAD_COUNT_BADGE = "has_unread_count_badge";
  @SerializedName(SERIALIZED_NAME_HAS_UNREAD_COUNT_BADGE)
  private BigDecimal hasUnreadCountBadge;

  public static final String SERIALIZED_NAME_CONTENT_AVAILABLE = "content_available";
  @SerializedName(SERIALIZED_NAME_CONTENT_AVAILABLE)
  private Boolean contentAvailable;

  public static final String SERIALIZED_NAME_MUTABLE_CONTENT = "mutable_content";
  @SerializedName(SERIALIZED_NAME_MUTABLE_CONTENT)
  private Boolean mutableContent;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public AddApnsPushConfigurationResponsePushConfigurations() { 
  }

  public AddApnsPushConfigurationResponsePushConfigurations id(String id) {
    
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


  public AddApnsPushConfigurationResponsePushConfigurations pushType(String pushType) {
    
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


  public AddApnsPushConfigurationResponsePushConfigurations createdAt(BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public AddApnsPushConfigurationResponsePushConfigurations apnsCerEnvType(String apnsCerEnvType) {
    
    this.apnsCerEnvType = apnsCerEnvType;
    return this;
  }

   /**
   * Get apnsCerEnvType
   * @return apnsCerEnvType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApnsCerEnvType() {
    return apnsCerEnvType;
  }


  public void setApnsCerEnvType(String apnsCerEnvType) {
    this.apnsCerEnvType = apnsCerEnvType;
  }


  public AddApnsPushConfigurationResponsePushConfigurations apnsExpiration(BigDecimal apnsExpiration) {
    
    this.apnsExpiration = apnsExpiration;
    return this;
  }

   /**
   * Get apnsExpiration
   * @return apnsExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getApnsExpiration() {
    return apnsExpiration;
  }


  public void setApnsExpiration(BigDecimal apnsExpiration) {
    this.apnsExpiration = apnsExpiration;
  }


  public AddApnsPushConfigurationResponsePushConfigurations apnsName(String apnsName) {
    
    this.apnsName = apnsName;
    return this;
  }

   /**
   * Get apnsName
   * @return apnsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApnsName() {
    return apnsName;
  }


  public void setApnsName(String apnsName) {
    this.apnsName = apnsName;
  }


  public AddApnsPushConfigurationResponsePushConfigurations hasUnreadCountBadge(BigDecimal hasUnreadCountBadge) {
    
    this.hasUnreadCountBadge = hasUnreadCountBadge;
    return this;
  }

   /**
   * Get hasUnreadCountBadge
   * @return hasUnreadCountBadge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getHasUnreadCountBadge() {
    return hasUnreadCountBadge;
  }


  public void setHasUnreadCountBadge(BigDecimal hasUnreadCountBadge) {
    this.hasUnreadCountBadge = hasUnreadCountBadge;
  }


  public AddApnsPushConfigurationResponsePushConfigurations contentAvailable(Boolean contentAvailable) {
    
    this.contentAvailable = contentAvailable;
    return this;
  }

   /**
   * Get contentAvailable
   * @return contentAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getContentAvailable() {
    return contentAvailable;
  }


  public void setContentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
  }


  public AddApnsPushConfigurationResponsePushConfigurations mutableContent(Boolean mutableContent) {
    
    this.mutableContent = mutableContent;
    return this;
  }

   /**
   * Get mutableContent
   * @return mutableContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMutableContent() {
    return mutableContent;
  }


  public void setMutableContent(Boolean mutableContent) {
    this.mutableContent = mutableContent;
  }


  public AddApnsPushConfigurationResponsePushConfigurations pushSound(String pushSound) {
    
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
    AddApnsPushConfigurationResponsePushConfigurations addApnsPushConfigurationResponsePushConfigurations = (AddApnsPushConfigurationResponsePushConfigurations) o;
    return Objects.equals(this.id, addApnsPushConfigurationResponsePushConfigurations.id) &&
        Objects.equals(this.pushType, addApnsPushConfigurationResponsePushConfigurations.pushType) &&
        Objects.equals(this.createdAt, addApnsPushConfigurationResponsePushConfigurations.createdAt) &&
        Objects.equals(this.apnsCerEnvType, addApnsPushConfigurationResponsePushConfigurations.apnsCerEnvType) &&
        Objects.equals(this.apnsExpiration, addApnsPushConfigurationResponsePushConfigurations.apnsExpiration) &&
        Objects.equals(this.apnsName, addApnsPushConfigurationResponsePushConfigurations.apnsName) &&
        Objects.equals(this.hasUnreadCountBadge, addApnsPushConfigurationResponsePushConfigurations.hasUnreadCountBadge) &&
        Objects.equals(this.contentAvailable, addApnsPushConfigurationResponsePushConfigurations.contentAvailable) &&
        Objects.equals(this.mutableContent, addApnsPushConfigurationResponsePushConfigurations.mutableContent) &&
        Objects.equals(this.pushSound, addApnsPushConfigurationResponsePushConfigurations.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pushType, createdAt, apnsCerEnvType, apnsExpiration, apnsName, hasUnreadCountBadge, contentAvailable, mutableContent, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddApnsPushConfigurationResponsePushConfigurations {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pushType: ").append(toIndentedString(pushType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    apnsCerEnvType: ").append(toIndentedString(apnsCerEnvType)).append("\n");
    sb.append("    apnsExpiration: ").append(toIndentedString(apnsExpiration)).append("\n");
    sb.append("    apnsName: ").append(toIndentedString(apnsName)).append("\n");
    sb.append("    hasUnreadCountBadge: ").append(toIndentedString(hasUnreadCountBadge)).append("\n");
    sb.append("    contentAvailable: ").append(toIndentedString(contentAvailable)).append("\n");
    sb.append("    mutableContent: ").append(toIndentedString(mutableContent)).append("\n");
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

