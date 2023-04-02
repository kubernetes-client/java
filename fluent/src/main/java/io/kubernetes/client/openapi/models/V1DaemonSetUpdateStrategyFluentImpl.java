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
  public class V1DaemonSetUpdateStrategyFluentImpl<A extends V1DaemonSetUpdateStrategyFluent<A>> extends BaseFluent<A> implements V1DaemonSetUpdateStrategyFluent<A>{
  public V1DaemonSetUpdateStrategyFluentImpl() {
  }
  public V1DaemonSetUpdateStrategyFluentImpl(V1DaemonSetUpdateStrategy instance) {
    this.withRollingUpdate(instance.getRollingUpdate());

    this.withType(instance.getType());

  }
  private V1RollingUpdateDaemonSetBuilder rollingUpdate;
  private String type;
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateDaemonSet getRollingUpdate() {
    return this.rollingUpdate!=null ?this.rollingUpdate.build():null;
  }
  public V1RollingUpdateDaemonSet buildRollingUpdate() {
    return this.rollingUpdate!=null ?this.rollingUpdate.build():null;
  }
  public A withRollingUpdate(V1RollingUpdateDaemonSet rollingUpdate) {
    _visitables.get("rollingUpdate").remove(this.rollingUpdate);
    if (rollingUpdate!=null){ this.rollingUpdate= new V1RollingUpdateDaemonSetBuilder(rollingUpdate); _visitables.get("rollingUpdate").add(this.rollingUpdate);} else { this.rollingUpdate = null; _visitables.get("rollingUpdate").remove(this.rollingUpdate); } return (A) this;
  }
  public Boolean hasRollingUpdate() {
    return this.rollingUpdate != null;
  }
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate() {
    return new V1DaemonSetUpdateStrategyFluentImpl.RollingUpdateNestedImpl();
  }
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(V1RollingUpdateDaemonSet item) {
    return new V1DaemonSetUpdateStrategyFluentImpl.RollingUpdateNestedImpl(item);
  }
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate() {
    return withNewRollingUpdateLike(getRollingUpdate());
  }
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate() {
    return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): new V1RollingUpdateDaemonSetBuilder().build());
  }
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(V1RollingUpdateDaemonSet item) {
    return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): item);
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonSetUpdateStrategyFluentImpl that = (V1DaemonSetUpdateStrategyFluentImpl) o;
    if (rollingUpdate != null ? !rollingUpdate.equals(that.rollingUpdate) :that.rollingUpdate != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
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
  class RollingUpdateNestedImpl<N> extends V1RollingUpdateDaemonSetFluentImpl<V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>> implements V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>,Nested<N>{
    RollingUpdateNestedImpl(V1RollingUpdateDaemonSet item) {
      this.builder = new V1RollingUpdateDaemonSetBuilder(this, item);
    }
    RollingUpdateNestedImpl() {
      this.builder = new V1RollingUpdateDaemonSetBuilder(this);
    }
    V1RollingUpdateDaemonSetBuilder builder;
    public N and() {
      return (N) V1DaemonSetUpdateStrategyFluentImpl.this.withRollingUpdate(builder.build());
    }
    public N endRollingUpdate() {
      return and();
    }
    
  }
  
}