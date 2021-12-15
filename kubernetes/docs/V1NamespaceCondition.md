

# V1NamespaceCondition

NamespaceCondition contains details about state of namespace.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. |  [optional]
**message** | **String** |  |  [optional]
**reason** | **String** |  |  [optional]
**status** | **String** | Status of the condition, one of True, False, Unknown. | 
**type** | [**TypeEnum**](#TypeEnum) | Type of namespace controller condition.  Possible enum values:  - &#x60;\&quot;NamespaceContentRemaining\&quot;&#x60; contains information about resources remaining in a namespace.  - &#x60;\&quot;NamespaceDeletionContentFailure\&quot;&#x60; contains information about namespace deleter errors during deletion of resources.  - &#x60;\&quot;NamespaceDeletionDiscoveryFailure\&quot;&#x60; contains information about namespace deleter errors during resource discovery.  - &#x60;\&quot;NamespaceDeletionGroupVersionParsingFailure\&quot;&#x60; contains information about namespace deleter errors parsing GV for legacy types.  - &#x60;\&quot;NamespaceFinalizersRemaining\&quot;&#x60; contains information about which finalizers are on resources remaining in a namespace. | 



## Enum: TypeEnum

Name | Value
---- | -----
NAMESPACECONTENTREMAINING | &quot;NamespaceContentRemaining&quot;
NAMESPACEDELETIONCONTENTFAILURE | &quot;NamespaceDeletionContentFailure&quot;
NAMESPACEDELETIONDISCOVERYFAILURE | &quot;NamespaceDeletionDiscoveryFailure&quot;
NAMESPACEDELETIONGROUPVERSIONPARSINGFAILURE | &quot;NamespaceDeletionGroupVersionParsingFailure&quot;
NAMESPACEFINALIZERSREMAINING | &quot;NamespaceFinalizersRemaining&quot;



