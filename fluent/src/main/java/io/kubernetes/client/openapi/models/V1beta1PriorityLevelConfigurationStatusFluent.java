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

public interface V1beta1PriorityLevelConfigurationStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item);
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item);
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate);
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionFluent<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}
