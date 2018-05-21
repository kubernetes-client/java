# AppsV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespacedControllerRevision**](AppsV1beta1Api.md#createNamespacedControllerRevision) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions | 
[**createNamespacedDeployment**](AppsV1beta1Api.md#createNamespacedDeployment) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/deployments | 
[**createNamespacedDeploymentRollback**](AppsV1beta1Api.md#createNamespacedDeploymentRollback) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/rollback | 
[**createNamespacedStatefulSet**](AppsV1beta1Api.md#createNamespacedStatefulSet) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
[**deleteCollectionNamespacedControllerRevision**](AppsV1beta1Api.md#deleteCollectionNamespacedControllerRevision) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions | 
[**deleteCollectionNamespacedDeployment**](AppsV1beta1Api.md#deleteCollectionNamespacedDeployment) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/deployments | 
[**deleteCollectionNamespacedStatefulSet**](AppsV1beta1Api.md#deleteCollectionNamespacedStatefulSet) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
[**deleteNamespacedControllerRevision**](AppsV1beta1Api.md#deleteNamespacedControllerRevision) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name} | 
[**deleteNamespacedDeployment**](AppsV1beta1Api.md#deleteNamespacedDeployment) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name} | 
[**deleteNamespacedStatefulSet**](AppsV1beta1Api.md#deleteNamespacedStatefulSet) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
[**getAPIResources**](AppsV1beta1Api.md#getAPIResources) | **GET** /apis/apps/v1beta1/ | 
[**listControllerRevisionForAllNamespaces**](AppsV1beta1Api.md#listControllerRevisionForAllNamespaces) | **GET** /apis/apps/v1beta1/controllerrevisions | 
[**listDeploymentForAllNamespaces**](AppsV1beta1Api.md#listDeploymentForAllNamespaces) | **GET** /apis/apps/v1beta1/deployments | 
[**listNamespacedControllerRevision**](AppsV1beta1Api.md#listNamespacedControllerRevision) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions | 
[**listNamespacedDeployment**](AppsV1beta1Api.md#listNamespacedDeployment) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/deployments | 
[**listNamespacedStatefulSet**](AppsV1beta1Api.md#listNamespacedStatefulSet) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
[**listStatefulSetForAllNamespaces**](AppsV1beta1Api.md#listStatefulSetForAllNamespaces) | **GET** /apis/apps/v1beta1/statefulsets | 
[**patchNamespacedControllerRevision**](AppsV1beta1Api.md#patchNamespacedControllerRevision) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name} | 
[**patchNamespacedDeployment**](AppsV1beta1Api.md#patchNamespacedDeployment) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name} | 
[**patchNamespacedDeploymentScale**](AppsV1beta1Api.md#patchNamespacedDeploymentScale) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
[**patchNamespacedDeploymentStatus**](AppsV1beta1Api.md#patchNamespacedDeploymentStatus) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
[**patchNamespacedStatefulSet**](AppsV1beta1Api.md#patchNamespacedStatefulSet) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
[**patchNamespacedStatefulSetScale**](AppsV1beta1Api.md#patchNamespacedStatefulSetScale) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale | 
[**patchNamespacedStatefulSetStatus**](AppsV1beta1Api.md#patchNamespacedStatefulSetStatus) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
[**readNamespacedControllerRevision**](AppsV1beta1Api.md#readNamespacedControllerRevision) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name} | 
[**readNamespacedDeployment**](AppsV1beta1Api.md#readNamespacedDeployment) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name} | 
[**readNamespacedDeploymentScale**](AppsV1beta1Api.md#readNamespacedDeploymentScale) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
[**readNamespacedDeploymentStatus**](AppsV1beta1Api.md#readNamespacedDeploymentStatus) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
[**readNamespacedStatefulSet**](AppsV1beta1Api.md#readNamespacedStatefulSet) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
[**readNamespacedStatefulSetScale**](AppsV1beta1Api.md#readNamespacedStatefulSetScale) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale | 
[**readNamespacedStatefulSetStatus**](AppsV1beta1Api.md#readNamespacedStatefulSetStatus) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
[**replaceNamespacedControllerRevision**](AppsV1beta1Api.md#replaceNamespacedControllerRevision) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name} | 
[**replaceNamespacedDeployment**](AppsV1beta1Api.md#replaceNamespacedDeployment) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name} | 
[**replaceNamespacedDeploymentScale**](AppsV1beta1Api.md#replaceNamespacedDeploymentScale) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
[**replaceNamespacedDeploymentStatus**](AppsV1beta1Api.md#replaceNamespacedDeploymentStatus) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
[**replaceNamespacedStatefulSet**](AppsV1beta1Api.md#replaceNamespacedStatefulSet) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
[**replaceNamespacedStatefulSetScale**](AppsV1beta1Api.md#replaceNamespacedStatefulSetScale) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale | 
[**replaceNamespacedStatefulSetStatus**](AppsV1beta1Api.md#replaceNamespacedStatefulSetStatus) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 


<a name="createNamespacedControllerRevision"></a>
# **createNamespacedControllerRevision**
> V1beta1ControllerRevision createNamespacedControllerRevision(namespace, body, pretty)



create a ControllerRevision

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1ControllerRevision body = new V1beta1ControllerRevision(); // V1beta1ControllerRevision | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1ControllerRevision result = apiInstance.createNamespacedControllerRevision(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#createNamespacedControllerRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1ControllerRevision**](V1beta1ControllerRevision.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1ControllerRevision**](V1beta1ControllerRevision.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createNamespacedDeployment"></a>
# **createNamespacedDeployment**
> AppsV1beta1Deployment createNamespacedDeployment(namespace, body, pretty)



create a Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
AppsV1beta1Deployment body = new AppsV1beta1Deployment(); // AppsV1beta1Deployment | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Deployment result = apiInstance.createNamespacedDeployment(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#createNamespacedDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createNamespacedDeploymentRollback"></a>
# **createNamespacedDeploymentRollback**
> AppsV1beta1DeploymentRollback createNamespacedDeploymentRollback(name, namespace, body, pretty)



create rollback of a Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the DeploymentRollback
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
AppsV1beta1DeploymentRollback body = new AppsV1beta1DeploymentRollback(); // AppsV1beta1DeploymentRollback | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1DeploymentRollback result = apiInstance.createNamespacedDeploymentRollback(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#createNamespacedDeploymentRollback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the DeploymentRollback |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**AppsV1beta1DeploymentRollback**](AppsV1beta1DeploymentRollback.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1DeploymentRollback**](AppsV1beta1DeploymentRollback.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createNamespacedStatefulSet"></a>
# **createNamespacedStatefulSet**
> V1beta1StatefulSet createNamespacedStatefulSet(namespace, body, pretty)



create a StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1StatefulSet body = new V1beta1StatefulSet(); // V1beta1StatefulSet | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.createNamespacedStatefulSet(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#createNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1StatefulSet**](V1beta1StatefulSet.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCollectionNamespacedControllerRevision"></a>
# **deleteCollectionNamespacedControllerRevision**
> V1Status deleteCollectionNamespacedControllerRevision(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



delete collection of ControllerRevision

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1Status result = apiInstance.deleteCollectionNamespacedControllerRevision(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#deleteCollectionNamespacedControllerRevision");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCollectionNamespacedDeployment"></a>
# **deleteCollectionNamespacedDeployment**
> V1Status deleteCollectionNamespacedDeployment(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



delete collection of Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1Status result = apiInstance.deleteCollectionNamespacedDeployment(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#deleteCollectionNamespacedDeployment");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCollectionNamespacedStatefulSet"></a>
# **deleteCollectionNamespacedStatefulSet**
> V1Status deleteCollectionNamespacedStatefulSet(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



delete collection of StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1Status result = apiInstance.deleteCollectionNamespacedStatefulSet(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#deleteCollectionNamespacedStatefulSet");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteNamespacedControllerRevision"></a>
# **deleteNamespacedControllerRevision**
> V1Status deleteNamespacedControllerRevision(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a ControllerRevision

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the ControllerRevision
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
try {
    V1Status result = apiInstance.deleteNamespacedControllerRevision(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#deleteNamespacedControllerRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ControllerRevision |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteNamespacedDeployment"></a>
# **deleteNamespacedDeployment**
> V1Status deleteNamespacedDeployment(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Deployment
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
try {
    V1Status result = apiInstance.deleteNamespacedDeployment(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#deleteNamespacedDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Deployment |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteNamespacedStatefulSet"></a>
# **deleteNamespacedStatefulSet**
> V1Status deleteNamespacedStatefulSet(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
try {
    V1Status result = apiInstance.deleteNamespacedStatefulSet(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#deleteNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. | [optional]

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
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
try {
    V1APIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#getAPIResources");
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

<a name="listControllerRevisionForAllNamespaces"></a>
# **listControllerRevisionForAllNamespaces**
> V1beta1ControllerRevisionList listControllerRevisionForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind ControllerRevision

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1beta1ControllerRevisionList result = apiInstance.listControllerRevisionForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#listControllerRevisionForAllNamespaces");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1beta1ControllerRevisionList**](V1beta1ControllerRevisionList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listDeploymentForAllNamespaces"></a>
# **listDeploymentForAllNamespaces**
> AppsV1beta1DeploymentList listDeploymentForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    AppsV1beta1DeploymentList result = apiInstance.listDeploymentForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#listDeploymentForAllNamespaces");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**AppsV1beta1DeploymentList**](AppsV1beta1DeploymentList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listNamespacedControllerRevision"></a>
# **listNamespacedControllerRevision**
> V1beta1ControllerRevisionList listNamespacedControllerRevision(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind ControllerRevision

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1beta1ControllerRevisionList result = apiInstance.listNamespacedControllerRevision(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#listNamespacedControllerRevision");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1beta1ControllerRevisionList**](V1beta1ControllerRevisionList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listNamespacedDeployment"></a>
# **listNamespacedDeployment**
> AppsV1beta1DeploymentList listNamespacedDeployment(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    AppsV1beta1DeploymentList result = apiInstance.listNamespacedDeployment(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#listNamespacedDeployment");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**AppsV1beta1DeploymentList**](AppsV1beta1DeploymentList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listNamespacedStatefulSet"></a>
# **listNamespacedStatefulSet**
> V1beta1StatefulSetList listNamespacedStatefulSet(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1beta1StatefulSetList result = apiInstance.listNamespacedStatefulSet(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#listNamespacedStatefulSet");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1beta1StatefulSetList**](V1beta1StatefulSetList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listStatefulSetForAllNamespaces"></a>
# **listStatefulSetForAllNamespaces**
> V1beta1StatefulSetList listStatefulSetForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server the server will respond with a 410 ResourceExpired error indicating the client must restart their list without the continue field. This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1beta1StatefulSetList result = apiInstance.listStatefulSetForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#listStatefulSetForAllNamespaces");
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1beta1StatefulSetList**](V1beta1StatefulSetList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchNamespacedControllerRevision"></a>
# **patchNamespacedControllerRevision**
> V1beta1ControllerRevision patchNamespacedControllerRevision(name, namespace, body, pretty)



partially update the specified ControllerRevision

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the ControllerRevision
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1ControllerRevision result = apiInstance.patchNamespacedControllerRevision(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedControllerRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ControllerRevision |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1ControllerRevision**](V1beta1ControllerRevision.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedDeployment"></a>
# **patchNamespacedDeployment**
> AppsV1beta1Deployment patchNamespacedDeployment(name, namespace, body, pretty)



partially update the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Deployment
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Deployment result = apiInstance.patchNamespacedDeployment(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Deployment |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedDeploymentScale"></a>
# **patchNamespacedDeploymentScale**
> AppsV1beta1Scale patchNamespacedDeploymentScale(name, namespace, body, pretty)



partially update scale of the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Scale
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Scale result = apiInstance.patchNamespacedDeploymentScale(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedDeploymentScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Scale |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Scale**](AppsV1beta1Scale.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedDeploymentStatus"></a>
# **patchNamespacedDeploymentStatus**
> AppsV1beta1Deployment patchNamespacedDeploymentStatus(name, namespace, body, pretty)



partially update status of the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Deployment
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Deployment result = apiInstance.patchNamespacedDeploymentStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedDeploymentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Deployment |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedStatefulSet"></a>
# **patchNamespacedStatefulSet**
> V1beta1StatefulSet patchNamespacedStatefulSet(name, namespace, body, pretty)



partially update the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.patchNamespacedStatefulSet(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedStatefulSetScale"></a>
# **patchNamespacedStatefulSetScale**
> AppsV1beta1Scale patchNamespacedStatefulSetScale(name, namespace, body, pretty)



partially update scale of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Scale
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Scale result = apiInstance.patchNamespacedStatefulSetScale(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedStatefulSetScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Scale |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Scale**](AppsV1beta1Scale.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedStatefulSetStatus"></a>
# **patchNamespacedStatefulSetStatus**
> V1beta1StatefulSet patchNamespacedStatefulSetStatus(name, namespace, body, pretty)



partially update status of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.patchNamespacedStatefulSetStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedStatefulSetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedControllerRevision"></a>
# **readNamespacedControllerRevision**
> V1beta1ControllerRevision readNamespacedControllerRevision(name, namespace, pretty, exact, export)



read the specified ControllerRevision

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the ControllerRevision
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    V1beta1ControllerRevision result = apiInstance.readNamespacedControllerRevision(name, namespace, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedControllerRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ControllerRevision |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**V1beta1ControllerRevision**](V1beta1ControllerRevision.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedDeployment"></a>
# **readNamespacedDeployment**
> AppsV1beta1Deployment readNamespacedDeployment(name, namespace, pretty, exact, export)



read the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Deployment
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    AppsV1beta1Deployment result = apiInstance.readNamespacedDeployment(name, namespace, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Deployment |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedDeploymentScale"></a>
# **readNamespacedDeploymentScale**
> AppsV1beta1Scale readNamespacedDeploymentScale(name, namespace, pretty)



read scale of the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Scale
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Scale result = apiInstance.readNamespacedDeploymentScale(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedDeploymentScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Scale |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Scale**](AppsV1beta1Scale.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedDeploymentStatus"></a>
# **readNamespacedDeploymentStatus**
> AppsV1beta1Deployment readNamespacedDeploymentStatus(name, namespace, pretty)



read status of the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Deployment
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Deployment result = apiInstance.readNamespacedDeploymentStatus(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedDeploymentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Deployment |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedStatefulSet"></a>
# **readNamespacedStatefulSet**
> V1beta1StatefulSet readNamespacedStatefulSet(name, namespace, pretty, exact, export)



read the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    V1beta1StatefulSet result = apiInstance.readNamespacedStatefulSet(name, namespace, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedStatefulSetScale"></a>
# **readNamespacedStatefulSetScale**
> AppsV1beta1Scale readNamespacedStatefulSetScale(name, namespace, pretty)



read scale of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Scale
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Scale result = apiInstance.readNamespacedStatefulSetScale(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedStatefulSetScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Scale |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Scale**](AppsV1beta1Scale.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedStatefulSetStatus"></a>
# **readNamespacedStatefulSetStatus**
> V1beta1StatefulSet readNamespacedStatefulSetStatus(name, namespace, pretty)



read status of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.readNamespacedStatefulSetStatus(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedStatefulSetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedControllerRevision"></a>
# **replaceNamespacedControllerRevision**
> V1beta1ControllerRevision replaceNamespacedControllerRevision(name, namespace, body, pretty)



replace the specified ControllerRevision

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the ControllerRevision
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1ControllerRevision body = new V1beta1ControllerRevision(); // V1beta1ControllerRevision | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1ControllerRevision result = apiInstance.replaceNamespacedControllerRevision(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedControllerRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ControllerRevision |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1ControllerRevision**](V1beta1ControllerRevision.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1ControllerRevision**](V1beta1ControllerRevision.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedDeployment"></a>
# **replaceNamespacedDeployment**
> AppsV1beta1Deployment replaceNamespacedDeployment(name, namespace, body, pretty)



replace the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Deployment
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
AppsV1beta1Deployment body = new AppsV1beta1Deployment(); // AppsV1beta1Deployment | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Deployment result = apiInstance.replaceNamespacedDeployment(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Deployment |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedDeploymentScale"></a>
# **replaceNamespacedDeploymentScale**
> AppsV1beta1Scale replaceNamespacedDeploymentScale(name, namespace, body, pretty)



replace scale of the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Scale
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
AppsV1beta1Scale body = new AppsV1beta1Scale(); // AppsV1beta1Scale | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Scale result = apiInstance.replaceNamespacedDeploymentScale(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedDeploymentScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Scale |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**AppsV1beta1Scale**](AppsV1beta1Scale.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Scale**](AppsV1beta1Scale.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedDeploymentStatus"></a>
# **replaceNamespacedDeploymentStatus**
> AppsV1beta1Deployment replaceNamespacedDeploymentStatus(name, namespace, body, pretty)



replace status of the specified Deployment

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Deployment
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
AppsV1beta1Deployment body = new AppsV1beta1Deployment(); // AppsV1beta1Deployment | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Deployment result = apiInstance.replaceNamespacedDeploymentStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedDeploymentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Deployment |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Deployment**](AppsV1beta1Deployment.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedStatefulSet"></a>
# **replaceNamespacedStatefulSet**
> V1beta1StatefulSet replaceNamespacedStatefulSet(name, namespace, body, pretty)



replace the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1StatefulSet body = new V1beta1StatefulSet(); // V1beta1StatefulSet | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.replaceNamespacedStatefulSet(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1StatefulSet**](V1beta1StatefulSet.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedStatefulSetScale"></a>
# **replaceNamespacedStatefulSetScale**
> AppsV1beta1Scale replaceNamespacedStatefulSetScale(name, namespace, body, pretty)



replace scale of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the Scale
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
AppsV1beta1Scale body = new AppsV1beta1Scale(); // AppsV1beta1Scale | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    AppsV1beta1Scale result = apiInstance.replaceNamespacedStatefulSetScale(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedStatefulSetScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Scale |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**AppsV1beta1Scale**](AppsV1beta1Scale.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**AppsV1beta1Scale**](AppsV1beta1Scale.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedStatefulSetStatus"></a>
# **replaceNamespacedStatefulSetStatus**
> V1beta1StatefulSet replaceNamespacedStatefulSetStatus(name, namespace, body, pretty)



replace status of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1StatefulSet body = new V1beta1StatefulSet(); // V1beta1StatefulSet | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.replaceNamespacedStatefulSetStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedStatefulSetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1StatefulSet**](V1beta1StatefulSet.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

