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
 * CreateBotResponseBot
 */
@JsonPropertyOrder({
  CreateBotResponseBot.JSON_PROPERTY_BOT_TOKEN,
  CreateBotResponseBot.JSON_PROPERTY_BOT_PROFILE_URL,
  CreateBotResponseBot.JSON_PROPERTY_BOT_USERID,
  CreateBotResponseBot.JSON_PROPERTY_BOT_NICKNAME,
  CreateBotResponseBot.JSON_PROPERTY_BOT_TYPE,
  CreateBotResponseBot.JSON_PROPERTY_BOT_METADATA
})
@JsonTypeName("createBotResponse_bot")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class CreateBotResponseBot {
  public static final String JSON_PROPERTY_BOT_TOKEN = "bot_token";
  private String botToken;

  public static final String JSON_PROPERTY_BOT_PROFILE_URL = "bot_profile_url";
  private String botProfileUrl;

  public static final String JSON_PROPERTY_BOT_USERID = "bot_userid";
  private String botUserid;

  public static final String JSON_PROPERTY_BOT_NICKNAME = "bot_nickname";
  private String botNickname;

  public static final String JSON_PROPERTY_BOT_TYPE = "bot_type";
  private String botType;

  public static final String JSON_PROPERTY_BOT_METADATA = "bot_metadata";
  private Object botMetadata;

  public CreateBotResponseBot() { 
  }

  public CreateBotResponseBot botToken(String botToken) {
    this.botToken = botToken;
    return this;
  }

   /**
   * Get botToken
   * @return botToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBotToken() {
    return botToken;
  }


  @JsonProperty(JSON_PROPERTY_BOT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBotToken(String botToken) {
    this.botToken = botToken;
  }


  public CreateBotResponseBot botProfileUrl(String botProfileUrl) {
    this.botProfileUrl = botProfileUrl;
    return this;
  }

   /**
   * Get botProfileUrl
   * @return botProfileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOT_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBotProfileUrl() {
    return botProfileUrl;
  }


  @JsonProperty(JSON_PROPERTY_BOT_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBotProfileUrl(String botProfileUrl) {
    this.botProfileUrl = botProfileUrl;
  }


  public CreateBotResponseBot botUserid(String botUserid) {
    this.botUserid = botUserid;
    return this;
  }

   /**
   * Get botUserid
   * @return botUserid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOT_USERID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBotUserid() {
    return botUserid;
  }


  @JsonProperty(JSON_PROPERTY_BOT_USERID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBotUserid(String botUserid) {
    this.botUserid = botUserid;
  }


  public CreateBotResponseBot botNickname(String botNickname) {
    this.botNickname = botNickname;
    return this;
  }

   /**
   * Get botNickname
   * @return botNickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOT_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBotNickname() {
    return botNickname;
  }


  @JsonProperty(JSON_PROPERTY_BOT_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBotNickname(String botNickname) {
    this.botNickname = botNickname;
  }


  public CreateBotResponseBot botType(String botType) {
    this.botType = botType;
    return this;
  }

   /**
   * Get botType
   * @return botType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBotType() {
    return botType;
  }


  @JsonProperty(JSON_PROPERTY_BOT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBotType(String botType) {
    this.botType = botType;
  }


  public CreateBotResponseBot botMetadata(Object botMetadata) {
    this.botMetadata = botMetadata;
    return this;
  }

   /**
   * Get botMetadata
   * @return botMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getBotMetadata() {
    return botMetadata;
  }


  @JsonProperty(JSON_PROPERTY_BOT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBotMetadata(Object botMetadata) {
    this.botMetadata = botMetadata;
  }


  /**
   * Return true if this createBotResponse_bot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBotResponseBot createBotResponseBot = (CreateBotResponseBot) o;
    return Objects.equals(this.botToken, createBotResponseBot.botToken) &&
        Objects.equals(this.botProfileUrl, createBotResponseBot.botProfileUrl) &&
        Objects.equals(this.botUserid, createBotResponseBot.botUserid) &&
        Objects.equals(this.botNickname, createBotResponseBot.botNickname) &&
        Objects.equals(this.botType, createBotResponseBot.botType) &&
        Objects.equals(this.botMetadata, createBotResponseBot.botMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botToken, botProfileUrl, botUserid, botNickname, botType, botMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBotResponseBot {\n");
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

