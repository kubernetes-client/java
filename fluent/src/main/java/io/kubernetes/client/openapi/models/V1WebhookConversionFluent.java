package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1WebhookConversionFluent<A extends V1WebhookConversionFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public ApiextensionsV1WebhookClientConfig getClientConfig();
  public ApiextensionsV1WebhookClientConfig buildClientConfig();
  public A withClientConfig(ApiextensionsV1WebhookClientConfig clientConfig);
  public Boolean hasClientConfig();
  public V1WebhookConversionFluent.ClientConfigNested<A> withNewClientConfig();
  public V1WebhookConversionFluent.ClientConfigNested<A> withNewClientConfigLike(ApiextensionsV1WebhookClientConfig item);
  public V1WebhookConversionFluent.ClientConfigNested<A> editClientConfig();
  public V1WebhookConversionFluent.ClientConfigNested<A> editOrNewClientConfig();
  public V1WebhookConversionFluent.ClientConfigNested<A> editOrNewClientConfigLike(ApiextensionsV1WebhookClientConfig item);
  public A addToConversionReviewVersions(Integer index,String item);
  public A setToConversionReviewVersions(Integer index,String item);
  public A addToConversionReviewVersions(java.lang.String... items);
  public A addAllToConversionReviewVersions(Collection<String> items);
  public A removeFromConversionReviewVersions(java.lang.String... items);
  public A removeAllFromConversionReviewVersions(Collection<String> items);
  public List<String> getConversionReviewVersions();
  public String getConversionReviewVersion(Integer index);
  public String getFirstConversionReviewVersion();
  public String getLastConversionReviewVersion();
  public String getMatchingConversionReviewVersion(Predicate<String> predicate);
  public Boolean hasMatchingConversionReviewVersion(Predicate<String> predicate);
  public A withConversionReviewVersions(List<String> conversionReviewVersions);
  public A withConversionReviewVersions(java.lang.String... conversionReviewVersions);
  public Boolean hasConversionReviewVersions();
  public interface ClientConfigNested<N> extends Nested<N>,ApiextensionsV1WebhookClientConfigFluent<V1WebhookConversionFluent.ClientConfigNested<N>>{
    public N and();
    public N endClientConfig();
    
  }
  
}