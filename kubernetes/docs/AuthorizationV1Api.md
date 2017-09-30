# AuthorizationV1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespacedLocalSubjectAccessReview**](AuthorizationV1Api.md#createNamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/namespaces/{namespace}/localsubjectaccessreviews | 
[**createSelfSubjectAccessReview**](AuthorizationV1Api.md#createSelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/selfsubjectaccessreviews | 
[**createSelfSubjectRulesReview**](AuthorizationV1Api.md#createSelfSubjectRulesReview) | **POST** /apis/authorization.k8s.io/v1/selfsubjectrulesreviews | 
[**createSubjectAccessReview**](AuthorizationV1Api.md#createSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/subjectaccessreviews | 
[**getAPIResources**](AuthorizationV1Api.md#getAPIResources) | **GET** /apis/authorization.k8s.io/v1/ | 


<a name="createNamespacedLocalSubjectAccessReview"></a>
# **createNamespacedLocalSubjectAccessReview**
> V1LocalSubjectAccessReview createNamespacedLocalSubjectAccessReview(namespace, body, pretty)



create a LocalSubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1LocalSubjectAccessReview body = new V1LocalSubjectAccessReview(); // V1LocalSubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1LocalSubjectAccessReview result = apiInstance.createNamespacedLocalSubjectAccessReview(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createNamespacedLocalSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1LocalSubjectAccessReview**](V1LocalSubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1LocalSubjectAccessReview**](V1LocalSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createSelfSubjectAccessReview"></a>
# **createSelfSubjectAccessReview**
> V1SelfSubjectAccessReview createSelfSubjectAccessReview(body, pretty)



create a SelfSubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
V1SelfSubjectAccessReview body = new V1SelfSubjectAccessReview(); // V1SelfSubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1SelfSubjectAccessReview result = apiInstance.createSelfSubjectAccessReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createSelfSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1SelfSubjectAccessReview**](V1SelfSubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1SelfSubjectAccessReview**](V1SelfSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createSelfSubjectRulesReview"></a>
# **createSelfSubjectRulesReview**
> V1SelfSubjectRulesReview createSelfSubjectRulesReview(body, pretty)



create a SelfSubjectRulesReview

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
V1SelfSubjectRulesReview body = new V1SelfSubjectRulesReview(); // V1SelfSubjectRulesReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1SelfSubjectRulesReview result = apiInstance.createSelfSubjectRulesReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createSelfSubjectRulesReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1SelfSubjectRulesReview**](V1SelfSubjectRulesReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1SelfSubjectRulesReview**](V1SelfSubjectRulesReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createSubjectAccessReview"></a>
# **createSubjectAccessReview**
> V1SubjectAccessReview createSubjectAccessReview(body, pretty)



create a SubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
V1SubjectAccessReview body = new V1SubjectAccessReview(); // V1SubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1SubjectAccessReview result = apiInstance.createSubjectAccessReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1SubjectAccessReview**](V1SubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1SubjectAccessReview**](V1SubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAPIResources"></a>
# **getAPIResources**
> V1APIResourceList getAPIResources()



get available resources

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
try {
    V1APIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#getAPIResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1APIResourceList**](V1APIResourceList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

