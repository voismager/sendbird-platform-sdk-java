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
 * SendBirdThumbnailSize
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class SendBirdThumbnailSize {
  public static final String SERIALIZED_NAME_MAX_HEIGHT = "max_height";
  @SerializedName(SERIALIZED_NAME_MAX_HEIGHT)
  private BigDecimal maxHeight;

  public static final String SERIALIZED_NAME_MAX_WIDTH = "max_width";
  @SerializedName(SERIALIZED_NAME_MAX_WIDTH)
  private BigDecimal maxWidth;

  public SendBirdThumbnailSize() { 
  }

  public SendBirdThumbnailSize maxHeight(BigDecimal maxHeight) {
    
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * Get maxHeight
   * @return maxHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxHeight() {
    return maxHeight;
  }


  public void setMaxHeight(BigDecimal maxHeight) {
    this.maxHeight = maxHeight;
  }


  public SendBirdThumbnailSize maxWidth(BigDecimal maxWidth) {
    
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * Get maxWidth
   * @return maxWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxWidth() {
    return maxWidth;
  }


  public void setMaxWidth(BigDecimal maxWidth) {
    this.maxWidth = maxWidth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdThumbnailSize sendBirdThumbnailSize = (SendBirdThumbnailSize) o;
    return Objects.equals(this.maxHeight, sendBirdThumbnailSize.maxHeight) &&
        Objects.equals(this.maxWidth, sendBirdThumbnailSize.maxWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHeight, maxWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdThumbnailSize {\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
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
    openapiFields.add("max_height");
    openapiFields.add("max_width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdThumbnailSize
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdThumbnailSize.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdThumbnailSize is not found in the empty JSON string", SendBirdThumbnailSize.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdThumbnailSize.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdThumbnailSize` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdThumbnailSize.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdThumbnailSize' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdThumbnailSize> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdThumbnailSize.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdThumbnailSize>() {
           @Override
           public void write(JsonWriter out, SendBirdThumbnailSize value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdThumbnailSize read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdThumbnailSize given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdThumbnailSize
  * @throws IOException if the JSON string is invalid with respect to SendBirdThumbnailSize
  */
  public static SendBirdThumbnailSize fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdThumbnailSize.class);
  }

 /**
  * Convert an instance of SendBirdThumbnailSize to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

