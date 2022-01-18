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
public interface V1IngressSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1IngressSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildDefaultBackend instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressBackend getDefaultBackend();

  public io.kubernetes.client.openapi.models.V1IngressBackend buildDefaultBackend();

  public A withDefaultBackend(io.kubernetes.client.openapi.models.V1IngressBackend defaultBackend);

  public java.lang.Boolean hasDefaultBackend();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      withNewDefaultBackend();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      withNewDefaultBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item);

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      editDefaultBackend();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      editOrNewDefaultBackend();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      editOrNewDefaultBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item);

  public java.lang.String getIngressClassName();

  public A withIngressClassName(java.lang.String ingressClassName);

  public java.lang.Boolean hasIngressClassName();

  /** Method is deprecated. use withIngressClassName instead. */
  @java.lang.Deprecated
  public A withNewIngressClassName(java.lang.String original);

  public A addToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressRule item);

  public A setToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressRule item);

  public A addToRules(io.kubernetes.client.openapi.models.V1IngressRule... items);

  public A addAllToRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1IngressRule> items);

  public A removeFromRules(io.kubernetes.client.openapi.models.V1IngressRule... items);

  public A removeAllFromRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1IngressRule> items);

  public A removeMatchingFromRules(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1IngressRule> getRules();

  public java.util.List<io.kubernetes.client.openapi.models.V1IngressRule> buildRules();

  public io.kubernetes.client.openapi.models.V1IngressRule buildRule(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1IngressRule buildFirstRule();

  public io.kubernetes.client.openapi.models.V1IngressRule buildLastRule();

  public io.kubernetes.client.openapi.models.V1IngressRule buildMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>
          predicate);

  public java.lang.Boolean hasMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>
          predicate);

  public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1IngressRule> rules);

  public A withRules(io.kubernetes.client.openapi.models.V1IngressRule... rules);

  public java.lang.Boolean hasRules();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> addNewRule();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> addNewRuleLike(
      io.kubernetes.client.openapi.models.V1IngressRule item);

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> setNewRuleLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressRule item);

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> editRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> editFirstRule();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> editLastRule();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> editMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>
          predicate);

  public A addToTls(java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressTLS item);

  public A setToTls(java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressTLS item);

  public A addToTls(io.kubernetes.client.openapi.models.V1IngressTLS... items);

  public A addAllToTls(
      java.util.Collection<io.kubernetes.client.openapi.models.V1IngressTLS> items);

  public A removeFromTls(io.kubernetes.client.openapi.models.V1IngressTLS... items);

  public A removeAllFromTls(
      java.util.Collection<io.kubernetes.client.openapi.models.V1IngressTLS> items);

  public A removeMatchingFromTls(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildTls instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1IngressTLS> getTls();

  public java.util.List<io.kubernetes.client.openapi.models.V1IngressTLS> buildTls();

  public io.kubernetes.client.openapi.models.V1IngressTLS buildTl(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1IngressTLS buildFirstTl();

  public io.kubernetes.client.openapi.models.V1IngressTLS buildLastTl();

  public io.kubernetes.client.openapi.models.V1IngressTLS buildMatchingTl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>
          predicate);

  public java.lang.Boolean hasMatchingTl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>
          predicate);

  public A withTls(java.util.List<io.kubernetes.client.openapi.models.V1IngressTLS> tls);

  public A withTls(io.kubernetes.client.openapi.models.V1IngressTLS... tls);

  public java.lang.Boolean hasTls();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> addNewTl();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> addNewTlLike(
      io.kubernetes.client.openapi.models.V1IngressTLS item);

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> setNewTlLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressTLS item);

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> editTl(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> editFirstTl();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> editLastTl();

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> editMatchingTl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>
          predicate);

  public interface DefaultBackendNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1IngressBackendFluent<
              io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<N>> {
    public N and();

    public N endDefaultBackend();
  }

  public interface RulesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1IngressRuleFluent<
              io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<N>> {
    public N and();

    public N endRule();
  }

  public interface TlsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1IngressTLSFluent<
              io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<N>> {
    public N and();

    public N endTl();
  }
}
