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
public interface AdmissionregistrationV1WebhookClientConfigFluent<A extends AdmissionregistrationV1WebhookClientConfigFluent<A>> extends Fluent<A>{
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
  public AdmissionregistrationV1ServiceReference getService();
  public AdmissionregistrationV1ServiceReference buildService();
  public A withService(AdmissionregistrationV1ServiceReference service);
  public Boolean hasService();
  public AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> withNewService();
  public AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> withNewServiceLike(AdmissionregistrationV1ServiceReference item);
  public AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> editService();
  public AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> editOrNewService();
  public AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> editOrNewServiceLike(AdmissionregistrationV1ServiceReference item);
  public String getUrl();
  public A withUrl(String url);
  public Boolean hasUrl();
  public interface ServiceNested<N> extends Nested<N>,AdmissionregistrationV1ServiceReferenceFluent<AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<N>>{
    public N and();
    public N endService();
    
  }
  
}