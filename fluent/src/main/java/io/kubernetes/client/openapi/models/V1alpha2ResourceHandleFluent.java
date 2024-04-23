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
public class V1alpha2ResourceHandleFluent<A extends V1alpha2ResourceHandleFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceHandleFluent() {
  }
  
  public V1alpha2ResourceHandleFluent(V1alpha2ResourceHandle instance) {
    this.copyInstance(instance);
  }
  private String data;
  private String driverName;
  private V1alpha2StructuredResourceHandleBuilder structuredData;
  
  protected void copyInstance(V1alpha2ResourceHandle instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceHandle());
    if (instance != null) {
          this.withData(instance.getData());
          this.withDriverName(instance.getDriverName());
          this.withStructuredData(instance.getStructuredData());
        }
  }
  
  public String getData() {
    return this.data;
  }
  
  public A withData(String data) {
    this.data = data;
    return (A) this;
  }
  
  public boolean hasData() {
    return this.data != null;
  }
  
  public String getDriverName() {
    return this.driverName;
  }
  
  public A withDriverName(String driverName) {
    this.driverName = driverName;
    return (A) this;
  }
  
  public boolean hasDriverName() {
    return this.driverName != null;
  }
  
  public V1alpha2StructuredResourceHandle buildStructuredData() {
    return this.structuredData != null ? this.structuredData.build() : null;
  }
  
  public A withStructuredData(V1alpha2StructuredResourceHandle structuredData) {
    this._visitables.remove("structuredData");
    if (structuredData != null) {
        this.structuredData = new V1alpha2StructuredResourceHandleBuilder(structuredData);
        this._visitables.get("structuredData").add(this.structuredData);
    } else {
        this.structuredData = null;
        this._visitables.get("structuredData").remove(this.structuredData);
    }
    return (A) this;
  }
  
  public boolean hasStructuredData() {
    return this.structuredData != null;
  }
  
  public StructuredDataNested<A> withNewStructuredData() {
    return new StructuredDataNested(null);
  }
  
  public StructuredDataNested<A> withNewStructuredDataLike(V1alpha2StructuredResourceHandle item) {
    return new StructuredDataNested(item);
  }
  
  public StructuredDataNested<A> editStructuredData() {
    return withNewStructuredDataLike(java.util.Optional.ofNullable(buildStructuredData()).orElse(null));
  }
  
  public StructuredDataNested<A> editOrNewStructuredData() {
    return withNewStructuredDataLike(java.util.Optional.ofNullable(buildStructuredData()).orElse(new V1alpha2StructuredResourceHandleBuilder().build()));
  }
  
  public StructuredDataNested<A> editOrNewStructuredDataLike(V1alpha2StructuredResourceHandle item) {
    return withNewStructuredDataLike(java.util.Optional.ofNullable(buildStructuredData()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceHandleFluent that = (V1alpha2ResourceHandleFluent) o;
    if (!java.util.Objects.equals(data, that.data)) return false;
    if (!java.util.Objects.equals(driverName, that.driverName)) return false;
    if (!java.util.Objects.equals(structuredData, that.structuredData)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(data,  driverName,  structuredData,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (data != null) { sb.append("data:"); sb.append(data + ","); }
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (structuredData != null) { sb.append("structuredData:"); sb.append(structuredData); }
    sb.append("}");
    return sb.toString();
  }
  public class StructuredDataNested<N> extends V1alpha2StructuredResourceHandleFluent<StructuredDataNested<N>> implements Nested<N>{
    StructuredDataNested(V1alpha2StructuredResourceHandle item) {
      this.builder = new V1alpha2StructuredResourceHandleBuilder(this, item);
    }
    V1alpha2StructuredResourceHandleBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceHandleFluent.this.withStructuredData(builder.build());
    }
    
    public N endStructuredData() {
      return and();
    }
    
  
  }

}