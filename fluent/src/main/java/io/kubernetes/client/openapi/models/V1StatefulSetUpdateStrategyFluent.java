package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1StatefulSetUpdateStrategyFluent<A extends V1StatefulSetUpdateStrategyFluent<A>> extends BaseFluent<A>{
  public V1StatefulSetUpdateStrategyFluent() {
  }
  
  public V1StatefulSetUpdateStrategyFluent(V1StatefulSetUpdateStrategy instance) {
    this.copyInstance(instance);
  }
  private V1RollingUpdateStatefulSetStrategyBuilder rollingUpdate;
  private String type;
  
  protected void copyInstance(V1StatefulSetUpdateStrategy instance) {
    instance = (instance != null ? instance : new V1StatefulSetUpdateStrategy());
    if (instance != null) {
          this.withRollingUpdate(instance.getRollingUpdate());
          this.withType(instance.getType());
        }
  }
  
  public V1RollingUpdateStatefulSetStrategy buildRollingUpdate() {
    return this.rollingUpdate != null ? this.rollingUpdate.build() : null;
  }
  
  public A withRollingUpdate(V1RollingUpdateStatefulSetStrategy rollingUpdate) {
    this._visitables.remove("rollingUpdate");
    if (rollingUpdate != null) {
        this.rollingUpdate = new V1RollingUpdateStatefulSetStrategyBuilder(rollingUpdate);
        this._visitables.get("rollingUpdate").add(this.rollingUpdate);
    } else {
        this.rollingUpdate = null;
        this._visitables.get("rollingUpdate").remove(this.rollingUpdate);
    }
    return (A) this;
  }
  
  public boolean hasRollingUpdate() {
    return this.rollingUpdate != null;
  }
  
  public RollingUpdateNested<A> withNewRollingUpdate() {
    return new RollingUpdateNested(null);
  }
  
  public RollingUpdateNested<A> withNewRollingUpdateLike(V1RollingUpdateStatefulSetStrategy item) {
    return new RollingUpdateNested(item);
  }
  
  public RollingUpdateNested<A> editRollingUpdate() {
    return withNewRollingUpdateLike(java.util.Optional.ofNullable(buildRollingUpdate()).orElse(null));
  }
  
  public RollingUpdateNested<A> editOrNewRollingUpdate() {
    return withNewRollingUpdateLike(java.util.Optional.ofNullable(buildRollingUpdate()).orElse(new V1RollingUpdateStatefulSetStrategyBuilder().build()));
  }
  
  public RollingUpdateNested<A> editOrNewRollingUpdateLike(V1RollingUpdateStatefulSetStrategy item) {
    return withNewRollingUpdateLike(java.util.Optional.ofNullable(buildRollingUpdate()).orElse(item));
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StatefulSetUpdateStrategyFluent that = (V1StatefulSetUpdateStrategyFluent) o;
    if (!java.util.Objects.equals(rollingUpdate, that.rollingUpdate)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(rollingUpdate,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (rollingUpdate != null) { sb.append("rollingUpdate:"); sb.append(rollingUpdate + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  public class RollingUpdateNested<N> extends V1RollingUpdateStatefulSetStrategyFluent<RollingUpdateNested<N>> implements Nested<N>{
    RollingUpdateNested(V1RollingUpdateStatefulSetStrategy item) {
      this.builder = new V1RollingUpdateStatefulSetStrategyBuilder(this, item);
    }
    V1RollingUpdateStatefulSetStrategyBuilder builder;
    
    public N and() {
      return (N) V1StatefulSetUpdateStrategyFluent.this.withRollingUpdate(builder.build());
    }
    
    public N endRollingUpdate() {
      return and();
    }
    
  
  }

}