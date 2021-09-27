# ImagesApi

All URIs are relative to *https://api.lagrello.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imagesTotp**](ImagesApi.md#imagesTotp) | **GET** /v1/images/totp | Returns a generated QR code


<a name="imagesTotp"></a>
# **imagesTotp**
> File imagesTotp(tenantName, userId, userSecret)

Returns a generated QR code

This endpoint does not do any lookups of any sort. It will just generate a QR code from the parameters supplied to it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lagrello.com");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String tenantName = "tenantName_example"; // String | The company name you your users to see in their TOTP application
    String userId = "userId_example"; // String | The userId of the user you want to create the TOTP QR image for
    String userSecret = "userSecret_example"; // String | The TOTP secret for the specified user
    try {
      File result = apiInstance.imagesTotp(tenantName, userId, userSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagesTotp");
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
 **tenantName** | **String**| The company name you your users to see in their TOTP application | [optional]
 **userId** | **String**| The userId of the user you want to create the TOTP QR image for | [optional]
 **userSecret** | **String**| The TOTP secret for the specified user | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Gives back the QR code as an image |  -  |
**400** | The payload of the request is not valid |  -  |

