package io.classicmodels.service;

import io.classicmodels.entity.Office;

import java.util.List;

public interface OfficeService {
    List<Office> getAllOffices();

    Office getOffice(String officeCode);

    Office createOffice(Office office);

    Office updateOffice(Office office);

    boolean deleteOffice(String officeCode);
}
