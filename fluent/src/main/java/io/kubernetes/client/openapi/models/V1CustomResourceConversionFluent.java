package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceConversionFluent<A extends V1CustomResourceConversionFluent<A>> extends Fluent<A>{
  public String getStrategy();
  public A withStrategy(String strategy);
  public Boolean hasStrategy();
  
  /**
   * This method has been deprecated, please use method buildWebhook instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1WebhookConversion getWebhook();
  public V1WebhookConversion buildWebhook();
  public A withWebhook(V1WebhookConversion webhook);
  public Boolean hasWebhook();
  public V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhook();
  public V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhookLike(V1WebhookConversion item);
  public V1CustomResourceConversionFluent.WebhookNested<A> editWebhook();
  public V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhook();
  public V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhookLike(V1WebhookConversion item);
  public interface WebhookNested<N> extends Nested<N>,V1WebhookConversionFluent<V1CustomResourceConversionFluent.WebhookNested<N>>{
    public N and();
    public N endWebhook();
    
  }
  
}