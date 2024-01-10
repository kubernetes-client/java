

# V1beta3Subject

Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**group** | [**V1beta3GroupSubject**](V1beta3GroupSubject.md) |  |  [optional] |
|**kind** | **String** | &#x60;kind&#x60; indicates which one of the other fields is non-empty. Required |  |
|**serviceAccount** | [**V1beta3ServiceAccountSubject**](V1beta3ServiceAccountSubject.md) |  |  [optional] |
|**user** | [**V1beta3UserSubject**](V1beta3UserSubject.md) |  |  [optional] |



