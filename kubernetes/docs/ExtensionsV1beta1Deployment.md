
# ExtensionsV1beta1Deployment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) | Standard object metadata. |  [optional]
**spec** | [**ExtensionsV1beta1DeploymentSpec**](ExtensionsV1beta1DeploymentSpec.md) | Specification of the desired behavior of the Deployment. |  [optional]
**status** | [**ExtensionsV1beta1DeploymentStatus**](ExtensionsV1beta1DeploymentStatus.md) | Most recently observed status of the Deployment. |  [optional]



