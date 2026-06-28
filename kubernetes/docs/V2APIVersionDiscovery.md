

# V2APIVersionDiscovery

APIVersionDiscovery holds a list of APIResourceDiscovery types that are served for a particular version within an API Group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | version is the name of the version within a group version. |  |
|**resources** | [**List&lt;V2APIResourceDiscovery&gt;**](V2APIResourceDiscovery.md) |  |  [optional] |
|**freshness** | **String** | freshness marks whether a group version&#39;s discovery document is up to date. |  [optional] |



