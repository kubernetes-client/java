

# V1FlowSchemaSpec

FlowSchemaSpec describes how the FlowSchema's specification looks like.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**distinguisherMethod** | [**V1FlowDistinguisherMethod**](V1FlowDistinguisherMethod.md) |  |  [optional] |
|**matchingPrecedence** | **Integer** | &#x60;matchingPrecedence&#x60; is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default. |  [optional] |
|**priorityLevelConfiguration** | [**V1PriorityLevelConfigurationReference**](V1PriorityLevelConfigurationReference.md) |  |  |
|**rules** | [**List&lt;V1PolicyRulesWithSubjects&gt;**](V1PolicyRulesWithSubjects.md) | &#x60;rules&#x60; describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema. |  [optional] |



