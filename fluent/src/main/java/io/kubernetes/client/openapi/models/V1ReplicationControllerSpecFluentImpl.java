package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ReplicationControllerSpecFluentImpl<A extends V1ReplicationControllerSpecFluent<A>> extends BaseFluent<A> implements V1ReplicationControllerSpecFluent<A>{
  public V1ReplicationControllerSpecFluentImpl() {
  }
  public V1ReplicationControllerSpecFluentImpl(V1ReplicationControllerSpec instance) {
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

  }
  private Integer minReadySeconds;
  private Integer replicas;
  private Map<String,String> selector;
  private V1PodTemplateSpecBuilder template;
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  public A withMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds=minReadySeconds; return (A) this;
  }
  public Boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  public Integer getReplicas() {
    return this.replicas;
  }
  public A withReplicas(Integer replicas) {
    this.replicas=replicas; return (A) this;
  }
  public Boolean hasReplicas() {
    return this.replicas != null;
  }
  public A addToSelector(String key,String value) {
    if(this.selector == null && key != null && value != null) { this.selector = new LinkedHashMap(); }
    if(key != null && value != null) {this.selector.put(key, value);} return (A)this;
  }
  public A addToSelector(Map<String,String> map) {
    if(this.selector == null && map != null) { this.selector = new LinkedHashMap(); }
    if(map != null) { this.selector.putAll(map);} return (A)this;
  }
  public A removeFromSelector(String key) {
    if(this.selector == null) { return (A) this; }
    if(key != null && this.selector != null) {this.selector.remove(key);} return (A)this;
  }
  public A removeFromSelector(Map<String,String> map) {
    if(this.selector == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.selector != null){this.selector.remove(key);}}} return (A)this;
  }
  public Map<String,String> getSelector() {
    return this.selector;
  }
  public <K,V>A withSelector(Map<String,String> selector) {
    if (selector == null) { this.selector =  null;} else {this.selector = new LinkedHashMap(selector);} return (A) this;
  }
  public Boolean hasSelector() {
    return this.selector != null;
  }
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate() {
    return this.template!=null ?this.template.build():null;
  }
  public V1PodTemplateSpec buildTemplate() {
    return this.template!=null ?this.template.build():null;
  }
  public A withTemplate(V1PodTemplateSpec template) {
    _visitables.get("template").remove(this.template);
    if (template!=null){ this.template= new V1PodTemplateSpecBuilder(template); _visitables.get("template").add(this.template);} else { this.template = null; _visitables.get("template").remove(this.template); } return (A) this;
  }
  public Boolean hasTemplate() {
    return this.template != null;
  }
  public V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplate() {
    return new V1ReplicationControllerSpecFluentImpl.TemplateNestedImpl();
  }
  public V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new V1ReplicationControllerSpecFluentImpl.TemplateNestedImpl(item);
  }
  public V1ReplicationControllerSpecFluent.TemplateNested<A> editTemplate() {
    return withNewTemplateLike(getTemplate());
  }
  public V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): new V1PodTemplateSpecBuilder().build());
  }
  public V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ReplicationControllerSpecFluentImpl that = (V1ReplicationControllerSpecFluentImpl) o;
    if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
    if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    if (template != null ? !template.equals(that.template) :that.template != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(minReadySeconds,  replicas,  selector,  template,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (minReadySeconds != null) { sb.append("minReadySeconds:"); sb.append(minReadySeconds + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (selector != null && !selector.isEmpty()) { sb.append("selector:"); sb.append(selector + ","); }
    if (template != null) { sb.append("template:"); sb.append(template); }
    sb.append("}");
    return sb.toString();
  }
  class TemplateNestedImpl<N> extends V1PodTemplateSpecFluentImpl<V1ReplicationControllerSpecFluent.TemplateNested<N>> implements V1ReplicationControllerSpecFluent.TemplateNested<N>,Nested<N>{
    TemplateNestedImpl(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    TemplateNestedImpl() {
      this.builder = new V1PodTemplateSpecBuilder(this);
    }
    V1PodTemplateSpecBuilder builder;
    public N and() {
      return (N) V1ReplicationControllerSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate() {
      return and();
    }
    
  }
  
}