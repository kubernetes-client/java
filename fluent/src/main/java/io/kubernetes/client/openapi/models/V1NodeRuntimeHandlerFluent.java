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
public class V1NodeRuntimeHandlerFluent<A extends V1NodeRuntimeHandlerFluent<A>> extends BaseFluent<A>{
  public V1NodeRuntimeHandlerFluent() {
  }
  
  public V1NodeRuntimeHandlerFluent(V1NodeRuntimeHandler instance) {
    this.copyInstance(instance);
  }
  private V1NodeRuntimeHandlerFeaturesBuilder features;
  private String name;
  
  protected void copyInstance(V1NodeRuntimeHandler instance) {
    instance = (instance != null ? instance : new V1NodeRuntimeHandler());
    if (instance != null) {
          this.withFeatures(instance.getFeatures());
          this.withName(instance.getName());
        }
  }
  
  public V1NodeRuntimeHandlerFeatures buildFeatures() {
    return this.features != null ? this.features.build() : null;
  }
  
  public A withFeatures(V1NodeRuntimeHandlerFeatures features) {
    this._visitables.remove("features");
    if (features != null) {
        this.features = new V1NodeRuntimeHandlerFeaturesBuilder(features);
        this._visitables.get("features").add(this.features);
    } else {
        this.features = null;
        this._visitables.get("features").remove(this.features);
    }
    return (A) this;
  }
  
  public boolean hasFeatures() {
    return this.features != null;
  }
  
  public FeaturesNested<A> withNewFeatures() {
    return new FeaturesNested(null);
  }
  
  public FeaturesNested<A> withNewFeaturesLike(V1NodeRuntimeHandlerFeatures item) {
    return new FeaturesNested(item);
  }
  
  public FeaturesNested<A> editFeatures() {
    return withNewFeaturesLike(java.util.Optional.ofNullable(buildFeatures()).orElse(null));
  }
  
  public FeaturesNested<A> editOrNewFeatures() {
    return withNewFeaturesLike(java.util.Optional.ofNullable(buildFeatures()).orElse(new V1NodeRuntimeHandlerFeaturesBuilder().build()));
  }
  
  public FeaturesNested<A> editOrNewFeaturesLike(V1NodeRuntimeHandlerFeatures item) {
    return withNewFeaturesLike(java.util.Optional.ofNullable(buildFeatures()).orElse(item));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeRuntimeHandlerFluent that = (V1NodeRuntimeHandlerFluent) o;
    if (!java.util.Objects.equals(features, that.features)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(features,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (features != null) { sb.append("features:"); sb.append(features + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  public class FeaturesNested<N> extends V1NodeRuntimeHandlerFeaturesFluent<FeaturesNested<N>> implements Nested<N>{
    FeaturesNested(V1NodeRuntimeHandlerFeatures item) {
      this.builder = new V1NodeRuntimeHandlerFeaturesBuilder(this, item);
    }
    V1NodeRuntimeHandlerFeaturesBuilder builder;
    
    public N and() {
      return (N) V1NodeRuntimeHandlerFluent.this.withFeatures(builder.build());
    }
    
    public N endFeatures() {
      return and();
    }
    
  
  }

}