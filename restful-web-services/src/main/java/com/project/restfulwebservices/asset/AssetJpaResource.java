package com.project.restfulwebservices.asset;



import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.project.restfulwebservices.asset.AssetHardcodedServices; 

import com.project.restfulwebservices.asset.AssetJpa; 

//import com.project.restfulwebservices.asset.mysql.model.Asset;
import com.project.restfulwebservices.asset.AssetRepository;;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AssetJpaResource {

	@Autowired
	private AssetRepository assetRepo;
	
	//private AssetHardcodedServices assetService;
	@GetMapping("/users/{username}/assets")
  public List<AssetJpa> getAllAssets(@PathVariable String username){
	
		return assetRepo.findAll();
		
	}
	
	
	
	@GetMapping("/users/{username}/assets/{id}")
	  public AssetJpa getAsset(@PathVariable String username,@PathVariable long id){
		
		return assetRepo.findById(id).get();
		
		}
		
	
	
	@DeleteMapping("/users/{username}/assets/{id}")
	public ResponseEntity<String> deleteAsset(
			@PathVariable String username, @PathVariable long id){
		
		assetRepo.deleteById(id);
		
		//if(asset!=null) {
			//return ResponseEntity.noContent().build();
		//}
	
		return ResponseEntity.noContent().build();
 //return new ResponseEntity<>("Asset deleted",HttpStatus.OK);
		//return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/users/{username}/assets/{id}")
	public ResponseEntity<AssetJpa> updateAsset(
			@PathVariable String username,
			@PathVariable long id, @RequestBody AssetJpa asset){
		
		AssetJpa assetUpdated = assetRepo.save(asset);
		
		return new ResponseEntity<AssetJpa>(asset, HttpStatus.OK);
	}

	@PostMapping("/users/{username}/assets")
	public ResponseEntity<Void> updateTodo(
			@PathVariable String username, @RequestBody AssetJpa asset){
		asset.setUsername(username);
		AssetJpa createdAsset = assetRepo.save(asset);
		
		//Location
		//Get current resource url
		///{id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdAsset.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

	


}

