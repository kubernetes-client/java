

# V1TokenRequestSpec

TokenRequestSpec contains client provided parameters of a token request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audiences** | **List&lt;String&gt;** | Audiences are the intendend audiences of the token. A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences. |  |
|**boundObjectRef** | [**V1BoundObjectReference**](V1BoundObjectReference.md) |  |  [optional] |
|**expirationSeconds** | **Long** | ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the &#39;expiration&#39; field in a response. |  [optional] |



