

# V1AggregationRule

AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clusterRoleSelectors** | [**List&lt;V1LabelSelector&gt;**](V1LabelSelector.md) | ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added |  [optional] |



