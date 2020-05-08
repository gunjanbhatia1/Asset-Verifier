package com.project.restfulwebservices.asset;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AssetHardcodedServices {

	private static List<Asset> assets = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		assets.add(new Asset(++idCounter, "44","Gunjan","asset1", new Date(),false ));
		assets.add(new Asset(++idCounter, "45","Gunjan","asset2", new Date(),false));
		assets.add(new Asset(++idCounter, "47","Gunjan","asset3",new Date(),false));
	}

	public List<Asset> findAll() {
		return assets;
	}

	public Asset save(Asset asset) {
		if(asset.getId()==-1 || asset.getId()==0) {
			asset.setId(++idCounter);
			assets.add(asset);
		} else {
			deleteById(asset.getId());
			assets.add(asset);
		}
		return asset;
	}

	
	public Asset deleteById(long id) {
		Asset asset = findById(id);
		
		if(asset==null) return null;
		
		if(assets.remove(asset)) {
			return asset;
		}
		
		return null;
	}

	public Asset findById(long id) {
		for(Asset asset:assets) {
			if(asset.getId() == id) {
				return asset;
			}
		}
		
		return null;
	}

}
