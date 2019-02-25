package com.rnehul.model.sfgpetclinic.service;

import com.rnehul.model.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
