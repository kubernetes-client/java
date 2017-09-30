
# V1alpha1ExternalAdmissionHook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientConfig** | [**V1alpha1AdmissionHookClientConfig**](V1alpha1AdmissionHookClientConfig.md) | ClientConfig defines how to communicate with the hook. Required | 
**failurePolicy** | **String** | FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore. |  [optional]
**name** | **String** | The name of the external admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \&quot;imagepolicy\&quot; is the name of the webhook, and kubernetes.io is the name of the organization. Required. | 
**rules** | [**List&lt;V1alpha1RuleWithOperations&gt;**](V1alpha1RuleWithOperations.md) | Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. |  [optional]



