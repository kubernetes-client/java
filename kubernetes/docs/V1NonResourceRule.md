

# V1NonResourceRule

NonResourceRule holds information that describes a rule for the non-resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nonResourceURLs** | **List&lt;String&gt;** | NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  \&quot;*\&quot; means all. |  [optional] |
|**verbs** | **List&lt;String&gt;** | Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  \&quot;*\&quot; means all. |  |



