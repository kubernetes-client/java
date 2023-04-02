package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CertificateSigningRequestSpecBuilder extends V1CertificateSigningRequestSpecFluentImpl<V1CertificateSigningRequestSpecBuilder> implements VisitableBuilder<V1CertificateSigningRequestSpec,V1CertificateSigningRequestSpecBuilder>{
  public V1CertificateSigningRequestSpecBuilder() {
    this(false);
  }
  public V1CertificateSigningRequestSpecBuilder(Boolean validationEnabled) {
    this(new V1CertificateSigningRequestSpec(), validationEnabled);
  }
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestSpec(), validationEnabled);
  }
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpecFluent<?> fluent,V1CertificateSigningRequestSpec instance) {
    this(fluent, instance, false);
  }
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpecFluent<?> fluent,V1CertificateSigningRequestSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withExpirationSeconds(instance.getExpirationSeconds());

    fluent.withExtra(instance.getExtra());

    fluent.withGroups(instance.getGroups());

    fluent.withRequest(instance.getRequest());

    fluent.withSignerName(instance.getSignerName());

    fluent.withUid(instance.getUid());

    fluent.withUsages(instance.getUsages());

    fluent.withUsername(instance.getUsername());

    this.validationEnabled = validationEnabled; 
  }
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpec instance) {
    this(instance,false);
  }
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withRequest(instance.getRequest());

    this.withSignerName(instance.getSignerName());

    this.withUid(instance.getUid());

    this.withUsages(instance.getUsages());

    this.withUsername(instance.getUsername());

    this.validationEnabled = validationEnabled; 
  }
  V1CertificateSigningRequestSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1CertificateSigningRequestSpec build() {
    V1CertificateSigningRequestSpec buildable = new V1CertificateSigningRequestSpec();
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setRequest(fluent.getRequest());
    buildable.setSignerName(fluent.getSignerName());
    buildable.setUid(fluent.getUid());
    buildable.setUsages(fluent.getUsages());
    buildable.setUsername(fluent.getUsername());
    return buildable;
  }
  
}