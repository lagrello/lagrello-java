# TokensApi

All URIs are relative to *https://api.lagrello.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokensCreate**](TokensApi.md#tokensCreate) | **POST** /v1/tokens | Creates new token
[**tokensDelete**](TokensApi.md#tokensDelete) | **DELETE** /v1/tokens/{id} | Deletes specifed access token
[**tokensList**](TokensApi.md#tokensList) | **GET** /v1/tokens | Returns a list of all active tokens in tenant


<a name="tokensCreate"></a>
# **tokensCreate**
> Token tokensCreate(createTokenRequest)

Creates new token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    CreateTokenRequest createTokenRequest = new CreateTokenRequest(); // CreateTokenRequest | 
    try {
      Token result = apiInstance.tokensCreate(createTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#tokensCreate");
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
 **createTokenRequest** | [**CreateTokenRequest**](CreateTokenRequest.md)|  | [optional]

### Return type

[**Token**](Token.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the newly created token |  -  |

<a name="tokensDelete"></a>
# **tokensDelete**
> tokensDelete(tokenId)

Deletes specifed access token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    String tokenId = "ffd12fb4-da5b-4751-a9f6-d3214b418139"; // String | Id of the token you want to delete
    try {
      apiInstance.tokensDelete(tokenId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#tokensDelete");
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
 **tokenId** | **String**| Id of the token you want to delete |

### Return type

null (empty response body)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully deleted specified token |  -  |
**403** | The access token used to access resource is wrong |  -  |
**404** | token could not be found |  -  |

<a name="tokensList"></a>
# **tokensList**
> TokenList tokensList(size, page)

Returns a list of all active tokens in tenant

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    Integer size = 56; // Integer | Maximum of results per page
    Integer page = 56; // Integer | The page you want to see
    try {
      TokenList result = apiInstance.tokensList(size, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#tokensList");
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
 **size** | **Integer**| Maximum of results per page | [optional]
 **page** | **Integer**| The page you want to see | [optional]

### Return type

[**TokenList**](TokenList.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a paginated list of tokens |  -  |

