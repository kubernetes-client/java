package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1beta1AllowedFlexVolumeFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<A>{
  public V1beta1AllowedFlexVolumeFluentImpl() {
  }
  public V1beta1AllowedFlexVolumeFluentImpl(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance) {
    this.withDriver(instance.getDriver());

  }
  private java.lang.String driver;
  public java.lang.String getDriver() {
    return this.driver;
  }
  public A withDriver(java.lang.String driver) {
    this.driver=driver; return (A) this;
  }
  public java.lang.Boolean hasDriver() {
    return this.driver != null;
  }
  
  /**
   * Method is deprecated. use withDriver instead.
   */
  @java.lang.Deprecated
  public A withNewDriver(java.lang.String arg0) {
    return (A)withDriver(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1AllowedFlexVolumeFluentImpl that = (V1beta1AllowedFlexVolumeFluentImpl) o;
    if (driver != null ? !driver.equals(that.driver) :that.driver != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(driver,  super.hashCode());
  }
  
}