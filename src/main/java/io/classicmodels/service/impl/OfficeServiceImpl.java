package io.classicmodels.service.impl;

import io.classicmodels.DAO.OfficeDAO;
import io.classicmodels.entity.Office;
import io.classicmodels.service.OfficeService;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Remote
@Stateless
public class OfficeServiceImpl implements OfficeService {

    @Inject
    private OfficeDAO officeDAO;
    @Override
    public List<Office> getAllOffices() {
        return officeDAO.listAll();
    }

    @Override
    public Office getOffice(String officeCode) {
        return officeDAO.read(officeCode);
    }

    @Override
    public Office createOffice(Office office) {
        return officeDAO.insert(office);
    }

    @Override
    public Office updateOffice(Office office) {
        return officeDAO.insert(office);
    }

    @Override
    public boolean deleteOffice(String officeCode) {
        return officeDAO.deleteById(officeCode);
    }
}
