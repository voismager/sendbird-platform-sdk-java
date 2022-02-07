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
 * InlineResponse20065Bot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20065Bot {
  public static final String SERIALIZED_NAME_BOT_TOKEN = "bot_token";
  @SerializedName(SERIALIZED_NAME_BOT_TOKEN)
  private String botToken;

  public static final String SERIALIZED_NAME_BOT_PROFILE_URL = "bot_profile_url";
  @SerializedName(SERIALIZED_NAME_BOT_PROFILE_URL)
  private String botProfileUrl;

  public static final String SERIALIZED_NAME_BOT_USERID = "bot_userid";
  @SerializedName(SERIALIZED_NAME_BOT_USERID)
  private String botUserid;

  public static final String SERIALIZED_NAME_BOT_NICKNAME = "bot_nickname";
  @SerializedName(SERIALIZED_NAME_BOT_NICKNAME)
  private String botNickname;

  public static final String SERIALIZED_NAME_BOT_TYPE = "bot_type";
  @SerializedName(SERIALIZED_NAME_BOT_TYPE)
  private String botType;

  public static final String SERIALIZED_NAME_BOT_METADATA = "bot_metadata";
  @SerializedName(SERIALIZED_NAME_BOT_METADATA)
  private Object botMetadata;

  public InlineResponse20065Bot() { 
  }

  public InlineResponse20065Bot botToken(String botToken) {
    
    this.botToken = botToken;
    return this;
  }

   /**
   * Get botToken
   * @return botToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotToken() {
    return botToken;
  }


  public void setBotToken(String botToken) {
    this.botToken = botToken;
  }


  public InlineResponse20065Bot botProfileUrl(String botProfileUrl) {
    
    this.botProfileUrl = botProfileUrl;
    return this;
  }

   /**
   * Get botProfileUrl
   * @return botProfileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotProfileUrl() {
    return botProfileUrl;
  }


  public void setBotProfileUrl(String botProfileUrl) {
    this.botProfileUrl = botProfileUrl;
  }


  public InlineResponse20065Bot botUserid(String botUserid) {
    
    this.botUserid = botUserid;
    return this;
  }

   /**
   * Get botUserid
   * @return botUserid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotUserid() {
    return botUserid;
  }


  public void setBotUserid(String botUserid) {
    this.botUserid = botUserid;
  }


  public InlineResponse20065Bot botNickname(String botNickname) {
    
    this.botNickname = botNickname;
    return this;
  }

   /**
   * Get botNickname
   * @return botNickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotNickname() {
    return botNickname;
  }


  public void setBotNickname(String botNickname) {
    this.botNickname = botNickname;
  }


  public InlineResponse20065Bot botType(String botType) {
    
    this.botType = botType;
    return this;
  }

   /**
   * Get botType
   * @return botType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotType() {
    return botType;
  }


  public void setBotType(String botType) {
    this.botType = botType;
  }


  public InlineResponse20065Bot botMetadata(Object botMetadata) {
    
    this.botMetadata = botMetadata;
    return this;
  }

   /**
   * Get botMetadata
   * @return botMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBotMetadata() {
    return botMetadata;
  }


  public void setBotMetadata(Object botMetadata) {
    this.botMetadata = botMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20065Bot inlineResponse20065Bot = (InlineResponse20065Bot) o;
    return Objects.equals(this.botToken, inlineResponse20065Bot.botToken) &&
        Objects.equals(this.botProfileUrl, inlineResponse20065Bot.botProfileUrl) &&
        Objects.equals(this.botUserid, inlineResponse20065Bot.botUserid) &&
        Objects.equals(this.botNickname, inlineResponse20065Bot.botNickname) &&
        Objects.equals(this.botType, inlineResponse20065Bot.botType) &&
        Objects.equals(this.botMetadata, inlineResponse20065Bot.botMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botToken, botProfileUrl, botUserid, botNickname, botType, botMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20065Bot {\n");
    sb.append("    botToken: ").append(toIndentedString(botToken)).append("\n");
    sb.append("    botProfileUrl: ").append(toIndentedString(botProfileUrl)).append("\n");
    sb.append("    botUserid: ").append(toIndentedString(botUserid)).append("\n");
    sb.append("    botNickname: ").append(toIndentedString(botNickname)).append("\n");
    sb.append("    botType: ").append(toIndentedString(botType)).append("\n");
    sb.append("    botMetadata: ").append(toIndentedString(botMetadata)).append("\n");
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

