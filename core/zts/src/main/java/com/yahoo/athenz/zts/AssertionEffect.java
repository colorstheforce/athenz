//
// This file generated by rdl 1.4.12. Do not modify!
//

package com.yahoo.athenz.zts;
import com.yahoo.rdl.*;

//
// AssertionEffect - Every assertion can have the effect of ALLOW or DENY.
//
public enum AssertionEffect {
    ALLOW,
    DENY;

    public static AssertionEffect fromString(String v) {
        for (AssertionEffect e : values()) {
            if (e.toString().equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException("Invalid string representation for AssertionEffect: " + v);
    }
}
