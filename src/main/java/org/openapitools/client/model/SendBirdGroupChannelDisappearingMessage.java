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
 * SendBirdGroupChannelDisappearingMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class SendBirdGroupChannelDisappearingMessage {
  public static final String SERIALIZED_NAME_MESSAGE_SURVIVAL_SECONDS = "message_survival_seconds";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SURVIVAL_SECONDS)
  private BigDecimal messageSurvivalSeconds;

  public static final String SERIALIZED_NAME_IS_TRIGGERED_BY_MESSAGE_READ = "is_triggered_by_message_read";
  @SerializedName(SERIALIZED_NAME_IS_TRIGGERED_BY_MESSAGE_READ)
  private Boolean isTriggeredByMessageRead;

  public SendBirdGroupChannelDisappearingMessage() { 
  }

  public SendBirdGroupChannelDisappearingMessage messageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    
    this.messageSurvivalSeconds = messageSurvivalSeconds;
    return this;
  }

   /**
   * Get messageSurvivalSeconds
   * @return messageSurvivalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMessageSurvivalSeconds() {
    return messageSurvivalSeconds;
  }


  public void setMessageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
  }


  public SendBirdGroupChannelDisappearingMessage isTriggeredByMessageRead(Boolean isTriggeredByMessageRead) {
    
    this.isTriggeredByMessageRead = isTriggeredByMessageRead;
    return this;
  }

   /**
   * Get isTriggeredByMessageRead
   * @return isTriggeredByMessageRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsTriggeredByMessageRead() {
    return isTriggeredByMessageRead;
  }


  public void setIsTriggeredByMessageRead(Boolean isTriggeredByMessageRead) {
    this.isTriggeredByMessageRead = isTriggeredByMessageRead;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdGroupChannelDisappearingMessage sendBirdGroupChannelDisappearingMessage = (SendBirdGroupChannelDisappearingMessage) o;
    return Objects.equals(this.messageSurvivalSeconds, sendBirdGroupChannelDisappearingMessage.messageSurvivalSeconds) &&
        Objects.equals(this.isTriggeredByMessageRead, sendBirdGroupChannelDisappearingMessage.isTriggeredByMessageRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSurvivalSeconds, isTriggeredByMessageRead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdGroupChannelDisappearingMessage {\n");
    sb.append("    messageSurvivalSeconds: ").append(toIndentedString(messageSurvivalSeconds)).append("\n");
    sb.append("    isTriggeredByMessageRead: ").append(toIndentedString(isTriggeredByMessageRead)).append("\n");
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

