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
 * DeleteAllowedIpsFromWhitelistResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class DeleteAllowedIpsFromWhitelistResponse {
  public static final String SERIALIZED_NAME_IP_WHITELIST_ADDRESSES = "ip_whitelist_addresses";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_ADDRESSES)
  private List<String> ipWhitelistAddresses = null;

  public DeleteAllowedIpsFromWhitelistResponse() { 
  }

  public DeleteAllowedIpsFromWhitelistResponse ipWhitelistAddresses(List<String> ipWhitelistAddresses) {
    
    this.ipWhitelistAddresses = ipWhitelistAddresses;
    return this;
  }

  public DeleteAllowedIpsFromWhitelistResponse addIpWhitelistAddressesItem(String ipWhitelistAddressesItem) {
    if (this.ipWhitelistAddresses == null) {
      this.ipWhitelistAddresses = new ArrayList<>();
    }
    this.ipWhitelistAddresses.add(ipWhitelistAddressesItem);
    return this;
  }

   /**
   * Get ipWhitelistAddresses
   * @return ipWhitelistAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpWhitelistAddresses() {
    return ipWhitelistAddresses;
  }


  public void setIpWhitelistAddresses(List<String> ipWhitelistAddresses) {
    this.ipWhitelistAddresses = ipWhitelistAddresses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAllowedIpsFromWhitelistResponse deleteAllowedIpsFromWhitelistResponse = (DeleteAllowedIpsFromWhitelistResponse) o;
    return Objects.equals(this.ipWhitelistAddresses, deleteAllowedIpsFromWhitelistResponse.ipWhitelistAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipWhitelistAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAllowedIpsFromWhitelistResponse {\n");
    sb.append("    ipWhitelistAddresses: ").append(toIndentedString(ipWhitelistAddresses)).append("\n");
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
    openapiFields.add("ip_whitelist_addresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeleteAllowedIpsFromWhitelistResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeleteAllowedIpsFromWhitelistResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteAllowedIpsFromWhitelistResponse is not found in the empty JSON string", DeleteAllowedIpsFromWhitelistResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeleteAllowedIpsFromWhitelistResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteAllowedIpsFromWhitelistResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("ip_whitelist_addresses") != null && !jsonObj.get("ip_whitelist_addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_whitelist_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("ip_whitelist_addresses").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteAllowedIpsFromWhitelistResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteAllowedIpsFromWhitelistResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteAllowedIpsFromWhitelistResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteAllowedIpsFromWhitelistResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteAllowedIpsFromWhitelistResponse>() {
           @Override
           public void write(JsonWriter out, DeleteAllowedIpsFromWhitelistResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteAllowedIpsFromWhitelistResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteAllowedIpsFromWhitelistResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteAllowedIpsFromWhitelistResponse
  * @throws IOException if the JSON string is invalid with respect to DeleteAllowedIpsFromWhitelistResponse
  */
  public static DeleteAllowedIpsFromWhitelistResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteAllowedIpsFromWhitelistResponse.class);
  }

 /**
  * Convert an instance of DeleteAllowedIpsFromWhitelistResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

