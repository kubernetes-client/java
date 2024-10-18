

# V1ResourceStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the resource. Must be unique within the pod and match one of the resources from the pod spec. |  |
|**resources** | [**List&lt;V1ResourceHealth&gt;**](V1ResourceHealth.md) | List of unique Resources health. Each element in the list contains an unique resource ID and resource health. At a minimum, ResourceID must uniquely identify the Resource allocated to the Pod on the Node for the lifetime of a Pod. See ResourceID type for it&#39;s definition. |  [optional] |



