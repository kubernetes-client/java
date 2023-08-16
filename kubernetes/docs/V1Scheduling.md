

# V1Scheduling

Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodeSelector** | **Map&lt;String, String&gt;** | nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will cause the pod to be rejected in admission. |  [optional] |
|**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass. |  [optional] |



