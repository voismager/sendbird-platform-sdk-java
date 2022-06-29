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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GetStatisticsDailyResponseStatisticsInner;

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
 * GetStatisticsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class GetStatisticsResponse {
  public static final String SERIALIZED_NAME_STATISTICS = "statistics";
  @SerializedName(SERIALIZED_NAME_STATISTICS)
  private List<GetStatisticsDailyResponseStatisticsInner> statistics = null;

  public static final String SERIALIZED_NAME_WEEK = "week";
  @SerializedName(SERIALIZED_NAME_WEEK)
  private BigDecimal week;

  public GetStatisticsResponse() { 
  }

  public GetStatisticsResponse statistics(List<GetStatisticsDailyResponseStatisticsInner> statistics) {
    
    this.statistics = statistics;
    return this;
  }

  public GetStatisticsResponse addStatisticsItem(GetStatisticsDailyResponseStatisticsInner statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new ArrayList<>();
    }
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetStatisticsDailyResponseStatisticsInner> getStatistics() {
    return statistics;
  }


  public void setStatistics(List<GetStatisticsDailyResponseStatisticsInner> statistics) {
    this.statistics = statistics;
  }


  public GetStatisticsResponse week(BigDecimal week) {
    
    this.week = week;
    return this;
  }

   /**
   * Get week
   * @return week
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getWeek() {
    return week;
  }


  public void setWeek(BigDecimal week) {
    this.week = week;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatisticsResponse getStatisticsResponse = (GetStatisticsResponse) o;
    return Objects.equals(this.statistics, getStatisticsResponse.statistics) &&
        Objects.equals(this.week, getStatisticsResponse.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statistics, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatisticsResponse {\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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
    openapiFields.add("statistics");
    openapiFields.add("week");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetStatisticsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetStatisticsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetStatisticsResponse is not found in the empty JSON string", GetStatisticsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetStatisticsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetStatisticsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraystatistics = jsonObj.getAsJsonArray("statistics");
      if (jsonArraystatistics != null) {
        // ensure the json data is an array
        if (!jsonObj.get("statistics").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `statistics` to be an array in the JSON string but got `%s`", jsonObj.get("statistics").toString()));
        }

        // validate the optional field `statistics` (array)
        for (int i = 0; i < jsonArraystatistics.size(); i++) {
          GetStatisticsDailyResponseStatisticsInner.validateJsonObject(jsonArraystatistics.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetStatisticsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetStatisticsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetStatisticsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetStatisticsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetStatisticsResponse>() {
           @Override
           public void write(JsonWriter out, GetStatisticsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetStatisticsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetStatisticsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetStatisticsResponse
  * @throws IOException if the JSON string is invalid with respect to GetStatisticsResponse
  */
  public static GetStatisticsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetStatisticsResponse.class);
  }

 /**
  * Convert an instance of GetStatisticsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

