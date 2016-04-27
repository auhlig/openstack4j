package org.openstack4j.openstack.gbp.domain;

import java.util.List;

import org.openstack4j.model.gbp.PolicyClassifier;
import org.openstack4j.model.gbp.builder.PolicyClassifierBuilder;
import org.openstack4j.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Model implementation for Policy Classifier
 * 
 * @author vinod borole
 */
@JsonRootName("policy_classifier")
public class GbpPolicyClassifier implements PolicyClassifier {
    private static final long serialVersionUID = 1L;
    private String name;
    @JsonProperty("tenant_id")
    private String tenantId;
    private String id;
    private String description;
    private String direction;
    @JsonProperty("port_range")
    private String portRange;
    private String protocol;
    private boolean shared;
    
    
    @Override
    public PolicyClassifierBuilder toBuilder() {
        return new PolicyClassifierConcreteBuilder(this);
    }

    @Override
    public String getTenantId() {
        return tenantId;
    }

    @Override
    public void setTenantId(String tenantId) {
        this.tenantId=tenantId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id=id;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getDirection() {
        return direction;
    }

    @Override
    public String getPortRange() {
        return portRange;
    }

    @Override
    public String getProtocol() {
        return protocol;
    }

    @Override
    public boolean isShared() {
        return shared;
    }

    public static class PolicyClassifiers extends ListResult<GbpPolicyClassifier>{

        private static final long serialVersionUID = 1L;
        @JsonProperty("policy_classifiers")
        private List<GbpPolicyClassifier> policyClassfiers;
        @Override
        protected List<GbpPolicyClassifier> value() {
            return policyClassfiers;
        }
    }
    
    
    public static class PolicyClassifierConcreteBuilder implements PolicyClassifierBuilder{

        private GbpPolicyClassifier policyClassfier;
        public PolicyClassifierConcreteBuilder(GbpPolicyClassifier gbpPolicyClassifier) {
            this.policyClassfier=gbpPolicyClassifier;
        }

        @Override
        public PolicyClassifier build() {
            return policyClassfier;
        }

        @Override
        public PolicyClassifierBuilder from(PolicyClassifier in) {
            this.policyClassfier=(GbpPolicyClassifier) in;
            return this;
        }
        
    }

}
