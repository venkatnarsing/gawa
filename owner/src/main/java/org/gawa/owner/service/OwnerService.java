package org.gawa.owner.service;

import org.gawa.owner.entity.Owner;
import org.gawa.owner.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerService {
    @Autowired
    OwnerRepository ownerRepository;

    //getting all student records
    public List<Owner> getAllOwners()
    {

        /*List<Owner> owners = Arrays.asList(
                new Owner(1, "Kiran Ch", "9-3-1", "1234567890"),
                new Owner(2, "Jaggaiah", "9-3-2", "1234567890"),
                new Owner(3, "Uday", "9-3-3", "1234567890")
        );*/

        List<Owner> owners = new ArrayList<Owner>();

        ownerRepository.findAll().forEach(owner -> owners.add(owner));
        return owners;
    }
    //getting a specific record
    public Owner getOwnerById(int id)
    {
        return ownerRepository.findById(id).get();
    }
    public void saveOrUpdate(Owner owner)
    {
        ownerRepository.save(owner);
    }
    //deleting a specific record
    public void delete(int id)
    {
        ownerRepository.deleteById(id);
    }
}
