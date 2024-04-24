# AuthenticationV1alpha1Api

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSelfSubjectReview**](AuthenticationV1alpha1Api.md#createSelfSubjectReview) | **POST** /apis/authentication.k8s.io/v1alpha1/selfsubjectreviews |  |
| [**getAPIResources**](AuthenticationV1alpha1Api.md#getAPIResources) | **GET** /apis/authentication.k8s.io/v1alpha1/ |  |


<a id="createSelfSubjectReview"></a>
# **createSelfSubjectReview**
> V1alpha1SelfSubjectReview createSelfSubjectReview(body).dryRun(dryRun).fieldManager(fieldManager).fieldValidation(fieldValidation).pretty(pretty).execute();



create a SelfSubjectReview

### Example
```java
// Import classes:
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.auth.*;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.openapi.apis.AuthenticationV1alpha1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    AuthenticationV1alpha1Api apiInstance = new AuthenticationV1alpha1Api(defaultClient);
    V1alpha1SelfSubjectReview body = new V1alpha1SelfSubjectReview(); // V1alpha1SelfSubjectReview | 
    String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
    String fieldManager = "fieldManager_example"; // String | fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
    String fieldValidation = "fieldValidation_example"; // String | fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered.
    String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed. Defaults to 'false' unless the user-agent indicates a browser or command-line HTTP tool (curl and wget).
    try {
      V1alpha1SelfSubjectReview result = apiInstance.createSelfSubjectReview(body)
            .dryRun(dryRun)
            .fieldManager(fieldManager)
            .fieldValidation(fieldValidation)
            .pretty(pretty)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationV1alpha1Api#createSelfSubjectReview");
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
| **body** | [**V1alpha1SelfSubjectReview**](V1alpha1SelfSubjectReview.md)|  | |
| **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional] |
| **fieldManager** | **String**| fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. | [optional] |
| **fieldValidation** | **String**| fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. | [optional] |
| **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). | [optional] |

### Return type

[**V1alpha1SelfSubjectReview**](V1alpha1SelfSubjectReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **202** | Accepted |  -  |
| **401** | Unauthorized |  -  |

<a id="getAPIResources"></a>
# **getAPIResources**
> V1APIResourceList getAPIResources().execute();



get available resources

### Example
```java
// Import classes:
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.auth.*;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.openapi.apis.AuthenticationV1alpha1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    AuthenticationV1alpha1Api apiInstance = new AuthenticationV1alpha1Api(defaultClient);
    try {
      V1APIResourceList result = apiInstance.getAPIResources()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationV1alpha1Api#getAPIResources");
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

[**V1APIResourceList**](V1APIResourceList.md)

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

