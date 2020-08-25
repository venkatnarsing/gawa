package org.gawa.owner.resource;

import org.gawa.owner.model.Owner;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class OwnerResource {
    @RequestMapping("/owners")
    public List<Owner> getOwners() {
        List<Owner> owners = Arrays.asList(
                new Owner(1, "Kiran Ch", "9-3-1", "1234567890"),
                new Owner(2, "Jaggaiah", "9-3-2", "1234567890"),
                new Owner(3, "Uday", "9-3-3", "1234567890")
        );

        return owners;
    }

    @RequestMapping("/owners/{ownerId}")
    public Owner getOwnerDetails(@PathVariable String ownerId) {
        List<Owner> owners = getOwners();
        Integer ownerIdInt = Integer.parseInt(ownerId);

        return owners.stream().filter(owner -> (owner.getId() == ownerIdInt)).findFirst().get();
    }
}
