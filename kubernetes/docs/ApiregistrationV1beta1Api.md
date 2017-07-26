# ApiregistrationV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAPIService**](ApiregistrationV1beta1Api.md#createAPIService) | **POST** /apis/apiregistration.k8s.io/v1beta1/apiservices | 
[**deleteAPIService**](ApiregistrationV1beta1Api.md#deleteAPIService) | **DELETE** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name} | 
[**deleteCollectionAPIService**](ApiregistrationV1beta1Api.md#deleteCollectionAPIService) | **DELETE** /apis/apiregistration.k8s.io/v1beta1/apiservices | 
[**getAPIResources**](ApiregistrationV1beta1Api.md#getAPIResources) | **GET** /apis/apiregistration.k8s.io/v1beta1/ | 
[**listAPIService**](ApiregistrationV1beta1Api.md#listAPIService) | **GET** /apis/apiregistration.k8s.io/v1beta1/apiservices | 
[**patchAPIService**](ApiregistrationV1beta1Api.md#patchAPIService) | **PATCH** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name} | 
[**readAPIService**](ApiregistrationV1beta1Api.md#readAPIService) | **GET** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name} | 
[**replaceAPIService**](ApiregistrationV1beta1Api.md#replaceAPIService) | **PUT** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name} | 
[**replaceAPIServiceStatus**](ApiregistrationV1beta1Api.md#replaceAPIServiceStatus) | **PUT** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name}/status | 


<a name="createAPIService"></a>
# **createAPIService**
> V1beta1APIService createAPIService(body, pretty)



create an APIService

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
V1beta1APIService body = new V1beta1APIService(); // V1beta1APIService | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1APIService result = apiInstance.createAPIService(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#createAPIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1APIService**](V1beta1APIService.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1APIService**](V1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteAPIService"></a>
# **deleteAPIService**
> V1Status deleteAPIService(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete an APIService

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    V1Status result = apiInstance.deleteAPIService(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#deleteAPIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCollectionAPIService"></a>
# **deleteCollectionAPIService**
> V1Status deleteCollectionAPIService(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of APIService

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1Status result = apiInstance.deleteCollectionAPIService(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#deleteCollectionAPIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1Status**](V1Status.md)

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
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
try {
    V1APIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#getAPIResources");
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

<a name="listAPIService"></a>
# **listAPIService**
> V1beta1APIServiceList listAPIService(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind APIService

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1beta1APIServiceList result = apiInstance.listAPIService(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#listAPIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1beta1APIServiceList**](V1beta1APIServiceList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchAPIService"></a>
# **patchAPIService**
> V1beta1APIService patchAPIService(name, body, pretty)



partially update the specified APIService

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1APIService result = apiInstance.patchAPIService(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#patchAPIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1APIService**](V1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readAPIService"></a>
# **readAPIService**
> V1beta1APIService readAPIService(name, pretty, exact, export)



read the specified APIService

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    V1beta1APIService result = apiInstance.readAPIService(name, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#readAPIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**V1beta1APIService**](V1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceAPIService"></a>
# **replaceAPIService**
> V1beta1APIService replaceAPIService(name, body, pretty)



replace the specified APIService

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
V1beta1APIService body = new V1beta1APIService(); // V1beta1APIService | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1APIService result = apiInstance.replaceAPIService(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#replaceAPIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **body** | [**V1beta1APIService**](V1beta1APIService.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1APIService**](V1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceAPIServiceStatus"></a>
# **replaceAPIServiceStatus**
> V1beta1APIService replaceAPIServiceStatus(name, body, pretty)



replace status of the specified APIService

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ApiregistrationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
V1beta1APIService body = new V1beta1APIService(); // V1beta1APIService | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1APIService result = apiInstance.replaceAPIServiceStatus(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#replaceAPIServiceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **body** | [**V1beta1APIService**](V1beta1APIService.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1APIService**](V1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

