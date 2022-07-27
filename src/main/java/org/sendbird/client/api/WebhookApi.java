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


package org.sendbird.client.api;

import org.sendbird.client.ApiCallback;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;
import org.sendbird.client.ProgressRequestBody;
import org.sendbird.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ChooseWhichEventsToSubscribeToData;
import org.openapitools.client.model.ChooseWhichEventsToSubscribeToResponse;
import org.openapitools.client.model.RetrieveListOfSubscribedEventsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WebhookApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WebhookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for chooseWhichEventsToSubscribeTo
     * @param apiToken  (required)
     * @param chooseWhichEventsToSubscribeToData  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call chooseWhichEventsToSubscribeToCall(String apiToken, ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = chooseWhichEventsToSubscribeToData;

        // create path and map variables
        String localVarPath = "/v3/applications/settings/webhook";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (apiToken != null) {
            localVarHeaderParams.put("Api-Token", localVarApiClient.parameterToString(apiToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call chooseWhichEventsToSubscribeToValidateBeforeCall(String apiToken, ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling chooseWhichEventsToSubscribeTo(Async)");
        }
        

        okhttp3.Call localVarCall = chooseWhichEventsToSubscribeToCall(apiToken, chooseWhichEventsToSubscribeToData, _callback);
        return localVarCall;

    }

    /**
     * Choose which events to subscribe to
     * ## Choose which events to subscribe to  Chooses which events for your webhook server to receive payloads for. By subscribing to specific events based on your own needs, you can control the number of HTTP requests to your webhook server.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-choose-which-events-to-subscribe-to
     * @param apiToken  (required)
     * @param chooseWhichEventsToSubscribeToData  (optional)
     * @return ChooseWhichEventsToSubscribeToResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ChooseWhichEventsToSubscribeToResponse chooseWhichEventsToSubscribeTo(String apiToken, ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData) throws ApiException {
        ApiResponse<ChooseWhichEventsToSubscribeToResponse> localVarResp = chooseWhichEventsToSubscribeToWithHttpInfo(apiToken, chooseWhichEventsToSubscribeToData);
        return localVarResp.getData();
    }

    /**
     * Choose which events to subscribe to
     * ## Choose which events to subscribe to  Chooses which events for your webhook server to receive payloads for. By subscribing to specific events based on your own needs, you can control the number of HTTP requests to your webhook server.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-choose-which-events-to-subscribe-to
     * @param apiToken  (required)
     * @param chooseWhichEventsToSubscribeToData  (optional)
     * @return ApiResponse&lt;ChooseWhichEventsToSubscribeToResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ChooseWhichEventsToSubscribeToResponse> chooseWhichEventsToSubscribeToWithHttpInfo(String apiToken, ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData) throws ApiException {
        okhttp3.Call localVarCall = chooseWhichEventsToSubscribeToValidateBeforeCall(apiToken, chooseWhichEventsToSubscribeToData, null);
        Type localVarReturnType = new TypeToken<ChooseWhichEventsToSubscribeToResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Choose which events to subscribe to (asynchronously)
     * ## Choose which events to subscribe to  Chooses which events for your webhook server to receive payloads for. By subscribing to specific events based on your own needs, you can control the number of HTTP requests to your webhook server.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-choose-which-events-to-subscribe-to
     * @param apiToken  (required)
     * @param chooseWhichEventsToSubscribeToData  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call chooseWhichEventsToSubscribeToAsync(String apiToken, ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData, final ApiCallback<ChooseWhichEventsToSubscribeToResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = chooseWhichEventsToSubscribeToValidateBeforeCall(apiToken, chooseWhichEventsToSubscribeToData, _callback);
        Type localVarReturnType = new TypeToken<ChooseWhichEventsToSubscribeToResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveListOfSubscribedEvents
     * @param apiToken  (required)
     * @param displayAllWebhookCategories  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveListOfSubscribedEventsCall(String apiToken, Boolean displayAllWebhookCategories, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/applications/settings/webhook";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (displayAllWebhookCategories != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("display_all_webhook_categories", displayAllWebhookCategories));
        }

        if (apiToken != null) {
            localVarHeaderParams.put("Api-Token", localVarApiClient.parameterToString(apiToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveListOfSubscribedEventsValidateBeforeCall(String apiToken, Boolean displayAllWebhookCategories, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling retrieveListOfSubscribedEvents(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveListOfSubscribedEventsCall(apiToken, displayAllWebhookCategories, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a list of subscribed events
     * ## Retrieve a list of subscribed events  Retrieves a list of events for your webhook server to receive payloads for.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-retrieve-a-list-of-subscribed-events ----------------------------
     * @param apiToken  (required)
     * @param displayAllWebhookCategories  (optional)
     * @return RetrieveListOfSubscribedEventsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public RetrieveListOfSubscribedEventsResponse retrieveListOfSubscribedEvents(String apiToken, Boolean displayAllWebhookCategories) throws ApiException {
        ApiResponse<RetrieveListOfSubscribedEventsResponse> localVarResp = retrieveListOfSubscribedEventsWithHttpInfo(apiToken, displayAllWebhookCategories);
        return localVarResp.getData();
    }

    /**
     * Retrieve a list of subscribed events
     * ## Retrieve a list of subscribed events  Retrieves a list of events for your webhook server to receive payloads for.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-retrieve-a-list-of-subscribed-events ----------------------------
     * @param apiToken  (required)
     * @param displayAllWebhookCategories  (optional)
     * @return ApiResponse&lt;RetrieveListOfSubscribedEventsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RetrieveListOfSubscribedEventsResponse> retrieveListOfSubscribedEventsWithHttpInfo(String apiToken, Boolean displayAllWebhookCategories) throws ApiException {
        okhttp3.Call localVarCall = retrieveListOfSubscribedEventsValidateBeforeCall(apiToken, displayAllWebhookCategories, null);
        Type localVarReturnType = new TypeToken<RetrieveListOfSubscribedEventsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a list of subscribed events (asynchronously)
     * ## Retrieve a list of subscribed events  Retrieves a list of events for your webhook server to receive payloads for.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-retrieve-a-list-of-subscribed-events ----------------------------
     * @param apiToken  (required)
     * @param displayAllWebhookCategories  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveListOfSubscribedEventsAsync(String apiToken, Boolean displayAllWebhookCategories, final ApiCallback<RetrieveListOfSubscribedEventsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveListOfSubscribedEventsValidateBeforeCall(apiToken, displayAllWebhookCategories, _callback);
        Type localVarReturnType = new TypeToken<RetrieveListOfSubscribedEventsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}