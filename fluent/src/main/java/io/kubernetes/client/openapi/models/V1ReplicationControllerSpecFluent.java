package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ReplicationControllerSpecFluent<A extends V1ReplicationControllerSpecFluent<A>> extends BaseFluent<A>{
  public V1ReplicationControllerSpecFluent() {
  }
  
  public V1ReplicationControllerSpecFluent(V1ReplicationControllerSpec instance) {
    this.copyInstance(instance);
  }
  private Integer minReadySeconds;
  private Integer replicas;
  private Map<String,String> selector;
  private V1PodTemplateSpecBuilder template;
  
  protected void copyInstance(V1ReplicationControllerSpec instance) {
    instance = (instance != null ? instance : new V1ReplicationControllerSpec());
    if (instance != null) {
          this.withMinReadySeconds(instance.getMinReadySeconds());
          this.withReplicas(instance.getReplicas());
          this.withSelector(instance.getSelector());
          this.withTemplate(instance.getTemplate());
        }
  }
  
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  
  public A withMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return (A) this;
  }
  
  public boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
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
    if (selector == null) {
      this.selector = null;
    } else {
      this.selector = new LinkedHashMap(selector);
    }
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public V1PodTemplateSpec buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }
  
  public A withTemplate(V1PodTemplateSpec template) {
    this._visitables.remove("template");
    if (template != null) {
        this.template = new V1PodTemplateSpecBuilder(template);
        this._visitables.get("template").add(this.template);
    } else {
        this.template = null;
        this._visitables.get("template").remove(this.template);
    }
    return (A) this;
  }
  
  public boolean hasTemplate() {
    return this.template != null;
  }
  
  public TemplateNested<A> withNewTemplate() {
    return new TemplateNested(null);
  }
  
  public TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new TemplateNested(item);
  }
  
  public TemplateNested<A> editTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(null));
  }
  
  public TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(new V1PodTemplateSpecBuilder().build()));
  }
  
  public TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ReplicationControllerSpecFluent that = (V1ReplicationControllerSpecFluent) o;
    if (!java.util.Objects.equals(minReadySeconds, that.minReadySeconds)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(template, that.template)) return false;
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
  public class TemplateNested<N> extends V1PodTemplateSpecFluent<TemplateNested<N>> implements Nested<N>{
    TemplateNested(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    V1PodTemplateSpecBuilder builder;
    
    public N and() {
      return (N) V1ReplicationControllerSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  
  }

}