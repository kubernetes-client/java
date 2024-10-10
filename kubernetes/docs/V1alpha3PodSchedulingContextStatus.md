

# V1alpha3PodSchedulingContextStatus

PodSchedulingContextStatus describes where resources for the Pod can be allocated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceClaims** | [**List&lt;V1alpha3ResourceClaimSchedulingStatus&gt;**](V1alpha3ResourceClaimSchedulingStatus.md) | ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding ResourceClaim uses \&quot;WaitForFirstConsumer\&quot; allocation mode. |  [optional] |



