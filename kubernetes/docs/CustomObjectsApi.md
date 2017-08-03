# CustomObjectsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClusterCustomObject**](CustomObjectsApi.md#createClusterCustomObject) | **POST** /apis/{group}/{version}/{plural} | 
[**createNamespacedCustomObject**](CustomObjectsApi.md#createNamespacedCustomObject) | **POST** /apis/{group}/{version}/namespaces/{namespace}/{plural} | 
[**deleteClusterCustomObject**](CustomObjectsApi.md#deleteClusterCustomObject) | **DELETE** /apis/{group}/{version}/{plural}/{name} | 
[**deleteNamespacedCustomObject**](CustomObjectsApi.md#deleteNamespacedCustomObject) | **DELETE** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
[**getClusterCustomObject**](CustomObjectsApi.md#getClusterCustomObject) | **GET** /apis/{group}/{version}/{plural}/{name} | 
[**getNamespacedCustomObject**](CustomObjectsApi.md#getNamespacedCustomObject) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
[**listClusterCustomObject**](CustomObjectsApi.md#listClusterCustomObject) | **GET** /apis/{group}/{version}/{plural} | 
[**listNamespacedCustomObject**](CustomObjectsApi.md#listNamespacedCustomObject) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural} | 
[**replaceClusterCustomObject**](CustomObjectsApi.md#replaceClusterCustomObject) | **PUT** /apis/{group}/{version}/{plural}/{name} | 
[**replaceNamespacedCustomObject**](CustomObjectsApi.md#replaceNamespacedCustomObject) | **PUT** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 


<a name="createClusterCustomObject"></a>
# **createClusterCustomObject**
> Object createClusterCustomObject(group, version, plural, body, pretty)



Creates a cluster scoped Custom object

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | The custom resource's group name
String version = "version_example"; // String | The custom resource's version
String plural = "plural_example"; // String | The custom resource's plural name. For TPRs this would be lowercase plural kind.
Object body = null; // Object | The JSON schema of the Resource to create.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    Object result = apiInstance.createClusterCustomObject(group, version, plural, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#createClusterCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The custom resource&#39;s group name |
 **version** | **String**| The custom resource&#39;s version |
 **plural** | **String**| The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **body** | **Object**| The JSON schema of the Resource to create. |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNamespacedCustomObject"></a>
# **createNamespacedCustomObject**
> Object createNamespacedCustomObject(group, version, namespace, plural, body, pretty)



Creates a namespace scoped Custom object

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | The custom resource's group name
String version = "version_example"; // String | The custom resource's version
String namespace = "namespace_example"; // String | The custom resource's namespace
String plural = "plural_example"; // String | The custom resource's plural name. For TPRs this would be lowercase plural kind.
Object body = null; // Object | The JSON schema of the Resource to create.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    Object result = apiInstance.createNamespacedCustomObject(group, version, namespace, plural, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#createNamespacedCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The custom resource&#39;s group name |
 **version** | **String**| The custom resource&#39;s version |
 **namespace** | **String**| The custom resource&#39;s namespace |
 **plural** | **String**| The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **body** | **Object**| The JSON schema of the Resource to create. |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteClusterCustomObject"></a>
# **deleteClusterCustomObject**
> Object deleteClusterCustomObject(group, version, plural, name, body, gracePeriodSeconds, orphanDependents, propagationPolicy)



Deletes the specified cluster scoped custom object

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | the custom resource's group
String version = "version_example"; // String | the custom resource's version
String plural = "plural_example"; // String | the custom object's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    Object result = apiInstance.deleteClusterCustomObject(group, version, plural, name, body, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#deleteClusterCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom object&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteNamespacedCustomObject"></a>
# **deleteNamespacedCustomObject**
> Object deleteNamespacedCustomObject(group, version, namespace, plural, name, body, gracePeriodSeconds, orphanDependents, propagationPolicy)



Deletes the specified namespace scoped custom object

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | the custom resource's group
String version = "version_example"; // String | the custom resource's version
String namespace = "namespace_example"; // String | The custom resource's namespace
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    Object result = apiInstance.deleteNamespacedCustomObject(group, version, namespace, plural, name, body, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#deleteNamespacedCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **namespace** | **String**| The custom resource&#39;s namespace |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getClusterCustomObject"></a>
# **getClusterCustomObject**
> Object getClusterCustomObject(group, version, plural, name)



Returns a cluster scoped custom object

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | the custom resource's group
String version = "version_example"; // String | the custom resource's version
String plural = "plural_example"; // String | the custom object's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
try {
    Object result = apiInstance.getClusterCustomObject(group, version, plural, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#getClusterCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom object&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getNamespacedCustomObject"></a>
# **getNamespacedCustomObject**
> Object getNamespacedCustomObject(group, version, namespace, plural, name)



Returns a namespace scoped custom object

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | the custom resource's group
String version = "version_example"; // String | the custom resource's version
String namespace = "namespace_example"; // String | The custom resource's namespace
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
try {
    Object result = apiInstance.getNamespacedCustomObject(group, version, namespace, plural, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#getNamespacedCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **namespace** | **String**| The custom resource&#39;s namespace |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="listClusterCustomObject"></a>
# **listClusterCustomObject**
> Object listClusterCustomObject(group, version, plural, pretty, labelSelector, resourceVersion, watch)



list or watch cluster scoped custom objects

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | The custom resource's group name
String version = "version_example"; // String | The custom resource's version
String plural = "plural_example"; // String | The custom resource's plural name. For TPRs this would be lowercase plural kind.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications.
try {
    Object result = apiInstance.listClusterCustomObject(group, version, plural, pretty, labelSelector, resourceVersion, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#listClusterCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The custom resource&#39;s group name |
 **version** | **String**| The custom resource&#39;s version |
 **plural** | **String**| The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/json;stream=watch

<a name="listNamespacedCustomObject"></a>
# **listNamespacedCustomObject**
> Object listNamespacedCustomObject(group, version, namespace, plural, pretty, labelSelector, resourceVersion, watch)



list or watch namespace scoped custom objects

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | The custom resource's group name
String version = "version_example"; // String | The custom resource's version
String namespace = "namespace_example"; // String | The custom resource's namespace
String plural = "plural_example"; // String | The custom resource's plural name. For TPRs this would be lowercase plural kind.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications.
try {
    Object result = apiInstance.listNamespacedCustomObject(group, version, namespace, plural, pretty, labelSelector, resourceVersion, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#listNamespacedCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The custom resource&#39;s group name |
 **version** | **String**| The custom resource&#39;s version |
 **namespace** | **String**| The custom resource&#39;s namespace |
 **plural** | **String**| The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/json;stream=watch

<a name="replaceClusterCustomObject"></a>
# **replaceClusterCustomObject**
> Object replaceClusterCustomObject(group, version, plural, name, body)



replace the specified cluster scoped custom object

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | the custom resource's group
String version = "version_example"; // String | the custom resource's version
String plural = "plural_example"; // String | the custom object's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
Object body = null; // Object | The JSON schema of the Resource to replace.
try {
    Object result = apiInstance.replaceClusterCustomObject(group, version, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#replaceClusterCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom object&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |
 **body** | **Object**| The JSON schema of the Resource to replace. |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="replaceNamespacedCustomObject"></a>
# **replaceNamespacedCustomObject**
> Object replaceNamespacedCustomObject(group, version, namespace, plural, name, body)



replace the specified namespace scoped custom object

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CustomObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CustomObjectsApi apiInstance = new CustomObjectsApi();
String group = "group_example"; // String | the custom resource's group
String version = "version_example"; // String | the custom resource's version
String namespace = "namespace_example"; // String | The custom resource's namespace
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
Object body = null; // Object | The JSON schema of the Resource to replace.
try {
    Object result = apiInstance.replaceNamespacedCustomObject(group, version, namespace, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#replaceNamespacedCustomObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **namespace** | **String**| The custom resource&#39;s namespace |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |
 **body** | **Object**| The JSON schema of the Resource to replace. |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

