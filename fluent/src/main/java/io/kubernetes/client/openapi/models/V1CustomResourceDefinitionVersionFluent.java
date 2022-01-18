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

/** Generated */
public interface V1CustomResourceDefinitionVersionFluent<
        A extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAdditionalPrinterColumns(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition item);

  public A setToAdditionalPrinterColumns(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition item);

  public A addToAdditionalPrinterColumns(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... items);

  public A addAllToAdditionalPrinterColumns(
      java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition>
          items);

  public A removeFromAdditionalPrinterColumns(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... items);

  public A removeAllFromAdditionalPrinterColumns(
      java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition>
          items);

  public A removeMatchingFromAdditionalPrinterColumns(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition>
      getAdditionalPrinterColumns();

  public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition>
      buildAdditionalPrinterColumns();

  public io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition
      buildAdditionalPrinterColumn(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition
      buildFirstAdditionalPrinterColumn();

  public io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition
      buildLastAdditionalPrinterColumn();

  public io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition
      buildMatchingAdditionalPrinterColumn(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionBuilder>
              predicate);

  public java.lang.Boolean hasMatchingAdditionalPrinterColumn(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionBuilder>
          predicate);

  public A withAdditionalPrinterColumns(
      java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition>
          additionalPrinterColumns);

  public A withAdditionalPrinterColumns(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition...
          additionalPrinterColumns);

  public java.lang.Boolean hasAdditionalPrinterColumns();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .AdditionalPrinterColumnsNested<
          A>
      addNewAdditionalPrinterColumn();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .AdditionalPrinterColumnsNested<
          A>
      addNewAdditionalPrinterColumnLike(
          io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .AdditionalPrinterColumnsNested<
          A>
      setNewAdditionalPrinterColumnLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .AdditionalPrinterColumnsNested<
          A>
      editAdditionalPrinterColumn(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .AdditionalPrinterColumnsNested<
          A>
      editFirstAdditionalPrinterColumn();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .AdditionalPrinterColumnsNested<
          A>
      editLastAdditionalPrinterColumn();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .AdditionalPrinterColumnsNested<
          A>
      editMatchingAdditionalPrinterColumn(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionBuilder>
              predicate);

  public java.lang.Boolean getDeprecated();

  public A withDeprecated(java.lang.Boolean deprecated);

  public java.lang.Boolean hasDeprecated();

  public java.lang.String getDeprecationWarning();

  public A withDeprecationWarning(java.lang.String deprecationWarning);

  public java.lang.Boolean hasDeprecationWarning();

  /** Method is deprecated. use withDeprecationWarning instead. */
  @java.lang.Deprecated
  public A withNewDeprecationWarning(java.lang.String original);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildSchema instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CustomResourceValidation getSchema();

  public io.kubernetes.client.openapi.models.V1CustomResourceValidation buildSchema();

  public A withSchema(io.kubernetes.client.openapi.models.V1CustomResourceValidation schema);

  public java.lang.Boolean hasSchema();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent.SchemaNested<A>
      withNewSchema();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent.SchemaNested<A>
      withNewSchemaLike(io.kubernetes.client.openapi.models.V1CustomResourceValidation item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent.SchemaNested<A>
      editSchema();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent.SchemaNested<A>
      editOrNewSchema();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent.SchemaNested<A>
      editOrNewSchemaLike(io.kubernetes.client.openapi.models.V1CustomResourceValidation item);

  public java.lang.Boolean getServed();

  public A withServed(java.lang.Boolean served);

  public java.lang.Boolean hasServed();

  public java.lang.Boolean getStorage();

  public A withStorage(java.lang.Boolean storage);

  public java.lang.Boolean hasStorage();

  /**
   * This method has been deprecated, please use method buildSubresources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CustomResourceSubresources getSubresources();

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresources buildSubresources();

  public A withSubresources(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresources subresources);

  public java.lang.Boolean hasSubresources();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .SubresourcesNested<
          A>
      withNewSubresources();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .SubresourcesNested<
          A>
      withNewSubresourcesLike(
          io.kubernetes.client.openapi.models.V1CustomResourceSubresources item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .SubresourcesNested<
          A>
      editSubresources();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .SubresourcesNested<
          A>
      editOrNewSubresources();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
              .SubresourcesNested<
          A>
      editOrNewSubresourcesLike(
          io.kubernetes.client.openapi.models.V1CustomResourceSubresources item);

  public interface AdditionalPrinterColumnsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<
              io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
                      .AdditionalPrinterColumnsNested<
                  N>> {
    public N and();

    public N endAdditionalPrinterColumn();
  }

  public interface SchemaNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<
              io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
                      .SchemaNested<
                  N>> {
    public N and();

    public N endSchema();
  }

  public interface SubresourcesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<
              io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent
                      .SubresourcesNested<
                  N>> {
    public N and();

    public N endSubresources();
  }
}
