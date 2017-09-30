
# V1beta1NetworkPolicyPeer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipBlock** | [**V1beta1IPBlock**](V1beta1IPBlock.md) | IPBlock defines policy on a particular IPBlock |  [optional]
**namespaceSelector** | [**V1LabelSelector**](V1LabelSelector.md) | Selects Namespaces using cluster scoped-labels.  This matches all pods in all namespaces selected by this label selector. This field follows standard label selector semantics. If present but empty, this selector selects all namespaces. |  [optional]
**podSelector** | [**V1LabelSelector**](V1LabelSelector.md) | This is a label selector which selects Pods in this namespace. This field follows standard label selector semantics. If present but empty, this selector selects all pods in this namespace. |  [optional]



