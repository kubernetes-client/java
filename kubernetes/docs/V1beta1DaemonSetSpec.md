

# V1beta1DaemonSetSpec

DaemonSetSpec is the specification of a daemon set.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minReadySeconds** | **Integer** | The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). |  [optional]
**revisionHistoryLimit** | **Integer** | The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10. |  [optional]
**selector** | [**V1LabelSelector**](V1LabelSelector.md) |  |  [optional]
**template** | [**V1PodTemplateSpec**](V1PodTemplateSpec.md) |  | 
**templateGeneration** | **Long** | DEPRECATED. A sequence number representing a specific generation of the template. Populated by the system. It can be set only during the creation. |  [optional]
**updateStrategy** | [**V1beta1DaemonSetUpdateStrategy**](V1beta1DaemonSetUpdateStrategy.md) |  |  [optional]



