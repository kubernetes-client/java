

# V1beta1ApplyConfiguration

ApplyConfiguration defines the desired configuration values of an object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expression** | **String** | expression will be evaluated by CEL to create an apply configuration. ref: https://github.com/google/cel-spec  Apply configurations are declared in CEL using object initialization. For example, this CEL expression returns an apply configuration to set a single field:   Object{    spec: Object.spec{      serviceAccountName: \&quot;example\&quot;    }  }  Apply configurations may not modify atomic structs, maps or arrays due to the risk of accidental deletion of values not included in the apply configuration.  CEL expressions have access to the object types needed to create apply configurations:  - &#39;Object&#39; - CEL type of the resource object. - &#39;Object.&lt;fieldName&gt;&#39; - CEL type of object field (such as &#39;Object.spec&#39;) - &#39;Object.&lt;fieldName1&gt;.&lt;fieldName2&gt;...&lt;fieldNameN&gt;&#x60; - CEL type of nested field (such as &#39;Object.spec.containers&#39;)  CEL expressions have access to the contents of the API request, organized into CEL variables as well as some other useful variables:  - &#39;object&#39; - The object from the incoming request. The value is null for DELETE requests. - &#39;oldObject&#39; - The existing object. The value is null for CREATE requests. - &#39;request&#39; - Attributes of the API request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). - &#39;params&#39; - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind. - &#39;namespaceObject&#39; - The namespace object that the incoming object belongs to. The value is null for cluster-scoped resources. - &#39;variables&#39; - Map of composited variables, from its name to its lazily evaluated value.   For example, a variable named &#39;foo&#39; can be accessed as &#39;variables.foo&#39;. - &#39;authorizer&#39; - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz - &#39;authorizer.requestResource&#39; - A CEL ResourceCheck constructed from the &#39;authorizer&#39; and configured with the   request resource.  The &#x60;apiVersion&#x60;, &#x60;kind&#x60;, &#x60;metadata.name&#x60; and &#x60;metadata.generateName&#x60; are always accessible from the root of the object. No other metadata properties are accessible.  Only property names of the form &#x60;[a-zA-Z_.-/][a-zA-Z0-9_.-/]*&#x60; are accessible. Required. |  [optional] |



