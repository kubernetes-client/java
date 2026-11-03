

# V1alpha3CompositePodGroupStatus

CompositePodGroupStatus represents information about the status of a composite pod group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V1Condition&gt;**](V1Condition.md) | conditions represent the latest observations of the CompositePodGroup&#39;s state.  Known condition types: - \&quot;CompositePodGroupInitiallyScheduled\&quot;: Indicates whether the overall scheduling requirement   for the subtree under this CompositePodGroup has been satisfied. Once this condition   transitions to True, it serves as a terminal state and will never revert to False,   even if pods are subsequently deleted and group constraints are no longer met. - \&quot;DisruptionTarget\&quot;: Indicates whether the CompositePodGroup is about to be terminated   due to disruption such as preemption.  Known reasons for the CompositePodGroupInitiallyScheduled condition: - \&quot;Unschedulable\&quot;: The CompositePodGroup&#39;s subtree could not be placed due to resource constraints,   affinity/anti-affinity, or topological constraints. - \&quot;SchedulerError\&quot;: The CompositePodGroup cannot be scheduled due to some internal error   that occurred during scheduling. - \&quot;Invalid\&quot;: Set to True when kube-scheduler detects an invalid group layout during   runtime validation. The &#x60;message&#x60; field details the specific layout violation (such as   a detected cycle, exceeding the maximum depth of 4, or referencing multiple distinct Workloads).  Known reasons for the DisruptionTarget condition: - \&quot;PreemptionByScheduler\&quot;: The CompositePodGroup was targeted by the scheduler&#39;s preemption loop   to free up capacity for higher-priority preemptors. |  [optional] |



