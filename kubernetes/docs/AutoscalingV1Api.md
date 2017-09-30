# AutoscalingV1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#createNamespacedHorizontalPodAutoscaler) | **POST** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
[**deleteCollectionNamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#deleteCollectionNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
[**deleteNamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#deleteNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**getAPIResources**](AutoscalingV1Api.md#getAPIResources) | **GET** /apis/autoscaling/v1/ | 
[**listHorizontalPodAutoscalerForAllNamespaces**](AutoscalingV1Api.md#listHorizontalPodAutoscalerForAllNamespaces) | **GET** /apis/autoscaling/v1/horizontalpodautoscalers | 
[**listNamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#listNamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
[**patchNamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#patchNamespacedHorizontalPodAutoscaler) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**patchNamespacedHorizontalPodAutoscalerStatus**](AutoscalingV1Api.md#patchNamespacedHorizontalPodAutoscalerStatus) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
[**readNamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#readNamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**readNamespacedHorizontalPodAutoscalerStatus**](AutoscalingV1Api.md#readNamespacedHorizontalPodAutoscalerStatus) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
[**replaceNamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#replaceNamespacedHorizontalPodAutoscaler) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**replaceNamespacedHorizontalPodAutoscalerStatus**](AutoscalingV1Api.md#replaceNamespacedHorizontalPodAutoscalerStatus) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 


<a name="createNamespacedHorizontalPodAutoscaler"></a>
# **createNamespacedHorizontalPodAutoscaler**
> V1HorizontalPodAutoscaler createNamespacedHorizontalPodAutoscaler(namespace, body, pretty)



create a HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1HorizontalPodAutoscaler body = new V1HorizontalPodAutoscaler(); // V1HorizontalPodAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1HorizontalPodAutoscaler result = apiInstance.createNamespacedHorizontalPodAutoscaler(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#createNamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCollectionNamespacedHorizontalPodAutoscaler"></a>
# **deleteCollectionNamespacedHorizontalPodAutoscaler**
> V1Status deleteCollectionNamespacedHorizontalPodAutoscaler(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



delete collection of HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1Status result = apiInstance.deleteCollectionNamespacedHorizontalPodAutoscaler(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#deleteCollectionNamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **_continue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **limit** | **Integer**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
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

<a name="deleteNamespacedHorizontalPodAutoscaler"></a>
# **deleteNamespacedHorizontalPodAutoscaler**
> V1Status deleteNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    V1Status result = apiInstance.deleteNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#deleteNamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
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
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
try {
    V1APIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#getAPIResources");
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

<a name="listHorizontalPodAutoscalerForAllNamespaces"></a>
# **listHorizontalPodAutoscalerForAllNamespaces**
> V1HorizontalPodAutoscalerList listHorizontalPodAutoscalerForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1HorizontalPodAutoscalerList result = apiInstance.listHorizontalPodAutoscalerForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#listHorizontalPodAutoscalerForAllNamespaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_continue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **limit** | **Integer**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1HorizontalPodAutoscalerList**](V1HorizontalPodAutoscalerList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listNamespacedHorizontalPodAutoscaler"></a>
# **listNamespacedHorizontalPodAutoscaler**
> V1HorizontalPodAutoscalerList listNamespacedHorizontalPodAutoscaler(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1HorizontalPodAutoscalerList result = apiInstance.listNamespacedHorizontalPodAutoscaler(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#listNamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **_continue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **limit** | **Integer**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1HorizontalPodAutoscalerList**](V1HorizontalPodAutoscalerList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchNamespacedHorizontalPodAutoscaler"></a>
# **patchNamespacedHorizontalPodAutoscaler**
> V1HorizontalPodAutoscaler patchNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty)



partially update the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1HorizontalPodAutoscaler result = apiInstance.patchNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#patchNamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedHorizontalPodAutoscalerStatus"></a>
# **patchNamespacedHorizontalPodAutoscalerStatus**
> V1HorizontalPodAutoscaler patchNamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty)



partially update status of the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1HorizontalPodAutoscaler result = apiInstance.patchNamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#patchNamespacedHorizontalPodAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedHorizontalPodAutoscaler"></a>
# **readNamespacedHorizontalPodAutoscaler**
> V1HorizontalPodAutoscaler readNamespacedHorizontalPodAutoscaler(name, namespace, pretty, exact, export)



read the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    V1HorizontalPodAutoscaler result = apiInstance.readNamespacedHorizontalPodAutoscaler(name, namespace, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#readNamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedHorizontalPodAutoscalerStatus"></a>
# **readNamespacedHorizontalPodAutoscalerStatus**
> V1HorizontalPodAutoscaler readNamespacedHorizontalPodAutoscalerStatus(name, namespace, pretty)



read status of the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1HorizontalPodAutoscaler result = apiInstance.readNamespacedHorizontalPodAutoscalerStatus(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#readNamespacedHorizontalPodAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedHorizontalPodAutoscaler"></a>
# **replaceNamespacedHorizontalPodAutoscaler**
> V1HorizontalPodAutoscaler replaceNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty)



replace the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1HorizontalPodAutoscaler body = new V1HorizontalPodAutoscaler(); // V1HorizontalPodAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1HorizontalPodAutoscaler result = apiInstance.replaceNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#replaceNamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedHorizontalPodAutoscalerStatus"></a>
# **replaceNamespacedHorizontalPodAutoscalerStatus**
> V1HorizontalPodAutoscaler replaceNamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty)



replace status of the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AutoscalingV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1HorizontalPodAutoscaler body = new V1HorizontalPodAutoscaler(); // V1HorizontalPodAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1HorizontalPodAutoscaler result = apiInstance.replaceNamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#replaceNamespacedHorizontalPodAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1HorizontalPodAutoscaler**](V1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

