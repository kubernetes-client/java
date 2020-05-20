

# FlowcontrolV1alpha1Subject

Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | [**V1alpha1GroupSubject**](V1alpha1GroupSubject.md) |  |  [optional]
**kind** | **String** | Required | 
**serviceAccount** | [**V1alpha1ServiceAccountSubject**](V1alpha1ServiceAccountSubject.md) |  |  [optional]
**user** | [**V1alpha1UserSubject**](V1alpha1UserSubject.md) |  |  [optional]



