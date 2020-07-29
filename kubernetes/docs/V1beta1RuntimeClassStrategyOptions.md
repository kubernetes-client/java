

# V1beta1RuntimeClassStrategyOptions

RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedRuntimeClassNames** | **List&lt;String&gt;** | allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of \&quot;*\&quot; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset. | 
**defaultRuntimeClassName** | **String** | defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod. |  [optional]



