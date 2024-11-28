package co.simplon.cda.fundamentals.dtos;

// JavaBean conventions 
/*
 * Represents simple data with no logic
 * Public class  
 * Public no arg constructor 
 * Private fields
 * Getter and setters  (prefix get or is boolean and set) 
 */
public class PokemonDto {
	private Long id;
	private String name;

	public PokemonDto() {
	}

	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
