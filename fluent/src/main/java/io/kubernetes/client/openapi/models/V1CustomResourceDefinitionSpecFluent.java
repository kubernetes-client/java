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
public interface V1CustomResourceDefinitionSpecFluent<A extends V1CustomResourceDefinitionSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildConversion instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceConversion getConversion();
  public V1CustomResourceConversion buildConversion();
  public A withConversion(V1CustomResourceConversion conversion);
  public Boolean hasConversion();
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion();
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversionLike(V1CustomResourceConversion item);
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editConversion();
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversion();
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversionLike(V1CustomResourceConversion item);
  public String getGroup();
  public A withGroup(String group);
  public Boolean hasGroup();
  
  /**
   * This method has been deprecated, please use method buildNames instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceDefinitionNames getNames();
  public V1CustomResourceDefinitionNames buildNames();
  public A withNames(V1CustomResourceDefinitionNames names);
  public Boolean hasNames();
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames();
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNamesLike(V1CustomResourceDefinitionNames item);
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> editNames();
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNames();
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNamesLike(V1CustomResourceDefinitionNames item);
  public Boolean getPreserveUnknownFields();
  public A withPreserveUnknownFields(Boolean preserveUnknownFields);
  public Boolean hasPreserveUnknownFields();
  public String getScope();
  public A withScope(String scope);
  public Boolean hasScope();
  public A addToVersions(Integer index,V1CustomResourceDefinitionVersion item);
  public A setToVersions(Integer index,V1CustomResourceDefinitionVersion item);
  public A addToVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items);
  public A addAllToVersions(Collection<V1CustomResourceDefinitionVersion> items);
  public A removeFromVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items);
  public A removeAllFromVersions(Collection<V1CustomResourceDefinitionVersion> items);
  public A removeMatchingFromVersions(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVersions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CustomResourceDefinitionVersion> getVersions();
  public List<V1CustomResourceDefinitionVersion> buildVersions();
  public V1CustomResourceDefinitionVersion buildVersion(Integer index);
  public V1CustomResourceDefinitionVersion buildFirstVersion();
  public V1CustomResourceDefinitionVersion buildLastVersion();
  public V1CustomResourceDefinitionVersion buildMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate);
  public Boolean hasMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate);
  public A withVersions(List<V1CustomResourceDefinitionVersion> versions);
  public A withVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... versions);
  public Boolean hasVersions();
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion();
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersionLike(V1CustomResourceDefinitionVersion item);
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> setNewVersionLike(Integer index,V1CustomResourceDefinitionVersion item);
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editVersion(Integer index);
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editFirstVersion();
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editLastVersion();
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate);
  public A withPreserveUnknownFields();
  public interface ConversionNested<N> extends Nested<N>,V1CustomResourceConversionFluent<V1CustomResourceDefinitionSpecFluent.ConversionNested<N>>{
    public N and();
    public N endConversion();
    
  }
  public interface NamesNested<N> extends Nested<N>,V1CustomResourceDefinitionNamesFluent<V1CustomResourceDefinitionSpecFluent.NamesNested<N>>{
    public N and();
    public N endNames();
    
  }
  public interface VersionsNested<N> extends Nested<N>,V1CustomResourceDefinitionVersionFluent<V1CustomResourceDefinitionSpecFluent.VersionsNested<N>>{
    public N and();
    public N endVersion();
    
  }
  
}