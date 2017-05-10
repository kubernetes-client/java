# CertificatesV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCertificateSigningRequest**](CertificatesV1beta1Api.md#createCertificateSigningRequest) | **POST** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
[**deleteCertificateSigningRequest**](CertificatesV1beta1Api.md#deleteCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
[**deleteCollectionCertificateSigningRequest**](CertificatesV1beta1Api.md#deleteCollectionCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
[**getAPIResources**](CertificatesV1beta1Api.md#getAPIResources) | **GET** /apis/certificates.k8s.io/v1beta1/ | 
[**listCertificateSigningRequest**](CertificatesV1beta1Api.md#listCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
[**patchCertificateSigningRequest**](CertificatesV1beta1Api.md#patchCertificateSigningRequest) | **PATCH** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
[**readCertificateSigningRequest**](CertificatesV1beta1Api.md#readCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
[**replaceCertificateSigningRequest**](CertificatesV1beta1Api.md#replaceCertificateSigningRequest) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
[**replaceCertificateSigningRequestApproval**](CertificatesV1beta1Api.md#replaceCertificateSigningRequestApproval) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/approval | 
[**replaceCertificateSigningRequestStatus**](CertificatesV1beta1Api.md#replaceCertificateSigningRequestStatus) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/status | 


<a name="createCertificateSigningRequest"></a>
# **createCertificateSigningRequest**
> V1beta1CertificateSigningRequest createCertificateSigningRequest(body, pretty)



create a CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
V1beta1CertificateSigningRequest body = new V1beta1CertificateSigningRequest(); // V1beta1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1CertificateSigningRequest result = apiInstance.createCertificateSigningRequest(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#createCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCertificateSigningRequest"></a>
# **deleteCertificateSigningRequest**
> V1Status deleteCertificateSigningRequest(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    V1Status result = apiInstance.deleteCertificateSigningRequest(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#deleteCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
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

<a name="deleteCollectionCertificateSigningRequest"></a>
# **deleteCollectionCertificateSigningRequest**
> V1Status deleteCollectionCertificateSigningRequest(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1Status result = apiInstance.deleteCollectionCertificateSigningRequest(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#deleteCollectionCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
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
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
try {
    V1APIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#getAPIResources");
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

<a name="listCertificateSigningRequest"></a>
# **listCertificateSigningRequest**
> V1beta1CertificateSigningRequestList listCertificateSigningRequest(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1beta1CertificateSigningRequestList result = apiInstance.listCertificateSigningRequest(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#listCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1beta1CertificateSigningRequestList**](V1beta1CertificateSigningRequestList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchCertificateSigningRequest"></a>
# **patchCertificateSigningRequest**
> V1beta1CertificateSigningRequest patchCertificateSigningRequest(name, body, pretty)



partially update the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1CertificateSigningRequest result = apiInstance.patchCertificateSigningRequest(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#patchCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readCertificateSigningRequest"></a>
# **readCertificateSigningRequest**
> V1beta1CertificateSigningRequest readCertificateSigningRequest(name, pretty, exact, export)



read the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    V1beta1CertificateSigningRequest result = apiInstance.readCertificateSigningRequest(name, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#readCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificateSigningRequest"></a>
# **replaceCertificateSigningRequest**
> V1beta1CertificateSigningRequest replaceCertificateSigningRequest(name, body, pretty)



replace the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
V1beta1CertificateSigningRequest body = new V1beta1CertificateSigningRequest(); // V1beta1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1CertificateSigningRequest result = apiInstance.replaceCertificateSigningRequest(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#replaceCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificateSigningRequestApproval"></a>
# **replaceCertificateSigningRequestApproval**
> V1beta1CertificateSigningRequest replaceCertificateSigningRequestApproval(name, body, pretty)



replace approval of the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
V1beta1CertificateSigningRequest body = new V1beta1CertificateSigningRequest(); // V1beta1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1CertificateSigningRequest result = apiInstance.replaceCertificateSigningRequestApproval(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#replaceCertificateSigningRequestApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificateSigningRequestStatus"></a>
# **replaceCertificateSigningRequestStatus**
> V1beta1CertificateSigningRequest replaceCertificateSigningRequestStatus(name, body, pretty)



replace status of the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.client.ApiClient;
//import io.kubernetes.client.ApiException;
//import io.kubernetes.client.Configuration;
//import io.kubernetes.client.auth.*;
//import io.kubernetes.client.apis.CertificatesV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
V1beta1CertificateSigningRequest body = new V1beta1CertificateSigningRequest(); // V1beta1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1CertificateSigningRequest result = apiInstance.replaceCertificateSigningRequestStatus(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#replaceCertificateSigningRequestStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1CertificateSigningRequest**](V1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

