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
public interface V1RoleBindingFluent<
        A extends io.kubernetes.client.openapi.models.V1RoleBindingFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.MetadataNested<A>
      withNewMetadata();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildRoleRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RoleRef getRoleRef();

  public io.kubernetes.client.openapi.models.V1RoleRef buildRoleRef();

  public A withRoleRef(io.kubernetes.client.openapi.models.V1RoleRef roleRef);

  public java.lang.Boolean hasRoleRef();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.RoleRefNested<A> withNewRoleRef();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.RoleRefNested<A>
      withNewRoleRefLike(io.kubernetes.client.openapi.models.V1RoleRef item);

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.RoleRefNested<A> editRoleRef();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.RoleRefNested<A>
      editOrNewRoleRef();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.RoleRefNested<A>
      editOrNewRoleRefLike(io.kubernetes.client.openapi.models.V1RoleRef item);

  public A addToSubjects(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Subject item);

  public A setToSubjects(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Subject item);

  public A addToSubjects(io.kubernetes.client.openapi.models.V1Subject... items);

  public A addAllToSubjects(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Subject> items);

  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1Subject... items);

  public A removeAllFromSubjects(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Subject> items);

  public A removeMatchingFromSubjects(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SubjectBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildSubjects instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Subject> getSubjects();

  public java.util.List<io.kubernetes.client.openapi.models.V1Subject> buildSubjects();

  public io.kubernetes.client.openapi.models.V1Subject buildSubject(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Subject buildFirstSubject();

  public io.kubernetes.client.openapi.models.V1Subject buildLastSubject();

  public io.kubernetes.client.openapi.models.V1Subject buildMatchingSubject(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SubjectBuilder> predicate);

  public java.lang.Boolean hasMatchingSubject(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SubjectBuilder> predicate);

  public A withSubjects(java.util.List<io.kubernetes.client.openapi.models.V1Subject> subjects);

  public A withSubjects(io.kubernetes.client.openapi.models.V1Subject... subjects);

  public java.lang.Boolean hasSubjects();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.SubjectsNested<A> addNewSubject();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.SubjectsNested<A>
      addNewSubjectLike(io.kubernetes.client.openapi.models.V1Subject item);

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.SubjectsNested<A>
      setNewSubjectLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Subject item);

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.SubjectsNested<A> editSubject(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.SubjectsNested<A>
      editFirstSubject();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.SubjectsNested<A>
      editLastSubject();

  public io.kubernetes.client.openapi.models.V1RoleBindingFluent.SubjectsNested<A>
      editMatchingSubject(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SubjectBuilder>
              predicate);

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1RoleBindingFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface RoleRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1RoleRefFluent<
              io.kubernetes.client.openapi.models.V1RoleBindingFluent.RoleRefNested<N>> {
    public N and();

    public N endRoleRef();
  }

  public interface SubjectsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SubjectFluent<
              io.kubernetes.client.openapi.models.V1RoleBindingFluent.SubjectsNested<N>> {
    public N and();

    public N endSubject();
  }
}
