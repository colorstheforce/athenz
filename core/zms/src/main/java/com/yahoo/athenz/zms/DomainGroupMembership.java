//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// DomainGroupMembership -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class DomainGroupMembership {
    public List<DomainGroupMembers> domainGroupMembersList;

    public DomainGroupMembership setDomainGroupMembersList(List<DomainGroupMembers> domainGroupMembersList) {
        this.domainGroupMembersList = domainGroupMembersList;
        return this;
    }
    public List<DomainGroupMembers> getDomainGroupMembersList() {
        return domainGroupMembersList;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainGroupMembership.class) {
                return false;
            }
            DomainGroupMembership a = (DomainGroupMembership) another;
            if (domainGroupMembersList == null ? a.domainGroupMembersList != null : !domainGroupMembersList.equals(a.domainGroupMembersList)) {
                return false;
            }
        }
        return true;
    }
}
