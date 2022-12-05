package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class StorageV1TokenRequestBuilder extends StorageV1TokenRequestFluentImpl<StorageV1TokenRequestBuilder> implements VisitableBuilder<StorageV1TokenRequest,StorageV1TokenRequestBuilder>{
  public StorageV1TokenRequestBuilder() {
    this(false);
  }
  public StorageV1TokenRequestBuilder(Boolean validationEnabled) {
    this(new StorageV1TokenRequest(), validationEnabled);
  }
  public StorageV1TokenRequestBuilder(StorageV1TokenRequestFluent<?> fluent) {
    this(fluent, false);
  }
  public StorageV1TokenRequestBuilder(StorageV1TokenRequestFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new StorageV1TokenRequest(), validationEnabled);
  }
  public StorageV1TokenRequestBuilder(StorageV1TokenRequestFluent<?> fluent,StorageV1TokenRequest instance) {
    this(fluent, instance, false);
  }
  public StorageV1TokenRequestBuilder(StorageV1TokenRequestFluent<?> fluent,StorageV1TokenRequest instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAudience(instance.getAudience());

    fluent.withExpirationSeconds(instance.getExpirationSeconds());

    this.validationEnabled = validationEnabled; 
  }
  public StorageV1TokenRequestBuilder(StorageV1TokenRequest instance) {
    this(instance,false);
  }
  public StorageV1TokenRequestBuilder(StorageV1TokenRequest instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAudience(instance.getAudience());

    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.validationEnabled = validationEnabled; 
  }
  StorageV1TokenRequestFluent<?> fluent;
  Boolean validationEnabled;
  public StorageV1TokenRequest build() {
    StorageV1TokenRequest buildable = new StorageV1TokenRequest();
    buildable.setAudience(fluent.getAudience());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    return buildable;
  }
  
}