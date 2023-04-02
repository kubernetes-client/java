package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1LifecycleFluentImpl<A extends V1LifecycleFluent<A>> extends BaseFluent<A> implements V1LifecycleFluent<A>{
  public V1LifecycleFluentImpl() {
  }
  public V1LifecycleFluentImpl(V1Lifecycle instance) {
    this.withPostStart(instance.getPostStart());

    this.withPreStop(instance.getPreStop());

  }
  private V1LifecycleHandlerBuilder postStart;
  private V1LifecycleHandlerBuilder preStop;
  
  /**
   * This method has been deprecated, please use method buildPostStart instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LifecycleHandler getPostStart() {
    return this.postStart!=null ?this.postStart.build():null;
  }
  public V1LifecycleHandler buildPostStart() {
    return this.postStart!=null ?this.postStart.build():null;
  }
  public A withPostStart(V1LifecycleHandler postStart) {
    _visitables.get("postStart").remove(this.postStart);
    if (postStart!=null){ this.postStart= new V1LifecycleHandlerBuilder(postStart); _visitables.get("postStart").add(this.postStart);} else { this.postStart = null; _visitables.get("postStart").remove(this.postStart); } return (A) this;
  }
  public Boolean hasPostStart() {
    return this.postStart != null;
  }
  public V1LifecycleFluent.PostStartNested<A> withNewPostStart() {
    return new V1LifecycleFluentImpl.PostStartNestedImpl();
  }
  public V1LifecycleFluent.PostStartNested<A> withNewPostStartLike(V1LifecycleHandler item) {
    return new V1LifecycleFluentImpl.PostStartNestedImpl(item);
  }
  public V1LifecycleFluent.PostStartNested<A> editPostStart() {
    return withNewPostStartLike(getPostStart());
  }
  public V1LifecycleFluent.PostStartNested<A> editOrNewPostStart() {
    return withNewPostStartLike(getPostStart() != null ? getPostStart(): new V1LifecycleHandlerBuilder().build());
  }
  public V1LifecycleFluent.PostStartNested<A> editOrNewPostStartLike(V1LifecycleHandler item) {
    return withNewPostStartLike(getPostStart() != null ? getPostStart(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPreStop instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LifecycleHandler getPreStop() {
    return this.preStop!=null ?this.preStop.build():null;
  }
  public V1LifecycleHandler buildPreStop() {
    return this.preStop!=null ?this.preStop.build():null;
  }
  public A withPreStop(V1LifecycleHandler preStop) {
    _visitables.get("preStop").remove(this.preStop);
    if (preStop!=null){ this.preStop= new V1LifecycleHandlerBuilder(preStop); _visitables.get("preStop").add(this.preStop);} else { this.preStop = null; _visitables.get("preStop").remove(this.preStop); } return (A) this;
  }
  public Boolean hasPreStop() {
    return this.preStop != null;
  }
  public V1LifecycleFluent.PreStopNested<A> withNewPreStop() {
    return new V1LifecycleFluentImpl.PreStopNestedImpl();
  }
  public V1LifecycleFluent.PreStopNested<A> withNewPreStopLike(V1LifecycleHandler item) {
    return new V1LifecycleFluentImpl.PreStopNestedImpl(item);
  }
  public V1LifecycleFluent.PreStopNested<A> editPreStop() {
    return withNewPreStopLike(getPreStop());
  }
  public V1LifecycleFluent.PreStopNested<A> editOrNewPreStop() {
    return withNewPreStopLike(getPreStop() != null ? getPreStop(): new V1LifecycleHandlerBuilder().build());
  }
  public V1LifecycleFluent.PreStopNested<A> editOrNewPreStopLike(V1LifecycleHandler item) {
    return withNewPreStopLike(getPreStop() != null ? getPreStop(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LifecycleFluentImpl that = (V1LifecycleFluentImpl) o;
    if (postStart != null ? !postStart.equals(that.postStart) :that.postStart != null) return false;
    if (preStop != null ? !preStop.equals(that.preStop) :that.preStop != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(postStart,  preStop,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (postStart != null) { sb.append("postStart:"); sb.append(postStart + ","); }
    if (preStop != null) { sb.append("preStop:"); sb.append(preStop); }
    sb.append("}");
    return sb.toString();
  }
  class PostStartNestedImpl<N> extends V1LifecycleHandlerFluentImpl<V1LifecycleFluent.PostStartNested<N>> implements V1LifecycleFluent.PostStartNested<N>,Nested<N>{
    PostStartNestedImpl(V1LifecycleHandler item) {
      this.builder = new V1LifecycleHandlerBuilder(this, item);
    }
    PostStartNestedImpl() {
      this.builder = new V1LifecycleHandlerBuilder(this);
    }
    V1LifecycleHandlerBuilder builder;
    public N and() {
      return (N) V1LifecycleFluentImpl.this.withPostStart(builder.build());
    }
    public N endPostStart() {
      return and();
    }
    
  }
  class PreStopNestedImpl<N> extends V1LifecycleHandlerFluentImpl<V1LifecycleFluent.PreStopNested<N>> implements V1LifecycleFluent.PreStopNested<N>,Nested<N>{
    PreStopNestedImpl(V1LifecycleHandler item) {
      this.builder = new V1LifecycleHandlerBuilder(this, item);
    }
    PreStopNestedImpl() {
      this.builder = new V1LifecycleHandlerBuilder(this);
    }
    V1LifecycleHandlerBuilder builder;
    public N and() {
      return (N) V1LifecycleFluentImpl.this.withPreStop(builder.build());
    }
    public N endPreStop() {
      return and();
    }
    
  }
  
}