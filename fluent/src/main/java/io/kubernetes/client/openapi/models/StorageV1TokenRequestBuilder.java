package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class StorageV1TokenRequestBuilder extends StorageV1TokenRequestFluent<StorageV1TokenRequestBuilder> implements VisitableBuilder<StorageV1TokenRequest,StorageV1TokenRequestBuilder>{
  public StorageV1TokenRequestBuilder() {
    this(new StorageV1TokenRequest());
  }
  
  public StorageV1TokenRequestBuilder(StorageV1TokenRequestFluent<?> fluent) {
    this(fluent, new StorageV1TokenRequest());
  }
  
  public StorageV1TokenRequestBuilder(StorageV1TokenRequestFluent<?> fluent,StorageV1TokenRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public StorageV1TokenRequestBuilder(StorageV1TokenRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  StorageV1TokenRequestFluent<?> fluent;
  
  public StorageV1TokenRequest build() {
    StorageV1TokenRequest buildable = new StorageV1TokenRequest();
    buildable.setAudience(fluent.getAudience());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    return buildable;
  }
  

}