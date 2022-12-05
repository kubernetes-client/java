package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceDefinitionVersionFluent<A extends V1CustomResourceDefinitionVersionFluent<A>> extends Fluent<A>{
  public A addToAdditionalPrinterColumns(Integer index,V1CustomResourceColumnDefinition item);
  public A setToAdditionalPrinterColumns(Integer index,V1CustomResourceColumnDefinition item);
  public A addToAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... items);
  public A addAllToAdditionalPrinterColumns(Collection<V1CustomResourceColumnDefinition> items);
  public A removeFromAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... items);
  public A removeAllFromAdditionalPrinterColumns(Collection<V1CustomResourceColumnDefinition> items);
  public A removeMatchingFromAdditionalPrinterColumns(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CustomResourceColumnDefinition> getAdditionalPrinterColumns();
  public List<V1CustomResourceColumnDefinition> buildAdditionalPrinterColumns();
  public V1CustomResourceColumnDefinition buildAdditionalPrinterColumn(Integer index);
  public V1CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn();
  public V1CustomResourceColumnDefinition buildLastAdditionalPrinterColumn();
  public V1CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate);
  public Boolean hasMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate);
  public A withAdditionalPrinterColumns(List<V1CustomResourceColumnDefinition> additionalPrinterColumns);
  public A withAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... additionalPrinterColumns);
  public Boolean hasAdditionalPrinterColumns();
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn();
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(V1CustomResourceColumnDefinition item);
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(Integer index,V1CustomResourceColumnDefinition item);
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(Integer index);
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn();
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn();
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate);
  public Boolean getDeprecated();
  public A withDeprecated(Boolean deprecated);
  public Boolean hasDeprecated();
  public String getDeprecationWarning();
  public A withDeprecationWarning(String deprecationWarning);
  public Boolean hasDeprecationWarning();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildSchema instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceValidation getSchema();
  public V1CustomResourceValidation buildSchema();
  public A withSchema(V1CustomResourceValidation schema);
  public Boolean hasSchema();
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchema();
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchemaLike(V1CustomResourceValidation item);
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> editSchema();
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchema();
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchemaLike(V1CustomResourceValidation item);
  public Boolean getServed();
  public A withServed(Boolean served);
  public Boolean hasServed();
  public Boolean getStorage();
  public A withStorage(Boolean storage);
  public Boolean hasStorage();
  
  /**
   * This method has been deprecated, please use method buildSubresources instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceSubresources getSubresources();
  public V1CustomResourceSubresources buildSubresources();
  public A withSubresources(V1CustomResourceSubresources subresources);
  public Boolean hasSubresources();
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresources();
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresourcesLike(V1CustomResourceSubresources item);
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editSubresources();
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresources();
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresourcesLike(V1CustomResourceSubresources item);
  public A withDeprecated();
  public A withServed();
  public A withStorage();
  public interface AdditionalPrinterColumnsNested<N> extends Nested<N>,V1CustomResourceColumnDefinitionFluent<V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>>{
    public N and();
    public N endAdditionalPrinterColumn();
    
  }
  public interface SchemaNested<N> extends Nested<N>,V1CustomResourceValidationFluent<V1CustomResourceDefinitionVersionFluent.SchemaNested<N>>{
    public N and();
    public N endSchema();
    
  }
  public interface SubresourcesNested<N> extends Nested<N>,V1CustomResourceSubresourcesFluent<V1CustomResourceDefinitionVersionFluent.SubresourcesNested<N>>{
    public N and();
    public N endSubresources();
    
  }
  
}