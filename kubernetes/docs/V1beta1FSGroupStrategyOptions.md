

# V1beta1FSGroupStrategyOptions

FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ranges** | [**List&lt;V1beta1IDRange&gt;**](V1beta1IDRange.md) | ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs. |  [optional]
**rule** | **String** | rule is the strategy that will dictate what FSGroup is used in the SecurityContext. |  [optional]



