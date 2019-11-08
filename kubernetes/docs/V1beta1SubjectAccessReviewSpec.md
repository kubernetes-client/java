

# V1beta1SubjectAccessReviewSpec

SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extra** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here. |  [optional]
**group** | **List&lt;String&gt;** | Groups is the groups you&#39;re testing for. |  [optional]
**nonResourceAttributes** | [**V1beta1NonResourceAttributes**](V1beta1NonResourceAttributes.md) |  |  [optional]
**resourceAttributes** | [**V1beta1ResourceAttributes**](V1beta1ResourceAttributes.md) |  |  [optional]
**uid** | **String** | UID information about the requesting user. |  [optional]
**user** | **String** | User is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not \&quot;Group\&quot;, then is it interpreted as \&quot;What if User were not a member of any groups |  [optional]



