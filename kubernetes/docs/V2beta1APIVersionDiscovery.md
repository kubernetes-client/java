

# V2beta1APIVersionDiscovery

APIVersionDiscovery holds a list of APIResourceDiscovery types that are served for a particular version within an API Group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | version is the name of the version within a group version. |  |
|**resources** | [**List&lt;V2beta1APIResourceDiscovery&gt;**](V2beta1APIResourceDiscovery.md) |  |  [optional] |
|**freshness** | **String** | freshness marks whether a group version&#39;s discovery document is up to date. |  [optional] |



