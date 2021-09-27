/*
 * Lagrello API
 * API specification for Lagrello, a simple to use authentication service
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@lagrello.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CreateTokenRequest;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Token;
import org.openapitools.client.model.TokenList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokensApi {
    private ApiClient localVarApiClient;

    public TokensApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokensApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for tokensCreate
     * @param createTokenRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the newly created token </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokensCreateCall(CreateTokenRequest createTokenRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createTokenRequest;

        // create path and map variables
        String localVarPath = "/v1/tokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tokensCreateValidateBeforeCall(CreateTokenRequest createTokenRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = tokensCreateCall(createTokenRequest, _callback);
        return localVarCall;

    }

    /**
     * Creates new token
     * 
     * @param createTokenRequest  (optional)
     * @return Token
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the newly created token </td><td>  -  </td></tr>
     </table>
     */
    public Token tokensCreate(CreateTokenRequest createTokenRequest) throws ApiException {
        ApiResponse<Token> localVarResp = tokensCreateWithHttpInfo(createTokenRequest);
        return localVarResp.getData();
    }

    /**
     * Creates new token
     * 
     * @param createTokenRequest  (optional)
     * @return ApiResponse&lt;Token&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the newly created token </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Token> tokensCreateWithHttpInfo(CreateTokenRequest createTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = tokensCreateValidateBeforeCall(createTokenRequest, null);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates new token (asynchronously)
     * 
     * @param createTokenRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the newly created token </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokensCreateAsync(CreateTokenRequest createTokenRequest, final ApiCallback<Token> _callback) throws ApiException {

        okhttp3.Call localVarCall = tokensCreateValidateBeforeCall(createTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tokensDelete
     * @param tokenId Id of the token you want to delete (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted specified token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> token could not be found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokensDeleteCall(String tokenId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/tokens/{id}"
            .replaceAll("\\{" + "tokenId" + "\\}", localVarApiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "token" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tokensDeleteValidateBeforeCall(String tokenId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling tokensDelete(Async)");
        }
        

        okhttp3.Call localVarCall = tokensDeleteCall(tokenId, _callback);
        return localVarCall;

    }

    /**
     * Deletes specifed access token
     * 
     * @param tokenId Id of the token you want to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted specified token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> token could not be found </td><td>  -  </td></tr>
     </table>
     */
    public void tokensDelete(String tokenId) throws ApiException {
        tokensDeleteWithHttpInfo(tokenId);
    }

    /**
     * Deletes specifed access token
     * 
     * @param tokenId Id of the token you want to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted specified token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> token could not be found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> tokensDeleteWithHttpInfo(String tokenId) throws ApiException {
        okhttp3.Call localVarCall = tokensDeleteValidateBeforeCall(tokenId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Deletes specifed access token (asynchronously)
     * 
     * @param tokenId Id of the token you want to delete (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted specified token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> token could not be found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokensDeleteAsync(String tokenId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = tokensDeleteValidateBeforeCall(tokenId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for tokensList
     * @param size Maximum of results per page (optional)
     * @param page The page you want to see (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paginated list of tokens </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokensListCall(Integer size, Integer page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/tokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tokensListValidateBeforeCall(Integer size, Integer page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = tokensListCall(size, page, _callback);
        return localVarCall;

    }

    /**
     * Returns a list of all active tokens in tenant
     * 
     * @param size Maximum of results per page (optional)
     * @param page The page you want to see (optional)
     * @return TokenList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paginated list of tokens </td><td>  -  </td></tr>
     </table>
     */
    public TokenList tokensList(Integer size, Integer page) throws ApiException {
        ApiResponse<TokenList> localVarResp = tokensListWithHttpInfo(size, page);
        return localVarResp.getData();
    }

    /**
     * Returns a list of all active tokens in tenant
     * 
     * @param size Maximum of results per page (optional)
     * @param page The page you want to see (optional)
     * @return ApiResponse&lt;TokenList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paginated list of tokens </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TokenList> tokensListWithHttpInfo(Integer size, Integer page) throws ApiException {
        okhttp3.Call localVarCall = tokensListValidateBeforeCall(size, page, null);
        Type localVarReturnType = new TypeToken<TokenList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of all active tokens in tenant (asynchronously)
     * 
     * @param size Maximum of results per page (optional)
     * @param page The page you want to see (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paginated list of tokens </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokensListAsync(Integer size, Integer page, final ApiCallback<TokenList> _callback) throws ApiException {

        okhttp3.Call localVarCall = tokensListValidateBeforeCall(size, page, _callback);
        Type localVarReturnType = new TypeToken<TokenList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}