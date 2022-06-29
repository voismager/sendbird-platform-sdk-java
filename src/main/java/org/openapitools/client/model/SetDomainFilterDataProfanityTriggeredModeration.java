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
 * SetDomainFilterDataProfanityTriggeredModeration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class SetDomainFilterDataProfanityTriggeredModeration {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Integer action;

  public SetDomainFilterDataProfanityTriggeredModeration() { 
  }

  public SetDomainFilterDataProfanityTriggeredModeration count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public SetDomainFilterDataProfanityTriggeredModeration duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public SetDomainFilterDataProfanityTriggeredModeration action(Integer action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAction() {
    return action;
  }


  public void setAction(Integer action) {
    this.action = action;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDomainFilterDataProfanityTriggeredModeration setDomainFilterDataProfanityTriggeredModeration = (SetDomainFilterDataProfanityTriggeredModeration) o;
    return Objects.equals(this.count, setDomainFilterDataProfanityTriggeredModeration.count) &&
        Objects.equals(this.duration, setDomainFilterDataProfanityTriggeredModeration.duration) &&
        Objects.equals(this.action, setDomainFilterDataProfanityTriggeredModeration.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, duration, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDomainFilterDataProfanityTriggeredModeration {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("duration");
    openapiFields.add("action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetDomainFilterDataProfanityTriggeredModeration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetDomainFilterDataProfanityTriggeredModeration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetDomainFilterDataProfanityTriggeredModeration is not found in the empty JSON string", SetDomainFilterDataProfanityTriggeredModeration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetDomainFilterDataProfanityTriggeredModeration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetDomainFilterDataProfanityTriggeredModeration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetDomainFilterDataProfanityTriggeredModeration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetDomainFilterDataProfanityTriggeredModeration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetDomainFilterDataProfanityTriggeredModeration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetDomainFilterDataProfanityTriggeredModeration.class));

       return (TypeAdapter<T>) new TypeAdapter<SetDomainFilterDataProfanityTriggeredModeration>() {
           @Override
           public void write(JsonWriter out, SetDomainFilterDataProfanityTriggeredModeration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetDomainFilterDataProfanityTriggeredModeration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetDomainFilterDataProfanityTriggeredModeration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetDomainFilterDataProfanityTriggeredModeration
  * @throws IOException if the JSON string is invalid with respect to SetDomainFilterDataProfanityTriggeredModeration
  */
  public static SetDomainFilterDataProfanityTriggeredModeration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetDomainFilterDataProfanityTriggeredModeration.class);
  }

 /**
  * Convert an instance of SetDomainFilterDataProfanityTriggeredModeration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

