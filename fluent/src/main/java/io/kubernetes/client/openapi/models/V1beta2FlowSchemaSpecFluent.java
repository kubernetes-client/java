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
public interface V1beta2FlowSchemaSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildDistinguisherMethod instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod
      getDistinguisherMethod();

  public io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod
      buildDistinguisherMethod();

  public A withDistinguisherMethod(
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod distinguisherMethod);

  public java.lang.Boolean hasDistinguisherMethod();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      withNewDistinguisherMethod();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      withNewDistinguisherMethodLike(
          io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod item);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      editDistinguisherMethod();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      editOrNewDistinguisherMethod();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      editOrNewDistinguisherMethodLike(
          io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod item);

  public java.lang.Integer getMatchingPrecedence();

  public A withMatchingPrecedence(java.lang.Integer matchingPrecedence);

  public java.lang.Boolean hasMatchingPrecedence();

  /**
   * This method has been deprecated, please use method buildPriorityLevelConfiguration instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference
      getPriorityLevelConfiguration();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference
      buildPriorityLevelConfiguration();

  public A withPriorityLevelConfiguration(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference
          priorityLevelConfiguration);

  public java.lang.Boolean hasPriorityLevelConfiguration();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      withNewPriorityLevelConfiguration();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      withNewPriorityLevelConfigurationLike(
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference item);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      editPriorityLevelConfiguration();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      editOrNewPriorityLevelConfiguration();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      editOrNewPriorityLevelConfigurationLike(
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference item);

  public A addToRules(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item);

  public A setToRules(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item);

  public A addToRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... items);

  public A addAllToRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects>
          items);

  public A removeFromRules(
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... items);

  public A removeAllFromRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects>
          items);

  public A removeMatchingFromRules(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects>
      getRules();

  public java.util.List<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects>
      buildRules();

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects buildRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects buildFirstRule();

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects buildLastRule();

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects buildMatchingRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
          predicate);

  public java.lang.Boolean hasMatchingRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
          predicate);

  public A withRules(
      java.util.List<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects> rules);

  public A withRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... rules);

  public java.lang.Boolean hasRules();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      addNewRule();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      addNewRuleLike(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      setNewRuleLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A> editRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      editFirstRule();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      editLastRule();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      editMatchingRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
              predicate);

  public interface DistinguisherMethodNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
                      .DistinguisherMethodNested<
                  N>> {
    public N and();

    public N endDistinguisherMethod();
  }

  public interface PriorityLevelConfigurationNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
                      .PriorityLevelConfigurationNested<
                  N>> {
    public N and();

    public N endPriorityLevelConfiguration();
  }

  public interface RulesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<N>> {
    public N and();

    public N endRule();
  }
}
