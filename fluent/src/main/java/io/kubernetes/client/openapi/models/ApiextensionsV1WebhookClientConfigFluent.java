package io.kubernetes.client.openapi.models;

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
public interface ApiextensionsV1WebhookClientConfigFluent<A extends ApiextensionsV1WebhookClientConfigFluent<A>> extends Fluent<A>{
  public A withCaBundle(byte... caBundle);
  public byte[] getCaBundle();
  public A addToCaBundle(Integer index,Byte item);
  public A setToCaBundle(Integer index,Byte item);
  public A addToCaBundle(java.lang.Byte... items);
  public A addAllToCaBundle(Collection<Byte> items);
  public A removeFromCaBundle(java.lang.Byte... items);
  public A removeAllFromCaBundle(Collection<Byte> items);
  public Boolean hasCaBundle();
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @Deprecated
  public ApiextensionsV1ServiceReference getService();
  public ApiextensionsV1ServiceReference buildService();
  public A withService(ApiextensionsV1ServiceReference service);
  public Boolean hasService();
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> withNewService();
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> withNewServiceLike(ApiextensionsV1ServiceReference item);
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editService();
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editOrNewService();
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editOrNewServiceLike(ApiextensionsV1ServiceReference item);
  public String getUrl();
  public A withUrl(String url);
  public Boolean hasUrl();
  public interface ServiceNested<N> extends Nested<N>,ApiextensionsV1ServiceReferenceFluent<ApiextensionsV1WebhookClientConfigFluent.ServiceNested<N>>{
    public N and();
    public N endService();
    
  }
  
}