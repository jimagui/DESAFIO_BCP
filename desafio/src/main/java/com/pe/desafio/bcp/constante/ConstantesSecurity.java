package com.pe.desafio.bcp.constante;

public class ConstantesSecurity {
	public static final String ID_APLICACION ="DesafioBcp";
	public static final String SECRET = "SecretKeyDesafioBcp";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER = "Authorization";
    public static final String SIGN_UP_URL = "/login";
}
