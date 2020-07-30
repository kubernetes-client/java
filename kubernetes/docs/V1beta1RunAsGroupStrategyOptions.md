

# V1beta1RunAsGroupStrategyOptions

RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ranges** | [**List&lt;V1beta1IDRange&gt;**](V1beta1IDRange.md) | ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs. |  [optional]
**rule** | **String** | rule is the strategy that will dictate the allowable RunAsGroup values that may be set. | 



