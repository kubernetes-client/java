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
  public class V1StatefulSetUpdateStrategyFluentImpl<A extends V1StatefulSetUpdateStrategyFluent<A>> extends BaseFluent<A> implements V1StatefulSetUpdateStrategyFluent<A>{
  public V1StatefulSetUpdateStrategyFluentImpl() {
  }
  public V1StatefulSetUpdateStrategyFluentImpl(V1StatefulSetUpdateStrategy instance) {
    if (instance != null) {
      this.withRollingUpdate(instance.getRollingUpdate());
      this.withType(instance.getType());
    }
  }
  private V1RollingUpdateStatefulSetStrategyBuilder rollingUpdate;
  private String type;
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateStatefulSetStrategy getRollingUpdate() {
    return this.rollingUpdate!=null ?this.rollingUpdate.build():null;
  }
  public V1RollingUpdateStatefulSetStrategy buildRollingUpdate() {
    return this.rollingUpdate!=null ?this.rollingUpdate.build():null;
  }
  public A withRollingUpdate(V1RollingUpdateStatefulSetStrategy rollingUpdate) {
    _visitables.get("rollingUpdate").remove(this.rollingUpdate);
    if (rollingUpdate!=null){ this.rollingUpdate= new V1RollingUpdateStatefulSetStrategyBuilder(rollingUpdate); _visitables.get("rollingUpdate").add(this.rollingUpdate);} else { this.rollingUpdate = null; _visitables.get("rollingUpdate").remove(this.rollingUpdate); } return (A) this;
  }
  public Boolean hasRollingUpdate() {
    return this.rollingUpdate != null;
  }
  public V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNested<A> withNewRollingUpdate() {
    return new V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNestedImpl();
  }
  public V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNested<A> withNewRollingUpdateLike(V1RollingUpdateStatefulSetStrategy item) {
    return new V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNestedImpl(item);
  }
  public V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNested<A> editRollingUpdate() {
    return withNewRollingUpdateLike(getRollingUpdate());
  }
  public V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNested<A> editOrNewRollingUpdate() {
    return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): new V1RollingUpdateStatefulSetStrategyBuilder().build());
  }
  public V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNested<A> editOrNewRollingUpdateLike(V1RollingUpdateStatefulSetStrategy item) {
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
    if (!super.equals(o)) return false;
    V1StatefulSetUpdateStrategyFluentImpl that = (V1StatefulSetUpdateStrategyFluentImpl) o;
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
  class RollingUpdateNestedImpl<N> extends V1RollingUpdateStatefulSetStrategyFluentImpl<V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNested<N>> implements V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNested<N>,Nested<N>{
    RollingUpdateNestedImpl(V1RollingUpdateStatefulSetStrategy item) {
      this.builder = new V1RollingUpdateStatefulSetStrategyBuilder(this, item);
    }
    RollingUpdateNestedImpl() {
      this.builder = new V1RollingUpdateStatefulSetStrategyBuilder(this);
    }
    V1RollingUpdateStatefulSetStrategyBuilder builder;
    public N and() {
      return (N) V1StatefulSetUpdateStrategyFluentImpl.this.withRollingUpdate(builder.build());
    }
    public N endRollingUpdate() {
      return and();
    }
    
  }
  
}