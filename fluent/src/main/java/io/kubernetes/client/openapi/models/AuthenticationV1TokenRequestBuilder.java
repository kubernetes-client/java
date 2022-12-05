package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class AuthenticationV1TokenRequestBuilder extends AuthenticationV1TokenRequestFluentImpl<AuthenticationV1TokenRequestBuilder> implements VisitableBuilder<AuthenticationV1TokenRequest,AuthenticationV1TokenRequestBuilder>{
  public AuthenticationV1TokenRequestBuilder() {
    this(false);
  }
  public AuthenticationV1TokenRequestBuilder(Boolean validationEnabled) {
    this(new AuthenticationV1TokenRequest(), validationEnabled);
  }
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequestFluent<?> fluent) {
    this(fluent, false);
  }
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequestFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new AuthenticationV1TokenRequest(), validationEnabled);
  }
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequestFluent<?> fluent,AuthenticationV1TokenRequest instance) {
    this(fluent, instance, false);
  }
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequestFluent<?> fluent,AuthenticationV1TokenRequest instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequest instance) {
    this(instance,false);
  }
  public AuthenticationV1TokenRequestBuilder(AuthenticationV1TokenRequest instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  AuthenticationV1TokenRequestFluent<?> fluent;
  Boolean validationEnabled;
  public AuthenticationV1TokenRequest build() {
    AuthenticationV1TokenRequest buildable = new AuthenticationV1TokenRequest();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}