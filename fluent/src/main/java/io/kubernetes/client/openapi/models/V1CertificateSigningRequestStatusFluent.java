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
public interface V1CertificateSigningRequestStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A withCertificate(byte... certificate);

  public byte[] getCertificate();

  public A addToCertificate(java.lang.Integer index, java.lang.Byte item);

  public A setToCertificate(java.lang.Integer index, java.lang.Byte item);

  public A addToCertificate(java.lang.Byte... items);

  public A addAllToCertificate(java.util.Collection<java.lang.Byte> items);

  public A removeFromCertificate(java.lang.Byte... items);

  public A removeAllFromCertificate(java.util.Collection<java.lang.Byte> items);

  public java.lang.Boolean hasCertificate();

  public A addToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item);

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... items);

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition>
          items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition>
          items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition>
      getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition
      buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition
      buildLastCondition();

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition
      buildMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>
              predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition>
          conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... conditions);

  public java.lang.Boolean hasConditions();

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent
              .ConditionsNested<
          A>
      addNewCondition();

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent
              .ConditionsNested<
          A>
      addNewConditionLike(
          io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item);

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent
              .ConditionsNested<
          A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item);

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent
              .ConditionsNested<
          A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent
              .ConditionsNested<
          A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent
              .ConditionsNested<
          A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent
              .ConditionsNested<
          A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>
              predicate);

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<
              io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent
                      .ConditionsNested<
                  N>> {
    public N and();

    public N endCondition();
  }
}
