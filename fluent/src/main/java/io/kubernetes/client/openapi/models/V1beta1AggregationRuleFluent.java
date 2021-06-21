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

public interface V1beta1AggregationRuleFluent<A extends io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToClusterRoleSelectors(int index,io.kubernetes.client.openapi.models.V1LabelSelector item);
    public A setToClusterRoleSelectors(int index,io.kubernetes.client.openapi.models.V1LabelSelector item);
    public A addToClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... items);
    public A addAllToClusterRoleSelectors(java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelector> items);
    public A removeFromClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... items);
    public A removeAllFromClusterRoleSelectors(java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelector> items);
    public A removeMatchingFromClusterRoleSelectors(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildClusterRoleSelectors instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelector> getClusterRoleSelectors();
    public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelector> buildClusterRoleSelectors();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildClusterRoleSelector(int index);
    public io.kubernetes.client.openapi.models.V1LabelSelector buildFirstClusterRoleSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildLastClusterRoleSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildMatchingClusterRoleSelector(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder> predicate);
    public java.lang.Boolean hasMatchingClusterRoleSelector(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder> predicate);
    public A withClusterRoleSelectors(java.util.List<io.kubernetes.client.openapi.models.V1LabelSelector> clusterRoleSelectors);
    public A withClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... clusterRoleSelectors);
    public java.lang.Boolean hasClusterRoleSelectors();
    public io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelector();
    public io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent.ClusterRoleSelectorsNested<A> setNewClusterRoleSelectorLike(int index,io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editClusterRoleSelector(int index);
    public io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editFirstClusterRoleSelector();
    public io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editLastClusterRoleSelector();
    public io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editMatchingClusterRoleSelector(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder> predicate);
    public interface ClusterRoleSelectorsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent.ClusterRoleSelectorsNested<N>> {

            public N and();
            public N endClusterRoleSelector();    }


}
