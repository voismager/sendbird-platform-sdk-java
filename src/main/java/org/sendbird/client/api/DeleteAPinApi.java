package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.SendBirdChannelResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class DeleteAPinApi {
  private ApiClient apiClient;

  public DeleteAPinApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DeleteAPinApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


private ApiResponse<SendBirdChannelResponse> v3ChannelTypeChannelUrlMessagesMessageIdPinDeleteWithHttpInfo(String channelType, String channelUrl, Integer messageId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling v3ChannelTypeChannelUrlMessagesMessageIdPinDelete");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling v3ChannelTypeChannelUrlMessagesMessageIdPinDelete");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling v3ChannelTypeChannelUrlMessagesMessageIdPinDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}/pin"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SendBirdChannelResponse> localVarReturnType = new GenericType<SendBirdChannelResponse>() {};

    return apiClient.invokeAPI("DeleteAPinApi.v3ChannelTypeChannelUrlMessagesMessageIdPinDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3ChannelTypeChannelUrlMessagesMessageIdPinDeleteRequest {
    private String channelType;
    private String channelUrl;
    private Integer messageId;
    private String apiToken;

    private APIv3ChannelTypeChannelUrlMessagesMessageIdPinDeleteRequest(String channelType, String channelUrl, Integer messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3ChannelTypeChannelUrlMessagesMessageIdPinDeleteRequest
     */
    public APIv3ChannelTypeChannelUrlMessagesMessageIdPinDeleteRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3ChannelTypeChannelUrlMessagesMessageIdPinDelete request
     * @return SendBirdChannelResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdChannelResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3ChannelTypeChannelUrlMessagesMessageIdPinDelete request with HTTP info returned
     * @return ApiResponse&lt;SendBirdChannelResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdChannelResponse> executeWithHttpInfo() throws ApiException {
      return v3ChannelTypeChannelUrlMessagesMessageIdPinDeleteWithHttpInfo(channelType, channelUrl, messageId, apiToken);
    }
  }

  /**
   * Delete a pin
   * ## Delete a pin Unpin a message from its channel. -----------------------------  
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return v3ChannelTypeChannelUrlMessagesMessageIdPinDeleteRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3ChannelTypeChannelUrlMessagesMessageIdPinDeleteRequest v3ChannelTypeChannelUrlMessagesMessageIdPinDelete(String channelType, String channelUrl, Integer messageId) throws ApiException {
    return new APIv3ChannelTypeChannelUrlMessagesMessageIdPinDeleteRequest(channelType, channelUrl, messageId);
  }
}
