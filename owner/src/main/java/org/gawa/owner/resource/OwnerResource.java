package org.gawa.owner.resource;

import org.gawa.owner.entity.Owner;
import org.gawa.owner.model.OwnerVO;
import org.gawa.owner.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OwnerResource {

    @Autowired
    OwnerService ownerService;

    @RequestMapping("/owners")
    public List<OwnerVO> getOwners() {

        List<OwnerVO> ownerVOs = new ArrayList<OwnerVO>();

        List<Owner> owners = ownerService.getAllOwners();

        owners.forEach(owner -> {
            OwnerVO ownerVO = new OwnerVO(owner.getId(), owner.getFirstName() + " " + owner.getLastName(),
                    owner.getHouseNumber(), owner.getPhoneNumber());
            ownerVOs.add(ownerVO);
        });

        return ownerVOs;
    }

    @RequestMapping("/owners/{ownerId}")
    public OwnerVO getOwnerDetails(@PathVariable String ownerId) {
        List<OwnerVO> owners = getOwners();
        Integer ownerIdInt = Integer.parseInt(ownerId);

        return owners.stream().filter(owner -> (owner.getId() == ownerIdInt)).findFirst().get();
    }
}
