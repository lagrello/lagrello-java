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


import org.openapitools.client.model.ActivateTenantRequest;
import org.openapitools.client.model.CreateTenantRequest;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Tenant;
import org.openapitools.client.model.UpdateTenantRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TenantsApi {
    private ApiClient localVarApiClient;

    public TenantsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TenantsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for tenantUpdate
     * @param updateTenantRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated tenant </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantUpdateCall(UpdateTenantRequest updateTenantRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = updateTenantRequest;

        // create path and map variables
        String localVarPath = "/v1/tenant";

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
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tenantUpdateValidateBeforeCall(UpdateTenantRequest updateTenantRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = tenantUpdateCall(updateTenantRequest, _callback);
        return localVarCall;

    }

    /**
     * Updates tenant information
     * This endpoint is used to update certain information about your tenant. For example if you want to update your tenant&#39;s callback URL you will do that here.
     * @param updateTenantRequest  (optional)
     * @return Tenant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated tenant </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public Tenant tenantUpdate(UpdateTenantRequest updateTenantRequest) throws ApiException {
        ApiResponse<Tenant> localVarResp = tenantUpdateWithHttpInfo(updateTenantRequest);
        return localVarResp.getData();
    }

    /**
     * Updates tenant information
     * This endpoint is used to update certain information about your tenant. For example if you want to update your tenant&#39;s callback URL you will do that here.
     * @param updateTenantRequest  (optional)
     * @return ApiResponse&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated tenant </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tenant> tenantUpdateWithHttpInfo(UpdateTenantRequest updateTenantRequest) throws ApiException {
        okhttp3.Call localVarCall = tenantUpdateValidateBeforeCall(updateTenantRequest, null);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates tenant information (asynchronously)
     * This endpoint is used to update certain information about your tenant. For example if you want to update your tenant&#39;s callback URL you will do that here.
     * @param updateTenantRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated tenant </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantUpdateAsync(UpdateTenantRequest updateTenantRequest, final ApiCallback<Tenant> _callback) throws ApiException {

        okhttp3.Call localVarCall = tenantUpdateValidateBeforeCall(updateTenantRequest, _callback);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tenantsActivate
     * @param activateTenantRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns tenant information about the newly activated tenant. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The payload of the request is not valid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantsActivateCall(ActivateTenantRequest activateTenantRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = activateTenantRequest;

        // create path and map variables
        String localVarPath = "/v1/tenant/activate";

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
    private okhttp3.Call tenantsActivateValidateBeforeCall(ActivateTenantRequest activateTenantRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = tenantsActivateCall(activateTenantRequest, _callback);
        return localVarCall;

    }

    /**
     * Activates the tenant, checks that all necessary information to activate a tenant is included
     * 
     * @param activateTenantRequest  (optional)
     * @return Tenant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns tenant information about the newly activated tenant. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The payload of the request is not valid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public Tenant tenantsActivate(ActivateTenantRequest activateTenantRequest) throws ApiException {
        ApiResponse<Tenant> localVarResp = tenantsActivateWithHttpInfo(activateTenantRequest);
        return localVarResp.getData();
    }

    /**
     * Activates the tenant, checks that all necessary information to activate a tenant is included
     * 
     * @param activateTenantRequest  (optional)
     * @return ApiResponse&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns tenant information about the newly activated tenant. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The payload of the request is not valid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tenant> tenantsActivateWithHttpInfo(ActivateTenantRequest activateTenantRequest) throws ApiException {
        okhttp3.Call localVarCall = tenantsActivateValidateBeforeCall(activateTenantRequest, null);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Activates the tenant, checks that all necessary information to activate a tenant is included (asynchronously)
     * 
     * @param activateTenantRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns tenant information about the newly activated tenant. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The payload of the request is not valid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantsActivateAsync(ActivateTenantRequest activateTenantRequest, final ApiCallback<Tenant> _callback) throws ApiException {

        okhttp3.Call localVarCall = tenantsActivateValidateBeforeCall(activateTenantRequest, _callback);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tenantsCreate
     * @param createTenantRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns information about the newly created tenant </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantsCreateCall(CreateTenantRequest createTenantRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createTenantRequest;

        // create path and map variables
        String localVarPath = "/v1/tenant";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tenantsCreateValidateBeforeCall(CreateTenantRequest createTenantRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = tenantsCreateCall(createTenantRequest, _callback);
        return localVarCall;

    }

    /**
     * Creates new tenant
     * 
     * @param createTenantRequest  (optional)
     * @return Tenant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns information about the newly created tenant </td><td>  -  </td></tr>
     </table>
     */
    public Tenant tenantsCreate(CreateTenantRequest createTenantRequest) throws ApiException {
        ApiResponse<Tenant> localVarResp = tenantsCreateWithHttpInfo(createTenantRequest);
        return localVarResp.getData();
    }

    /**
     * Creates new tenant
     * 
     * @param createTenantRequest  (optional)
     * @return ApiResponse&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns information about the newly created tenant </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tenant> tenantsCreateWithHttpInfo(CreateTenantRequest createTenantRequest) throws ApiException {
        okhttp3.Call localVarCall = tenantsCreateValidateBeforeCall(createTenantRequest, null);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates new tenant (asynchronously)
     * 
     * @param createTenantRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns information about the newly created tenant </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantsCreateAsync(CreateTenantRequest createTenantRequest, final ApiCallback<Tenant> _callback) throws ApiException {

        okhttp3.Call localVarCall = tenantsCreateValidateBeforeCall(createTenantRequest, _callback);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tenantsCreate_0
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Sucess, will send verification email before deleting </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantsCreate_0Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/tenant";

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
    private okhttp3.Call tenantsCreate_0ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = tenantsCreate_0Call(_callback);
        return localVarCall;

    }

    /**
     * Deletes tenant caller is part of, will send verification email before deleting tenant
     * This endpoint will delete your tenant. Will send an email to the admin email address of the tenant confirming that you want to delete your tenant before deletion.
     * @return Tenant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Sucess, will send verification email before deleting </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public Tenant tenantsCreate_0() throws ApiException {
        ApiResponse<Tenant> localVarResp = tenantsCreate_0WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Deletes tenant caller is part of, will send verification email before deleting tenant
     * This endpoint will delete your tenant. Will send an email to the admin email address of the tenant confirming that you want to delete your tenant before deletion.
     * @return ApiResponse&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Sucess, will send verification email before deleting </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tenant> tenantsCreate_0WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = tenantsCreate_0ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deletes tenant caller is part of, will send verification email before deleting tenant (asynchronously)
     * This endpoint will delete your tenant. Will send an email to the admin email address of the tenant confirming that you want to delete your tenant before deletion.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Sucess, will send verification email before deleting </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantsCreate_0Async(final ApiCallback<Tenant> _callback) throws ApiException {

        okhttp3.Call localVarCall = tenantsCreate_0ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tenantsGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Gives back the tenant call is part of </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantsGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/tenant";

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
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tenantsGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = tenantsGetCall(_callback);
        return localVarCall;

    }

    /**
     * Returns the tenant information the caller is part of
     * 
     * @return Tenant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Gives back the tenant call is part of </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public Tenant tenantsGet() throws ApiException {
        ApiResponse<Tenant> localVarResp = tenantsGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Returns the tenant information the caller is part of
     * 
     * @return ApiResponse&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Gives back the tenant call is part of </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Tenant> tenantsGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = tenantsGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns the tenant information the caller is part of (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Gives back the tenant call is part of </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The access token used to access resource is wrong </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tenantsGetAsync(final ApiCallback<Tenant> _callback) throws ApiException {

        okhttp3.Call localVarCall = tenantsGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}