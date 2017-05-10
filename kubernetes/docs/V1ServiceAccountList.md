
# V1ServiceAccountList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources |  [optional]
**items** | [**List&lt;V1ServiceAccount&gt;**](V1ServiceAccount.md) | List of ServiceAccounts. More info: http://releases.k8s.io/HEAD/docs/design/service_accounts.md#service-accounts | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ListMeta**](V1ListMeta.md) | Standard list metadata. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds |  [optional]



