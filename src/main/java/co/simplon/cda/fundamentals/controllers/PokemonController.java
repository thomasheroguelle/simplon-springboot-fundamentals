package co.simplon.cda.fundamentals.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cda.fundamentals.dtos.PokemonCreate;
import co.simplon.cda.fundamentals.dtos.PokemonDto;
import co.simplon.cda.fundamentals.dtos.PokemonView;

@RequestMapping("/pokemons")
@RestController // indique qu'on veut faire du REST, le format privilégié étant le json
class PokemonController {

	@GetMapping("/{id}")
	PokemonDto getOne(@PathVariable("id") Long id) {
		PokemonDto dto = new PokemonDto();
		dto.setId(id);
		dto.setName("Pikachu");
		return dto;
		/*
		 * La méthode getOne() est package-private. Elle ne sera accessible : - Qu'aux
		 * classes du même package (co.simplon.cda.fundamentals.objects.geometry dans
		 * ton cas). - Pas aux classes situées dans d'autres packages, même si elles
		 * sont dans le même module ou projet.
		 */
	}

	@GetMapping
	PokemonView[] getAll() {
		// String[] pokemons = { "Pikachu", "Rexillus" };
		PokemonView[] pokemons = new PokemonView[2];
		PokemonView poke1 = new PokemonView(1L, "Pikachu");
		pokemons[0] = poke1;
		PokemonView poke2 = new PokemonView(2L, "Rexillus");
		pokemons[1] = poke2;
		return pokemons;
	}
	
	@PostMapping
	void create(@RequestBody PokemonCreate inputs) { 
		System.out.println(inputs);
	}
}
