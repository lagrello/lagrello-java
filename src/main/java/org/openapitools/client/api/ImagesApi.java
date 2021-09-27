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


import org.openapitools.client.model.Error;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImagesApi {
    private ApiClient localVarApiClient;

    public ImagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImagesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for imagesTotp
     * @param tenantName The company name you your users to see in their TOTP application (optional)
     * @param userId The userId of the user you want to create the TOTP QR image for (optional)
     * @param userSecret The TOTP secret for the specified user (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Gives back the QR code as an image </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The payload of the request is not valid </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imagesTotpCall(String tenantName, String userId, String userSecret, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/images/totp";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tenantName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantName", tenantName));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (userSecret != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userSecret", userSecret));
        }

        final String[] localVarAccepts = {
            "image/png", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call imagesTotpValidateBeforeCall(String tenantName, String userId, String userSecret, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = imagesTotpCall(tenantName, userId, userSecret, _callback);
        return localVarCall;

    }

    /**
     * Returns a generated QR code
     * This endpoint does not do any lookups of any sort. It will just generate a QR code from the parameters supplied to it.
     * @param tenantName The company name you your users to see in their TOTP application (optional)
     * @param userId The userId of the user you want to create the TOTP QR image for (optional)
     * @param userSecret The TOTP secret for the specified user (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Gives back the QR code as an image </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The payload of the request is not valid </td><td>  -  </td></tr>
     </table>
     */
    public File imagesTotp(String tenantName, String userId, String userSecret) throws ApiException {
        ApiResponse<File> localVarResp = imagesTotpWithHttpInfo(tenantName, userId, userSecret);
        return localVarResp.getData();
    }

    /**
     * Returns a generated QR code
     * This endpoint does not do any lookups of any sort. It will just generate a QR code from the parameters supplied to it.
     * @param tenantName The company name you your users to see in their TOTP application (optional)
     * @param userId The userId of the user you want to create the TOTP QR image for (optional)
     * @param userSecret The TOTP secret for the specified user (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Gives back the QR code as an image </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The payload of the request is not valid </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> imagesTotpWithHttpInfo(String tenantName, String userId, String userSecret) throws ApiException {
        okhttp3.Call localVarCall = imagesTotpValidateBeforeCall(tenantName, userId, userSecret, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a generated QR code (asynchronously)
     * This endpoint does not do any lookups of any sort. It will just generate a QR code from the parameters supplied to it.
     * @param tenantName The company name you your users to see in their TOTP application (optional)
     * @param userId The userId of the user you want to create the TOTP QR image for (optional)
     * @param userSecret The TOTP secret for the specified user (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Gives back the QR code as an image </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The payload of the request is not valid </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imagesTotpAsync(String tenantName, String userId, String userSecret, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = imagesTotpValidateBeforeCall(tenantName, userId, userSecret, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
