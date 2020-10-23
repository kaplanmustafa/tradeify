package com.tradeify.tradeify_ws.user;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data 
@Entity
public class Users implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5165190637252786122L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull(message = "{hoaxify.constraints.username.NotNull.message}")
	@Size(min = 10, max= 255)
	//@UniqueUsername
	private String email;
	
	@NotNull
	@Size(min = 4, max= 255)
	private String fullName;
	
	@NotNull
	@Size(min = 8, max= 255)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", 
	message = "{hoaxify.constraints.username.Pattern.message}")
	private String password;
	
	private String image;
	
	/*@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<Token> tokens;*/

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("Role_user");
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getUsername() {
		return null;
	}
}
