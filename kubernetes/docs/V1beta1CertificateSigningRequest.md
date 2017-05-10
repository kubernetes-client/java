
# V1beta1CertificateSigningRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**spec** | [**V1beta1CertificateSigningRequestSpec**](V1beta1CertificateSigningRequestSpec.md) | The certificate request itself and any additional information. |  [optional]
**status** | [**V1beta1CertificateSigningRequestStatus**](V1beta1CertificateSigningRequestStatus.md) | Derived information about the request. |  [optional]



