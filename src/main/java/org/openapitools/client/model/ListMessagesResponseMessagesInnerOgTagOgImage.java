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
 * ListMessagesResponseMessagesInnerOgTagOgImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
public class ListMessagesResponseMessagesInnerOgTagOgImage {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SECURE_URL = "secure_url";
  @SerializedName(SERIALIZED_NAME_SECURE_URL)
  private String secureUrl;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private BigDecimal width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public ListMessagesResponseMessagesInnerOgTagOgImage() { 
  }

  public ListMessagesResponseMessagesInnerOgTagOgImage url(String url) {
    
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


  public ListMessagesResponseMessagesInnerOgTagOgImage secureUrl(String secureUrl) {
    
    this.secureUrl = secureUrl;
    return this;
  }

   /**
   * Get secureUrl
   * @return secureUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureUrl() {
    return secureUrl;
  }


  public void setSecureUrl(String secureUrl) {
    this.secureUrl = secureUrl;
  }


  public ListMessagesResponseMessagesInnerOgTagOgImage width(BigDecimal width) {
    
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


  public ListMessagesResponseMessagesInnerOgTagOgImage height(BigDecimal height) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMessagesResponseMessagesInnerOgTagOgImage listMessagesResponseMessagesInnerOgTagOgImage = (ListMessagesResponseMessagesInnerOgTagOgImage) o;
    return Objects.equals(this.url, listMessagesResponseMessagesInnerOgTagOgImage.url) &&
        Objects.equals(this.secureUrl, listMessagesResponseMessagesInnerOgTagOgImage.secureUrl) &&
        Objects.equals(this.width, listMessagesResponseMessagesInnerOgTagOgImage.width) &&
        Objects.equals(this.height, listMessagesResponseMessagesInnerOgTagOgImage.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, secureUrl, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMessagesResponseMessagesInnerOgTagOgImage {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secureUrl: ").append(toIndentedString(secureUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("secure_url");
    openapiFields.add("width");
    openapiFields.add("height");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListMessagesResponseMessagesInnerOgTagOgImage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListMessagesResponseMessagesInnerOgTagOgImage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListMessagesResponseMessagesInnerOgTagOgImage is not found in the empty JSON string", ListMessagesResponseMessagesInnerOgTagOgImage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListMessagesResponseMessagesInnerOgTagOgImage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListMessagesResponseMessagesInnerOgTagOgImage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (jsonObj.get("secure_url") != null && !jsonObj.get("secure_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListMessagesResponseMessagesInnerOgTagOgImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListMessagesResponseMessagesInnerOgTagOgImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListMessagesResponseMessagesInnerOgTagOgImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListMessagesResponseMessagesInnerOgTagOgImage.class));

       return (TypeAdapter<T>) new TypeAdapter<ListMessagesResponseMessagesInnerOgTagOgImage>() {
           @Override
           public void write(JsonWriter out, ListMessagesResponseMessagesInnerOgTagOgImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListMessagesResponseMessagesInnerOgTagOgImage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListMessagesResponseMessagesInnerOgTagOgImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListMessagesResponseMessagesInnerOgTagOgImage
  * @throws IOException if the JSON string is invalid with respect to ListMessagesResponseMessagesInnerOgTagOgImage
  */
  public static ListMessagesResponseMessagesInnerOgTagOgImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListMessagesResponseMessagesInnerOgTagOgImage.class);
  }

 /**
  * Convert an instance of ListMessagesResponseMessagesInnerOgTagOgImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

