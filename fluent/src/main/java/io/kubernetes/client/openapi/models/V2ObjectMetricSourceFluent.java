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
public interface V2ObjectMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference getDescribedObject();
  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference buildDescribedObject();
  public A withDescribedObject(io.kubernetes.client.openapi.models.V2CrossVersionObjectReference describedObject);
  public java.lang.Boolean hasDescribedObject();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObject();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObjectLike(io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item);
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A> editDescribedObject();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A> editOrNewDescribedObject();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A> editOrNewDescribedObjectLike(io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item);
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricIdentifier getMetric();
  public io.kubernetes.client.openapi.models.V2MetricIdentifier buildMetric();
  public A withMetric(io.kubernetes.client.openapi.models.V2MetricIdentifier metric);
  public java.lang.Boolean hasMetric();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A> withNewMetric();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A> withNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A> editMetric();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A> editOrNewMetric();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A> editOrNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricTarget getTarget();
  public io.kubernetes.client.openapi.models.V2MetricTarget buildTarget();
  public A withTarget(io.kubernetes.client.openapi.models.V2MetricTarget target);
  public java.lang.Boolean hasTarget();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A> withNewTarget();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A> editTarget();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);
  public interface DescribedObjectNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<N>>{
    public N and();
    public N endDescribedObject();
    
  }
  public interface MetricNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2MetricIdentifierFluent<io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  public interface TargetNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2MetricTargetFluent<io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}