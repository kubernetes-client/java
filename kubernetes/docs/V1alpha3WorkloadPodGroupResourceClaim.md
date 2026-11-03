

# V1alpha3WorkloadPodGroupResourceClaim

WorkloadPodGroupResourceClaim references a dynamic resource claim that is shared across pods in the group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name uniquely identifies this resource claim inside the group. This field is required. It must be a DNS_LABEL. |  |
|**resourceClaimName** | **String** | resourceClaimName is the name of a ResourceClaim object in the same namespace. This field is optional. If it is not specified, no resource claim is used. If set, it must be a DNS subdomain. |  [optional] |
|**resourceClaimTemplateName** | **String** | resourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace. This field is optional. If it is not specified, no resource claim template is used. If set, it must be a DNS subdomain. |  [optional] |



