

# V1EndpointHints

EndpointHints provides hints describing how an endpoint should be consumed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forNodes** | [**List&lt;V1ForNode&gt;**](V1ForNode.md) | forNodes indicates the node(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries. This is an Alpha feature and is only used when the PreferSameTrafficDistribution feature gate is enabled. |  [optional]
**forZones** | [**List&lt;V1ForZone&gt;**](V1ForZone.md) | forZones indicates the zone(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries. |  [optional]



