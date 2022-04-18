/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1CustomResourceDefinitionSpecFluent<
        A extends V1CustomResourceDefinitionSpecFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildConversion instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceConversion getConversion();

  public io.kubernetes.client.openapi.models.V1CustomResourceConversion buildConversion();

  public A withConversion(
      io.kubernetes.client.openapi.models.V1CustomResourceConversion conversion);

  public Boolean hasConversion();

  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<
          A>
      withNewConversionLike(io.kubernetes.client.openapi.models.V1CustomResourceConversion item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<
          A>
      editConversion();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<
          A>
      editOrNewConversion();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<
          A>
      editOrNewConversionLike(io.kubernetes.client.openapi.models.V1CustomResourceConversion item);

  public String getGroup();

  public A withGroup(java.lang.String group);

  public java.lang.Boolean hasGroup();

  /**
   * This method has been deprecated, please use method buildNames instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1CustomResourceDefinitionNames getNames();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames buildNames();

  public A withNames(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames names);

  public java.lang.Boolean hasNames();

  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A>
      withNewNamesLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A>
      editNames();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A>
      editOrNewNames();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A>
      editOrNewNamesLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item);

  public java.lang.Boolean getPreserveUnknownFields();

  public A withPreserveUnknownFields(java.lang.Boolean preserveUnknownFields);

  public java.lang.Boolean hasPreserveUnknownFields();

  public java.lang.String getScope();

  public A withScope(java.lang.String scope);

  public java.lang.Boolean hasScope();

  public A addToVersions(Integer index, V1CustomResourceDefinitionVersion item);

  public A setToVersions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item);

  public A addToVersions(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items);

  public A addAllToVersions(
      Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> items);

  public A removeFromVersions(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items);

  public A removeAllFromVersions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion>
          items);

  public A removeMatchingFromVersions(
      Predicate<V1CustomResourceDefinitionVersionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildVersions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> getVersions();

  public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion>
      buildVersions();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildVersion(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildFirstVersion();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildLastVersion();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildMatchingVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder>
          predicate);

  public java.lang.Boolean hasMatchingVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder>
          predicate);

  public A withVersions(
      java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion>
          versions);

  public A withVersions(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... versions);

  public java.lang.Boolean hasVersions();

  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A>
      addNewVersionLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A>
      setNewVersionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A>
      editVersion(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A>
      editFirstVersion();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A>
      editLastVersion();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A>
      editMatchingVersion(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder>
              predicate);

  public A withPreserveUnknownFields();

  public interface ConversionNested<N>
      extends Nested<N>,
          V1CustomResourceConversionFluent<
              V1CustomResourceDefinitionSpecFluent.ConversionNested<N>> {
    public N and();

    public N endConversion();
  }

  public interface NamesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1CustomResourceDefinitionNamesFluent<
              V1CustomResourceDefinitionSpecFluent.NamesNested<N>> {
    public N and();

    public N endNames();
  }

  public interface VersionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1CustomResourceDefinitionVersionFluent<
              V1CustomResourceDefinitionSpecFluent.VersionsNested<N>> {
    public N and();

    public N endVersion();
  }
}
