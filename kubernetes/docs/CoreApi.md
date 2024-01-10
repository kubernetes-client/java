# CoreApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAPIVersions**](CoreApi.md#getAPIVersions) | **GET** /api/ |  |


<a id="getAPIVersions"></a>
# **getAPIVersions**
> V1APIVersions getAPIVersions().execute();



get available API versions

### Example
```java
// Import classes:
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.auth.*;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.openapi.apis.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    try {
      V1APIVersions result = apiInstance.getAPIVersions()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#getAPIVersions");
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

[**V1APIVersions**](V1APIVersions.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

