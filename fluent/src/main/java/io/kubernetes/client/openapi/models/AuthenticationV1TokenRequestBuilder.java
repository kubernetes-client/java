package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class AuthenticationV1TokenRequestBuilder extends AuthenticationV1TokenRequestFluent<AuthenticationV1TokenRequestBuilder> implements VisitableBuilder<AuthenticationV1TokenRequest,AuthenticationV1TokenRequestBuilder>{
  public AuthenticationV1TokenRequestBuilder() {
    this(new AuthenticationV1TokenRequest());
  }
  
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequestFluent<?> fluent) {
    this(fluent, new AuthenticationV1TokenRequest());
  }
  
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequestFluent<?> fluent,AuthenticationV1TokenRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AuthenticationV1TokenRequestFluent<?> fluent;
  
  public AuthenticationV1TokenRequest build() {
    AuthenticationV1TokenRequest buildable = new AuthenticationV1TokenRequest();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}