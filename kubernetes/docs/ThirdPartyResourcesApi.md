# ThirdPartyResourcesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createThirdPartyResource**](ThirdPartyResourcesApi.md#createThirdPartyResource) | **POST** /apis/{fqdn}/v1/namespaces/{namespace}/{resource} | Create a Resource
[**deleteThirdPartyResource**](ThirdPartyResourcesApi.md#deleteThirdPartyResource) | **DELETE** /apis/{fqdn}/v1/namespaces/{namespace}/{resource}/{name} | Deletes a specific Resource
[**getThirdPartyResource**](ThirdPartyResourcesApi.md#getThirdPartyResource) | **GET** /apis/{fqdn}/v1/namespaces/{namespace}/{resource}/{name} | Gets a specific Resource
[**listThirdPartyResource**](ThirdPartyResourcesApi.md#listThirdPartyResource) | **GET** /apis/{fqdn}/v1/{resource} | Gets Resources
[**updateThirdPartyResource**](ThirdPartyResourcesApi.md#updateThirdPartyResource) | **PUT** /apis/{fqdn}/v1/namespaces/{namespace}/{resource}/{name} | Update a Resource


<a name="createThirdPartyResource"></a>
# **createThirdPartyResource**
> Object createThirdPartyResource(namespace, fqdn, resource, body)

Create a Resource

Creates a third party resource of the type specified

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ThirdPartyResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ThirdPartyResourcesApi apiInstance = new ThirdPartyResourcesApi();
String namespace = "namespace_example"; // String | The Resource's namespace
String fqdn = "fqdn_example"; // String | The Third party Resource fqdn
String resource = "resource_example"; // String | The Resource type
Object body = null; // Object | The JSON schema of the Resource to create.
try {
    Object result = apiInstance.createThirdPartyResource(namespace, fqdn, resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyResourcesApi#createThirdPartyResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The Resource&#39;s namespace |
 **fqdn** | **String**| The Third party Resource fqdn |
 **resource** | **String**| The Resource type |
 **body** | **Object**| The JSON schema of the Resource to create. |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteThirdPartyResource"></a>
# **deleteThirdPartyResource**
> Object deleteThirdPartyResource(body, gracePeriodSeconds, orphanDependents, propagationPolicy)

Deletes a specific Resource

Deletes the specified Resource in the specified namespace

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ThirdPartyResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ThirdPartyResourcesApi apiInstance = new ThirdPartyResourcesApi();
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    Object result = apiInstance.deleteThirdPartyResource(body, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyResourcesApi#deleteThirdPartyResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getThirdPartyResource"></a>
# **getThirdPartyResource**
> Object getThirdPartyResource(namespace, name, fqdn, resource)

Gets a specific Resource

Returns a specific Resource in a namespace

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ThirdPartyResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ThirdPartyResourcesApi apiInstance = new ThirdPartyResourcesApi();
String namespace = "namespace_example"; // String | The Resource's namespace
String name = "name_example"; // String | The Resource's name
String fqdn = "fqdn_example"; // String | The Third party Resource fqdn
String resource = "resource_example"; // String | The Resource type
try {
    Object result = apiInstance.getThirdPartyResource(namespace, name, fqdn, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyResourcesApi#getThirdPartyResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The Resource&#39;s namespace |
 **name** | **String**| The Resource&#39;s name |
 **fqdn** | **String**| The Third party Resource fqdn |
 **resource** | **String**| The Resource type |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listThirdPartyResource"></a>
# **listThirdPartyResource**
> Object listThirdPartyResource(fqdn, resource, watch)

Gets Resources

Returns a list of Resources

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ThirdPartyResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ThirdPartyResourcesApi apiInstance = new ThirdPartyResourcesApi();
String fqdn = "fqdn_example"; // String | The Third party Resource fqdn
String resource = "resource_example"; // String | The Resource type
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    Object result = apiInstance.listThirdPartyResource(fqdn, resource, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyResourcesApi#listThirdPartyResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fqdn** | **String**| The Third party Resource fqdn |
 **resource** | **String**| The Resource type |
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateThirdPartyResource"></a>
# **updateThirdPartyResource**
> Object updateThirdPartyResource(namespace, fqdn, resource, body)

Update a Resource

Update the specified third party resource of the type specified

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.ThirdPartyResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ThirdPartyResourcesApi apiInstance = new ThirdPartyResourcesApi();
String namespace = "namespace_example"; // String | The Resource's namespace
String fqdn = "fqdn_example"; // String | The Third party Resource fqdn
String resource = "resource_example"; // String | The Resource type
Object body = null; // Object | The JSON schema of the Resource to create.
try {
    Object result = apiInstance.updateThirdPartyResource(namespace, fqdn, resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyResourcesApi#updateThirdPartyResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The Resource&#39;s namespace |
 **fqdn** | **String**| The Third party Resource fqdn |
 **resource** | **String**| The Resource type |
 **body** | **Object**| The JSON schema of the Resource to create. |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

