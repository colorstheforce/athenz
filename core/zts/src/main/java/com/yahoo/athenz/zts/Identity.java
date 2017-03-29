//
// This file generated by rdl 1.4.12. Do not modify!
//

package com.yahoo.athenz.zts;
import java.util.Map;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// Identity - Identity - a signed assertion of service or human identity, the
// response could be either a client certificate or just a regular NToken
// (depending if the request contained a csr or not).
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class Identity {
    public String name;
    @RdlOptional
    public String certificate;
    @RdlOptional
    public String caCertBundle;
    @RdlOptional
    public String sshCertificate;
    @RdlOptional
    public String sshCertificateSigner;
    @RdlOptional
    public String serviceToken;
    @RdlOptional
    public Map<String, String> attributes;

    public Identity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public Identity setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return certificate;
    }
    public Identity setCaCertBundle(String caCertBundle) {
        this.caCertBundle = caCertBundle;
        return this;
    }
    public String getCaCertBundle() {
        return caCertBundle;
    }
    public Identity setSshCertificate(String sshCertificate) {
        this.sshCertificate = sshCertificate;
        return this;
    }
    public String getSshCertificate() {
        return sshCertificate;
    }
    public Identity setSshCertificateSigner(String sshCertificateSigner) {
        this.sshCertificateSigner = sshCertificateSigner;
        return this;
    }
    public String getSshCertificateSigner() {
        return sshCertificateSigner;
    }
    public Identity setServiceToken(String serviceToken) {
        this.serviceToken = serviceToken;
        return this;
    }
    public String getServiceToken() {
        return serviceToken;
    }
    public Identity setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public Map<String, String> getAttributes() {
        return attributes;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Identity.class) {
                return false;
            }
            Identity a = (Identity) another;
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (certificate == null ? a.certificate != null : !certificate.equals(a.certificate)) {
                return false;
            }
            if (caCertBundle == null ? a.caCertBundle != null : !caCertBundle.equals(a.caCertBundle)) {
                return false;
            }
            if (sshCertificate == null ? a.sshCertificate != null : !sshCertificate.equals(a.sshCertificate)) {
                return false;
            }
            if (sshCertificateSigner == null ? a.sshCertificateSigner != null : !sshCertificateSigner.equals(a.sshCertificateSigner)) {
                return false;
            }
            if (serviceToken == null ? a.serviceToken != null : !serviceToken.equals(a.serviceToken)) {
                return false;
            }
            if (attributes == null ? a.attributes != null : !attributes.equals(a.attributes)) {
                return false;
            }
        }
        return true;
    }
}
