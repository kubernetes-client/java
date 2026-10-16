

# V1TokenRequestSpec

TokenRequestSpec contains client provided parameters of a token request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attestations** | **Map&lt;String, List&lt;String&gt;&gt;** | attestations is a map of well-known keys to string-slice values. The values for each key have a specific semantic meaning, which is documented on the key definition. Requesters of tokens may ask the Kubernetes API Server to attest to certain claims. The API Server may perform authorization checks depending on the key of this map. |  [optional] |
|**audiences** | **List&lt;String&gt;** | audiences are the intendend audiences of the token. A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences. |  [optional] |
|**boundObjectRef** | [**V1BoundObjectReference**](V1BoundObjectReference.md) |  |  [optional] |
|**expirationSeconds** | **Long** | expirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the &#39;expiration&#39; field in a response. |  [optional] |



