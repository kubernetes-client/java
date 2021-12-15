package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2PodsMetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricValueStatus getCurrent();
  public io.kubernetes.client.openapi.models.V2MetricValueStatus buildCurrent();
  public A withCurrent(io.kubernetes.client.openapi.models.V2MetricValueStatus current);
  public java.lang.Boolean hasCurrent();
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item);
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.CurrentNested<A> editCurrent();
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item);
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricIdentifier getMetric();
  public io.kubernetes.client.openapi.models.V2MetricIdentifier buildMetric();
  public A withMetric(io.kubernetes.client.openapi.models.V2MetricIdentifier metric);
  public java.lang.Boolean hasMetric();
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.MetricNested<A> withNewMetric();
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.MetricNested<A> withNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.MetricNested<A> editMetric();
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.MetricNested<A> editOrNewMetric();
  public io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.MetricNested<A> editOrNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);
  public interface CurrentNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  public interface MetricNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2MetricIdentifierFluent<io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  
}