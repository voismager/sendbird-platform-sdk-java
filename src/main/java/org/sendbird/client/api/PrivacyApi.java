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


import org.openapitools.client.model.ListGdprRequestsResponse;
import org.openapitools.client.model.RegisterGdprRequestData;
import org.openapitools.client.model.RegisterGdprRequestResponse;
import org.openapitools.client.model.ViewGdprRequestByIdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PrivacyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PrivacyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PrivacyApi(ApiClient apiClient) {
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
     * Build call for cancelTheRegistrationOfGdprRequestById
     * @param apiToken  (required)
     * @param requestId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelTheRegistrationOfGdprRequestByIdCall(String apiToken, String requestId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v3/privacy/gdpr/{request_id}"
            .replaceAll("\\{" + "request_id" + "\\}", localVarApiClient.escapeString(requestId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (apiToken != null) {
            localVarHeaderParams.put("Api-Token", localVarApiClient.parameterToString(apiToken));
        }

        final String[] localVarAccepts = {
            
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelTheRegistrationOfGdprRequestByIdValidateBeforeCall(String apiToken, String requestId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling cancelTheRegistrationOfGdprRequestById(Async)");
        }
        
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling cancelTheRegistrationOfGdprRequestById(Async)");
        }
        

        okhttp3.Call localVarCall = cancelTheRegistrationOfGdprRequestByIdCall(apiToken, requestId, _callback);
        return localVarCall;

    }

    /**
     * Cancel the registration of a GDPR request
     * ## Cancel the registration of a GDPR request  Cancels the registration of a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-cancel-the-registration-of-a-gdpr-request ----------------------------
     * @param apiToken  (required)
     * @param requestId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public void cancelTheRegistrationOfGdprRequestById(String apiToken, String requestId) throws ApiException {
        cancelTheRegistrationOfGdprRequestByIdWithHttpInfo(apiToken, requestId);
    }

    /**
     * Cancel the registration of a GDPR request
     * ## Cancel the registration of a GDPR request  Cancels the registration of a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-cancel-the-registration-of-a-gdpr-request ----------------------------
     * @param apiToken  (required)
     * @param requestId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> cancelTheRegistrationOfGdprRequestByIdWithHttpInfo(String apiToken, String requestId) throws ApiException {
        okhttp3.Call localVarCall = cancelTheRegistrationOfGdprRequestByIdValidateBeforeCall(apiToken, requestId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Cancel the registration of a GDPR request (asynchronously)
     * ## Cancel the registration of a GDPR request  Cancels the registration of a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-cancel-the-registration-of-a-gdpr-request ----------------------------
     * @param apiToken  (required)
     * @param requestId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelTheRegistrationOfGdprRequestByIdAsync(String apiToken, String requestId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelTheRegistrationOfGdprRequestByIdValidateBeforeCall(apiToken, requestId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listGdprRequests
     * @param apiToken  (required)
     * @param token  (optional)
     * @param limit  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listGdprRequestsCall(String apiToken, String token, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v3/privacy/gdpr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call listGdprRequestsValidateBeforeCall(String apiToken, String token, Integer limit, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling listGdprRequests(Async)");
        }
        

        okhttp3.Call localVarCall = listGdprRequestsCall(apiToken, token, limit, _callback);
        return localVarCall;

    }

    /**
     * List GDPR requests
     * ## List GDPR requests  Retrieves a list of GDPR requests of all types.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-list-gdpr-requests ----------------------------
     * @param apiToken  (required)
     * @param token  (optional)
     * @param limit  (optional)
     * @return ListGdprRequestsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ListGdprRequestsResponse listGdprRequests(String apiToken, String token, Integer limit) throws ApiException {
        ApiResponse<ListGdprRequestsResponse> localVarResp = listGdprRequestsWithHttpInfo(apiToken, token, limit);
        return localVarResp.getData();
    }

    /**
     * List GDPR requests
     * ## List GDPR requests  Retrieves a list of GDPR requests of all types.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-list-gdpr-requests ----------------------------
     * @param apiToken  (required)
     * @param token  (optional)
     * @param limit  (optional)
     * @return ApiResponse&lt;ListGdprRequestsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListGdprRequestsResponse> listGdprRequestsWithHttpInfo(String apiToken, String token, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listGdprRequestsValidateBeforeCall(apiToken, token, limit, null);
        Type localVarReturnType = new TypeToken<ListGdprRequestsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List GDPR requests (asynchronously)
     * ## List GDPR requests  Retrieves a list of GDPR requests of all types.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-list-gdpr-requests ----------------------------
     * @param apiToken  (required)
     * @param token  (optional)
     * @param limit  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listGdprRequestsAsync(String apiToken, String token, Integer limit, final ApiCallback<ListGdprRequestsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listGdprRequestsValidateBeforeCall(apiToken, token, limit, _callback);
        Type localVarReturnType = new TypeToken<ListGdprRequestsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for registerGdprRequest
     * @param apiToken  (required)
     * @param registerGdprRequestData  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerGdprRequestCall(String apiToken, RegisterGdprRequestData registerGdprRequestData, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = registerGdprRequestData;

        // create path and map variables
        String localVarPath = "/v3/privacy/gdpr";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registerGdprRequestValidateBeforeCall(String apiToken, RegisterGdprRequestData registerGdprRequestData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling registerGdprRequest(Async)");
        }
        

        okhttp3.Call localVarCall = registerGdprRequestCall(apiToken, registerGdprRequestData, _callback);
        return localVarCall;

    }

    /**
     * Register a GDPR request
     * ## Register a GDPR request  Registers a specific type of GDPR request to meet the GDPR&#39;s requirements.  &gt; __Note__: Currently, only delete and access of the user data are supported. The features for the [right to restriction of processing](https://gdpr-info.eu/art-18-gdpr/) and [right to object](https://gdpr-info.eu/art-21-gdpr/) will be available soon.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-register-a-gdpr-request
     * @param apiToken  (required)
     * @param registerGdprRequestData  (optional)
     * @return RegisterGdprRequestResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public RegisterGdprRequestResponse registerGdprRequest(String apiToken, RegisterGdprRequestData registerGdprRequestData) throws ApiException {
        ApiResponse<RegisterGdprRequestResponse> localVarResp = registerGdprRequestWithHttpInfo(apiToken, registerGdprRequestData);
        return localVarResp.getData();
    }

    /**
     * Register a GDPR request
     * ## Register a GDPR request  Registers a specific type of GDPR request to meet the GDPR&#39;s requirements.  &gt; __Note__: Currently, only delete and access of the user data are supported. The features for the [right to restriction of processing](https://gdpr-info.eu/art-18-gdpr/) and [right to object](https://gdpr-info.eu/art-21-gdpr/) will be available soon.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-register-a-gdpr-request
     * @param apiToken  (required)
     * @param registerGdprRequestData  (optional)
     * @return ApiResponse&lt;RegisterGdprRequestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RegisterGdprRequestResponse> registerGdprRequestWithHttpInfo(String apiToken, RegisterGdprRequestData registerGdprRequestData) throws ApiException {
        okhttp3.Call localVarCall = registerGdprRequestValidateBeforeCall(apiToken, registerGdprRequestData, null);
        Type localVarReturnType = new TypeToken<RegisterGdprRequestResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Register a GDPR request (asynchronously)
     * ## Register a GDPR request  Registers a specific type of GDPR request to meet the GDPR&#39;s requirements.  &gt; __Note__: Currently, only delete and access of the user data are supported. The features for the [right to restriction of processing](https://gdpr-info.eu/art-18-gdpr/) and [right to object](https://gdpr-info.eu/art-21-gdpr/) will be available soon.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-register-a-gdpr-request
     * @param apiToken  (required)
     * @param registerGdprRequestData  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerGdprRequestAsync(String apiToken, RegisterGdprRequestData registerGdprRequestData, final ApiCallback<RegisterGdprRequestResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = registerGdprRequestValidateBeforeCall(apiToken, registerGdprRequestData, _callback);
        Type localVarReturnType = new TypeToken<RegisterGdprRequestResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for viewGdprRequestById
     * @param apiToken  (required)
     * @param requestId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call viewGdprRequestByIdCall(String apiToken, String requestId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v3/privacy/gdpr/{request_id}"
            .replaceAll("\\{" + "request_id" + "\\}", localVarApiClient.escapeString(requestId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call viewGdprRequestByIdValidateBeforeCall(String apiToken, String requestId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling viewGdprRequestById(Async)");
        }
        
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling viewGdprRequestById(Async)");
        }
        

        okhttp3.Call localVarCall = viewGdprRequestByIdCall(apiToken, requestId, _callback);
        return localVarCall;

    }

    /**
     * View a GDPR request
     * ## View a GDPR request  Retrieves a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-view-a-gdpr-request ----------------------------
     * @param apiToken  (required)
     * @param requestId  (required)
     * @return ViewGdprRequestByIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ViewGdprRequestByIdResponse viewGdprRequestById(String apiToken, String requestId) throws ApiException {
        ApiResponse<ViewGdprRequestByIdResponse> localVarResp = viewGdprRequestByIdWithHttpInfo(apiToken, requestId);
        return localVarResp.getData();
    }

    /**
     * View a GDPR request
     * ## View a GDPR request  Retrieves a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-view-a-gdpr-request ----------------------------
     * @param apiToken  (required)
     * @param requestId  (required)
     * @return ApiResponse&lt;ViewGdprRequestByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ViewGdprRequestByIdResponse> viewGdprRequestByIdWithHttpInfo(String apiToken, String requestId) throws ApiException {
        okhttp3.Call localVarCall = viewGdprRequestByIdValidateBeforeCall(apiToken, requestId, null);
        Type localVarReturnType = new TypeToken<ViewGdprRequestByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * View a GDPR request (asynchronously)
     * ## View a GDPR request  Retrieves a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-view-a-gdpr-request ----------------------------
     * @param apiToken  (required)
     * @param requestId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call viewGdprRequestByIdAsync(String apiToken, String requestId, final ApiCallback<ViewGdprRequestByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = viewGdprRequestByIdValidateBeforeCall(apiToken, requestId, _callback);
        Type localVarReturnType = new TypeToken<ViewGdprRequestByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
