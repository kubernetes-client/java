package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Byte;
import java.util.Collection;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface ApiextensionsV1WebhookClientConfigFluent<A extends io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A withCaBundle(byte... caBundle);
  public byte[] getCaBundle();
  public A addToCaBundle(java.lang.Integer index,java.lang.Byte item);
  public A setToCaBundle(java.lang.Integer index,java.lang.Byte item);
  public A addToCaBundle(java.lang.Byte... items);
  public A addAllToCaBundle(java.util.Collection<java.lang.Byte> items);
  public A removeFromCaBundle(java.lang.Byte... items);
  public A removeAllFromCaBundle(java.util.Collection<java.lang.Byte> items);
  public java.lang.Boolean hasCaBundle();
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference getService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference buildService();
  public A withService(io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference service);
  public java.lang.Boolean hasService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> withNewService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> withNewServiceLike(io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference item);
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editOrNewService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editOrNewServiceLike(io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference item);
  public java.lang.String getUrl();
  public A withUrl(java.lang.String url);
  public java.lang.Boolean hasUrl();
  
  /**
   * Method is deprecated. use withUrl instead.
   */
  @java.lang.Deprecated
  public A withNewUrl(java.lang.String arg0);
  public interface ServiceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReferenceFluent<io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<N>>{
    public N and();
    public N endService();
    
  }
  
}