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

public interface V1APIServiceStatusFluent<A extends io.kubernetes.client.openapi.models.V1APIServiceStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1APIServiceCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1APIServiceCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1APIServiceCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1APIServiceCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1APIServiceCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1APIServiceCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1APIServiceCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1APIServiceCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1APIServiceCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1APIServiceCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1APIServiceCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1APIServiceCondition item);
    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1APIServiceCondition item);
    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> predicate);
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1APIServiceConditionFluent<io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}
