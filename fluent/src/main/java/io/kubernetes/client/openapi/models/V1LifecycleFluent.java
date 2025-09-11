package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LifecycleFluent<A extends io.kubernetes.client.openapi.models.V1LifecycleFluent<A>> extends BaseFluent<A>{
  public V1LifecycleFluent() {
  }
  
  public V1LifecycleFluent(V1Lifecycle instance) {
    this.copyInstance(instance);
  }
  private V1LifecycleHandlerBuilder postStart;
  private V1LifecycleHandlerBuilder preStop;
  private String stopSignal;
  
  protected void copyInstance(V1Lifecycle instance) {
    instance = instance != null ? instance : new V1Lifecycle();
    if (instance != null) {
        this.withPostStart(instance.getPostStart());
        this.withPreStop(instance.getPreStop());
        this.withStopSignal(instance.getStopSignal());
    }
  }
  
  public V1LifecycleHandler buildPostStart() {
    return this.postStart != null ? this.postStart.build() : null;
  }
  
  public A withPostStart(V1LifecycleHandler postStart) {
    this._visitables.remove("postStart");
    if (postStart != null) {
        this.postStart = new V1LifecycleHandlerBuilder(postStart);
        this._visitables.get("postStart").add(this.postStart);
    } else {
        this.postStart = null;
        this._visitables.get("postStart").remove(this.postStart);
    }
    return (A) this;
  }
  
  public boolean hasPostStart() {
    return this.postStart != null;
  }
  
  public PostStartNested<A> withNewPostStart() {
    return new PostStartNested(null);
  }
  
  public PostStartNested<A> withNewPostStartLike(V1LifecycleHandler item) {
    return new PostStartNested(item);
  }
  
  public PostStartNested<A> editPostStart() {
    return this.withNewPostStartLike(Optional.ofNullable(this.buildPostStart()).orElse(null));
  }
  
  public PostStartNested<A> editOrNewPostStart() {
    return this.withNewPostStartLike(Optional.ofNullable(this.buildPostStart()).orElse(new V1LifecycleHandlerBuilder().build()));
  }
  
  public PostStartNested<A> editOrNewPostStartLike(V1LifecycleHandler item) {
    return this.withNewPostStartLike(Optional.ofNullable(this.buildPostStart()).orElse(item));
  }
  
  public V1LifecycleHandler buildPreStop() {
    return this.preStop != null ? this.preStop.build() : null;
  }
  
  public A withPreStop(V1LifecycleHandler preStop) {
    this._visitables.remove("preStop");
    if (preStop != null) {
        this.preStop = new V1LifecycleHandlerBuilder(preStop);
        this._visitables.get("preStop").add(this.preStop);
    } else {
        this.preStop = null;
        this._visitables.get("preStop").remove(this.preStop);
    }
    return (A) this;
  }
  
  public boolean hasPreStop() {
    return this.preStop != null;
  }
  
  public PreStopNested<A> withNewPreStop() {
    return new PreStopNested(null);
  }
  
  public PreStopNested<A> withNewPreStopLike(V1LifecycleHandler item) {
    return new PreStopNested(item);
  }
  
  public PreStopNested<A> editPreStop() {
    return this.withNewPreStopLike(Optional.ofNullable(this.buildPreStop()).orElse(null));
  }
  
  public PreStopNested<A> editOrNewPreStop() {
    return this.withNewPreStopLike(Optional.ofNullable(this.buildPreStop()).orElse(new V1LifecycleHandlerBuilder().build()));
  }
  
  public PreStopNested<A> editOrNewPreStopLike(V1LifecycleHandler item) {
    return this.withNewPreStopLike(Optional.ofNullable(this.buildPreStop()).orElse(item));
  }
  
  public String getStopSignal() {
    return this.stopSignal;
  }
  
  public A withStopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
    return (A) this;
  }
  
  public boolean hasStopSignal() {
    return this.stopSignal != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1LifecycleFluent that = (V1LifecycleFluent) o;
    if (!(Objects.equals(postStart, that.postStart))) {
      return false;
    }
    if (!(Objects.equals(preStop, that.preStop))) {
      return false;
    }
    if (!(Objects.equals(stopSignal, that.stopSignal))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(postStart, preStop, stopSignal);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(postStart == null)) {
        sb.append("postStart:");
        sb.append(postStart);
        sb.append(",");
    }
    if (!(preStop == null)) {
        sb.append("preStop:");
        sb.append(preStop);
        sb.append(",");
    }
    if (!(stopSignal == null)) {
        sb.append("stopSignal:");
        sb.append(stopSignal);
    }
    sb.append("}");
    return sb.toString();
  }
  public class PostStartNested<N> extends V1LifecycleHandlerFluent<PostStartNested<N>> implements Nested<N>{
    PostStartNested(V1LifecycleHandler item) {
      this.builder = new V1LifecycleHandlerBuilder(this, item);
    }
    V1LifecycleHandlerBuilder builder;
    
    public N and() {
      return (N) V1LifecycleFluent.this.withPostStart(builder.build());
    }
    
    public N endPostStart() {
      return and();
    }
    
  
  }
  public class PreStopNested<N> extends V1LifecycleHandlerFluent<PreStopNested<N>> implements Nested<N>{
    PreStopNested(V1LifecycleHandler item) {
      this.builder = new V1LifecycleHandlerBuilder(this, item);
    }
    V1LifecycleHandlerBuilder builder;
    
    public N and() {
      return (N) V1LifecycleFluent.this.withPreStop(builder.build());
    }
    
    public N endPreStop() {
      return and();
    }
    
  
  }

}