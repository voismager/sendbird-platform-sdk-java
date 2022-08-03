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
 * SendBirdThumbnailSBObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class SendBirdThumbnailSBObject {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public static final String SERIALIZED_NAME_PLAIN_URL = "plain_url";
  @SerializedName(SERIALIZED_NAME_PLAIN_URL)
  private String plainUrl;

  public static final String SERIALIZED_NAME_REAL_HEIGHT = "real_height";
  @SerializedName(SERIALIZED_NAME_REAL_HEIGHT)
  private BigDecimal realHeight;

  public static final String SERIALIZED_NAME_REAL_WIDTH = "real_width";
  @SerializedName(SERIALIZED_NAME_REAL_WIDTH)
  private BigDecimal realWidth;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private BigDecimal width;

  public SendBirdThumbnailSBObject() { 
  }

  public SendBirdThumbnailSBObject height(BigDecimal height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getHeight() {
    return height;
  }


  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public SendBirdThumbnailSBObject plainUrl(String plainUrl) {
    
    this.plainUrl = plainUrl;
    return this;
  }

   /**
   * Get plainUrl
   * @return plainUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlainUrl() {
    return plainUrl;
  }


  public void setPlainUrl(String plainUrl) {
    this.plainUrl = plainUrl;
  }


  public SendBirdThumbnailSBObject realHeight(BigDecimal realHeight) {
    
    this.realHeight = realHeight;
    return this;
  }

   /**
   * Get realHeight
   * @return realHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRealHeight() {
    return realHeight;
  }


  public void setRealHeight(BigDecimal realHeight) {
    this.realHeight = realHeight;
  }


  public SendBirdThumbnailSBObject realWidth(BigDecimal realWidth) {
    
    this.realWidth = realWidth;
    return this;
  }

   /**
   * Get realWidth
   * @return realWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRealWidth() {
    return realWidth;
  }


  public void setRealWidth(BigDecimal realWidth) {
    this.realWidth = realWidth;
  }


  public SendBirdThumbnailSBObject url(String url) {
    
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


  public SendBirdThumbnailSBObject width(BigDecimal width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getWidth() {
    return width;
  }


  public void setWidth(BigDecimal width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdThumbnailSBObject sendBirdThumbnailSBObject = (SendBirdThumbnailSBObject) o;
    return Objects.equals(this.height, sendBirdThumbnailSBObject.height) &&
        Objects.equals(this.plainUrl, sendBirdThumbnailSBObject.plainUrl) &&
        Objects.equals(this.realHeight, sendBirdThumbnailSBObject.realHeight) &&
        Objects.equals(this.realWidth, sendBirdThumbnailSBObject.realWidth) &&
        Objects.equals(this.url, sendBirdThumbnailSBObject.url) &&
        Objects.equals(this.width, sendBirdThumbnailSBObject.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, plainUrl, realHeight, realWidth, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdThumbnailSBObject {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    plainUrl: ").append(toIndentedString(plainUrl)).append("\n");
    sb.append("    realHeight: ").append(toIndentedString(realHeight)).append("\n");
    sb.append("    realWidth: ").append(toIndentedString(realWidth)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("plain_url");
    openapiFields.add("real_height");
    openapiFields.add("real_width");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdThumbnailSBObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdThumbnailSBObject.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdThumbnailSBObject is not found in the empty JSON string", SendBirdThumbnailSBObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdThumbnailSBObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdThumbnailSBObject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("plain_url") != null && !jsonObj.get("plain_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plain_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plain_url").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdThumbnailSBObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdThumbnailSBObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdThumbnailSBObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdThumbnailSBObject.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdThumbnailSBObject>() {
           @Override
           public void write(JsonWriter out, SendBirdThumbnailSBObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdThumbnailSBObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdThumbnailSBObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdThumbnailSBObject
  * @throws IOException if the JSON string is invalid with respect to SendBirdThumbnailSBObject
  */
  public static SendBirdThumbnailSBObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdThumbnailSBObject.class);
  }

 /**
  * Convert an instance of SendBirdThumbnailSBObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

