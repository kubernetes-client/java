package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface V1LabelSelectorFluent<A extends io.kubernetes.client.openapi.models.V1LabelSelectorFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToMatchExpressions(int index,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item);
    public A setToMatchExpressions(int index,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item);
    public A addToMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items);
    public A addAllToMatchExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> items);
    public A removeFromMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items);
    public A removeAllFromMatchExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> items);
    public A removeMatchingFromMatchExpressions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMatchExpressions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> getMatchExpressions();
    public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> buildMatchExpressions();
    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildMatchExpression(int index);
    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildFirstMatchExpression();
    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildLastMatchExpression();
    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> predicate);
    public java.lang.Boolean hasMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> predicate);
    public A withMatchExpressions(java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> matchExpressions);
    public A withMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... matchExpressions);
    public java.lang.Boolean hasMatchExpressions();
    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression();
    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item);
    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item);
    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> editMatchExpression(int index);
    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression();
    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression();
    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> predicate);
    public A addToMatchLabels(java.lang.String key,java.lang.String value);
    public A addToMatchLabels(java.util.Map<java.lang.String,java.lang.String> map);
    public A removeFromMatchLabels(java.lang.String key);
    public A removeFromMatchLabels(java.util.Map<java.lang.String,java.lang.String> map);
    public java.util.Map<java.lang.String,java.lang.String> getMatchLabels();
    public <K,V>A withMatchLabels(java.util.Map<java.lang.String,java.lang.String> matchLabels);
    public java.lang.Boolean hasMatchLabels();
    public interface MatchExpressionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<N>> {

            public N and();
            public N endMatchExpression();    }


}
