package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DaemonSetUpdateStrategyFluent<A extends io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<A>> extends BaseFluent<A>{

  private V1RollingUpdateDaemonSetBuilder rollingUpdate;
  private String type;

  public V1DaemonSetUpdateStrategyFluent() {
  }
  
  public V1DaemonSetUpdateStrategyFluent(V1DaemonSetUpdateStrategy instance) {
    this.copyInstance(instance);
  }

  public V1RollingUpdateDaemonSet buildRollingUpdate() {
    return this.rollingUpdate != null ? this.rollingUpdate.build() : null;
  }
  
  protected void copyInstance(V1DaemonSetUpdateStrategy instance) {
    instance = instance != null ? instance : new V1DaemonSetUpdateStrategy();
    if (instance != null) {
        this.withRollingUpdate(instance.getRollingUpdate());
        this.withType(instance.getType());
    }
  }
  
  public RollingUpdateNested<A> editOrNewRollingUpdate() {
    return this.withNewRollingUpdateLike(Optional.ofNullable(this.buildRollingUpdate()).orElse(new V1RollingUpdateDaemonSetBuilder().build()));
  }
  
  public RollingUpdateNested<A> editOrNewRollingUpdateLike(V1RollingUpdateDaemonSet item) {
    return this.withNewRollingUpdateLike(Optional.ofNullable(this.buildRollingUpdate()).orElse(item));
  }
  
  public RollingUpdateNested<A> editRollingUpdate() {
    return this.withNewRollingUpdateLike(Optional.ofNullable(this.buildRollingUpdate()).orElse(null));
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
    V1DaemonSetUpdateStrategyFluent that = (V1DaemonSetUpdateStrategyFluent) o;
    if (!(Objects.equals(rollingUpdate, that.rollingUpdate))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasRollingUpdate() {
    return this.rollingUpdate != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(rollingUpdate == null)) {
        sb.append("rollingUpdate:");
        sb.append(rollingUpdate);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public RollingUpdateNested<A> withNewRollingUpdate() {
    return new RollingUpdateNested(null);
  }
  
  public RollingUpdateNested<A> withNewRollingUpdateLike(V1RollingUpdateDaemonSet item) {
    return new RollingUpdateNested(item);
  }
  
  public A withRollingUpdate(V1RollingUpdateDaemonSet rollingUpdate) {
    this._visitables.remove("rollingUpdate");
    if (rollingUpdate != null) {
        this.rollingUpdate = new V1RollingUpdateDaemonSetBuilder(rollingUpdate);
        this._visitables.get("rollingUpdate").add(this.rollingUpdate);
    } else {
        this.rollingUpdate = null;
        this._visitables.get("rollingUpdate").remove(this.rollingUpdate);
    }
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  public class RollingUpdateNested<N> extends V1RollingUpdateDaemonSetFluent<RollingUpdateNested<N>> implements Nested<N>{
  
    V1RollingUpdateDaemonSetBuilder builder;
  
    RollingUpdateNested(V1RollingUpdateDaemonSet item) {
      this.builder = new V1RollingUpdateDaemonSetBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DaemonSetUpdateStrategyFluent.this.withRollingUpdate(builder.build());
    }
    
    public N endRollingUpdate() {
      return and();
    }
    
  }
}