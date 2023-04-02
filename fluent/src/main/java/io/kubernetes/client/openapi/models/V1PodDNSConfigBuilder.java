package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodDNSConfigBuilder extends V1PodDNSConfigFluentImpl<V1PodDNSConfigBuilder> implements VisitableBuilder<V1PodDNSConfig,V1PodDNSConfigBuilder>{
  public V1PodDNSConfigBuilder() {
    this(false);
  }
  public V1PodDNSConfigBuilder(Boolean validationEnabled) {
    this(new V1PodDNSConfig(), validationEnabled);
  }
  public V1PodDNSConfigBuilder(V1PodDNSConfigFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodDNSConfigBuilder(V1PodDNSConfigFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodDNSConfig(), validationEnabled);
  }
  public V1PodDNSConfigBuilder(V1PodDNSConfigFluent<?> fluent,V1PodDNSConfig instance) {
    this(fluent, instance, false);
  }
  public V1PodDNSConfigBuilder(V1PodDNSConfigFluent<?> fluent,V1PodDNSConfig instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNameservers(instance.getNameservers());

    fluent.withOptions(instance.getOptions());

    fluent.withSearches(instance.getSearches());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodDNSConfigBuilder(V1PodDNSConfig instance) {
    this(instance,false);
  }
  public V1PodDNSConfigBuilder(V1PodDNSConfig instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNameservers(instance.getNameservers());

    this.withOptions(instance.getOptions());

    this.withSearches(instance.getSearches());

    this.validationEnabled = validationEnabled; 
  }
  V1PodDNSConfigFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodDNSConfig build() {
    V1PodDNSConfig buildable = new V1PodDNSConfig();
    buildable.setNameservers(fluent.getNameservers());
    buildable.setOptions(fluent.getOptions());
    buildable.setSearches(fluent.getSearches());
    return buildable;
  }
  
}