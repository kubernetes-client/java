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

public interface V1alpha1SchedulingFluent<A extends io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToNodeSelector(java.lang.String key,java.lang.String value);
    public A addToNodeSelector(java.util.Map<java.lang.String,java.lang.String> map);
    public A removeFromNodeSelector(java.lang.String key);
    public A removeFromNodeSelector(java.util.Map<java.lang.String,java.lang.String> map);
    public java.util.Map<java.lang.String,java.lang.String> getNodeSelector();
    public <K,V>A withNodeSelector(java.util.Map<java.lang.String,java.lang.String> nodeSelector);
    public java.lang.Boolean hasNodeSelector();
    public A addToTolerations(int index,io.kubernetes.client.openapi.models.V1Toleration item);
    public A setToTolerations(int index,io.kubernetes.client.openapi.models.V1Toleration item);
    public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);
    public A addAllToTolerations(java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items);
    public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);
    public A removeAllFromTolerations(java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items);
    public A removeMatchingFromTolerations(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTolerations instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> getTolerations();
    public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> buildTolerations();
    public io.kubernetes.client.openapi.models.V1Toleration buildToleration(int index);
    public io.kubernetes.client.openapi.models.V1Toleration buildFirstToleration();
    public io.kubernetes.client.openapi.models.V1Toleration buildLastToleration();
    public io.kubernetes.client.openapi.models.V1Toleration buildMatchingToleration(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder> predicate);
    public java.lang.Boolean hasMatchingToleration(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder> predicate);
    public A withTolerations(java.util.List<io.kubernetes.client.openapi.models.V1Toleration> tolerations);
    public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations);
    public java.lang.Boolean hasTolerations();
    public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A> addNewToleration();
    public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A> addNewTolerationLike(io.kubernetes.client.openapi.models.V1Toleration item);
    public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A> setNewTolerationLike(int index,io.kubernetes.client.openapi.models.V1Toleration item);
    public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A> editToleration(int index);
    public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A> editFirstToleration();
    public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A> editLastToleration();
    public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A> editMatchingToleration(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder> predicate);
    public interface TolerationsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1TolerationFluent<io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<N>> {

            public N and();
            public N endToleration();    }


}
