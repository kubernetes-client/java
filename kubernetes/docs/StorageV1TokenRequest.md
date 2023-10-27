

# StorageV1TokenRequest

TokenRequest contains parameters of a service account token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audience** | **String** | audience is the intended audience of the token in \&quot;TokenRequestSpec\&quot;. It will default to the audiences of kube apiserver. |  |
|**expirationSeconds** | **Long** | expirationSeconds is the duration of validity of the token in \&quot;TokenRequestSpec\&quot;. It has the same default value of \&quot;ExpirationSeconds\&quot; in \&quot;TokenRequestSpec\&quot;. |  [optional] |



