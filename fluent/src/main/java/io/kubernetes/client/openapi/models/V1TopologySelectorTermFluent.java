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

public interface V1TopologySelectorTermFluent<A extends io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToMatchLabelExpressions(int index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);
    public A setToMatchLabelExpressions(int index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);
    public A addToMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items);
    public A addAllToMatchLabelExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> items);
    public A removeFromMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items);
    public A removeAllFromMatchLabelExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> items);
    public A removeMatchingFromMatchLabelExpressions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMatchLabelExpressions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> getMatchLabelExpressions();
    public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> buildMatchLabelExpressions();
    public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildMatchLabelExpression(int index);
    public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildFirstMatchLabelExpression();
    public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildLastMatchLabelExpression();
    public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate);
    public java.lang.Boolean hasMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate);
    public A withMatchLabelExpressions(java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> matchLabelExpressions);
    public A withMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... matchLabelExpressions);
    public java.lang.Boolean hasMatchLabelExpressions();
    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpression();
    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpressionLike(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);
    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> setNewMatchLabelExpressionLike(int index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);
    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchLabelExpression(int index);
    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editFirstMatchLabelExpression();
    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editLastMatchLabelExpression();
    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate);
    public interface MatchLabelExpressionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<N>> {

            public N and();
            public N endMatchLabelExpression();    }


}
