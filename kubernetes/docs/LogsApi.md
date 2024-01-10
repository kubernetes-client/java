# LogsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**logFileHandler**](LogsApi.md#logFileHandler) | **GET** /logs/{logpath} |  |
| [**logFileListHandler**](LogsApi.md#logFileListHandler) | **GET** /logs/ |  |


<a id="logFileHandler"></a>
# **logFileHandler**
> logFileHandler(logpath).execute();



### Example
```java
// Import classes:
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.auth.*;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.openapi.apis.LogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    LogsApi apiInstance = new LogsApi(defaultClient);
    String logpath = "logpath_example"; // String | path to the log
    try {
      apiInstance.logFileHandler(logpath)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#logFileHandler");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **logpath** | **String**| path to the log | |

### Return type

null (empty response body)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |

<a id="logFileListHandler"></a>
# **logFileListHandler**
> logFileListHandler().execute();



### Example
```java
// Import classes:
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.auth.*;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.openapi.apis.LogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    LogsApi apiInstance = new LogsApi(defaultClient);
    try {
      apiInstance.logFileListHandler()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#logFileListHandler");
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

null (empty response body)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |

