package com.capgemini.service;


import com.capgemini.entity.Employee;
import com.capgemini.entity.Office;
import com.capgemini.map.EmployeeMapper;
import com.capgemini.map.OfficeMapper;
import com.capgemini.repository.Repository;

public class OfficeService {

    Repository<Office> officeRepository;

    public OfficeService(Repository<Office> officeRepository) {
        this.officeRepository = officeRepository;
    }

    public void addOffice(OfficeDTO officeDTO) {
        Office newOffice = OfficeMapper.fromDTO(officeDTO);
        officeRepository.add(newOffice);
    }
}
