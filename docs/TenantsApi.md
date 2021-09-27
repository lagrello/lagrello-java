# TenantsApi

All URIs are relative to *https://api.lagrello.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tenantUpdate**](TenantsApi.md#tenantUpdate) | **PATCH** /v1/tenant | Updates tenant information
[**tenantsActivate**](TenantsApi.md#tenantsActivate) | **POST** /v1/tenant/activate | Activates the tenant, checks that all necessary information to activate a tenant is included
[**tenantsCreate**](TenantsApi.md#tenantsCreate) | **POST** /v1/tenant | Creates new tenant
[**tenantsCreate_0**](TenantsApi.md#tenantsCreate_0) | **DELETE** /v1/tenant | Deletes tenant caller is part of, will send verification email before deleting tenant
[**tenantsGet**](TenantsApi.md#tenantsGet) | **GET** /v1/tenant | Returns the tenant information the caller is part of


<a name="tenantUpdate"></a>
# **tenantUpdate**
> Tenant tenantUpdate(updateTenantRequest)

Updates tenant information

This endpoint is used to update certain information about your tenant. For example if you want to update your tenant&#39;s callback URL you will do that here.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    UpdateTenantRequest updateTenantRequest = new UpdateTenantRequest(); // UpdateTenantRequest | 
    try {
      Tenant result = apiInstance.tenantUpdate(updateTenantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#tenantUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateTenantRequest** | [**UpdateTenantRequest**](UpdateTenantRequest.md)|  | [optional]

### Return type

[**Tenant**](Tenant.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated tenant |  -  |
**403** | The access token used to access resource is wrong |  -  |

<a name="tenantsActivate"></a>
# **tenantsActivate**
> Tenant tenantsActivate(activateTenantRequest)

Activates the tenant, checks that all necessary information to activate a tenant is included

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    ActivateTenantRequest activateTenantRequest = new ActivateTenantRequest(); // ActivateTenantRequest | 
    try {
      Tenant result = apiInstance.tenantsActivate(activateTenantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#tenantsActivate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activateTenantRequest** | [**ActivateTenantRequest**](ActivateTenantRequest.md)|  | [optional]

### Return type

[**Tenant**](Tenant.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns tenant information about the newly activated tenant. |  -  |
**400** | The payload of the request is not valid |  -  |
**403** | The access token used to access resource is wrong |  -  |

<a name="tenantsCreate"></a>
# **tenantsCreate**
> Tenant tenantsCreate(createTenantRequest)

Creates new tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    CreateTenantRequest createTenantRequest = new CreateTenantRequest(); // CreateTenantRequest | 
    try {
      Tenant result = apiInstance.tenantsCreate(createTenantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#tenantsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTenantRequest** | [**CreateTenantRequest**](CreateTenantRequest.md)|  | [optional]

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Returns information about the newly created tenant |  -  |

<a name="tenantsCreate_0"></a>
# **tenantsCreate_0**
> Tenant tenantsCreate_0()

Deletes tenant caller is part of, will send verification email before deleting tenant

This endpoint will delete your tenant. Will send an email to the admin email address of the tenant confirming that you want to delete your tenant before deletion.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    try {
      Tenant result = apiInstance.tenantsCreate_0();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#tenantsCreate_0");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tenant**](Tenant.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Sucess, will send verification email before deleting |  -  |
**403** | The access token used to access resource is wrong |  -  |

<a name="tenantsGet"></a>
# **tenantsGet**
> Tenant tenantsGet()

Returns the tenant information the caller is part of

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    try {
      Tenant result = apiInstance.tenantsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#tenantsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tenant**](Tenant.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Gives back the tenant call is part of |  -  |
**403** | The access token used to access resource is wrong |  -  |

