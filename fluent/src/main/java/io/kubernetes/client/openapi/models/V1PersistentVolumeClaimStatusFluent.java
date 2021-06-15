package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface V1PersistentVolumeClaimStatusFluent<A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToAccessModes(int index,java.lang.String item);
    public A setToAccessModes(int index,java.lang.String item);
    public A addToAccessModes(java.lang.String... items);
    public A addAllToAccessModes(java.util.Collection<java.lang.String> items);
    public A removeFromAccessModes(java.lang.String... items);
    public A removeAllFromAccessModes(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getAccessModes();
    public java.lang.String getAccessMode(int index);
    public java.lang.String getFirstAccessMode();
    public java.lang.String getLastAccessMode();
    public java.lang.String getMatchingAccessMode(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingAccessMode(java.util.function.Predicate<java.lang.String> predicate);
    public A withAccessModes(java.util.List<java.lang.String> accessModes);
    public A withAccessModes(java.lang.String... accessModes);
    public java.lang.Boolean hasAccessModes();
    public A addNewAccessMode(java.lang.String original);
    public A addToCapacity(java.lang.String key,io.kubernetes.client.custom.Quantity value);
    public A addToCapacity(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
    public A removeFromCapacity(java.lang.String key);
    public A removeFromCapacity(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
    public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getCapacity();
    public <K,V>A withCapacity(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> capacity);
    public java.lang.Boolean hasCapacity();
    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item);
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item);
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> predicate);
    public java.lang.String getPhase();
    public A withPhase(java.lang.String phase);
    public java.lang.Boolean hasPhase();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPhase instead.
     */
        public A withNewPhase(java.lang.String original);
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluent<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}
