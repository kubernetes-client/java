

# V1beta1RunAsUserStrategyOptions

RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ranges** | [**List&lt;V1beta1IDRange&gt;**](V1beta1IDRange.md) | ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs. |  [optional]
**rule** | **String** | rule is the strategy that will dictate the allowable RunAsUser values that may be set. | 



