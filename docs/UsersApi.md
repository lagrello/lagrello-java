# UsersApi

All URIs are relative to *https://api.lagrello.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersCreate**](UsersApi.md#usersCreate) | **POST** /v1/users | Creates a user in tenant, tenant is determined from the token
[**usersDelete**](UsersApi.md#usersDelete) | **DELETE** /v1/users/{userId} | Deletes specified user
[**usersGet**](UsersApi.md#usersGet) | **GET** /v1/users/{userId} | Returns specified user
[**usersUpdate**](UsersApi.md#usersUpdate) | **PATCH** /v1/users/{userId} | Updates specified user


<a name="usersCreate"></a>
# **usersCreate**
> User usersCreate(createUserRequest)

Creates a user in tenant, tenant is determined from the token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | 
    try {
      User result = apiInstance.usersCreate(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersCreate");
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
 **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successfully created a new user |  -  |
**403** | The access token used to access resource is wrong |  -  |
**409** | Returned when user already exist |  -  |

<a name="usersDelete"></a>
# **usersDelete**
> usersDelete(userId)

Deletes specified user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userId = "userId_example"; // String | Id of the user you want to delete
    try {
      apiInstance.usersDelete(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersDelete");
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
 **userId** | **String**| Id of the user you want to delete |

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
**204** | Successfully deleted specified user |  -  |
**403** | The access token used to access resource is wrong |  -  |
**404** | user could not be found |  -  |

<a name="usersGet"></a>
# **usersGet**
> User usersGet(userId)

Returns specified user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userId = "userId_example"; // String | userId of user you want to fetch information about
    try {
      User result = apiInstance.usersGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersGet");
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
 **userId** | **String**| userId of user you want to fetch information about |

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
**200** | Returns user data for specified user |  -  |
**403** | The access token used to access resource is wrong |  -  |
**404** | user could not be found |  -  |

<a name="usersUpdate"></a>
# **usersUpdate**
> User usersUpdate(userId, updateUserRequest)

Updates specified user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userId = "userId_example"; // String | Id of the user you want to update
    UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | 
    try {
      User result = apiInstance.usersUpdate(userId, updateUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersUpdate");
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
 **userId** | **String**| Id of the user you want to update |
 **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated specified user |  -  |
**403** | The access token used to access resource is wrong |  -  |
**404** | user could not be found |  -  |

