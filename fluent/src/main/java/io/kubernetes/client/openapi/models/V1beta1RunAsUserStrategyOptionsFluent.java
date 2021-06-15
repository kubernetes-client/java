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

public interface V1beta1RunAsUserStrategyOptionsFluent<A extends io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToRanges(int index,io.kubernetes.client.openapi.models.V1beta1IDRange item);
    public A setToRanges(int index,io.kubernetes.client.openapi.models.V1beta1IDRange item);
    public A addToRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... items);
    public A addAllToRanges(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1IDRange> items);
    public A removeFromRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... items);
    public A removeAllFromRanges(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1IDRange> items);
    public A removeMatchingFromRanges(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRanges instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> getRanges();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> buildRanges();
    public io.kubernetes.client.openapi.models.V1beta1IDRange buildRange(int index);
    public io.kubernetes.client.openapi.models.V1beta1IDRange buildFirstRange();
    public io.kubernetes.client.openapi.models.V1beta1IDRange buildLastRange();
    public io.kubernetes.client.openapi.models.V1beta1IDRange buildMatchingRange(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder> predicate);
    public java.lang.Boolean hasMatchingRange(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder> predicate);
    public A withRanges(java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> ranges);
    public A withRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... ranges);
    public java.lang.Boolean hasRanges();
    public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent.RangesNested<A> addNewRange();
    public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent.RangesNested<A> addNewRangeLike(io.kubernetes.client.openapi.models.V1beta1IDRange item);
    public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent.RangesNested<A> setNewRangeLike(int index,io.kubernetes.client.openapi.models.V1beta1IDRange item);
    public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent.RangesNested<A> editRange(int index);
    public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent.RangesNested<A> editFirstRange();
    public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent.RangesNested<A> editLastRange();
    public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent.RangesNested<A> editMatchingRange(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder> predicate);
    public java.lang.String getRule();
    public A withRule(java.lang.String rule);
    public java.lang.Boolean hasRule();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRule instead.
     */
        public A withNewRule(java.lang.String original);
    public interface RangesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1IDRangeFluent<io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent.RangesNested<N>> {

            public N and();
            public N endRange();    }


}
