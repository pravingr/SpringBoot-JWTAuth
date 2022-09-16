package pgr.springjwtauth.models;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 7965887411578689685L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}

}
