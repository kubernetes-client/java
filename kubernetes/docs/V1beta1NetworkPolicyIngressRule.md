
# V1beta1NetworkPolicyIngressRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**List&lt;V1beta1NetworkPolicyPeer&gt;**](V1beta1NetworkPolicyPeer.md) | List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is not provided, this rule matches all sources (traffic not restricted by source). If this field is empty, this rule matches no sources (no traffic matches). If this field is present and contains at least on item, this rule allows traffic only if the traffic matches at least one item in the from list. |  [optional]
**ports** | [**List&lt;V1beta1NetworkPolicyPort&gt;**](V1beta1NetworkPolicyPort.md) | List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is not provided, this rule matches all ports (traffic not restricted by port). If this field is empty, this rule matches no ports (no traffic matches). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list. |  [optional]



