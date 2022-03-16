package com.capgemini.map;

import com.capgemini.entity.Employee;
import com.capgemini.entity.Office;
import com.capgemini.service.EmployeeDTO;
import com.capgemini.service.OfficeDTO;

public class OfficeMapper {

    public static Office fromDTO(OfficeDTO officeDTO){
        Office office = new Office();

        office.setOfficeCode(officeDTO.getOfficeCode());
        office.setCity(officeDTO.getCity());
        office.setPhone(officeDTO.getPhone());
        office.setAddressLine1(officeDTO.getAddressLine1());
        office.setCountry(officeDTO.getCountry());
        office.setPostalCode(officeDTO.getPostalCode());
        office.setTerritory(officeDTO.getTerritory());


        return office;
    }

    public static OfficeDTO fromOffice(Office office) {
        OfficeDTO officeDTO = new OfficeDTO();

        officeDTO.setOfficeCode(office.getOfficeCode());
        officeDTO.setCity(office.getCity());
        officeDTO.setPhone(office.getPhone());
        officeDTO.setAddressLine1(office.getAddressLine1());
        officeDTO.setCountry(office.getCountry());
        officeDTO.setPostalCode(office.getPostalCode());
        officeDTO.setTerritory(office.getTerritory());

        return officeDTO;

    }
}
