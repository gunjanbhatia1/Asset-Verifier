//package com.project.restfulwebservices.asset; 
//
//import java.net.URI;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import com.project.restfulwebservices.asset.AssetHardcodedServices; 
//
//import com.project.restfulwebservices.asset.Asset; 
//
////import com.project.restfulwebservices.asset.mysql.model.Asset;
////import com.project.restfulwebservices.asset.mysql.repo.AssetRepository;;
//@CrossOrigin(origins="http://localhost:4200")
//@RestController
//public class AssetResource {
//
//	@Autowired
//	private AssetHardcodedServices assetService;
//	
//	//private AssetHardcodedServices assetService;
//	@GetMapping("/users/{username}/assets")
//  public List<Asset> getAllAssets(@PathVariable String username){
//	
//		return assetService.findAll();
//		
//	}
//	
//	
//	
//	@GetMapping("/users/{username}/assets/{id}")
//	  public Asset getAsset(@PathVariable String username,@PathVariable long id){
//		
//		return assetService.findById(id);
//		
//		}
//		
//	
//	
//	@DeleteMapping("/users/{username}/assets/{id}")
//	public ResponseEntity<Void> deleteAsset(
//			@PathVariable String username, @PathVariable long id){
//		
//		Asset asset = assetService.deleteById(id);
//		
//		if(asset!=null) {
//			return ResponseEntity.noContent().build();
//		}
//		
//		return ResponseEntity.notFound().build();
//	}
//	
//	@PutMapping("/users/{username}/assets/{id}")
//	public ResponseEntity<Asset> updateAsset(
//			@PathVariable String username,
//			@PathVariable long id, @RequestBody Asset asset){
//		
//		Asset assetUpdated = assetService.save(asset);
//		
//		return new ResponseEntity<Asset>(asset, HttpStatus.OK);
//	}
//
//	@PostMapping("/users/{username}/assets")
//	public ResponseEntity<Void> updateTodo(
//			@PathVariable String username, @RequestBody Asset asset){
//		
//		Asset createdAsset = assetService.save(asset);
//		
//		//Location
//		//Get current resource url
//		///{id}
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//				.path("/{id}").buildAndExpand(createdAsset.getId()).toUri();
//		
//		return ResponseEntity.created(uri).build();
//	}
//
//	
//
//
//}
