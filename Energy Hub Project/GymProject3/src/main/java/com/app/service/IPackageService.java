package com.app.service;

import java.util.List;

import com.app.pojos.Package;

public interface IPackageService {
//add a method to add a new package
	Package addPackage(Package p);
	//add a method to get all packages
	List<Package> getAllPackages();
	//add a method to get package by id
	Package getPackageById(int packageId);
	//add a method to update package
	Package updatePackageDetails(Package detachedPackage,int packageId);
	//add a method to delete package
	String deletePackage(int packageId);
	//add a method to count the total package
		int countPackage();
	
}
