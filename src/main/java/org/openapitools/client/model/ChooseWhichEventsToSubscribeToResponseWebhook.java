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
 * ChooseWhichEventsToSubscribeToResponseWebhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class ChooseWhichEventsToSubscribeToResponseWebhook {
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

  public static final String SERIALIZED_NAME_INCLUDE_UNREAD_COUNT = "include_unread_count";
  @SerializedName(SERIALIZED_NAME_INCLUDE_UNREAD_COUNT)
  private Boolean includeUnreadCount;

  public ChooseWhichEventsToSubscribeToResponseWebhook() { 
  }

  public ChooseWhichEventsToSubscribeToResponseWebhook enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook includeMembers(Boolean includeMembers) {
    
    this.includeMembers = includeMembers;
    return this;
  }

   /**
   * Get includeMembers
   * @return includeMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeMembers() {
    return includeMembers;
  }


  public void setIncludeMembers(Boolean includeMembers) {
    this.includeMembers = includeMembers;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook enabledEvents(List<String> enabledEvents) {
    
    this.enabledEvents = enabledEvents;
    return this;
  }

  public ChooseWhichEventsToSubscribeToResponseWebhook addEnabledEventsItem(String enabledEventsItem) {
    if (this.enabledEvents == null) {
      this.enabledEvents = new ArrayList<String>();
    }
    this.enabledEvents.add(enabledEventsItem);
    return this;
  }

   /**
   * Get enabledEvents
   * @return enabledEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEnabledEvents() {
    return enabledEvents;
  }


  public void setEnabledEvents(List<String> enabledEvents) {
    this.enabledEvents = enabledEvents;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook includeUnreadCount(Boolean includeUnreadCount) {
    
    this.includeUnreadCount = includeUnreadCount;
    return this;
  }

   /**
   * Get includeUnreadCount
   * @return includeUnreadCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeUnreadCount() {
    return includeUnreadCount;
  }


  public void setIncludeUnreadCount(Boolean includeUnreadCount) {
    this.includeUnreadCount = includeUnreadCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChooseWhichEventsToSubscribeToResponseWebhook chooseWhichEventsToSubscribeToResponseWebhook = (ChooseWhichEventsToSubscribeToResponseWebhook) o;
    return Objects.equals(this.enabled, chooseWhichEventsToSubscribeToResponseWebhook.enabled) &&
        Objects.equals(this.url, chooseWhichEventsToSubscribeToResponseWebhook.url) &&
        Objects.equals(this.includeMembers, chooseWhichEventsToSubscribeToResponseWebhook.includeMembers) &&
        Objects.equals(this.enabledEvents, chooseWhichEventsToSubscribeToResponseWebhook.enabledEvents) &&
        Objects.equals(this.includeUnreadCount, chooseWhichEventsToSubscribeToResponseWebhook.includeUnreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, url, includeMembers, enabledEvents, includeUnreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChooseWhichEventsToSubscribeToResponseWebhook {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    includeMembers: ").append(toIndentedString(includeMembers)).append("\n");
    sb.append("    enabledEvents: ").append(toIndentedString(enabledEvents)).append("\n");
    sb.append("    includeUnreadCount: ").append(toIndentedString(includeUnreadCount)).append("\n");
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

