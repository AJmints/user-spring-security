package org.user.security.security;

public class SecurityConstants {

    public static final long JWT_EXPIRATION = 70000;

    /** Important to set up for real with real project, if someone get's ahold of this information, they can
     * generate tokens and pretend to be the victim of the datas theft.
     */
    public static final String JWT_SECRET = "secret";
}
