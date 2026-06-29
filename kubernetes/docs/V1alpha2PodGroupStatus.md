

# V1alpha2PodGroupStatus

PodGroupStatus represents information about the status of a pod group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V1Condition&gt;**](V1Condition.md) | Conditions represent the latest observations of the PodGroup&#39;s state.  Known condition types: - \&quot;PodGroupScheduled\&quot;: Indicates whether the scheduling requirement has been satisfied. - \&quot;DisruptionTarget\&quot;: Indicates whether the PodGroup is about to be terminated   due to disruption such as preemption.  Known reasons for the PodGroupScheduled condition: - \&quot;Unschedulable\&quot;: The PodGroup cannot be scheduled due to resource constraints,   affinity/anti-affinity rules, or insufficient capacity for the gang. - \&quot;SchedulerError\&quot;: The PodGroup cannot be scheduled due to some internal error   that happened during scheduling, for example due to nodeAffinity parsing errors.  Known reasons for the DisruptionTarget condition: - \&quot;PreemptionByScheduler\&quot;: The PodGroup was preempted by the scheduler to make room for   higher-priority PodGroups or Pods. |  [optional] |
|**resourceClaimStatuses** | [**List&lt;V1alpha2PodGroupResourceClaimStatus&gt;**](V1alpha2PodGroupResourceClaimStatus.md) | Status of resource claims. |  [optional] |



