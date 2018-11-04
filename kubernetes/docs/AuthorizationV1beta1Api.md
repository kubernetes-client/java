# AuthorizationV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespacedLocalSubjectAccessReview**](AuthorizationV1beta1Api.md#createNamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews | 
[**createSelfSubjectAccessReview**](AuthorizationV1beta1Api.md#createSelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews | 
[**createSelfSubjectRulesReview**](AuthorizationV1beta1Api.md#createSelfSubjectRulesReview) | **POST** /apis/authorization.k8s.io/v1beta1/selfsubjectrulesreviews | 
[**createSubjectAccessReview**](AuthorizationV1beta1Api.md#createSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/subjectaccessreviews | 
[**getAPIResources**](AuthorizationV1beta1Api.md#getAPIResources) | **GET** /apis/authorization.k8s.io/v1beta1/ | 


<a name="createNamespacedLocalSubjectAccessReview"></a>
# **createNamespacedLocalSubjectAccessReview**
> V1beta1LocalSubjectAccessReview createNamespacedLocalSubjectAccessReview(namespace, body, dryRun, includeUninitialized, pretty)



create a LocalSubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1LocalSubjectAccessReview body = new V1beta1LocalSubjectAccessReview(); // V1beta1LocalSubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1LocalSubjectAccessReview result = apiInstance.createNamespacedLocalSubjectAccessReview(namespace, body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createNamespacedLocalSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1LocalSubjectAccessReview**](V1beta1LocalSubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1LocalSubjectAccessReview**](V1beta1LocalSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createSelfSubjectAccessReview"></a>
# **createSelfSubjectAccessReview**
> V1beta1SelfSubjectAccessReview createSelfSubjectAccessReview(body, dryRun, includeUninitialized, pretty)



create a SelfSubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
V1beta1SelfSubjectAccessReview body = new V1beta1SelfSubjectAccessReview(); // V1beta1SelfSubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1SelfSubjectAccessReview result = apiInstance.createSelfSubjectAccessReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createSelfSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1SelfSubjectAccessReview**](V1beta1SelfSubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1SelfSubjectAccessReview**](V1beta1SelfSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createSelfSubjectRulesReview"></a>
# **createSelfSubjectRulesReview**
> V1beta1SelfSubjectRulesReview createSelfSubjectRulesReview(body, dryRun, includeUninitialized, pretty)



create a SelfSubjectRulesReview

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
V1beta1SelfSubjectRulesReview body = new V1beta1SelfSubjectRulesReview(); // V1beta1SelfSubjectRulesReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1SelfSubjectRulesReview result = apiInstance.createSelfSubjectRulesReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createSelfSubjectRulesReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1SelfSubjectRulesReview**](V1beta1SelfSubjectRulesReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1SelfSubjectRulesReview**](V1beta1SelfSubjectRulesReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createSubjectAccessReview"></a>
# **createSubjectAccessReview**
> V1beta1SubjectAccessReview createSubjectAccessReview(body, dryRun, includeUninitialized, pretty)



create a SubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
V1beta1SubjectAccessReview body = new V1beta1SubjectAccessReview(); // V1beta1SubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1SubjectAccessReview result = apiInstance.createSubjectAccessReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1SubjectAccessReview**](V1beta1SubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1SubjectAccessReview**](V1beta1SubjectAccessReview.md)

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
//import io.kubernetes.client.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
try {
    V1APIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#getAPIResources");
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

