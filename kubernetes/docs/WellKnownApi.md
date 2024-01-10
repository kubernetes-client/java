# WellKnownApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getServiceAccountIssuerOpenIDConfiguration**](WellKnownApi.md#getServiceAccountIssuerOpenIDConfiguration) | **GET** /.well-known/openid-configuration |  |


<a id="getServiceAccountIssuerOpenIDConfiguration"></a>
# **getServiceAccountIssuerOpenIDConfiguration**
> String getServiceAccountIssuerOpenIDConfiguration().execute();



get service account issuer OpenID configuration, also known as the &#39;OIDC discovery doc&#39;

### Example
```java
// Import classes:
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.auth.*;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.openapi.apis.WellKnownApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    WellKnownApi apiInstance = new WellKnownApi(defaultClient);
    try {
      String result = apiInstance.getServiceAccountIssuerOpenIDConfiguration()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WellKnownApi#getServiceAccountIssuerOpenIDConfiguration");
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

**String**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

