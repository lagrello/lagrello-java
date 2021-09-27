# AuthApi

All URIs are relative to *https://api.lagrello.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersEmailAuth**](AuthApi.md#usersEmailAuth) | **GET** /v1/users/email | Gives back user data for the magic link token
[**usersEmailSend**](AuthApi.md#usersEmailSend) | **POST** /v1/users/{userId}/email | This endpoint will be used when you want to send a magic login link to specified user
[**usersTotpAuth**](AuthApi.md#usersTotpAuth) | **GET** /v1/users/{userId}/totp | Verify users TOTP token
[**usersTotpToggle**](AuthApi.md#usersTotpToggle) | **POST** /v1/users/{userId}/totp | Enables or disables Time-based One-Time Password authentication method for specified user


<a name="usersEmailAuth"></a>
# **usersEmailAuth**
> User usersEmailAuth(payload)

Gives back user data for the magic link token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String payload = "payload_example"; // String | The magic link token the user sent
    try {
      User result = apiInstance.usersEmailAuth(payload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#usersEmailAuth");
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
 **payload** | **String**| The magic link token the user sent |

### Return type

[**User**](User.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns user data for authenticated user |  -  |
**401** | End users token is wrong, DO NOT authenticate user |  -  |
**403** | The access token used to access resource is wrong |  -  |
**404** | user could not be found |  -  |

<a name="usersEmailSend"></a>
# **usersEmailSend**
> usersEmailSend(userId)

This endpoint will be used when you want to send a magic login link to specified user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | Id of the user you want to send magic link to
    try {
      apiInstance.usersEmailSend(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#usersEmailSend");
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
 **userId** | **String**| Id of the user you want to send magic link to |

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
**204** | Email to user has been sent successfully. |  -  |
**400** | The payload of the request is not valid |  -  |
**403** | The access token used to access resource is wrong |  -  |
**404** | user could not be found |  -  |

<a name="usersTotpAuth"></a>
# **usersTotpAuth**
> User usersTotpAuth(userId, payload)

Verify users TOTP token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | Id of the user you want to verify TOTP code for
    String payload = "payload_example"; // String | The totp token the user sent
    try {
      User result = apiInstance.usersTotpAuth(userId, payload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#usersTotpAuth");
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
 **userId** | **String**| Id of the user you want to verify TOTP code for |
 **payload** | **String**| The totp token the user sent |

### Return type

[**User**](User.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success - Returns the user information if the totp token is correct |  -  |
**401** | End users token is wrong, DO NOT authenticate user |  -  |
**403** | The access token used to access resource is wrong |  -  |
**404** | user could not be found |  -  |

<a name="usersTotpToggle"></a>
# **usersTotpToggle**
> TotpEnableResponse usersTotpToggle(userId, totpEnableRequest)

Enables or disables Time-based One-Time Password authentication method for specified user

When you want your users to be able to use TOTP authentication you need to send enable set to true as payload to this endpoint. To turn off TOTP set enable to false. When enabling you will recieve the secret key and a QR code link. The QR code you need to show your user for them to scan.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | Id of the user you want to enable TOTP for
    TotpEnableRequest totpEnableRequest = new TotpEnableRequest(); // TotpEnableRequest | 
    try {
      TotpEnableResponse result = apiInstance.usersTotpToggle(userId, totpEnableRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#usersTotpToggle");
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
 **userId** | **String**| Id of the user you want to enable TOTP for |
 **totpEnableRequest** | [**TotpEnableRequest**](TotpEnableRequest.md)|  | [optional]

### Return type

[**TotpEnableResponse**](TotpEnableResponse.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Will return user&#39;s secret key and a url where QR-code image can be found |  -  |
**204** | Success when disabling TOTP for user |  -  |
**403** | The access token used to access resource is wrong |  -  |
**404** | user could not be found |  -  |

