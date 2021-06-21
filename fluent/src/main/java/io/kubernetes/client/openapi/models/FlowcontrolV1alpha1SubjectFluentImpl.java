package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class FlowcontrolV1alpha1SubjectFluentImpl<A extends io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent<A> {

    private io.kubernetes.client.openapi.models.V1alpha1GroupSubjectBuilder group;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubjectBuilder serviceAccount;
    private io.kubernetes.client.openapi.models.V1alpha1UserSubjectBuilder user;

    public FlowcontrolV1alpha1SubjectFluentImpl() {
    }

    public FlowcontrolV1alpha1SubjectFluentImpl(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject instance) {
        this.withGroup(instance.getGroup());
        
        this.withKind(instance.getKind());
        
        this.withServiceAccount(instance.getServiceAccount());
        
        this.withUser(instance.getUser());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildGroup instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1alpha1GroupSubject getGroup() {
        return this.group!=null?this.group.build():null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1GroupSubject buildGroup() {
        return this.group!=null?this.group.build():null;
    }

    public A withGroup(io.kubernetes.client.openapi.models.V1alpha1GroupSubject group) {
        _visitables.get("group").remove(this.group);
        if (group!=null){ this.group= new io.kubernetes.client.openapi.models.V1alpha1GroupSubjectBuilder(group); _visitables.get("group").add(this.group);} return (A) this;
    }

    public java.lang.Boolean hasGroup() {
        return this.group != null;
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.GroupNested<A> withNewGroup() {
        return new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluentImpl.GroupNestedImpl();
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.GroupNested<A> withNewGroupLike(io.kubernetes.client.openapi.models.V1alpha1GroupSubject item) {
        return new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluentImpl.GroupNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.GroupNested<A> editGroup() {
        return withNewGroupLike(getGroup());
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.GroupNested<A> editOrNewGroup() {
        return withNewGroupLike(getGroup() != null ? getGroup(): new io.kubernetes.client.openapi.models.V1alpha1GroupSubjectBuilder().build());
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.GroupNested<A> editOrNewGroupLike(io.kubernetes.client.openapi.models.V1alpha1GroupSubject item) {
        return withNewGroupLike(getGroup() != null ? getGroup(): item);
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildServiceAccount instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubject getServiceAccount() {
        return this.serviceAccount!=null?this.serviceAccount.build():null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubject buildServiceAccount() {
        return this.serviceAccount!=null?this.serviceAccount.build():null;
    }

    public A withServiceAccount(io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubject serviceAccount) {
        _visitables.get("serviceAccount").remove(this.serviceAccount);
        if (serviceAccount!=null){ this.serviceAccount= new io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubjectBuilder(serviceAccount); _visitables.get("serviceAccount").add(this.serviceAccount);} return (A) this;
    }

    public java.lang.Boolean hasServiceAccount() {
        return this.serviceAccount != null;
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.ServiceAccountNested<A> withNewServiceAccount() {
        return new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluentImpl.ServiceAccountNestedImpl();
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.ServiceAccountNested<A> withNewServiceAccountLike(io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubject item) {
        return new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluentImpl.ServiceAccountNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.ServiceAccountNested<A> editServiceAccount() {
        return withNewServiceAccountLike(getServiceAccount());
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccount() {
        return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount(): new io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubjectBuilder().build());
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccountLike(io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubject item) {
        return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildUser instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1alpha1UserSubject getUser() {
        return this.user!=null?this.user.build():null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1UserSubject buildUser() {
        return this.user!=null?this.user.build():null;
    }

    public A withUser(io.kubernetes.client.openapi.models.V1alpha1UserSubject user) {
        _visitables.get("user").remove(this.user);
        if (user!=null){ this.user= new io.kubernetes.client.openapi.models.V1alpha1UserSubjectBuilder(user); _visitables.get("user").add(this.user);} return (A) this;
    }

    public java.lang.Boolean hasUser() {
        return this.user != null;
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.UserNested<A> withNewUser() {
        return new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluentImpl.UserNestedImpl();
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.UserNested<A> withNewUserLike(io.kubernetes.client.openapi.models.V1alpha1UserSubject item) {
        return new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluentImpl.UserNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.UserNested<A> editUser() {
        return withNewUserLike(getUser());
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.UserNested<A> editOrNewUser() {
        return withNewUserLike(getUser() != null ? getUser(): new io.kubernetes.client.openapi.models.V1alpha1UserSubjectBuilder().build());
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.UserNested<A> editOrNewUserLike(io.kubernetes.client.openapi.models.V1alpha1UserSubject item) {
        return withNewUserLike(getUser() != null ? getUser(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowcontrolV1alpha1SubjectFluentImpl that = (FlowcontrolV1alpha1SubjectFluentImpl) o;
        if (group != null ? !group.equals(that.group) :that.group != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (serviceAccount != null ? !serviceAccount.equals(that.serviceAccount) :that.serviceAccount != null) return false;
        if (user != null ? !user.equals(that.user) :that.user != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(group,  kind,  serviceAccount,  user,  super.hashCode());
    }

    public class GroupNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1GroupSubjectFluentImpl<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.GroupNested<N>> implements io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.GroupNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1GroupSubjectBuilder builder;

            GroupNestedImpl(io.kubernetes.client.openapi.models.V1alpha1GroupSubject item) {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1GroupSubjectBuilder(this, item);
                        
            }

            GroupNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1GroupSubjectBuilder(this);
                        
            }

            public N and() {
                return (N) FlowcontrolV1alpha1SubjectFluentImpl.this.withGroup(builder.build());
            }

            public N endGroup() {
                return and();
            }
    }


    public class ServiceAccountNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubjectFluentImpl<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.ServiceAccountNested<N>> implements io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.ServiceAccountNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubjectBuilder builder;

            ServiceAccountNestedImpl(io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubject item) {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubjectBuilder(this, item);
                        
            }

            ServiceAccountNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1ServiceAccountSubjectBuilder(this);
                        
            }

            public N and() {
                return (N) FlowcontrolV1alpha1SubjectFluentImpl.this.withServiceAccount(builder.build());
            }

            public N endServiceAccount() {
                return and();
            }
    }


    public class UserNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluentImpl<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.UserNested<N>> implements io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent.UserNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1UserSubjectBuilder builder;

            UserNestedImpl(io.kubernetes.client.openapi.models.V1alpha1UserSubject item) {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1UserSubjectBuilder(this, item);
                        
            }

            UserNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1UserSubjectBuilder(this);
                        
            }

            public N and() {
                return (N) FlowcontrolV1alpha1SubjectFluentImpl.this.withUser(builder.build());
            }

            public N endUser() {
                return and();
            }
    }


}
