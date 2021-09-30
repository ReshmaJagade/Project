package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.PackageHandlingException;

import com.app.dao.IPackageRepository;
import com.app.pojos.Package;

@Service
@Transactional
public class PackageServiceImpl implements IPackageService {

	@Autowired
	private IPackageRepository packageRepo;

	@Override
	public Package addPackage(Package package1) {
		Package newpackage = packageRepo.save(package1);
		return newpackage;
	}

	@Override
	public List<Package> getAllPackages() {

		return packageRepo.findAll();
	}

	

	@Override
	public Package getPackageById(int packageId) {

		return packageRepo.findById(packageId).orElseThrow(() 
			-> new PackageHandlingException("Invalid Package id"));
	}

	@Override
	public Package updatePackageDetails(Package detachedPackage,int packageId) {
System.out.println(detachedPackage+" "+packageId);
		//return packageRepo.save(detachedPackage);
	Package p=packageRepo.findById(packageId).orElseThrow(() -> new PackageHandlingException("Invalid Package id"));
	p.setPackageName(detachedPackage.getPackageName());
	p.setAmount(detachedPackage.getAmount());
	p.setDuration(detachedPackage.getDuration());
	return packageRepo.save(p);
	}

	@Override
	public String deletePackage(int packageId) {

		packageRepo.deleteById(packageId);
		return "Package details deleted for ID=" + packageId;

	}
	
	@Override
	public int countPackage() {
		
		return (int)packageRepo.count();
	}
	

}
