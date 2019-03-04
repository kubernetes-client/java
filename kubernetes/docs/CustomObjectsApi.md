# CustomObjectsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClusterCustomObject**](CustomObjectsApi.md#createClusterCustomObject) | **POST** /apis/{group}/{version}/{plural} | 
[**createNamespacedCustomObject**](CustomObjectsApi.md#createNamespacedCustomObject) | **POST** /apis/{group}/{version}/namespaces/{namespace}/{plural} | 
[**deleteClusterCustomObject**](CustomObjectsApi.md#deleteClusterCustomObject) | **DELETE** /apis/{group}/{version}/{plural}/{name} | 
[**deleteNamespacedCustomObject**](CustomObjectsApi.md#deleteNamespacedCustomObject) | **DELETE** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
[**getClusterCustomObject**](CustomObjectsApi.md#getClusterCustomObject) | **GET** /apis/{group}/{version}/{plural}/{name} | 
[**getClusterCustomObjectScale**](CustomObjectsApi.md#getClusterCustomObjectScale) | **GET** /apis/{group}/{version}/{plural}/{name}/scale | 
[**getClusterCustomObjectStatus**](CustomObjectsApi.md#getClusterCustomObjectStatus) | **GET** /apis/{group}/{version}/{plural}/{name}/status | 
[**getNamespacedCustomObject**](CustomObjectsApi.md#getNamespacedCustomObject) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
[**getNamespacedCustomObjectScale**](CustomObjectsApi.md#getNamespacedCustomObjectScale) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale | 
[**getNamespacedCustomObjectStatus**](CustomObjectsApi.md#getNamespacedCustomObjectStatus) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status | 
[**listClusterCustomObject**](CustomObjectsApi.md#listClusterCustomObject) | **GET** /apis/{group}/{version}/{plural} | 
[**listNamespacedCustomObject**](CustomObjectsApi.md#listNamespacedCustomObject) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural} | 
[**patchClusterCustomObject**](CustomObjectsApi.md#patchClusterCustomObject) | **PATCH** /apis/{group}/{version}/{plural}/{name} | 
[**patchClusterCustomObjectScale**](CustomObjectsApi.md#patchClusterCustomObjectScale) | **PATCH** /apis/{group}/{version}/{plural}/{name}/scale | 
[**patchClusterCustomObjectStatus**](CustomObjectsApi.md#patchClusterCustomObjectStatus) | **PATCH** /apis/{group}/{version}/{plural}/{name}/status | 
[**patchNamespacedCustomObject**](CustomObjectsApi.md#patchNamespacedCustomObject) | **PATCH** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
[**patchNamespacedCustomObjectScale**](CustomObjectsApi.md#patchNamespacedCustomObjectScale) | **PATCH** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale | 
[**patchNamespacedCustomObjectStatus**](CustomObjectsApi.md#patchNamespacedCustomObjectStatus) | **PATCH** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status | 
[**replaceClusterCustomObject**](CustomObjectsApi.md#replaceClusterCustomObject) | **PUT** /apis/{group}/{version}/{plural}/{name} | 
[**replaceClusterCustomObjectScale**](CustomObjectsApi.md#replaceClusterCustomObjectScale) | **PUT** /apis/{group}/{version}/{plural}/{name}/scale | 
[**replaceClusterCustomObjectStatus**](CustomObjectsApi.md#replaceClusterCustomObjectStatus) | **PUT** /apis/{group}/{version}/{plural}/{name}/status | 
[**replaceNamespacedCustomObject**](CustomObjectsApi.md#replaceNamespacedCustomObject) | **PUT** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
[**replaceNamespacedCustomObjectScale**](CustomObjectsApi.md#replaceNamespacedCustomObjectScale) | **PUT** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale | 
[**replaceNamespacedCustomObjectStatus**](CustomObjectsApi.md#replaceNamespacedCustomObjectStatus) | **PUT** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status | 


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

<a name="getClusterCustomObjectScale"></a>
# **getClusterCustomObjectScale**
> Object getClusterCustomObjectScale(group, version, plural, name)



read scale of the specified custom object

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
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
try {
    Object result = apiInstance.getClusterCustomObjectScale(group, version, plural, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#getClusterCustomObjectScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getClusterCustomObjectStatus"></a>
# **getClusterCustomObjectStatus**
> Object getClusterCustomObjectStatus(group, version, plural, name)



read status of the specified cluster scoped custom object

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
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
try {
    Object result = apiInstance.getClusterCustomObjectStatus(group, version, plural, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#getClusterCustomObjectStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

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

<a name="getNamespacedCustomObjectScale"></a>
# **getNamespacedCustomObjectScale**
> Object getNamespacedCustomObjectScale(group, version, namespace, plural, name)



read scale of the specified namespace scoped custom object

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
    Object result = apiInstance.getNamespacedCustomObjectScale(group, version, namespace, plural, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#getNamespacedCustomObjectScale");
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
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getNamespacedCustomObjectStatus"></a>
# **getNamespacedCustomObjectStatus**
> Object getNamespacedCustomObjectStatus(group, version, namespace, plural, name)



read status of the specified namespace scoped custom object

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
    Object result = apiInstance.getNamespacedCustomObjectStatus(group, version, namespace, plural, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#getNamespacedCustomObjectStatus");
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
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="listClusterCustomObject"></a>
# **listClusterCustomObject**
> Object listClusterCustomObject(group, version, plural, pretty, labelSelector, resourceVersion, timeoutSeconds, watch)



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
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications.
try {
    Object result = apiInstance.listClusterCustomObject(group, version, plural, pretty, labelSelector, resourceVersion, timeoutSeconds, watch);
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
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
> Object listNamespacedCustomObject(group, version, namespace, plural, pretty, labelSelector, resourceVersion, timeoutSeconds, watch)



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
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications.
try {
    Object result = apiInstance.listNamespacedCustomObject(group, version, namespace, plural, pretty, labelSelector, resourceVersion, timeoutSeconds, watch);
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
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/json;stream=watch

<a name="patchClusterCustomObject"></a>
# **patchClusterCustomObject**
> Object patchClusterCustomObject(group, version, plural, name, body)



patch the specified cluster scoped custom object

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
Object body = null; // Object | The JSON schema of the Resource to patch.
try {
    Object result = apiInstance.patchClusterCustomObject(group, version, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#patchClusterCustomObject");
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
 **body** | **Object**| The JSON schema of the Resource to patch. |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

<a name="patchClusterCustomObjectScale"></a>
# **patchClusterCustomObjectScale**
> Object patchClusterCustomObjectScale(group, version, plural, name, body)



partially update scale of the specified cluster scoped custom object

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
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
Object body = null; // Object | 
try {
    Object result = apiInstance.patchClusterCustomObjectScale(group, version, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#patchClusterCustomObjectScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |
 **body** | **Object**|  |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchClusterCustomObjectStatus"></a>
# **patchClusterCustomObjectStatus**
> Object patchClusterCustomObjectStatus(group, version, plural, name, body)



partially update status of the specified cluster scoped custom object

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
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
Object body = null; // Object | 
try {
    Object result = apiInstance.patchClusterCustomObjectStatus(group, version, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#patchClusterCustomObjectStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |
 **body** | **Object**|  |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedCustomObject"></a>
# **patchNamespacedCustomObject**
> Object patchNamespacedCustomObject(group, version, namespace, plural, name, body)



patch the specified namespace scoped custom object

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
Object body = null; // Object | The JSON schema of the Resource to patch.
try {
    Object result = apiInstance.patchNamespacedCustomObject(group, version, namespace, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#patchNamespacedCustomObject");
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
 **body** | **Object**| The JSON schema of the Resource to patch. |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

<a name="patchNamespacedCustomObjectScale"></a>
# **patchNamespacedCustomObjectScale**
> Object patchNamespacedCustomObjectScale(group, version, namespace, plural, name, body)



partially update scale of the specified namespace scoped custom object

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
Object body = null; // Object | 
try {
    Object result = apiInstance.patchNamespacedCustomObjectScale(group, version, namespace, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#patchNamespacedCustomObjectScale");
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
 **body** | **Object**|  |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedCustomObjectStatus"></a>
# **patchNamespacedCustomObjectStatus**
> Object patchNamespacedCustomObjectStatus(group, version, namespace, plural, name, body)



partially update status of the specified namespace scoped custom object

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
Object body = null; // Object | 
try {
    Object result = apiInstance.patchNamespacedCustomObjectStatus(group, version, namespace, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#patchNamespacedCustomObjectStatus");
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
 **body** | **Object**|  |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

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

<a name="replaceClusterCustomObjectScale"></a>
# **replaceClusterCustomObjectScale**
> Object replaceClusterCustomObjectScale(group, version, plural, name, body)



replace scale of the specified cluster scoped custom object

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
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
Object body = null; // Object | 
try {
    Object result = apiInstance.replaceClusterCustomObjectScale(group, version, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#replaceClusterCustomObjectScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |
 **body** | **Object**|  |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceClusterCustomObjectStatus"></a>
# **replaceClusterCustomObjectStatus**
> Object replaceClusterCustomObjectStatus(group, version, plural, name, body)



replace status of the cluster scoped specified custom object

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
String plural = "plural_example"; // String | the custom resource's plural name. For TPRs this would be lowercase plural kind.
String name = "name_example"; // String | the custom object's name
Object body = null; // Object | 
try {
    Object result = apiInstance.replaceClusterCustomObjectStatus(group, version, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#replaceClusterCustomObjectStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| the custom resource&#39;s group |
 **version** | **String**| the custom resource&#39;s version |
 **plural** | **String**| the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. |
 **name** | **String**| the custom object&#39;s name |
 **body** | **Object**|  |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

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

<a name="replaceNamespacedCustomObjectScale"></a>
# **replaceNamespacedCustomObjectScale**
> Object replaceNamespacedCustomObjectScale(group, version, namespace, plural, name, body)



replace scale of the specified namespace scoped custom object

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
Object body = null; // Object | 
try {
    Object result = apiInstance.replaceNamespacedCustomObjectScale(group, version, namespace, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#replaceNamespacedCustomObjectScale");
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
 **body** | **Object**|  |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedCustomObjectStatus"></a>
# **replaceNamespacedCustomObjectStatus**
> Object replaceNamespacedCustomObjectStatus(group, version, namespace, plural, name, body)



replace status of the specified namespace scoped custom object

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
Object body = null; // Object | 
try {
    Object result = apiInstance.replaceNamespacedCustomObjectStatus(group, version, namespace, plural, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomObjectsApi#replaceNamespacedCustomObjectStatus");
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
 **body** | **Object**|  |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

