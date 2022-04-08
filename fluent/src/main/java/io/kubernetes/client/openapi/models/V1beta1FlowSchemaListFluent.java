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
public interface V1beta1FlowSchemaListFluent<A extends V1beta1FlowSchemaListFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, io.kubernetes.client.openapi.models.V1beta1FlowSchema item);

  public A setToItems(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1FlowSchema item);

  public A addToItems(io.kubernetes.client.openapi.models.V1beta1FlowSchema... items);

  public A addAllToItems(Collection<io.kubernetes.client.openapi.models.V1beta1FlowSchema> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1beta1FlowSchema... items);

  public A removeAllFromItems(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1FlowSchema> items);

  public A removeMatchingFromItems(Predicate<V1beta1FlowSchemaBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1beta1FlowSchema> getItems();

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1FlowSchema> buildItems();

  public io.kubernetes.client.openapi.models.V1beta1FlowSchema buildItem(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1FlowSchema buildFirstItem();

  public io.kubernetes.client.openapi.models.V1beta1FlowSchema buildLastItem();

  public io.kubernetes.client.openapi.models.V1beta1FlowSchema buildMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1FlowSchemaBuilder>
          predicate);

  public java.lang.Boolean hasMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1FlowSchemaBuilder>
          predicate);

  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1beta1FlowSchema> items);

  public A withItems(io.kubernetes.client.openapi.models.V1beta1FlowSchema... items);

  public java.lang.Boolean hasItems();

  public V1beta1FlowSchemaListFluent.ItemsNested<A> addNewItem();

  public V1beta1FlowSchemaListFluent.ItemsNested<A> addNewItemLike(
      io.kubernetes.client.openapi.models.V1beta1FlowSchema item);

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.ItemsNested<A>
      setNewItemLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1FlowSchema item);

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.ItemsNested<A> editItem(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.ItemsNested<A>
      editFirstItem();

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.ItemsNested<A>
      editLastItem();

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.ItemsNested<A>
      editMatchingItem(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1FlowSchemaBuilder>
              predicate);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ListMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1beta1FlowSchemaListFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.MetadataNested<A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaListFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);

  public interface ItemsNested<N>
      extends Nested<N>, V1beta1FlowSchemaFluent<V1beta1FlowSchemaListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ListMetaFluent<V1beta1FlowSchemaListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
