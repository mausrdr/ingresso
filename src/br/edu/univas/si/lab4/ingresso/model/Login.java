/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.model;

/**
 * @author mauro
 *
 */
public class Login {
	
	private String login = "admin";
	private char [] senha = { 'a', 'd', 'm', 'i', 'n'};
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the senha
	 */
	public char[] getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(char[] senha) {
		this.senha = senha;
	}
}