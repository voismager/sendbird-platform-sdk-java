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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sendbird.client.JSON;

/**
 * ChooseWhichEventsToSubscribeToData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
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
      this.enabledEvents = new ArrayList<>();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("enabled");
    openapiFields.add("url");
    openapiFields.add("include_members");
    openapiFields.add("enabled_events");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChooseWhichEventsToSubscribeToData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChooseWhichEventsToSubscribeToData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChooseWhichEventsToSubscribeToData is not found in the empty JSON string", ChooseWhichEventsToSubscribeToData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChooseWhichEventsToSubscribeToData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChooseWhichEventsToSubscribeToData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChooseWhichEventsToSubscribeToData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("enabled_events") != null && !jsonObj.get("enabled_events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabled_events` to be an array in the JSON string but got `%s`", jsonObj.get("enabled_events").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChooseWhichEventsToSubscribeToData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChooseWhichEventsToSubscribeToData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChooseWhichEventsToSubscribeToData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChooseWhichEventsToSubscribeToData.class));

       return (TypeAdapter<T>) new TypeAdapter<ChooseWhichEventsToSubscribeToData>() {
           @Override
           public void write(JsonWriter out, ChooseWhichEventsToSubscribeToData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChooseWhichEventsToSubscribeToData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChooseWhichEventsToSubscribeToData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChooseWhichEventsToSubscribeToData
  * @throws IOException if the JSON string is invalid with respect to ChooseWhichEventsToSubscribeToData
  */
  public static ChooseWhichEventsToSubscribeToData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChooseWhichEventsToSubscribeToData.class);
  }

 /**
  * Convert an instance of ChooseWhichEventsToSubscribeToData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

