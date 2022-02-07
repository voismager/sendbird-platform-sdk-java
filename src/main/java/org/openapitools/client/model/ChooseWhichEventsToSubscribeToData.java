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
 * ChooseWhichEventsToSubscribeToData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class ChooseWhichEventsToSubscribeToData {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_INCLUDE_MEMBERS = "include_members";
  @SerializedName(SERIALIZED_NAME_INCLUDE_MEMBERS)
  private Boolean includeMembers;

  public static final String SERIALIZED_NAME_ENABLED_EVENTS = "enabled_events";
  @SerializedName(SERIALIZED_NAME_ENABLED_EVENTS)
  private List<String> enabledEvents = null;

  public ChooseWhichEventsToSubscribeToData() { 
  }

  public ChooseWhichEventsToSubscribeToData enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Determines whether webhooks are turned on in your Sendbird application or not. (Default: false)
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether webhooks are turned on in your Sendbird application or not. (Default: false)")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ChooseWhichEventsToSubscribeToData url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Specifies the URL of your webhook server to receive payloads for events.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of your webhook server to receive payloads for events.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ChooseWhichEventsToSubscribeToData includeMembers(Boolean includeMembers) {
    
    this.includeMembers = includeMembers;
    return this;
  }

   /**
   * Determines whether to include the information on the members of group channels in payloads. (Default: false)
   * @return includeMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to include the information on the members of group channels in payloads. (Default: false)")

  public Boolean getIncludeMembers() {
    return includeMembers;
  }


  public void setIncludeMembers(Boolean includeMembers) {
    this.includeMembers = includeMembers;
  }


  public ChooseWhichEventsToSubscribeToData enabledEvents(List<String> enabledEvents) {
    
    this.enabledEvents = enabledEvents;
    return this;
  }

  public ChooseWhichEventsToSubscribeToData addEnabledEventsItem(String enabledEventsItem) {
    if (this.enabledEvents == null) {
      this.enabledEvents = new ArrayList<String>();
    }
    this.enabledEvents.add(enabledEventsItem);
    return this;
  }

   /**
   * Specifies an array of one or more [events](#2-webhook-events) for your webhook server to subscribe to. If set to an asterisk () only, the server will subscribe to all supported events. If set to an empty array, the server will unsubscribe from all (which indicates turning off webhooks).
   * @return enabledEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more [events](#2-webhook-events) for your webhook server to subscribe to. If set to an asterisk () only, the server will subscribe to all supported events. If set to an empty array, the server will unsubscribe from all (which indicates turning off webhooks).")

  public List<String> getEnabledEvents() {
    return enabledEvents;
  }


  public void setEnabledEvents(List<String> enabledEvents) {
    this.enabledEvents = enabledEvents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData = (ChooseWhichEventsToSubscribeToData) o;
    return Objects.equals(this.enabled, chooseWhichEventsToSubscribeToData.enabled) &&
        Objects.equals(this.url, chooseWhichEventsToSubscribeToData.url) &&
        Objects.equals(this.includeMembers, chooseWhichEventsToSubscribeToData.includeMembers) &&
        Objects.equals(this.enabledEvents, chooseWhichEventsToSubscribeToData.enabledEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, url, includeMembers, enabledEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChooseWhichEventsToSubscribeToData {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    includeMembers: ").append(toIndentedString(includeMembers)).append("\n");
    sb.append("    enabledEvents: ").append(toIndentedString(enabledEvents)).append("\n");
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

