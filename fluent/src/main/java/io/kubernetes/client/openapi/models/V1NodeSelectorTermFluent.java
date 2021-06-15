package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1NodeSelectorTermFluent<A extends io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToMatchExpressions(int index,io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item);
    public A setToMatchExpressions(int index,io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item);
    public A addToMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items);
    public A addAllToMatchExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> items);
    public A removeFromMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items);
    public A removeAllFromMatchExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> items);
    public A removeMatchingFromMatchExpressions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMatchExpressions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> getMatchExpressions();
    public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> buildMatchExpressions();
    public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildMatchExpression(int index);
    public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildFirstMatchExpression();
    public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildLastMatchExpression();
    public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> predicate);
    public java.lang.Boolean hasMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> predicate);
    public A withMatchExpressions(java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> matchExpressions);
    public A withMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... matchExpressions);
    public java.lang.Boolean hasMatchExpressions();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpression();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item);
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item);
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchExpression(int index);
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A> editFirstMatchExpression();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A> editLastMatchExpression();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> predicate);
    public A addToMatchFields(int index,io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item);
    public A setToMatchFields(int index,io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item);
    public A addToMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items);
    public A addAllToMatchFields(java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> items);
    public A removeFromMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items);
    public A removeAllFromMatchFields(java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> items);
    public A removeMatchingFromMatchFields(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMatchFields instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> getMatchFields();
    public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> buildMatchFields();
    public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildMatchField(int index);
    public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildFirstMatchField();
    public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildLastMatchField();
    public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildMatchingMatchField(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> predicate);
    public java.lang.Boolean hasMatchingMatchField(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> predicate);
    public A withMatchFields(java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> matchFields);
    public A withMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... matchFields);
    public java.lang.Boolean hasMatchFields();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchField();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchFieldLike(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item);
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A> setNewMatchFieldLike(int index,io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item);
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A> editMatchField(int index);
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A> editFirstMatchField();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A> editLastMatchField();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A> editMatchingMatchField(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> predicate);
    public interface MatchExpressionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluent<io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<N>> {

            public N and();
            public N endMatchExpression();    }


    public interface MatchFieldsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluent<io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<N>> {

            public N and();
            public N endMatchField();    }


}
