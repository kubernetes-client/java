package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha2ResourceHandleFluentImpl<A extends V1alpha2ResourceHandleFluent<A>> extends BaseFluent<A> implements V1alpha2ResourceHandleFluent<A>{
  public V1alpha2ResourceHandleFluentImpl() {
  }
  public V1alpha2ResourceHandleFluentImpl(V1alpha2ResourceHandle instance) {
    if (instance != null) {
      this.withData(instance.getData());
      this.withDriverName(instance.getDriverName());
    }
  }
  private String data;
  private String driverName;
  public String getData() {
    return this.data;
  }
  public A withData(String data) {
    this.data=data; return (A) this;
  }
  public Boolean hasData() {
    return this.data != null;
  }
  public String getDriverName() {
    return this.driverName;
  }
  public A withDriverName(String driverName) {
    this.driverName=driverName; return (A) this;
  }
  public Boolean hasDriverName() {
    return this.driverName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceHandleFluentImpl that = (V1alpha2ResourceHandleFluentImpl) o;
    if (!java.util.Objects.equals(data, that.data)) return false;

    if (!java.util.Objects.equals(driverName, that.driverName)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(data,  driverName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (data != null) { sb.append("data:"); sb.append(data + ","); }
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName); }
    sb.append("}");
    return sb.toString();
  }
  
}