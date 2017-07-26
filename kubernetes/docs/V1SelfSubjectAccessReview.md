
# V1SelfSubjectAccessReview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**spec** | [**V1SelfSubjectAccessReviewSpec**](V1SelfSubjectAccessReviewSpec.md) | Spec holds information about the request being evaluated.  user and groups must be empty | 
**status** | [**V1SubjectAccessReviewStatus**](V1SubjectAccessReviewStatus.md) | Status is filled in by the server and indicates whether the request is allowed or not |  [optional]



