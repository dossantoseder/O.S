package modelo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public interface HashSenha {
	
	public String encriptaSenha(String senha);

}
